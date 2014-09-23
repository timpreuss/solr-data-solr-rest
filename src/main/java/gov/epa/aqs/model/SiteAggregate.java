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

import org.apache.solr.client.solrj.beans.Field;

/**
 * @author Tim Preuss
 */
public class SiteAggregate implements SearchableSiteAggregate {

    @Field(ID_FIELD)
    private String id;

    @Field(YEAR_FIELD)
    private String year;

    @Field(STATE_CD_FIELD)
    private String state_cd;

    @Field(COUNTY_CD_FIELD )
    private String county_cd;

    @Field(SITE_NUM_FIELD)
    private String site_num;

    @Field(PARAMETER_CD_FIELD)
    private String parameter_cd;

    @Field(POC_FIELD)
    private String poc;

    @Field(LATITUDE_FIELD)
    private String latitude;

    @Field(LONGITUDE_FIELD)
    private String longitude;

    @Field(DATUM_FIELD)
    private String datum;

    @Field(PARAMETER_NM_FIELD)
    private String parameter_nm;

    @Field(SAMPLE_DURATION_FIELD)
    private String sample_duration;

    @Field(POL_STANDARD_FIELD)
    private String pol_standard;

    @Field(METRIC_USED_FIELD)
    private String metric_used;

    @Field(METHOD_NM_FIELD)
    private String method_nm;

    @Field(UOM_FIELD)
    private String uom;

    @Field(EVENT_TYPE_FIELD)
    private String event_type;

    @Field(OBSERVATION_CNT_FIELD)
    private String observation_cnt;

    @Field(OBSERVATION_PCT_FIELD)
    private String observation_pct;

    @Field(VALID_DAY_CNT_FIELD)
    private String valid_day_cnt;

    @Field(REQ_DY_CNT_FIELD)
    private String req_dy_cnt;

    @Field(EXCEPTIONAL_DAY_CNT_FIELD)
    private String exceptional_day_cnt;

    @Field(NULL_DATA_CNT_FIELD)
    private String null_data_cnt;

    @Field(PRI_EXCEEDANCE_CNT_FIELD )
    private String pri_exceedance_cnt;

    @Field(SEC_EXCEEDANCE_CNT_FIELD)
    private String sec_exceedance_cnt;

    @Field(CERTIFICATION_INDICATOR_FIELD)
    private String certification_indicator;

    @Field(NUM_OBS_BELOW_MDL_FIELD )
    private String num_obs_below_mdl;

    @Field(MEAN_FIELD)
    private String mean;

    @Field(DEVIATION_FIELD)
    private String deviation;

    @Field(MAX_VALUE_1_FIELD)
    private String max_value_1;

    @Field(MAX_DAY_TIME_1_FIELD)
    private String max_day_time_1;

    @Field(MAX_VALUE_2_FIELD)
    private String max_value_2;

    @Field(MAX_DAY_TIME_2_FIELD)
    private String max_day_time_2;

    @Field(MAX_VALUE_3_FIELD)
    private String max_value_3;

    @Field(MAX_DAY_TIME_3_FIELD)
    private String max_day_time_3;

    @Field(MAX_VALUE_4_FIELD)
    private String max_value_4;

    @Field(MAX_DAY_TIME_4_FIELD)
    private String max_day_time_4;

    @Field(MAX_NON_OVERLAP_1_FIELD)
    private String max_non_overlap_1;

    @Field(NO_MAX_DATETIME_1_FIELD)
    private String no_max_datetime_1;

    @Field(MAX_NON_OVERLAP_2_FIELD)
    private String max_non_overlap_2;

    @Field(NO_MAX_DATETIME_2_FIELD)
    private String no_max_datetime_2;

    @Field(PERCENTILE_99_FIELD)
    private String percentile_99;

    @Field(PERCENTILE_98_FIELD)
    private String percentile_98;

    @Field(PERCENTILE_95_FIELD)
    private String percentile_95;

    @Field(PERCENTILE_90_FIELD)
    private String percentile_90;

    @Field(PERCENTILE_75_FIELD)
    private String percentile_75;

    @Field(PERCENTILE_50_FIELD)
    private String percentile_50;

    @Field(PERCENTILE_10_FIELD)
    private String percentile_10;

    @Field(LOCAL_SITE_NM_FIELD)
    private String local_site_nm;

    @Field(ADDRESS_FIELD)
    private String address;

    @Field(STATE_NM_FIELD)
    private String state_nm;

