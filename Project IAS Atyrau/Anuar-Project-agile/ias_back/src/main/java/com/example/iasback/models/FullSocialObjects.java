package com.example.iasback.models;

import lombok.Data;

//@Data
public class FullSocialObjects {

    private Integer  id ;
    private  String  sbid ;
    private  String  o_name ;
//    private  String   o_industry ;
    private  String   o_gategory ;
    private  String   o_year_start ;
//    private  String   o_status_project ;
    private  String   o_year_end ;
//    private  Double  o_power ;
    private  String    o_unit ;
//    private  Integer   o_numer_objects;
//    private  String   o_budget_program ;
//    private  String   o_customer ;
//    private  String   o_contractor ;
//    private  String   o_region ;
    private  String   o_rural_district;
    private  String   o_rural_settlement;
    private  String   o_latitude ;
    private  String   o_longitude ;
//    private Integer o_number_population ;
//    private Integer  o_number_women ;
//    private Integer  o_number_man ;
//    private Integer  o_numer_children ;
    private Double  o_total_project_cost;
//    private String   o_unit_project;
//    private String test_pole;
    private String snid2;
//    private String source;
    private Integer category_type;
    private Integer source_type;
    private Integer region_type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSbid() {
		return sbid;
	}
	public void setSbid(String sbid) {
		this.sbid = sbid;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getO_gategory() {
		return o_gategory;
	}
	public void setO_gategory(String o_gategory) {
		this.o_gategory = o_gategory;
	}
	public String getO_year_start() {
		return o_year_start;
	}
	public void setO_year_start(String o_year_start) {
		this.o_year_start = o_year_start;
	}
	public String getO_year_end() {
		return o_year_end;
	}
	public void setO_year_end(String o_year_end) {
		this.o_year_end = o_year_end;
	}
	public String getO_unit() {
		return o_unit;
	}
	public void setO_unit(String o_unit) {
		this.o_unit = o_unit;
	}
	public String getO_rural_district() {
		return o_rural_district;
	}
	public void setO_rural_district(String o_rural_district) {
		this.o_rural_district = o_rural_district;
	}
	public String getO_rural_settlement() {
		return o_rural_settlement;
	}
	public void setO_rural_settlement(String o_rural_settlement) {
		this.o_rural_settlement = o_rural_settlement;
	}
	public String getO_latitude() {
		return o_latitude;
	}
	public void setO_latitude(String o_latitude) {
		this.o_latitude = o_latitude;
	}
	public String getO_longitude() {
		return o_longitude;
	}
	public void setO_longitude(String o_longitude) {
		this.o_longitude = o_longitude;
	}
	public Double getO_total_project_cost() {
		return o_total_project_cost;
	}
	public void setO_total_project_cost(Double o_total_project_cost) {
		this.o_total_project_cost = o_total_project_cost;
	}
	public String getSnid2() {
		return snid2;
	}
	public void setSnid2(String snid2) {
		this.snid2 = snid2;
	}
	public Integer getCategory_type() {
		return category_type;
	}
	public void setCategory_type(Integer category_type) {
		this.category_type = category_type;
	}
	public Integer getSource_type() {
		return source_type;
	}
	public void setSource_type(Integer source_type) {
		this.source_type = source_type;
	}
	public Integer getRegion_type() {
		return region_type;
	}
	public void setRegion_type(Integer region_type) {
		this.region_type = region_type;
	}

}