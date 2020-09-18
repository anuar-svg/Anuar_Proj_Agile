package com.example.demo.domain;

public class OrganizationsInfo {

	private String area;
	private String region;
	private String year;
	private Integer inpatientCare;
	private Double patientPolyclinicHelp; // амбулаторно-поликлинеческая помощь
	private Integer totalNumberOfHospitalBeds; // общее кол-во больничных коек | o_number_of_hospital_beds
	private Integer hospitalOrganizationsWithBeds; // в таблице: o_number_dhb_mon_system
	private Integer patientPolyclinicsWithBeds; // o_number_oo_hbdh
	private Double provisionHospitalBeds; // предоставление больничных коек 
	
	public OrganizationsInfo() {
	
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

	public Integer getInpatientCare() {
		return inpatientCare;
	}

	public void setInpatientCare(Integer inpatientCare) {
		this.inpatientCare = inpatientCare;
	}

	public Double getPatientPolyclinicHelp() {
		return patientPolyclinicHelp;
	}

	public void setPatientPolyclinicHelp(Double patientPolyclinicHelp) {
		this.patientPolyclinicHelp = patientPolyclinicHelp;
	}

	public Integer getTotalNumberOfHospitalBeds() {
		return totalNumberOfHospitalBeds;
	}

	public void setTotalNumberOfHospitalBeds(Integer totalNumberOfHospitalBeds) {
		this.totalNumberOfHospitalBeds = totalNumberOfHospitalBeds;
	}

	public Integer getHospitalOrganizationsWithBeds() {
		return hospitalOrganizationsWithBeds;
	}

	public void setHospitalOrganizationsWithBeds(Integer hospitalOrganizationsWithBeds) {
		this.hospitalOrganizationsWithBeds = hospitalOrganizationsWithBeds;
	}

	public Integer getPatientPolyclinicsWithBeds() {
		return patientPolyclinicsWithBeds;
	}

	public void setPatientPolyclinicsWithBeds(Integer patientPolyclinicsWithBeds) {
		this.patientPolyclinicsWithBeds = patientPolyclinicsWithBeds;
	}

	public Double getProvisionHospitalBeds() {
		return provisionHospitalBeds;
	}

	public void setProvisionHospitalBeds(Double provisionHospitalBeds) {
		this.provisionHospitalBeds = provisionHospitalBeds;
	}
	
}
