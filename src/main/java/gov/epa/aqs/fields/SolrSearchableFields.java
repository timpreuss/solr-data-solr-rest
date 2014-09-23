package gov.epa.aqs.fields;

import gov.epa.aqs.model.SearchableSiteAggregate;
import org.springframework.data.solr.core.query.Field;

/**
 * @author Tim Preuss
 */
public enum SolrSearchableFields implements Field {

	ID(SearchableSiteAggregate.ID_FIELD),
    YEAR(SearchableSiteAggregate.YEAR_FIELD),
    STATE_CD(SearchableSiteAggregate.STATE_CD_FIELD)
    ;

	private final String fieldName;

	private SolrSearchableFields(String fieldName) {
		this.fieldName = fieldName;
	}

	@Override
	public String getName() {
return fieldName;
}

}
