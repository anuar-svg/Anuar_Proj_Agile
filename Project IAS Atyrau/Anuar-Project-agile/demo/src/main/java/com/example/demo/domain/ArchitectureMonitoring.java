package com.example.demo.domain;

public class ArchitectureMonitoring {

	private String year;
	private String area;
	private String month;
	
	private Double volumeOfHousingCommissioned; // o_volume_housing_commissioned | Обьем введенного жилья
	private String volumeOfHousingCommissionedUnit; // o_unit | тыс. кв.метров
	
	private Double housingOnBudget; // o_housing_expense_budget | Жилье за счет бюджета
	private String housingOnBudgetUnit; // 	o_unit_a | тыс. кв.метров
	
	private Double departmentalHousing; // o_departmental_housing | Ведомственное жилье
	private String departmentalHousingUnit; // o_unit_b | тыс. кв.метров
	
	private Double IHS; // o_ihs | ИЖС
	private String IHSUnit; // o_unit_d | тыс. кв.метров
	
	private Double commercialHousing; // o_commercial_housing | Коммерческое жилье
	private String commercialHousingUnit; // 	 | тыс. кв.метров
	
	public ArchitectureMonitoring() {

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

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Double getVolumeOfHousingCommissioned() {
		return volumeOfHousingCommissioned;
	}

	public void setVolumeOfHousingCommissioned(Double volumeOfHousingCommissioned) {
		this.volumeOfHousingCommissioned = volumeOfHousingCommissioned;
	}

	public String getVolumeOfHousingCommissionedUnit() {
		return volumeOfHousingCommissionedUnit;
	}

	public void setVolumeOfHousingCommissionedUnit(String volumeOfHousingCommissionedUnit) {
		this.volumeOfHousingCommissionedUnit = volumeOfHousingCommissionedUnit;
	}

	public Double getHousingOnBudget() {
		return housingOnBudget;
	}

	public void setHousingOnBudget(Double housingOnBudget) {
		this.housingOnBudget = housingOnBudget;
	}

	public String getHousingOnBudgetUnit() {
		return housingOnBudgetUnit;
	}

	public void setHousingOnBudgetUnit(String housingOnBudgetUnit) {
		this.housingOnBudgetUnit = housingOnBudgetUnit;
	}

	public Double getDepartmentalHousing() {
		return departmentalHousing;
	}

	public void setDepartmentalHousing(Double departmentalHousing) {
		this.departmentalHousing = departmentalHousing;
	}

	public String getDepartmentalHousingUnit() {
		return departmentalHousingUnit;
	}

	public void setDepartmentalHousingUnit(String departmentalHousingUnit) {
		this.departmentalHousingUnit = departmentalHousingUnit;
	}

	public Double getIHS() {
		return IHS;
	}

	public void setIHS(Double iHS) {
		IHS = iHS;
	}

	public String getIHSUnit() {
		return IHSUnit;
	}

	public void setIHSUnit(String iHSUnit) {
		IHSUnit = iHSUnit;
	}

	public Double getCommercialHousing() {
		return commercialHousing;
	}

	public void setCommercialHousing(Double commercialHousing) {
		this.commercialHousing = commercialHousing;
	}

	public String getCommercialHousingUnit() {
		return commercialHousingUnit;
	}

	public void setCommercialHousingUnit(String commercialHousingUnit) {
		this.commercialHousingUnit = commercialHousingUnit;
	}
	
}
