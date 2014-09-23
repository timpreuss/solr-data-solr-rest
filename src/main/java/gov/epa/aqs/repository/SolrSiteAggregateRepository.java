package gov.epa.aqs.repository;


import gov.epa.aqs.fields.SolrSearchableFields;
import gov.epa.aqs.model.SiteAggregate;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.repository.support.SimpleSolrRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tim Preuss
 */
@Repository
public class SolrSiteAggregateRepository extends SimpleSolrRepository<SiteAggregate, String> implements SiteAggregateRepository {

    SolrServer solrServer = new HttpSolrServer( "http://localhost:8983/solr" );

    @Override
	public Page<SiteAggregate> findByYear(String year, Pageable pageable) {
        String[] years = year.split(",");
        Criteria conditions = createSearchConditions(years);

        Query query = new SimpleQuery(conditions);
        query.setPageRequest(pageable);
        SolrOperations so = getSolrOperations();
        if(so == null) {
            setSolrOperations(new SolrTemplate(solrServer));
        }
		return getSolrOperations().queryForPage(query, SiteAggregate.class);
	}

    @Override
	public Page<SiteAggregate> findById(String id) {
        Criteria conditions = new Criteria(SolrSearchableFields.ID).is(id);

        Query query = new SimpleQuery(conditions);
        SolrOperations so = getSolrOperations();
        if(so == null) {
            setSolrOperations(new SolrTemplate(solrServer));
        }
		return getSolrOperations().queryForPage(query, SiteAggregate.class);
	}

    @Override
    public Page<SiteAggregate> findByStateAndYear(String year, String state,Pageable pageable) {

        Criteria conditions = new Criteria(SolrSearchableFields.YEAR).contains(year).and(
                new Criteria(SolrSearchableFields.STATE_CD).contains(state)
        );

        Query query = new SimpleQuery(conditions);
        query.setPageRequest(pageable);
        SolrOperations so = getSolrOperations();
        if(so == null) {
            setSolrOperations(new SolrTemplate(solrServer));
        }
		return getSolrOperations().queryForPage(query, SiteAggregate.class);
    }

    private Criteria createSearchConditions(String[] words) {
        Criteria conditions = null;

        for (String word: words) {
            if (conditions == null) {
                conditions = new Criteria(SolrSearchableFields.YEAR).contains(word);
            }
            else {
                conditions = conditions.or(new Criteria(SolrSearchableFields.YEAR).contains(word));
            }
        }

        return conditions;
    }

}
