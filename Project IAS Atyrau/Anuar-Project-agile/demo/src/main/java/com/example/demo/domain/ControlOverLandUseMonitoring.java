package com.example.demo.domain;

public class ControlOverLandUseMonitoring {

	private String year;
	private String area;
	private String quarter;
	
	private Integer checksCarriedOut; // o_carried_out_inspections | Проведено проверок 
	private Integer actsOnRevealedOffenses; // o_issued_acts_offenses | Оформленные акты по выявленным правонарушениям
	private Integer imposeFines; // o_impose_fine | Наложенные штрафы
	private Integer administrativeFines; // o_administrative_offence | Административные штрафы
	private Integer regulationsForTheUseOfLand; // o_issued_orders | Выданные предписания для принятия мер по использованию земельного участка
	private Integer refulationsToEliminateViolationsOfTheLaw; // o_issued_orders_violations | Выданные предписания о необходимости устранить нарушения законодательство РК
	private Integer claimsForCompulsoryLandAcquisition; // o_lawsuits_filed | Подано исков по принудительному изьятию земельных участвков
	
	public ControlOverLandUseMonitoring() {
	
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

	public Integer getChecksCarriedOut() {
		return checksCarriedOut;
	}

	public void setChecksCarriedOut(Integer checksCarriedOut) {
		this.checksCarriedOut = checksCarriedOut;
	}

	public Integer getActsOnRevealedOffenses() {
		return actsOnRevealedOffenses;
	}

	public void setActsOnRevealedOffenses(Integer actsOnRevealedOffenses) {
		this.actsOnRevealedOffenses = actsOnRevealedOffenses;
	}

	public Integer getImposeFines() {
		return imposeFines;
	}

	public void setImposeFines(Integer imposeFines) {
		this.imposeFines = imposeFines;
	}

	public Integer getAdministrativeFines() {
		return administrativeFines;
	}

	public void setAdministrativeFines(Integer administrativeFines) {
		this.administrativeFines = administrativeFines;
	}

	public Integer getRegulationsForTheUseOfLand() {
		return regulationsForTheUseOfLand;
	}

	public void setRegulationsForTheUseOfLand(Integer regulationsForTheUseOfLand) {
		this.regulationsForTheUseOfLand = regulationsForTheUseOfLand;
	}

	public Integer getRefulationsToEliminateViolationsOfTheLaw() {
		return refulationsToEliminateViolationsOfTheLaw;
	}

	public void setRefulationsToEliminateViolationsOfTheLaw(Integer refulationsToEliminateViolationsOfTheLaw) {
		this.refulationsToEliminateViolationsOfTheLaw = refulationsToEliminateViolationsOfTheLaw;
	}

	public Integer getClaimsForCompulsoryLandAcquisition() {
		return claimsForCompulsoryLandAcquisition;
	}

	public void setClaimsForCompulsoryLandAcquisition(Integer claimsForCompulsoryLandAcquisition) {
		this.claimsForCompulsoryLandAcquisition = claimsForCompulsoryLandAcquisition;
	}
	
}
