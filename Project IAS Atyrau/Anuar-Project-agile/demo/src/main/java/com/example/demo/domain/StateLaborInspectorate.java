package com.example.demo.domain;

public class StateLaborInspectorate {

	private String year;
	private String area;
	private String month;
	
	private Double numberOfAccidents; // o_number_accidents | Количество несчастных случаев
	private String numberOfAccidentsUnit; // o_unit | единиц
	
	private Double numberOfTeamAccidents; // o_number_accidents_team | Количество несчастных случаев (Из них групповых)
	private String numberOfTeamAccidentsUnit; // o_unit_b | единиц

	private Double numberOfVictims; // o_number_victims | Количество пострадавших
	private String numberOfVictimsUnit; // o_unit_c | человек
	
	private Double numberOfVictimsDead; // o_number_victims_dead | Количество пострадавших (Из них погибших)
	private String numberOfVictimsDeadUnit; // o_unit_d | человек
	
	private Double monitoringOfCollectiveAgreements; // o_monitoring_collective_agreements | Мониторинг коллективных договоров
	private String monitoringOfCollectiveAgreementsUnit; // o_unit_e | единиц
	
	private Double administrativeFinesImposed; // o_administrative_fines_imposed | Наложено администратиынфх штрафов
	private String administrativeFinesImposedUnit; // o_unit_f | единиц
	
	private Double untimelyPayments; // o_identification_untimely_payment | Выявление фактов несвоевременной выплаты заработной платы
	private String untimelyPaymentsUnit; // o_unit_g | человек
	
	private Double socialTension; // o_social_tension | Социальная напряженность в трудовых коллективах
	private String socialTensionUnit; // o_unit_h | единиц
	
	public StateLaborInspectorate() {

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

	public Double getNumberOfAccidents() {
		return numberOfAccidents;
	}

	public void setNumberOfAccidents(Double numberOfAccidents) {
		this.numberOfAccidents = numberOfAccidents;
	}

	public String getNumberOfAccidentsUnit() {
		return numberOfAccidentsUnit;
	}

	public void setNumberOfAccidentsUnit(String numberOfAccidentsUnit) {
		this.numberOfAccidentsUnit = numberOfAccidentsUnit;
	}

	public Double getNumberOfTeamAccidents() {
		return numberOfTeamAccidents;
	}

	public void setNumberOfTeamAccidents(Double numberOfTeamAccidents) {
		this.numberOfTeamAccidents = numberOfTeamAccidents;
	}

	public String getNumberOfTeamAccidentsUnit() {
		return numberOfTeamAccidentsUnit;
	}

	public void setNumberOfTeamAccidentsUnit(String numberOfTeamAccidentsUnit) {
		this.numberOfTeamAccidentsUnit = numberOfTeamAccidentsUnit;
	}

	public Double getNumberOfVictims() {
		return numberOfVictims;
	}

	public void setNumberOfVictims(Double numberOfVictims) {
		this.numberOfVictims = numberOfVictims;
	}

	public String getNumberOfVictimsUnit() {
		return numberOfVictimsUnit;
	}

	public void setNumberOfVictimsUnit(String numberOfVictimsUnit) {
		this.numberOfVictimsUnit = numberOfVictimsUnit;
	}

	public Double getNumberOfVictimsDead() {
		return numberOfVictimsDead;
	}

	public void setNumberOfVictimsDead(Double numberOfVictimsDead) {
		this.numberOfVictimsDead = numberOfVictimsDead;
	}

	public String getNumberOfVictimsDeadUnit() {
		return numberOfVictimsDeadUnit;
	}

	public void setNumberOfVictimsDeadUnit(String numberOfVictimsDeadUnit) {
		this.numberOfVictimsDeadUnit = numberOfVictimsDeadUnit;
	}

	public Double getMonitoringOfCollectiveAgreements() {
		return monitoringOfCollectiveAgreements;
	}

	public void setMonitoringOfCollectiveAgreements(Double monitoringOfCollectiveAgreements) {
		this.monitoringOfCollectiveAgreements = monitoringOfCollectiveAgreements;
	}

	public String getMonitoringOfCollectiveAgreementsUnit() {
		return monitoringOfCollectiveAgreementsUnit;
	}

	public void setMonitoringOfCollectiveAgreementsUnit(String monitoringOfCollectiveAgreementsUnit) {
		this.monitoringOfCollectiveAgreementsUnit = monitoringOfCollectiveAgreementsUnit;
	}

	public Double getAdministrativeFinesImposed() {
		return administrativeFinesImposed;
	}

	public void setAdministrativeFinesImposed(Double administrativeFinesImposed) {
		this.administrativeFinesImposed = administrativeFinesImposed;
	}

	public String getAdministrativeFinesImposedUnit() {
		return administrativeFinesImposedUnit;
	}

	public void setAdministrativeFinesImposedUnit(String administrativeFinesImposedUnit) {
		this.administrativeFinesImposedUnit = administrativeFinesImposedUnit;
	}

	public Double getUntimelyPayments() {
		return untimelyPayments;
	}

	public void setUntimelyPayments(Double untimelyPayments) {
		this.untimelyPayments = untimelyPayments;
	}

	public String getUntimelyPaymentsUnit() {
		return untimelyPaymentsUnit;
	}

	public void setUntimelyPaymentsUnit(String untimelyPaymentsUnit) {
		this.untimelyPaymentsUnit = untimelyPaymentsUnit;
	}

	public Double getSocialTension() {
		return socialTension;
	}

	public void setSocialTension(Double socialTension) {
		this.socialTension = socialTension;
	}

	public String getSocialTensionUnit() {
		return socialTensionUnit;
	}

	public void setSocialTensionUnit(String socialTensionUnit) {
		this.socialTensionUnit = socialTensionUnit;
	}
	
}
