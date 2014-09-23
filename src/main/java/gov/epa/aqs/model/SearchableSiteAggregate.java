/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.epa.aqs.model;

/**
 * @author Tim Preuss
 */
public interface SearchableSiteAggregate {

    String ID_FIELD = "id";
    String YEAR_FIELD = "year";
    String STATE_CD_FIELD= "state_cd";
    String COUNTY_CD_FIELD = "county_cd";
    String SITE_NUM_FIELD = "site_num";
    String PARAMETER_CD_FIELD = "parameter_cd";
    String POC_FIELD = "poc";
    String LATITUDE_FIELD = "latitude";
    String LONGITUDE_FIELD = "longitude";
    String DATUM_FIELD = "datum";
    String PARAMETER_NM_FIELD = "parameter_nm";
    String SAMPLE_DURATION_FIELD ="sample_duration";
    String POL_STANDARD_FIELD = "pol_standard";
    String METRIC_USED_FIELD ="metric_used";
    String METHOD_NM_FIELD= "method_nm";
    String UOM_FIELD ="uom";
    String EVENT_TYPE_FIELD = "event_type";
    String OBSERVATION_CNT_FIELD = "observation_cnt";
    String OBSERVATION_PCT_FIELD = "observation_pct";
    String VALID_DAY_CNT_FIELD = "valid_day_cnt";
    String REQ_DY_CNT_FIELD = "req_dy_cnt";
    String EXCEPTIONAL_DAY_CNT_FIELD = "exceptional_day_cnt";
    String NULL_DATA_CNT_FIELD ="null_data_cnt";
    String PRI_EXCEEDANCE_CNT_FIELD = "pri_exceedance_cnt";
    String SEC_EXCEEDANCE_CNT_FIELD ="sec_exceedance_cnt";
    String CERTIFICATION_INDICATOR_FIELD = "certification_indicator";
    String NUM_OBS_BELOW_MDL_FIELD = "num_obs_below_mdl";
    String MEAN_FIELD= "mean";
    String DEVIATION_FIELD= "deviation";
    String MAX_VALUE_1_FIELD="max_value_1";
    String MAX_DAY_TIME_1_FIELD ="max_day_time_1";
    String MAX_VALUE_2_FIELD = "max_value_2";
    String MAX_DAY_TIME_2_FIELD = "max_day_time_2";
    String MAX_VALUE_3_FIELD = "max_value_3";
    String MAX_DAY_TIME_3_FIELD = "max_day_time_3";
    String MAX_VALUE_4_FIELD = "max_value_4";
    String MAX_DAY_TIME_4_FIELD = "max_day_time_4";
    String MAX_NON_OVERLAP_1_FIELD = "max_non_overlap_1";
    String NO_MAX_DATETIME_1_FIELD = "no_max_datetime_1";
    String MAX_NON_OVERLAP_2_FIELD = "max_non_overlap_2";
    String NO_MAX_DATETIME_2_FIELD = "no_max_datetime_2";
    String PERCENTILE_99_FIELD = "percentile_99";
    String PERCENTILE_98_FIELD = "percentile_98";
    String PERCENTILE_95_FIELD = "percentile_95";
    String PERCENTILE_90_FIELD = "percentile_90";
    String PERCENTILE_75_FIELD = "percentile_75";
    String PERCENTILE_50_FIELD = "percentile_50";
    String PERCENTILE_10_FIELD = "percentile_10";
    String LOCAL_SITE_NM_FIELD = "local_site_nm";
    String ADDRESS_FIELD= "address";
    String STATE_NM_FIELD = "state_nm";
    String COUNTY_NM_FIELD = "county_nm";
    String CITY_NM_FIELD = "city_nm";
    String CBSA_NM_FIELD = "cbsa_nm";
    String LAST_CHANGE_DT_FIELD ="last_change_dt";

}
