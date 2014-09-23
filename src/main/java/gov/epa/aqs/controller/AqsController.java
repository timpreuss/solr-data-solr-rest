package gov.epa.aqs.controller;

import gov.epa.aqs.model.SiteAggregate;
import gov.epa.aqs.repository.SolrSiteAggregateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/data")
public class AqsController {

    @Autowired
	private SolrSiteAggregateRepository solrSiteAggregateRepository;

    private Pageable pageable;



	@RequestMapping("/year")
	public Page<SiteAggregate> findByYear(@RequestParam(value = "year",required = false,
	                                                    defaultValue = "2010") String year,
                                         @RequestParam(value = "page",required = false,
                                                        defaultValue = "0") int page,
                                         @RequestParam(value = "size",required = false,
                                                        defaultValue = "10") int size) {

        pageable = new PageRequest(page, size);
		Page<SiteAggregate> p = solrSiteAggregateRepository.findByYear(year, pageable);
		return p;
	}

	@RequestMapping("/site")
	public Page<SiteAggregate> findById(@RequestParam(value = "id",required = true) String id) {

		Page p = solrSiteAggregateRepository.findById(id);
		return p;
	}

	@RequestMapping("/state")
	public Page<SiteAggregate> findById(@RequestParam(value = "year",required = false,
	                                                    defaultValue = "2010") String year,
                                        @RequestParam(value = "state",required = false,
	                                                    defaultValue = "NC") String state,
                                         @RequestParam(value = "page",required = false,
                                                        defaultValue = "0") int page,
                                         @RequestParam(value = "size",required = false,
                                                        defaultValue = "10") int size) {

        pageable = new PageRequest(page, size);
		Page<SiteAggregate> p = solrSiteAggregateRepository.findByStateAndYear(year, state, pageable);
		return p;
	}

	@RequestMapping("/stateview")
	public ModelAndView findByState(@RequestParam(value = "year",required = false,
	                                                    defaultValue = "2014") String year,
                                        @RequestParam(value = "state",required = false,
	                                                    defaultValue = "01") String state,
                                         @RequestParam(value = "page",required = false,
                                                        defaultValue = "0") int page,
                                         @RequestParam(value = "size",required = false,
                                                        defaultValue = "10") int size,  ModelAndView model) {

        pageable = new PageRequest(page, size);
		Page<SiteAggregate> p = solrSiteAggregateRepository.findByStateAndYear(year, state, pageable);

        List<SiteAggregate> siteList = new ArrayList<SiteAggregate>();
        for (SiteAggregate siteAggregate : p.getContent()){
            siteList.add(siteAggregate);
        }

		return new ModelAndView("location", "locations", siteList);
	}

	@RequestMapping("/siteview")
	public ModelAndView findBySiteID(@RequestParam(value = "id",required = true) String id,  ModelAndView model) {

        		Page<SiteAggregate> p = solrSiteAggregateRepository.findById(id);

        List<SiteAggregate> siteList = new ArrayList<SiteAggregate>();
        for (SiteAggregate siteAggregate : p.getContent()){
            siteList.add(siteAggregate);
        }

		return new ModelAndView("site", "locations", siteList);
	}

    @RequestMapping(value = "/downloadCSV")
    public void downloadCSV(@RequestParam(value = "year",required = false,
	                                                    defaultValue = "2014") String year,
                                        @RequestParam(value = "state",required = false,
	                                                    defaultValue = "01") String state,
                                         @RequestParam(value = "page",required = false,
                                                        defaultValue = "0") int page,
                                         @RequestParam(value = "size",required = false,
                                                        defaultValue = "10") int size, HttpServletResponse response) throws IOException {

        String csvFileName = "location.csv";

        response.setContentType("text/csv");

        // creates mock data
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"",
                csvFileName);
        response.setHeader(headerKey, headerValue);


        // uses the Super CSV API to generate CSV data from the model data
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
                CsvPreference.STANDARD_PREFERENCE);

        String[] header = { "STATE_CD", "COUNTY_CD", "SITE_NUM", "PARAMETER_CD", "POC", "LATITUDE",
                "LONGITUDE", "DATUM", "PARAMETER_NM", "SAMPLE_DURATION", "POL_STANDARD", "METRIC_USED",
                "METHOD_NM", "YEAR", "UOM", "EVENT_TYPE", "OBSERVATION_CNT", "OBSERVATION_PCT", "VALID_DAY_CNT",
                "REQ_DY_CNT", "EXCEPTIONAL_DAY_CNT", "NULL_DATA_CNT", "PRI_EXCEEDANCE_CNT", "SEC_EXCEEDANCE_CNT",
                "CERTIFICATION_INDICATOR", "NUM_OBS_BELOW_MDL", "MEAN", "DEVIATION", "MAX_VALUE_1", "MAX_DAY_TIME_1",
                "MAX_VALUE_2", "MAX_DAY_TIME_2", "MAX_VALUE_3", "MAX_DAY_TIME_3", "MAX_VALUE_4", "MAX_DAY_TIME_4",
                "MAX_NON_OVERLAP_1", "NO_MAX_DATETIME_1", "MAX_NON_OVERLAP_2", "NO_MAX_DATETIME_2", "PERCENTILE_99",
                "PERCENTILE_98", "PERCENTILE_95", "PERCENTILE_90", "PERCENTILE_75", "PERCENTILE_50", "PERCENTILE_10",
                "LOCAL_SITE_NM", "ADDRESS", "STATE_NM", "COUNTY_NM", "CITY_NM", "CBSA_NM", "LAST_CHANGE_DT" };

        csvWriter.writeHeader(header);

        pageable = new PageRequest(0, 10);
		Page<SiteAggregate> p = solrSiteAggregateRepository.findByStateAndYear(year, state, pageable);
        for (int i = 0; i < p.getTotalPages(); i++) {
            for (SiteAggregate site : p.getContent()){
                 csvWriter.write(site, header);
            }
                if (p.hasNext()) {
                    Pageable pageRequest = p.nextPageable();
                    p = solrSiteAggregateRepository.findByStateAndYear(year, state, pageRequest);;
                }
        }

        csvWriter.close();
    }
}