package com.example.demo.domain;

public class EducationMonitoring {

	private String year;
	private String area;
	
	private Integer suicideBefore18; // o_suicide | Суицид до восемнодцати лет
	private Double ENTParticipantsFromAllStudents; // o_share_participants_ent | Доля учащихся принявшие участие в ЕНТ от общего количества учащихся
	private Double ENTParticipantsComparedToLastYear; // o_number_participants | Количество участников ЕНТ в сравнении с прошлым годом
	private Integer numberOfENTParticipants ; // o_number_participants_ent | Количество участников ЕНТ
	private Double averagENTScoreInComparedToLastYear; // o_average_score_compared_lastyear | Средний балл ЕНТ в сравнении с прошлым годом
	private Double averageENTScore; // o_average_score_ent | Средний балл по итогам ЕНТ
	private Double AltynBelgiApplicantsComparedToLastYear; // o_applicants_altynbelgi_comparison_lastyear | Количество претендентов "Алтын Белги" в сравнении с прошлым годом
	private Integer AltynBelgiApplicants; // o_number_applicants_altynbelgi | Количество претендентов Алтын Белги
	private Integer numberOfConfirmedAltynBelgi; // o_number_confirmed_altynbelgi | Количество подтвердивших Алтын Белги 
	private Double numberOfConfirmedAltynBelgiComparedToTotalNumber; // o_number_confirmed_altynbelgi_total | Количество подтвердивших Алтын Белги в сравнении с общим количество претендентов
	private Double certificateWithHonorsApplicantsComparedToLastYear; // o_number_applicants_certificate_honors_lastyear | Количество претендентов на Аттестат с отличием в сравнении с прошлым годом
	private Integer numberOfConfirmedCertificateWithHonors; // o_confirmed_certificate_honors | Количество подтвердивших Аттестат с отличием
	private Integer graduatesWithUnsatisfactoryResult; // o_with_result_unsatisfactory | количество выпускников, набравших результат "неудовлетворительно"
	private Integer graduatesWithBelowTheThreshold; // o_scores_below_threshold | Количество выпускников, набравших результаты ниже порогового уровня
	private Double coverageChildrenWithEducationFrom1To6; // o_coverage_children_1_6 | Охват детей дошкольников воспитанием и обучением с 1 до 6 лет
	private Double coverageChildrenWithEducationFrom3To6; // o_coverage_children_3_6 | Охват детей дошкольников воспитанием и обучением с 3 до 6 
	private Double providingPreschoolEducationInUrbanAndRuralAreas; // o_provision_education_urban_rural | Обеспечение дошкольным образованием в городской и сельской местности
	private Double shareOfEmployedGraduatesFromTotal; // o_share_employed_graduates | Доля трудоустроенных выпускников технического и профессионального образование по специальости от общего количества выпускников
	private Integer totalNumberOfGraduates; // o_number_graduates_total | Количество выпускников всего
	private Double numberOfGraduatesComparedToLasttYear; // o_number_graduates_compared_lastyear | Количесвто выпускников в сравнении с прошлым годом
	private Double numberOfEducationalFacilities; // o_number_educational_facilities | Количество обьектов образования
	private Integer numbrOfSchools; // o_number_schools | Количество школ
	private Integer numberOfKindergartens; // o_number_kindergartens | Количество детских садов
	private Double numberOfEmergencyFaciliies; // o_number_emergency_facilities | Количество аварийных обьектов
	private Double numberOfEmergencyKindrgartens; // o_number_emergency_kindergartens | Количество аварийных детских садов
	private Double numberOfEmergencySchools; // o_number_emergency_schools | Количество аварийных школ
	private Double overageOfChildrenWithAdditionalEducation; // o_coverage_additional_education | Охват детей дополнительным образованием
	private Double organizationsOfHotMealsForPupils; // o_hot_feed_data | Данные об организации горячего питания обучающихся общеобразовательных школ области
	
