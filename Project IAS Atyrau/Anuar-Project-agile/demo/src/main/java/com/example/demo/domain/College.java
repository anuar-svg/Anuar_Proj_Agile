package com.example.demo.domain;

public class College {
	
	private String name; // o_name_tipo | Наименование учреждения ТиПо
	private String area;
	private String region;
	private String year;
	
	private Integer firstCategory; // o_count_category_a | Первая категория
	private Integer secondCategory; // o_count_category_b | Вторая категория
	private Integer highestCategory; // o_count_category_c | Высшая категория
	private Integer magistracy; // o_count_magistrate | Магистр
	private Integer doctorOfTechnicalSciences; // o_count_doctor_engineering | Доктор технических наук
	private Integer withoutCategory; // o_count_category_d | Без категории
	private Integer withHighEducation; // o_count_education_higher | Имеет высшее образование
	private Integer withGeneralSecondaryEducation; //o_count_general_secondary_education | Общее среднее образование
	private Integer withCollegeEducation; // o_count_education_colleges | ССУЗ
	
	private Integer numberOfAcceptedStudents; // o_count_accepted_students | принятые студенты
	private Integer numberOfGraduates; // o_count_graduates | Выпускники
	private Integer numberOfDesignCapacity; // o_count_design_capacity | Проектная мощность
	private Integer numberOfReleasedStudents; // o_count_released_students | Выпущенные студенты
	private Integer needForPersonnel; 	// COUNT(candidat) FROM edu_college_table
	private Integer numberOfPersonnel; // o_count_teachers | Количество кадров
	
	
	public College() {

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFirstCategory() {
		return firstCategory;
	}

	public void setFirstCategory(Integer firstCategory) {
		this.firstCategory = firstCategory;
	}

	public Integer getSecondCategory() {
		return secondCategory;
	}

	public void setSecondCategory(Integer secondCategory) {
		this.secondCategory = secondCategory;
	}

	public Integer getHighestCategory() {
		return highestCategory;
	}

	public void setHighestCategory(Integer highestCategory) {
		this.highestCategory = highestCategory;
	}

	public Integer getMagistracy() {
		return magistracy;
	}

	public void setMagistracy(Integer magistracy) {
		this.magistracy = magistracy;
	}

	public Integer getDoctorOfTechnicalSciences() {
		return doctorOfTechnicalSciences;
	}

	public void setDoctorOfTechnicalSciences(Integer doctorOfTechnicalSciences) {
		this.doctorOfTechnicalSciences = doctorOfTechnicalSciences;
	}

	public Integer getWithoutCategory() {
		return withoutCategory;
	}

	public void setWithoutCategory(Integer withoutCategory) {
		this.withoutCategory = withoutCategory;
	}

	public Integer getWithHighEducation() {
		return withHighEducation;
	}

	public void setWithHighEducation(Integer withHighEducation) {
		this.withHighEducation = withHighEducation;
	}

	public Integer getWithGeneralSecondaryEducation() {
		return withGeneralSecondaryEducation;
	}

	public void setWithGeneralSecondaryEducation(Integer withGeneralSecondaryEducation) {
		this.withGeneralSecondaryEducation = withGeneralSecondaryEducation;
	}

	public Integer getWithCollegeEducation() {
		return withCollegeEducation;
	}

	public void setWithCollegeEducation(Integer withCollegeEducation) {
		this.withCollegeEducation = withCollegeEducation;
	}

	public Integer getNumberOfAcceptedStudents() {
		return numberOfAcceptedStudents;
	}

	public void setNumberOfAcceptedStudents(Integer numberOfAcceptedStudents) {
		this.numberOfAcceptedStudents = numberOfAcceptedStudents;
	}

	public Integer getNumberOfGraduates() {
		return numberOfGraduates;
	}

	public void setNumberOfGraduates(Integer numberOfGraduates) {
		this.numberOfGraduates = numberOfGraduates;
	}

	public Integer getNumberOfDesignCapacity() {
		return numberOfDesignCapacity;
	}

	public void setNumberOfDesignCapacity(Integer numberOfDesignCapacity) {
		this.numberOfDesignCapacity = numberOfDesignCapacity;
	}

	public Integer getNumberOfReleasedStudents() {
		return numberOfReleasedStudents;
	}

	public void setNumberOfReleasedStudents(Integer numberOfReleasedStudents) {
		this.numberOfReleasedStudents = numberOfReleasedStudents;
	}

	public Integer getNeedForPersonnel() {
		return needForPersonnel;
	}

	public void setNeedForPersonnel(Integer needForPersonnel) {
		this.needForPersonnel = needForPersonnel;
	}

	public long getNumberOfPersonnel() {
		return numberOfPersonnel;
	}

	public void setNumberOfPersonnel(Integer numberOfPersonnel) {
		this.numberOfPersonnel = numberOfPersonnel;
	}
	
}
