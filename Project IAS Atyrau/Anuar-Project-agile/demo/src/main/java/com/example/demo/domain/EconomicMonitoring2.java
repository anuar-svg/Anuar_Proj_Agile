package com.example.demo.domain;

public class EconomicMonitoring2 {

	private String year;
	private String quarter;
	private String area;
	
	private Double GRPVolume; // o_volume | Обьем ВРП
	private Double GRPPerCapita; // o_per_capita_vrp | ВРП на душу населения
	
	public EconomicMonitoring2() {
	
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Double getGRPVolume() {
		return GRPVolume;
	}

	public void setGRPVolume(Double gRPVolume) {
		GRPVolume = gRPVolume;
	}

	public Double getGRPPerCapita() {
		return GRPPerCapita;
	}

	public void setGRPPerCapita(Double gRPPerCapita) {
		GRPPerCapita = gRPPerCapita;
	}
	
}
