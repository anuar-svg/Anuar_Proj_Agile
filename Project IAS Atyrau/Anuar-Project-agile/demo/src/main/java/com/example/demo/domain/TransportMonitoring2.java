package com.example.demo.domain;

public class TransportMonitoring2 {

	private String year;
	private String area;
	
	private Double totalLengthOfRoads; // o_total_length_roads | Общая протяженность дорого
	private Double percentageOfHighways; // o_share_roads | Доля автомобильных дорог местного значения
	private Double lengthOfRoadsOfRegionalSignificance; // o_length_roads | Протяженность дорог областого и районного значения
	private Double reconstructedRoads; // o_reconstructed_repairedroads | Отреконструированные и отремонтированны дороги
	
	public TransportMonitoring2() {
	
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

	public Double getTotalLengthOfRoads() {
		return totalLengthOfRoads;
	}

	public void setTotalLengthOfRoads(Double totalLengthOfRoads) {
		this.totalLengthOfRoads = totalLengthOfRoads;
	}

	public Double getPercentageOfHighways() {
		return percentageOfHighways;
	}

	public void setPercentageOfHighways(Double percentageOfHighways) {
		this.percentageOfHighways = percentageOfHighways;
	}

	public Double getLengthOfRoadsOfRegionalSignificance() {
		return lengthOfRoadsOfRegionalSignificance;
	}

	public void setLengthOfRoadsOfRegionalSignificance(Double lengthOfRoadsOfRegionalSignificance) {
		this.lengthOfRoadsOfRegionalSignificance = lengthOfRoadsOfRegionalSignificance;
	}

	public Double getReconstructedRoads() {
		return reconstructedRoads;
	}

	public void setReconstructedRoads(Double reconstructedRoads) {
		this.reconstructedRoads = reconstructedRoads;
	}
	
}
