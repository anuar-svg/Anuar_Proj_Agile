package com.example.demo.domain;

public class TransportMonitoring {

	private String year;
	private String area;
	private String month;

	private Double roadBuilding; // o_road_building | Строительство дорони
	private Double constructionOfBridges; // o_construction_bridges | Строительство мостов
	private Double transportationByAllTypes; // o_transportation_goods_modestransport | Перевозка грузов всеми видами транспорта
	private Double turnoverVolume; // o_volume_turnover | Обьем грузооборота
	private Double passengerTurnover; // o_passenger_turnover | Пассажирооборот
	private Double passengersTransportedByRoad; // o_transported_passengers_road | Перевезено пассажиров автотранспортом
	
	public TransportMonitoring() {
	
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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

	public Double getRoadBuilding() {
		return roadBuilding;
	}

	public void setRoadBuilding(Double roadBuilding) {
		this.roadBuilding = roadBuilding;
	}

	public Double getConstructionOfBridges() {
		return constructionOfBridges;
	}

	public void setConstructionOfBridges(Double constructionOfBridges) {
		this.constructionOfBridges = constructionOfBridges;
	}

	public Double getTransportationByAllTypes() {
		return transportationByAllTypes;
	}

	public void setTransportationByAllTypes(Double transportationByAllTypes) {
		this.transportationByAllTypes = transportationByAllTypes;
	}

	public Double getTurnoverVolume() {
		return turnoverVolume;
	}

	public void setTurnoverVolume(Double turnoverVolume) {
		this.turnoverVolume = turnoverVolume;
	}

	public Double getPassengerTurnover() {
		return passengerTurnover;
	}

	public void setPassengerTurnover(Double passengerTurnover) {
		this.passengerTurnover = passengerTurnover;
	}

	public Double getPassengersTransportedByRoad() {
		return passengersTransportedByRoad;
	}

	public void setPassengersTransportedByRoad(Double passengersTransportedByRoad) {
		this.passengersTransportedByRoad = passengersTransportedByRoad;
	}
	
}
