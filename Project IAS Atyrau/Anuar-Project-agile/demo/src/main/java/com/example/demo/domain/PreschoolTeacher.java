package com.example.demo.domain;

public class PreschoolTeacher {

	private String name; // o_name_ddo | Наименование учреждения ДДО
	private String area;
	private String region;
	private String district;
	private String year;
	
	private Integer before30; // o_age | До 30 лет
	private Integer from30to39; // o_age_a | От 30 до 39	
	private Integer from40to49; // o_age_b | От 40 до 49
	private Integer from50to59; // o_age_c | От 50 до 59
	private Integer after59; // o_age_d | Свыше 59
	
	private Integer withHighEducation; // o_education | ВУЗ
	private Integer withCollegeEducation; // o_education_a | ССУЗ
	
	private Integer before5; // o_experience | 0-5
	private Integer from5to10; // o_experience_a | 5-10
	private Integer from10to15; // o_experience_b | 10-15
	private Integer after15; // o_experience_c | 15+
	
	private Integer numberOfTeachers; // o_number_frames | Количество педагогов
	private String[] candidates; // candidat FROM edu_ddo_tablei | Потребность кадров
	
	public PreschoolTeacher() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getBefore30() {
		return before30;
	}

	public void setBefore30(Integer before30) {
		this.before30 = before30;
	}

	public Integer getFrom30to39() {
		return from30to39;
	}

	public void setFrom30to39(Integer from30to39) {
		this.from30to39 = from30to39;
	}

	public Integer getFrom40to49() {
		return from40to49;
	}

	public void setFrom40to49(Integer from40to49) {
		this.from40to49 = from40to49;
	}

	public Integer getFrom50to59() {
		return from50to59;
	}

	public void setFrom50to59(Integer from50to59) {
		this.from50to59 = from50to59;
	}

	public Integer getAfter59() {
		return after59;
	}

	public void setAfter59(Integer after59) {
		this.after59 = after59;
	}

	public Integer getWithHighEducation() {
		return withHighEducation;
	}

	public void setWithHighEducation(Integer withHighEducation) {
		this.withHighEducation = withHighEducation;
	}

	public Integer getWithCollegeEducation() {
		return withCollegeEducation;
	}

	public void setWithCollegeEducation(Integer withCollegeEducation) {
		this.withCollegeEducation = withCollegeEducation;
	}

	public Integer getBefore5() {
		return before5;
	}

	public void setBefore5(Integer before5) {
		this.before5 = before5;
	}

	public Integer getFrom5to10() {
		return from5to10;
	}

	public void setFrom5to10(Integer from5to10) {
		this.from5to10 = from5to10;
	}

	public Integer getFrom10to15() {
		return from10to15;
	}

	public void setFrom10to15(Integer from10to15) {
		this.from10to15 = from10to15;
	}

	public Integer getAfter15() {
		return after15;
	}

	public void setAfter15(Integer after15) {
		this.after15 = after15;
	}

	public Integer getNumberOfTeachers() {
		return numberOfTeachers;
	}

	public void setNumberOfTeachers(Integer numberOfTeachers) {
		this.numberOfTeachers = numberOfTeachers;
	}

	public String[] getCandidates() {
		return candidates;
	}

	public void setCandidates(String[] candidates) {
		this.candidates = candidates;
	}
	
}
