package com.example.demo.domain;

public class GovermentPurchases {

	private String year;
	private String month;
	
	private Integer numberOfCompetitionsHeld; // o_number_competitions_held | Количество проведенных конкурсов
	private String numberOfCompetitionsHeldUnit; // o_unit | единиц
	
	private Double totalNumberOfCompetitions; // o_total_amount_competitionsheld | Общая сумма проведенных конкурсов
	private String totalNumberOfCompetitionsUnit; // o_unit_a | тыс. тенге
	
	public GovermentPurchases() {
	
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getNumberOfCompetitionsHeld() {
		return numberOfCompetitionsHeld;
	}

	public void setNumberOfCompetitionsHeld(Integer numberOfCompetitionsHeld) {
		this.numberOfCompetitionsHeld = numberOfCompetitionsHeld;
	}

	public String getNumberOfCompetitionsHeldUnit() {
		return numberOfCompetitionsHeldUnit;
	}

	public void setNumberOfCompetitionsHeldUnit(String numberOfCompetitionsHeldUnit) {
		this.numberOfCompetitionsHeldUnit = numberOfCompetitionsHeldUnit;
	}

	public Double getTotalNumberOfCompetitions() {
		return totalNumberOfCompetitions;
	}

	public void setTotalNumberOfCompetitions(Double totalNumberOfCompetitions) {
		this.totalNumberOfCompetitions = totalNumberOfCompetitions;
	}

	public String getTotalNumberOfCompetitionsUnit() {
		return totalNumberOfCompetitionsUnit;
	}

	public void setTotalNumberOfCompetitionsUnit(String totalNumberOfCompetitionsUnit) {
		this.totalNumberOfCompetitionsUnit = totalNumberOfCompetitionsUnit;
	}
	
}
