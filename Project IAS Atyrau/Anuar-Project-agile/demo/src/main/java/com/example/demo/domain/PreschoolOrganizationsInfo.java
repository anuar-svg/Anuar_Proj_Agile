package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class PreschoolOrganizationsInfo {
	
	private String area;
	private String region;
	private String year;
	private Integer numberOfChildren; // o_numer_children | Количество детей в ДДО
	private Integer numberOfPersonnel; // o_number_frames | Количество кадров в ДДО
	private Integer numberOfPlaces; // o_number_packages | Количество мест в ДДО
	private Integer numberOfWaiters; // o_number_waiting_lists | Количество очередников
	private List<String> districts; // o_rural_district | Сельские округи
	private List<String> kindergartens; // o_name_ddo | Наименование учреждений ДДО
	
	public PreschoolOrganizationsInfo() {
		
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(Integer numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public Integer getNumberOfPersonnel() {
		return numberOfPersonnel;
	}

	public void setNumberOfPersonnel(Integer numberOfPersonnel) {
		this.numberOfPersonnel = numberOfPersonnel;
	}

	public Integer getNumberOfPlaces() {
		return numberOfPlaces;
	}

	public void setNumberOfPlaces(Integer numberOfPlaces) {
		this.numberOfPlaces = numberOfPlaces;
	}

	public List<String> getDistricts() {
		return districts;
	}

	public void setDistricts(List<String> districts) {
		this.districts = districts;
	}
	
	public void setDistrict(String district) {
		if (this.districts == null) {
			this.districts = new ArrayList<String>();
		}
		this.districts.add(district);
	}

	public List<String> getKindergartens() {
		return kindergartens;
	}

	public void setKindergartens(List<String> kindergartens) {
		this.kindergartens = kindergartens;
	}
	
	public void setKindergarten(String kindergarten) {
		if (this.kindergartens == null) {
			this.kindergartens = new ArrayList<String>();
		}
		this.kindergartens.add(kindergarten);
	}

	public Integer getNumberOfWaiters() {
		return numberOfWaiters;
	}

	public void setNumberOfWaiters(Integer numberOfWaiters) {
		this.numberOfWaiters = numberOfWaiters;
	}
	
}