	public EducationMonitoring() {

	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getSuicideBefore18() {
		return suicideBefore18;
	}

	public void setSuicideBefore18(Integer suicideBefore18) {
		this.suicideBefore18 = suicideBefore18;
	}

	public Double getENTParticipantsFromAllStudents() {
		return ENTParticipantsFromAllStudents;
	}

	public void setENTParticipantsFromAllStudents(Double eNTParticipantsFromAllStudents) {
		ENTParticipantsFromAllStudents = eNTParticipantsFromAllStudents;
	}

	public Double getENTParticipantsComparedToLastYear() {
		return ENTParticipantsComparedToLastYear;
	}

	public void setENTParticipantsComparedToLastYear(Double eNTParticipantsComparedToLastYear) {
		ENTParticipantsComparedToLastYear = eNTParticipantsComparedToLastYear;
	}

	public Integer getNumberOfENTParticipants() {
		return numberOfENTParticipants;
	}

	public void setNumberOfENTParticipants(Integer numberOfENTParticipants) {
		this.numberOfENTParticipants = numberOfENTParticipants;
	}

	public Double getAveragENTScoreInComparedToLastYear() {
		return averagENTScoreInComparedToLastYear;
	}

	public void setAveragENTScoreInComparedToLastYear(Double averagENTScoreInComparedToLastYear) {
		this.averagENTScoreInComparedToLastYear = averagENTScoreInComparedToLastYear;
	}

	public Double getAverageENTScore() {
		return averageENTScore;
	}

	public void setAverageENTScore(Double averageENTScore) {
		this.averageENTScore = averageENTScore;
	}

	public Double getAltynBelgiApplicantsComparedToLastYear() {
		return AltynBelgiApplicantsComparedToLastYear;
	}

	public void setAltynBelgiApplicantsComparedToLastYear(Double altynBelgiApplicantsComparedToLastYear) {
		AltynBelgiApplicantsComparedToLastYear = altynBelgiApplicantsComparedToLastYear;
	}

	public Integer getAltynBelgiApplicants() {
		return AltynBelgiApplicants;
	}

	public void setAltynBelgiApplicants(Integer altynBelgiApplicants) {
		AltynBelgiApplicants = altynBelgiApplicants;
	}

	public Integer getNumberOfConfirmedAltynBelgi() {
		return numberOfConfirmedAltynBelgi;
	}

	public void setNumberOfConfirmedAltynBelgi(Integer numberOfConfirmedAltynBelgi) {
		this.numberOfConfirmedAltynBelgi = numberOfConfirmedAltynBelgi;
	}

	public Double getNumberOfConfirmedAltynBelgiComparedToTotalNumber() {
		return numberOfConfirmedAltynBelgiComparedToTotalNumber;
	}

	public void setNumberOfConfirmedAltynBelgiComparedToTotalNumber(
			Double numberOfConfirmedAltynBelgiComparedToTotalNumber) {
		this.numberOfConfirmedAltynBelgiComparedToTotalNumber = numberOfConfirmedAltynBelgiComparedToTotalNumber;
	}

	public Double getCertificateWithHonorsApplicantsComparedToLastYear() {
		return certificateWithHonorsApplicantsComparedToLastYear;
	}

	public void setCertificateWithHonorsApplicantsComparedToLastYear(
			Double certificateWithHonorsApplicantsComparedToLastYear) {
		this.certificateWithHonorsApplicantsComparedToLastYear = certificateWithHonorsApplicantsComparedToLastYear;
	}

	public Integer getNumberOfConfirmedCertificateWithHonors() {
		return numberOfConfirmedCertificateWithHonors;
	}

	public void setNumberOfConfirmedCertificateWithHonors(Integer numberOfConfirmedCertificateWithHonors) {
		this.numberOfConfirmedCertificateWithHonors = numberOfConfirmedCertificateWithHonors;
	}

	public Integer getGraduatesWithUnsatisfactoryResult() {
		return graduatesWithUnsatisfactoryResult;
	}

	public void setGraduatesWithUnsatisfactoryResult(Integer graduatesWithUnsatisfactoryResult) {
		this.graduatesWithUnsatisfactoryResult = graduatesWithUnsatisfactoryResult;
	}

	public Integer getGraduatesWithBelowTheThreshold() {
		return graduatesWithBelowTheThreshold;
	}

	public void setGraduatesWithBelowTheThreshold(Integer graduatesWithBelowTheThreshold) {
		this.graduatesWithBelowTheThreshold = graduatesWithBelowTheThreshold;
	}

	public Double getCoverageChildrenWithEducationFrom1To6() {
		return coverageChildrenWithEducationFrom1To6;
	}

	public void setCoverageChildrenWithEducationFrom1To6(Double coverageChildrenWithEducationFrom1To6) {
		this.coverageChildrenWithEducationFrom1To6 = coverageChildrenWithEducationFrom1To6;
	}

	public Double getCoverageChildrenWithEducationFrom3To6() {
		return coverageChildrenWithEducationFrom3To6;
	}

	public void setCoverageChildrenWithEducationFrom3To6(Double coverageChildrenWithEducationFrom3To6) {
		this.coverageChildrenWithEducationFrom3To6 = coverageChildrenWithEducationFrom3To6;
	}

	public Double getProvidingPreschoolEducationInUrbanAndRuralAreas() {
		return providingPreschoolEducationInUrbanAndRuralAreas;
	}

	public void setProvidingPreschoolEducationInUrbanAndRuralAreas(Double providingPreschoolEducationInUrbanAndRuralAreas) {
		this.providingPreschoolEducationInUrbanAndRuralAreas = providingPreschoolEducationInUrbanAndRuralAreas;
	}

	public Double getShareOfEmployedGraduatesFromTotal() {
		return shareOfEmployedGraduatesFromTotal;
	}

	public void setShareOfEmployedGraduatesFromTotal(Double shareOfEmployedGraduatesFromTotal) {
		this.shareOfEmployedGraduatesFromTotal = shareOfEmployedGraduatesFromTotal;
	}

	public Integer getTotalNumberOfGraduates() {
		return totalNumberOfGraduates;
	}

	public void setTotalNumberOfGraduates(Integer totalNumberOfGraduates) {
		this.totalNumberOfGraduates = totalNumberOfGraduates;
	}

	public Double getNumberOfGraduatesComparedToLasttYear() {
		return numberOfGraduatesComparedToLasttYear;
	}

	public void setNumberOfGraduatesComparedToLasttYear(Double numberOfGraduatesComparedToLasttYear) {
		this.numberOfGraduatesComparedToLasttYear = numberOfGraduatesComparedToLasttYear;
	}

	public Double getNumberOfEducationalFacilities() {
		return numberOfEducationalFacilities;
	}

	public void setNumberOfEducationalFacilities(Double numberOfEducationalFacilities) {
		this.numberOfEducationalFacilities = numberOfEducationalFacilities;
	}

	public Integer getNumbrOfSchools() {
		return numbrOfSchools;
	}

	public void setNumbrOfSchools(Integer numbrOfSchools) {
		this.numbrOfSchools = numbrOfSchools;
	}

	public Integer getNumberOfKindergartens() {
		return numberOfKindergartens;
	}

	public void setNumberOfKindergartens(Integer numberOfKindergartens) {
		this.numberOfKindergartens = numberOfKindergartens;
	}

	public Double getNumberOfEmergencyFaciliies() {
		return numberOfEmergencyFaciliies;
	}

	public void setNumberOfEmergencyFaciliies(Double numberOfEmergencyFaciliies) {
		this.numberOfEmergencyFaciliies = numberOfEmergencyFaciliies;
	}

	public Double getNumberOfEmergencyKindrgartens() {
		return numberOfEmergencyKindrgartens;
	}

	public void setNumberOfEmergencyKindrgartens(Double numberOfEmergencyKindrgartens) {
		this.numberOfEmergencyKindrgartens = numberOfEmergencyKindrgartens;
	}

	public Double getNumberOfEmergencySchools() {
		return numberOfEmergencySchools;
	}

	public void setNumberOfEmergencySchools(Double numberOfEmergencySchools) {
		this.numberOfEmergencySchools = numberOfEmergencySchools;
	}

	public Double getOverageOfChildrenWithAdditionalEducation() {
		return overageOfChildrenWithAdditionalEducation;
	}

	public void setOverageOfChildrenWithAdditionalEducation(Double overageOfChildrenWithAdditionalEducation) {
		this.overageOfChildrenWithAdditionalEducation = overageOfChildrenWithAdditionalEducation;
	}

	public Double getOrganizationsOfHotMealsForPupils() {
		return organizationsOfHotMealsForPupils;
	}

	public void setOrganizationsOfHotMealsForPupils(Double organizationsOfHotMealsForPupils) {
		this.organizationsOfHotMealsForPupils = organizationsOfHotMealsForPupils;
	}
	
}
