package com.example.demo.domain;

public class School {
	
	private String name;
	private String area;
	private String region;
	private String year;
	private String district;
	
	private String address;
	private String yearOfConstruction;
	private String workingTimeFrom;
	private String workingTimeTo;
	private String contactNumber;
	private String firstName;
	private String surname;
	private String patronymic;
	
	private Integer numberOfPlacesInSchool; // o_integer | Количество мест в школе
	private Integer numberOfStudents; // o_number_students | Количество учеников
	private Integer numberOfTeachers; // o_count_teahers | Количество педагогов & Количество кадров
	private Integer numberOfGraduates; // o_count_graduates | Выпускники
	private Integer participantsENT; // o_count_participants_unt | Участники ЕНТ
	
	private Integer withGoldenMedal; // o_count_gold_medal | Золотая медаль
	private Integer withCertificateDistinction ; // o_count_certificate_distinction | Атестат с отличием
	private Integer withTheLowestRating; // o_count_the_lowest_rating | С самой низкой оценкой
	private Integer withUnsatisfactoryRating; // o_count_unsatisfactory_evaluation | С неудолетворительной оценкой
	
	public School() {
	
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

	public String getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(String yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getWorkingTimeFrom() {
		return workingTimeFrom;
	}

	public void setWorkingTimeFrom(String workingTimeFrom) {
		this.workingTimeFrom = workingTimeFrom;
	}

	public String getWorkingTimeTo() {
		return workingTimeTo;
	}

	public void setWorkingTimeTo(String workingTimeTo) {
		this.workingTimeTo = workingTimeTo;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public Integer getNumberOfPlacesInSchool() {
		return numberOfPlacesInSchool;
	}

	public void setNumberOfPlacesInSchool(Integer numberOfPlacesInSchool) {
		this.numberOfPlacesInSchool = numberOfPlacesInSchool;
	}

	public Integer getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(Integer numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public Integer getNumberOfTeachers() {
		return numberOfTeachers;
	}

	public void setNumberOfTeachers(Integer numberOfTeachers) {
		this.numberOfTeachers = numberOfTeachers;
	}

	public Integer getNumberOfGraduates() {
		return numberOfGraduates;
	}

	public void setNumberOfGraduates(Integer numberOfGraduates) {
		this.numberOfGraduates = numberOfGraduates;
	}

	public Integer getParticipantsENT() {
		return participantsENT;
	}

	public void setParticipantsENT(Integer participantsENT) {
		this.participantsENT = participantsENT;
	}

	public Integer getWithGoldenMedal() {
		return withGoldenMedal;
	}

	public void setWithGoldenMedal(Integer withGoldenMedal) {
		this.withGoldenMedal = withGoldenMedal;
	}

	public Integer getWithCertificateDistinction() {
		return withCertificateDistinction;
	}

	public void setWithCertificateDistinction(Integer withCertificateDistinction) {
		this.withCertificateDistinction = withCertificateDistinction;
	}

	public Integer getWithTheLowestRating() {
		return withTheLowestRating;
	}

	public void setWithTheLowestRating(Integer withTheLowestRating) {
		this.withTheLowestRating = withTheLowestRating;
	}

	public Integer getWithUnsatisfactoryRating() {
		return withUnsatisfactoryRating;
	}

	public void setWithUnsatisfactoryRating(Integer withUnsatisfactoryRating) {
		this.withUnsatisfactoryRating = withUnsatisfactoryRating;
	}
	
}
