package com.example.demo.domain;

public class Mortality {
	
	private String area;
	private String region;
	private String year;
	private Double maternalMortality;
	private Double infantMortality;
	private Double TuberculosisMortality;
	private Double injuriesMortality;
	private Double heartDiseaseMortality;
	private Double circulatoryDiseaseMortality; // in the table: o_mortality_from_of_the
	private Double cancerMortality;
	
	public Mortality() {
	
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

	public Double getMaternalMortality() {
		return maternalMortality;
	}

	public void setMaternalMortality(Double maternalMortality) {
		this.maternalMortality = maternalMortality;
	}

	public Double getInfantMortality() {
		return infantMortality;
	}

	public void setInfantMortality(Double infantMortality) {
		this.infantMortality = infantMortality;
	}

	public Double getTuberculosisMortality() {
		return TuberculosisMortality;
	}

	public void setTuberculosisMortality(Double tuberculosisMortality) {
		TuberculosisMortality = tuberculosisMortality;
	}

	public Double getInjuresMortality() {
		return injuriesMortality;
	}

	public void setInjuresMortality(Double injuresMortality) {
		this.injuriesMortality = injuresMortality;
	}

	public Double getHeartDiseaseMortality() {
		return heartDiseaseMortality;
	}

	public void setHeartDiseaseMortality(Double heartDiseaseMortality) {
		this.heartDiseaseMortality = heartDiseaseMortality;
	}

	public Double getCirculatoryDiseaseMortality() {
		return circulatoryDiseaseMortality;
	}

	public void setCirculatoryDiseaseMortality(Double circulatoryDiseaseMortality) {
		this.circulatoryDiseaseMortality = circulatoryDiseaseMortality;
	}

	public Double getCancerMortality() {
		return cancerMortality;
	}

	public void setCancerMortality(Double cancerMortality) {
		this.cancerMortality = cancerMortality;
	}
	
}
