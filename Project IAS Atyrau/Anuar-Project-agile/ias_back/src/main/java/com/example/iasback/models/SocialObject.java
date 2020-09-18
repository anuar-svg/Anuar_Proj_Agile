package com.example.iasback.models;

import lombok.Data;

import java.time.LocalDate;

//@Data
public class SocialObject {
    private Integer id;
    private String name;
    private Float latitude;
    private Float longitude;
    private Integer start;
    private Integer end;
    private Integer category_type;
    private Integer source_type;
    private Integer region_type;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
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