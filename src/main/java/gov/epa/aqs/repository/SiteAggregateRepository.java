package gov.epa.aqs.repository;


import gov.epa.aqs.model.SiteAggregate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Tim Preuss
 */
public interface SiteAggregateRepository extends CrudRepository<SiteAggregate, String> {

	Page<SiteAggregate> findByYear(String year, Pageable pageable);

    Page<SiteAggregate> findById(String id);

    Page<SiteAggregate> findByStateAndYear(String year, String state,Pageable pageable);

}


