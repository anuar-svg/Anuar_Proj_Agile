package com.example.demo.domain;

public class ReligionMonitoring {

	private String year;
	private String area;
	private String quarter;
	
	private Integer numberOfReligiousAssociations; // o_number_religious_associations | Количество религиозных обьединений
	private Integer numberOfIslamicReligiousAssociations; // o_associations_islam | Количество религиозных обьединений (Ислам)
	private Integer numberOfOrthodoxReligiousAssociations; // o_associations_orthodox | Количество религиозных обьединений (Православный)
	private Integer numberOfCatholicReligiousAssociations; // o_associations_catholic | Количество религиозных обьединений (Католический)
	private Integer numberOfProtestantReligiousAssociations; // o_associations_protestant | Количество религиозных обьединений (Протестантский)
	
	private Integer numberOfReligiousBuildings; // o_places_worship | Количество культовых сооружений
	private Integer numberOfIslamicReligiousBuildings; // o_places_worship_islam | Количество культовых сооружений (Ислам)
	private Integer numberOfOrthodoxReligiousBuildings; // o_places_worship_orthodox | Количество культовых сооружений (Православный)
	private Integer numberOfCatholicReligiousBuildings; // o_places_worship_catholic | Количество культовых сооружений (Католический)
	private Integer numberOfProtestantReligiousBuildings; // o_places_worship_protestant | Количество культовых сооружений (Протестантский)
	
	private Integer numberOfMissionaries; // o_number_missionaries | Количество миссионеров религиозных обьединений
	private Integer numberOfIslamicMissionaries; // o_missionaries_islam | Количество миссионеров религиозных обьединений (Ислам)
	private Integer numberOfOrthodoxMissionaries; // o_missionaries_orthodox | Количество миссионеров религиозных обьединений (Православный)
	private Integer numberOfCatholicMissionaries; // o_missionaries_catholic | Количество миссионеров религиозных обьединений (Колический)
	private Integer numberOfProtestantMissionaries; // o_missionaries_protestant | Количество миссионеров религиозных обьединений (Протестантский)
	
	private Integer informationAndExplanatoryEvents; // o_awareness_raising_activities | Информационно-разьяснительные мероприятрия
	private Integer conferences; // o_conferences | Конференции
	private Integer seminars; // o_seminars | Семинары
	private Integer lectures; // o_lectures | Лекции
	private Integer roundTables; // o_round_table | Круглые столы
	private Integer briefings; // o_briefings | Брифинги
	private Integer stocks; // o_stock | Акции
	private Integer forums; // o_forums | Форумы
	private Integer otherEvents; // o_other_event | Другие мероприятия
	private Integer individualMeeting ; // o_individual_meeting | Индивидуальные встречи
	
	private Integer numberOfCoveredPeople; // o_number_people_covered | Количество охваченных людей
	private Integer numberOfCoveredPeopleIslam; // o_covered_islam | Количество охваченных людей (Ислам)
	private Integer numberOfCoveredPeopleOrthodox; // o_covered_orthodox | Количество охваченных людей (Православный)
	private Integer numberOfCoveredPeopleCatholic; // o_covered_catholic | Количество охваченных людей (Католический)
	private Integer numberOfCoveredPeopleProtestant; // o_covered_protestant | Количество охваченных людей (протестантский)
	
	private Integer numberOfMaintenanceWork; // o_number_preventivework | Количество профилактических работ по адресам
	private Integer numberOfMaintenanceWorkIslam; // o_number_preventivework_islam | Количество профилактических работ по адресам (Ислам)
	private Integer numberOfMaintenanceWorkOrthodox; // o_number_preventivework_orthodox | Количество профилактических работ по адресам (Православный)
	private Integer numberOfMaintenanceWorkCatholic; // o_number_preventivework_catholic | Количество профилактических работ по адресам (Католический)
	private Integer numberOfMaintenanceWorkProtestant; // o_number_preventivework_protestant | Количество профилактических работ по адресам (Протестантский)
	
	private Integer meetings; // o_meetings | Встречи
	private Integer meetingsWithYouth; // o_meetings_with_young | Встречи с молодежью
	private Integer meetingsWithAulDistricts; // o_meetings_population_rural_districts | Встречи с населением аульных округов
	
