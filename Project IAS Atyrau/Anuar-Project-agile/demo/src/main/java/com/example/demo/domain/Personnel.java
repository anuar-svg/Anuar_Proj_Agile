package com.example.demo.domain;

public class Personnel {

	private String area;
	private String region;
	private String year;
	
	private Integer numberOfDoctors; // o_number_doctors | Численность врачей
	private Integer numberOfAverageMedicalStaff; // o_number_nurses | Численность среднего медперсонала
	private Double StaffingOfDoctors; // o_staffing_medical_personnel | Укомплектованность врачами
	
	private Double provisionOfAverageMedicalStaff;// o_provision_medical_personnel | Обеспеченность населения средним персоналом
	private Double provisionOfDoctors; // o_provision_population_doctors | Обеспеченность населения врачами
	
	private Double numberOfMedicalStaffPositions; // o_number_medical_staff_positions | Количество врачебных штатных должностей
	private Double numberOfHeldMedicalPositions ; // o_number_medical_positions_held | Количество врачебных занятых должностей

	public Personnel() {

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

	public Integer getNumberOfDoctors() {
		return numberOfDoctors;
	}

	public void setNumberOfDoctors(Integer numberOfDoctors) {
		this.numberOfDoctors = numberOfDoctors;
	}

	public Integer getNumberOfAverageMedicalStaff() {
		return numberOfAverageMedicalStaff;
	}

	public void setNumberOfAverageMedicalStaff(Integer numberOfAverageMedicalStaff) {
		this.numberOfAverageMedicalStaff = numberOfAverageMedicalStaff;
	}

	public Double getStaffingOfDoctors() {
		return StaffingOfDoctors;
	}

	public void setStaffingOfDoctors(Double staffingOfDoctors) {
		StaffingOfDoctors = staffingOfDoctors;
	}

	public Double getProvisionOfAverageMedicalStaff() {
		return provisionOfAverageMedicalStaff;
	}

	public void setProvisionOfAverageMedicalStaff(Double provisionOfAverageMedicalStaff) {
		this.provisionOfAverageMedicalStaff = provisionOfAverageMedicalStaff;
	}

	public Double getProvisionOfDoctors() {
		return provisionOfDoctors;
	}

	public void setProvisionOfDoctors(Double provisionOfDoctors) {
		this.provisionOfDoctors = provisionOfDoctors;
	}

	public Double getNumberOfMedicalStaffPositions() {
		return numberOfMedicalStaffPositions;
	}

	public void setNumberOfMedicalStaffPositions(Double numberOfMedicalStaffPositions) {
		this.numberOfMedicalStaffPositions = numberOfMedicalStaffPositions;
	}

	public Double getNumberOfHeldMedicalPositions() {
		return numberOfHeldMedicalPositions;
	}

	public void setNumberOfHeldMedicalPositions(Double numberOfHeldMedicalPositions) {
		this.numberOfHeldMedicalPositions = numberOfHeldMedicalPositions;
	}
	
}
