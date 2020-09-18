package com.example.demo.domain;

import java.util.List;

public class SchoolTeacher {

	private String nameOfSchool;
	private String area;
	private String region;
	private String year;
	private String district;
	
	private Integer firstCategory; // o_count_category_a | Первая категория
	private Integer secondCategory; // o_count_category_b | Вторая категория
	private Integer highestCategory; // o_count_category_c | ВЫсшая категория
	private Integer withoutCategory; // o_count_category_d | Без категории
	
	private Integer before25; // o_count_age_a | до 25
	private Integer from25to34; // o_count_age_b | от 25 до 34
	private Integer from35to44; // o_count_age_c | от 35 до 44
	private Integer from45to54; // o_count_age_d | от 45 до 54
	private Integer from55to64; // o_count_age_e | от 55 до 64
	private Integer after65; // o_count_age_f | от 65
	
	private Integer withHighEducation; // o_count_education_higher | Имеет высшее образование
	private Integer withSecondaryEducation; // o_general_secondary_education | Общее среднее образование
	private Integer withCollegeEducationInteger; // o_count_education_colleges | ССУЗ
	
	private Integer numberOfTeachers;
	private String[] candidates;
	
	public SchoolTeacher() {

	}

	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
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

	public Integer getWithoutCategory() {
		return withoutCategory;
	}

	public void setWithoutCategory(Integer withoutCategory) {
		this.withoutCategory = withoutCategory;
	}

	public Integer getBefore25() {
		return before25;
	}

	public void setBefore25(Integer before25) {
		this.before25 = before25;
	}

	public Integer getFrom25to34() {
		return from25to34;
	}

	public void setFrom25to34(Integer from25to34) {
		this.from25to34 = from25to34;
	}

	public Integer getFrom35to44() {
		return from35to44;
	}

	public void setFrom35to44(Integer from35to44) {
		this.from35to44 = from35to44;
	}

	public Integer getFrom45to54() {
		return from45to54;
	}

	public void setFrom45to54(Integer from45to54) {
		this.from45to54 = from45to54;
	}

	public Integer getFrom55to64() {
		return from55to64;
	}

	public void setFrom55to64(Integer from55to64) {
		this.from55to64 = from55to64;
	}

	public Integer getAfter65() {
		return after65;
	}

	public void setAfter65(Integer after65) {
		this.after65 = after65;
	}

	public Integer getWithHighEducation() {
		return withHighEducation;
	}

	public void setWithHighEducation(Integer withHighEducation) {
		this.withHighEducation = withHighEducation;
	}

	public Integer getWithSecondaryEducation() {
		return withSecondaryEducation;
	}

	public void setWithSecondaryEducation(Integer withSecondaryEducation) {
		this.withSecondaryEducation = withSecondaryEducation;
	}

	public Integer getWithCollegeEducationInteger() {
		return withCollegeEducationInteger;
	}

	public void setWithCollegeEducationInteger(Integer withCollegeEducationInteger) {
		this.withCollegeEducationInteger = withCollegeEducationInteger;
	}

	public String[] getCandidates() {
		return candidates;
	}

	public void setCandidates(String[] candidates) {
		this.candidates = candidates;
	}

	public Integer getNumberOfTeachers() {
		return numberOfTeachers;
	}

	public void setNumberOfTeachers(Integer numberOfTeachers) {
		this.numberOfTeachers = numberOfTeachers;
	}
	
}