	private Integer socialPolls; // o_sociological_surveys | Социальные опросы
	private Integer workingWithMedia; // o_working_with_media | Работа со СМИ
	private Integer article; // o_article | Статья
	private Integer interview; // o_interview | Интервью
	private Integer InformationNews; // o_information_news | Информационные новости
	private Integer internetMaterials; // o_internet_material | Интернет материалы
	private Integer programImanNury; // o_transfer_iman_nury | Передача "Иман Нуры"
	private Integer disseminationOfMethodologicalMaterials; // o_dissemination_materials | Распространение информационно-методических материалов
	private Integer expertiseOnSites; // o_examination_sites | Экспертиза по сайтам
	
	public ReligionMonitoring() {
	
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

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public Integer getNumberOfReligiousAssociations() {
		return numberOfReligiousAssociations;
	}

	public void setNumberOfReligiousAssociations(Integer numberOfReligiousAssociations) {
		this.numberOfReligiousAssociations = numberOfReligiousAssociations;
	}

	public Integer getNumberOfIslamicReligiousAssociations() {
		return numberOfIslamicReligiousAssociations;
	}

	public void setNumberOfIslamicReligiousAssociations(Integer numberOfIslamicReligiousAssociations) {
		this.numberOfIslamicReligiousAssociations = numberOfIslamicReligiousAssociations;
	}

	public Integer getNumberOfOrthodoxReligiousAssociations() {
		return numberOfOrthodoxReligiousAssociations;
	}

	public void setNumberOfOrthodoxReligiousAssociations(Integer numberOfOrthodoxReligiousAssociations) {
		this.numberOfOrthodoxReligiousAssociations = numberOfOrthodoxReligiousAssociations;
	}

	public Integer getNumberOfCatholicReligiousAssociations() {
		return numberOfCatholicReligiousAssociations;
	}

	public void setNumberOfCatholicReligiousAssociations(Integer numberOfCatholicReligiousAssociations) {
		this.numberOfCatholicReligiousAssociations = numberOfCatholicReligiousAssociations;
	}

	public Integer getNumberOfProtestantReligiousAssociations() {
		return numberOfProtestantReligiousAssociations;
	}

	public void setNumberOfProtestantReligiousAssociations(Integer numberOfProtestantReligiousAssociations) {
		this.numberOfProtestantReligiousAssociations = numberOfProtestantReligiousAssociations;
	}

	public Integer getNumberOfReligiousBuildings() {
		return numberOfReligiousBuildings;
	}

	public void setNumberOfReligiousBuildings(Integer numberOfReligiousBuildings) {
		this.numberOfReligiousBuildings = numberOfReligiousBuildings;
	}

	public Integer getNumberOfIslamicReligiousBuildings() {
		return numberOfIslamicReligiousBuildings;
	}

	public void setNumberOfIslamicReligiousBuildings(Integer numberOfIslamicReligiousBuildings) {
		this.numberOfIslamicReligiousBuildings = numberOfIslamicReligiousBuildings;
	}

	public Integer getNumberOfOrthodoxReligiousBuildings() {
		return numberOfOrthodoxReligiousBuildings;
	}

	public void setNumberOfOrthodoxReligiousBuildings(Integer numberOfOrthodoxReligiousBuildings) {
		this.numberOfOrthodoxReligiousBuildings = numberOfOrthodoxReligiousBuildings;
	}

	public Integer getNumberOfCatholicReligiousBuildings() {
		return numberOfCatholicReligiousBuildings;
	}

	public void setNumberOfCatholicReligiousBuildings(Integer numberOfCatholicReligiousBuildings) {
		this.numberOfCatholicReligiousBuildings = numberOfCatholicReligiousBuildings;
	}

	public Integer getNumberOfProtestantReligiousBuildings() {
		return numberOfProtestantReligiousBuildings;
	}

	public void setNumberOfProtestantReligiousBuildings(Integer numberOfProtestantReligiousBuildings) {
		this.numberOfProtestantReligiousBuildings = numberOfProtestantReligiousBuildings;
	}

	public Integer getNumberOfMissionaries() {
		return numberOfMissionaries;
	}

	public void setNumberOfMissionaries(Integer numberOfMissionaries) {
		this.numberOfMissionaries = numberOfMissionaries;
	}

	public Integer getNumberOfIslamicMissionaries() {
		return numberOfIslamicMissionaries;
	}

	public void setNumberOfIslamicMissionaries(Integer numberOfIslamicMissionaries) {
		this.numberOfIslamicMissionaries = numberOfIslamicMissionaries;
	}

	public Integer getNumberOfOrthodoxMissionaries() {
		return numberOfOrthodoxMissionaries;
	}

	public void setNumberOfOrthodoxMissionaries(Integer numberOfOrthodoxMissionaries) {
		this.numberOfOrthodoxMissionaries = numberOfOrthodoxMissionaries;
	}

	public Integer getNumberOfCatholicMissionaries() {
		return numberOfCatholicMissionaries;
	}

	public void setNumberOfCatholicMissionaries(Integer numberOfCatholicMissionaries) {
		this.numberOfCatholicMissionaries = numberOfCatholicMissionaries;
	}

	public Integer getNumberOfProtestantMissionaries() {
		return numberOfProtestantMissionaries;
	}

	public void setNumberOfProtestantMissionaries(Integer numberOfProtestantMissionaries) {
		this.numberOfProtestantMissionaries = numberOfProtestantMissionaries;
	}

	public Integer getInformationAndExplanatoryEvents() {
		return informationAndExplanatoryEvents;
	}

	public void setInformationAndExplanatoryEvents(Integer informationAndExplanatoryEvents) {
		this.informationAndExplanatoryEvents = informationAndExplanatoryEvents;
	}

	public Integer getConferences() {
		return conferences;
	}

	public void setConferences(Integer conferences) {
		this.conferences = conferences;
	}

	public Integer getSeminars() {
		return seminars;
	}

	public void setSeminars(Integer seminars) {
		this.seminars = seminars;
	}

	public Integer getLectures() {
		return lectures;
	}

	public void setLectures(Integer lectures) {
		this.lectures = lectures;
	}

	public Integer getRoundTables() {
		return roundTables;
	}

	public void setRoundTables(Integer roundTables) {
		this.roundTables = roundTables;
	}

	public Integer getBriefings() {
		return briefings;
	}

	public void setBriefings(Integer briefings) {
		this.briefings = briefings;
	}

	public Integer getStocks() {
		return stocks;
	}

	public void setStocks(Integer stocks) {
		this.stocks = stocks;
	}

	public Integer getForums() {
		return forums;
	}

	public void setForums(Integer forums) {
		this.forums = forums;
	}

	public Integer getOtherEvents() {
		return otherEvents;
	}

	public void setOtherEvents(Integer otherEvents) {
		this.otherEvents = otherEvents;
	}

	public Integer getIndividualMeeting() {
		return individualMeeting;
	}

	public void setIndividualMeeting(Integer individualMeeting) {
		this.individualMeeting = individualMeeting;
	}

	public Integer getNumberOfCoveredPeople() {
		return numberOfCoveredPeople;
	}

	public void setNumberOfCoveredPeople(Integer numberOfCoveredPeople) {
		this.numberOfCoveredPeople = numberOfCoveredPeople;
	}

	public Integer getNumberOfCoveredPeopleIslam() {
		return numberOfCoveredPeopleIslam;
	}

	public void setNumberOfCoveredPeopleIslam(Integer numberOfCoveredPeopleIslam) {
		this.numberOfCoveredPeopleIslam = numberOfCoveredPeopleIslam;
	}

	public Integer getNumberOfCoveredPeopleOrthodox() {
		return numberOfCoveredPeopleOrthodox;
	}

	public void setNumberOfCoveredPeopleOrthodox(Integer numberOfCoveredPeopleOrthodox) {
		this.numberOfCoveredPeopleOrthodox = numberOfCoveredPeopleOrthodox;
	}

	public Integer getNumberOfCoveredPeopleCatholic() {
		return numberOfCoveredPeopleCatholic;
	}

	public void setNumberOfCoveredPeopleCatholic(Integer numberOfCoveredPeopleCatholic) {
		this.numberOfCoveredPeopleCatholic = numberOfCoveredPeopleCatholic;
	}

	public Integer getNumberOfCoveredPeopleProtestant() {
		return numberOfCoveredPeopleProtestant;
	}

	public void setNumberOfCoveredPeopleProtestant(Integer numberOfCoveredPeopleProtestant) {
		this.numberOfCoveredPeopleProtestant = numberOfCoveredPeopleProtestant;
	}

	public Integer getNumberOfMaintenanceWork() {
		return numberOfMaintenanceWork;
	}

	public void setNumberOfMaintenanceWork(Integer numberOfMaintenanceWork) {
		this.numberOfMaintenanceWork = numberOfMaintenanceWork;
	}

	public Integer getNumberOfMaintenanceWorkIslam() {
		return numberOfMaintenanceWorkIslam;
	}

	public void setNumberOfMaintenanceWorkIslam(Integer numberOfMaintenanceWorkIslam) {
		this.numberOfMaintenanceWorkIslam = numberOfMaintenanceWorkIslam;
	}

	public Integer getNumberOfMaintenanceWorkOrthodox() {
		return numberOfMaintenanceWorkOrthodox;
	}

	public void setNumberOfMaintenanceWorkOrthodox(Integer numberOfMaintenanceWorkOrthodox) {
		this.numberOfMaintenanceWorkOrthodox = numberOfMaintenanceWorkOrthodox;
	}

	public Integer getNumberOfMaintenanceWorkCatholic() {
		return numberOfMaintenanceWorkCatholic;
	}

	public void setNumberOfMaintenanceWorkCatholic(Integer numberOfMaintenanceWorkCatholic) {
		this.numberOfMaintenanceWorkCatholic = numberOfMaintenanceWorkCatholic;
	}

	public Integer getNumberOfMaintenanceWorkProtestant() {
		return numberOfMaintenanceWorkProtestant;
	}

	public void setNumberOfMaintenanceWorkProtestant(Integer numberOfMaintenanceWorkProtestant) {
		this.numberOfMaintenanceWorkProtestant = numberOfMaintenanceWorkProtestant;
	}

	public Integer getMeetings() {
		return meetings;
	}

	public void setMeetings(Integer meetings) {
		this.meetings = meetings;
	}

	public Integer getMeetingsWithYouth() {
		return meetingsWithYouth;
	}

	public void setMeetingsWithYouth(Integer meetingsWithYouth) {
		this.meetingsWithYouth = meetingsWithYouth;
	}

	public Integer getMeetingsWithAulDistricts() {
		return meetingsWithAulDistricts;
	}

	public void setMeetingsWithAulDistricts(Integer meetingsWithAulDistricts) {
		this.meetingsWithAulDistricts = meetingsWithAulDistricts;
	}

	public Integer getSocialPolls() {
		return socialPolls;
	}

	public void setSocialPolls(Integer socialPolls) {
		this.socialPolls = socialPolls;
	}

	public Integer getWorkingWithMedia() {
		return workingWithMedia;
	}

	public void setWorkingWithMedia(Integer workingWithMedia) {
		this.workingWithMedia = workingWithMedia;
	}

	public Integer getArticle() {
		return article;
	}

	public void setArticle(Integer article) {
		this.article = article;
	}

	public Integer getInterview() {
		return interview;
	}

	public void setInterview(Integer interview) {
		this.interview = interview;
	}

	public Integer getInformationNews() {
		return InformationNews;
	}

	public void setInformationNews(Integer informationNews) {
		InformationNews = informationNews;
	}

	public Integer getInternetMaterials() {
		return internetMaterials;
	}

	public void setInternetMaterials(Integer internetMaterials) {
		this.internetMaterials = internetMaterials;
	}

	public Integer getProgramImanNury() {
		return programImanNury;
	}

	public void setProgramImanNury(Integer programImanNury) {
		this.programImanNury = programImanNury;
	}

	public Integer getDisseminationOfMethodologicalMaterials() {
		return disseminationOfMethodologicalMaterials;
	}

	public void setDisseminationOfMethodologicalMaterials(Integer disseminationOfMethodologicalMaterials) {
		this.disseminationOfMethodologicalMaterials = disseminationOfMethodologicalMaterials;
	}

	public Integer getExpertiseOnSites() {
		return expertiseOnSites;
	}

	public void setExpertiseOnSites(Integer expertiseOnSites) {
		this.expertiseOnSites = expertiseOnSites;
	}

}
