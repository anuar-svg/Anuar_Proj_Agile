package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;

public class HealthcareMonitoring {
	
	private String year;
	private Map<String, Integer> callsToAmbulance = new HashMap<>(); // o_number_calls_ambulance_station | Количество вызовов по станции скорой помощи
	private Map<String, Integer> adults = new HashMap<>(); // o_of_them_adults | Из них взрослые
	private Map<String, Integer> children = new HashMap<>(); // o_of_them_children | Из них дети
	private Map<String, Integer> takenByHospital = new HashMap<>(); // o_ofthem_taken_hospital | Из них довезенные в больницу
	private Map<String, Integer> placedToHospital = new HashMap<>(); // o_ofthem_placed_hospital | Из них помещенные в больницу
	private Map<String, Integer> numberOfDTP = new HashMap<>(); // o_ofthem_dtp | Из них ДТП
	private Map<String, Integer> industrialInjuries= new HashMap<>(); // o_ofthese_industrial_injuries | Из них производственные травмы
	private Map<String, Integer> domesticInjuries = new HashMap<>(); // o_ofthese_domestic_injuries | Из них бытовые травмы
	private Map<String, Integer> burns = new HashMap<>(); // o_ofthem_burns | Из них ожоги
	private Map<String, Integer> ambulances= new HashMap<>(); // o_number_ambulances | Количество санитарных машин
	private Map<String, Integer> ambulanceCrews= new HashMap<>(); // o_number_ambulance_crews_ssmp | Количество бригад скорой помощи ССМП
	
	public HealthcareMonitoring() {

	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Map<String, Integer> getCallsToAmbulance() {
		return callsToAmbulance;
	}

	public void setCallsToAmbulance(Map<String, Integer> callsToAmbulance) {
		this.callsToAmbulance = callsToAmbulance;
	}

	public Map<String, Integer> getAdults() {
		return adults;
	}

	public void setAdults(Map<String, Integer> adults) {
		this.adults = adults;
	}

	public Map<String, Integer> getChildren() {
		return children;
	}

	public void setChildren(Map<String, Integer> children) {
		this.children = children;
	}

	public Map<String, Integer> getTakenByHospital() {
		return takenByHospital;
	}

	public void setTakenByHospital(Map<String, Integer> takenByHospital) {
		this.takenByHospital = takenByHospital;
	}

	public Map<String, Integer> getPlacedToHospital() {
		return placedToHospital;
	}

	public void setPlacedToHospital(Map<String, Integer> placedToHospital) {
		this.placedToHospital = placedToHospital;
	}

	public Map<String, Integer> getNumberOfDTP() {
		return numberOfDTP;
	}

	public void setNumberOfDTP(Map<String, Integer> numberOfDTP) {
		this.numberOfDTP = numberOfDTP;
	}

	public Map<String, Integer> getIndustrialInjuries() {
		return industrialInjuries;
	}

	public void setIndustrialInjuries(Map<String, Integer> industrialInjuries) {
		this.industrialInjuries = industrialInjuries;
	}

	public Map<String, Integer> getDomesticInjuries() {
		return domesticInjuries;
	}

	public void setDomesticInjuries(Map<String, Integer> domesticInjuries) {
		this.domesticInjuries = domesticInjuries;
	}

	public Map<String, Integer> getBurns() {
		return burns;
	}

	public void setBurns(Map<String, Integer> burns) {
		this.burns = burns;
	}

	public Map<String, Integer> getAmbulances() {
		return ambulances;
	}

	public void setAmbulances(Map<String, Integer> ambulances) {
		this.ambulances = ambulances;
	}

	public Map<String, Integer> getAmbulanceCrews() {
		return ambulanceCrews;
	}

	public void setAmbulanceCrews(Map<String, Integer> ambulanceCrews) {
		this.ambulanceCrews = ambulanceCrews;
	}
	
}