    @Field(COUNTY_NM_FIELD)
    private String county_nm;

    @Field(CITY_NM_FIELD)
    private String city_nm;

    @Field(CBSA_NM_FIELD)
    private String cbsa_nm;

    @Field(LAST_CHANGE_DT_FIELD)
    private String last_change_dt;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getState_cd() {
        return state_cd;
    }

    public void setState_cd(final String state_cd) {
        this.state_cd = state_cd;
    }

    public String getCounty_cd() {
        return county_cd;
    }

    public void setCounty_cd(final String county_cd) {
        this.county_cd = county_cd;
    }

    public String getSite_num() {
        return site_num;
    }

    public void setSite_num(final String site_num) {
        this.site_num = site_num;
    }

    public String getParameter_cd() {
        return parameter_cd;
    }

    public void setParameter_cd(final String parameter_cd) {
        this.parameter_cd = parameter_cd;
    }

    public String getPoc() {
        return poc;
    }

    public void setPoc(final String poc) {
        this.poc = poc;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(final String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(final String longitude) {
        this.longitude = longitude;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(final String datum) {
        this.datum = datum;
    }

    public String getParameter_nm() {
        return parameter_nm;
    }

    public void setParameter_nm(final String parameter_nm) {
        this.parameter_nm = parameter_nm;
    }

    public String getSample_duration() {
        return sample_duration;
    }

    public void setSample_duration(final String sample_duration) {
        this.sample_duration = sample_duration;
    }

    public String getPol_standard() {
        return pol_standard;
    }

    public void setPol_standard(final String pol_standard) {
        this.pol_standard = pol_standard;
    }

    public String getMetric_used() {
        return metric_used;
    }

    public void setMetric_used(final String metric_used) {
        this.metric_used = metric_used;
    }

    public String getMethod_nm() {
        return method_nm;
    }

    public void setMethod_nm(final String method_nm) {
        this.method_nm = method_nm;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(final String uom) {
        this.uom = uom;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(final String event_type) {
        this.event_type = event_type;
    }

    public String getObservation_cnt() {
        return observation_cnt;
    }

    public void setObservation_cnt(final String observation_cnt) {
        this.observation_cnt = observation_cnt;
    }

    public String getObservation_pct() {
        return observation_pct;
    }

    public void setObservation_pct(final String observation_pct) {
        this.observation_pct = observation_pct;
    }

    public String getValid_day_cnt() {
        return valid_day_cnt;
    }

    public void setValid_day_cnt(final String valid_day_cnt) {
        this.valid_day_cnt = valid_day_cnt;
    }

    public String getReq_dy_cnt() {
        return req_dy_cnt;
    }

    public void setReq_dy_cnt(final String req_dy_cnt) {
        this.req_dy_cnt = req_dy_cnt;
    }

    public String getExceptional_day_cnt() {
        return exceptional_day_cnt;
    }

    public void setExceptional_day_cnt(final String exceptional_day_cnt) {
        this.exceptional_day_cnt = exceptional_day_cnt;
    }

    public String getNull_data_cnt() {
        return null_data_cnt;
    }

    public void setNull_data_cnt(final String null_data_cnt) {
        this.null_data_cnt = null_data_cnt;
    }

    public String getPri_exceedance_cnt() {
        return pri_exceedance_cnt;
    }

    public void setPri_exceedance_cnt(final String pri_exceedance_cnt) {
        this.pri_exceedance_cnt = pri_exceedance_cnt;
    }

    public String getSec_exceedance_cnt() {
        return sec_exceedance_cnt;
    }

    public void setSec_exceedance_cnt(final String sec_exceedance_cnt) {
        this.sec_exceedance_cnt = sec_exceedance_cnt;
    }

    public String getCertification_indicator() {
        return certification_indicator;
    }

    public void setCertification_indicator(final String certification_indicator) {
        this.certification_indicator = certification_indicator;
    }

    public String getNum_obs_below_mdl() {
        return num_obs_below_mdl;
    }

    public void setNum_obs_below_mdl(final String num_obs_below_mdl) {
        this.num_obs_below_mdl = num_obs_below_mdl;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(final String mean) {
        this.mean = mean;
    }

    public String getDeviation() {
        return deviation;
    }

    public void setDeviation(final String deviation) {
        this.deviation = deviation;
    }

    public String getMax_value_1() {
        return max_value_1;
    }

    public void setMax_value_1(final String max_value_1) {
        this.max_value_1 = max_value_1;
    }

    public String getMax_day_time_1() {
        return max_day_time_1;
    }

    public void setMax_day_time_1(final String max_day_time_1) {
        this.max_day_time_1 = max_day_time_1;
    }

    public String getMax_value_2() {
        return max_value_2;
    }

    public void setMax_value_2(final String max_value_2) {
        this.max_value_2 = max_value_2;
    }

    public String getMax_day_time_2() {
        return max_day_time_2;
    }

    public void setMax_day_time_2(final String max_day_time_2) {
        this.max_day_time_2 = max_day_time_2;
    }

    public String getMax_value_3() {
        return max_value_3;
    }

    public void setMax_value_3(final String max_value_3) {
        this.max_value_3 = max_value_3;
    }

    public String getMax_day_time_3() {
        return max_day_time_3;
    }

    public void setMax_day_time_3(final String max_day_time_3) {
        this.max_day_time_3 = max_day_time_3;
    }

    public String getMax_value_4() {
        return max_value_4;
    }

    public void setMax_value_4(final String max_value_4) {
        this.max_value_4 = max_value_4;
    }

    public String getMax_day_time_4() {
        return max_day_time_4;
    }

    public void setMax_day_time_4(final String max_day_time_4) {
        this.max_day_time_4 = max_day_time_4;
    }

    public String getMax_non_overlap_1() {
        return max_non_overlap_1;
    }

    public void setMax_non_overlap_1(final String max_non_overlap_1) {
        this.max_non_overlap_1 = max_non_overlap_1;
    }

    public String getNo_max_datetime_1() {
        return no_max_datetime_1;
    }

    public void setNo_max_datetime_1(final String no_max_datetime_1) {
        this.no_max_datetime_1 = no_max_datetime_1;
    }

    public String getMax_non_overlap_2() {
        return max_non_overlap_2;
    }

    public void setMax_non_overlap_2(final String max_non_overlap_2) {
        this.max_non_overlap_2 = max_non_overlap_2;
    }

    public String getNo_max_datetime_2() {
        return no_max_datetime_2;
    }

    public void setNo_max_datetime_2(final String no_max_datetime_2) {
        this.no_max_datetime_2 = no_max_datetime_2;
    }

    public String getPercentile_99() {
        return percentile_99;
    }

    public void setPercentile_99(final String percentile_99) {
        this.percentile_99 = percentile_99;
    }

    public String getPercentile_98() {
        return percentile_98;
    }

    public void setPercentile_98(final String percentile_98) {
        this.percentile_98 = percentile_98;
    }

    public String getPercentile_95() {
        return percentile_95;
    }

    public void setPercentile_95(final String percentile_95) {
        this.percentile_95 = percentile_95;
    }

    public String getPercentile_90() {
        return percentile_90;
    }

    public void setPercentile_90(final String percentile_90) {
        this.percentile_90 = percentile_90;
    }

    public String getPercentile_75() {
        return percentile_75;
    }

    public void setPercentile_75(final String percentile_75) {
        this.percentile_75 = percentile_75;
    }

    public String getPercentile_50() {
        return percentile_50;
    }

    public void setPercentile_50(final String percentile_50) {
        this.percentile_50 = percentile_50;
    }

    public String getPercentile_10() {
        return percentile_10;
    }

    public void setPercentile_10(final String percentile_10) {
        this.percentile_10 = percentile_10;
    }

    public String getLocal_site_nm() {
        return local_site_nm;
    }

    public void setLocal_site_nm(final String local_site_nm) {
        this.local_site_nm = local_site_nm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getState_nm() {
        return state_nm;
    }

    public void setState_nm(final String state_nm) {
        this.state_nm = state_nm;
    }

    public String getCounty_nm() {
        return county_nm;
    }

    public void setCounty_nm(final String county_nm) {
        this.county_nm = county_nm;
    }

    public String getCity_nm() {
        return city_nm;
    }

    public void setCity_nm(final String city_nm) {
        this.city_nm = city_nm;
    }

    public String getCbsa_nm() {
        return cbsa_nm;
    }

    public void setCbsa_nm(final String cbsa_nm) {
        this.cbsa_nm = cbsa_nm;
    }

    public String getLast_change_dt() {
        return last_change_dt;
    }

    public void setLast_change_dt(final String last_change_dt) {
        this.last_change_dt = last_change_dt;
    }

    @Override
  public String toString() {
    return "SiteAggregate [id=" + id + ", year=" + year + "]";
  }

}
