package com.example.demo.domain;

import lombok.Data;

//@Data
public class Demography {

	private String area;
	private String region;
	private String year;
	private Double fertility;
	private Double overallMortalityRate;
	private Double naturalPopulationGrowth;
	private Double lifeExpectancy;
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Double getFertility() {
		return fertility;
	}

	public void setFertility(Double fertility) {
		this.fertility = fertility;
	}

	public Double getOverallMortalityRate() {
		return overallMortalityRate;
	}

	public void setOverallMortalityRate(Double mortality) {
		this.overallMortalityRate = mortality;
	}

	public Double getNaturalPopulationGrowth() {
		return naturalPopulationGrowth;
	}

	public void setNaturalPopulationGrowth(Double naturalPopulationGrowth) {
		this.naturalPopulationGrowth = naturalPopulationGrowth;
	}

	public Double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(Double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	
}
