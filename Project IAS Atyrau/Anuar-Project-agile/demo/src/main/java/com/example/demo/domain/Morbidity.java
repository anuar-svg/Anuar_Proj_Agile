package com.example.demo.domain;

public class Morbidity {

	private String area;
	private String region;
	private String year;
	private Double total;
	private Double injuries;
	private Double bloodCirculation;
	private Double arterialhypertension;
	private Double coronaryHeartDisease; // Ишемическиз болезней сердца
	private Double acuteMyocardialInfarction;
	private Double mbd; // от психических расстройств
	private Double mbdSu; // от психических расстройств с употреблением активных ...
	private Double tuberculosis;
	private Double cancer;
	private Double hiv;
	
	public Morbidity() {
	
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getInjuries() {
		return injuries;
	}

	public void setInjuries(Double injuries) {
		this.injuries = injuries;
	}

	public Double getBloodCirculation() {
		return bloodCirculation;
	}

	public void setBloodCirculation(Double bloodCirculation) {
		this.bloodCirculation = bloodCirculation;
	}

	public Double getArterialhypertension() {
		return arterialhypertension;
	}

	public void setArterialhypertension(Double arterialhypertension) {
		this.arterialhypertension = arterialhypertension;
	}

	public Double getCoronaryHeartDisease() {
		return coronaryHeartDisease;
	}

	public void setCoronaryHeartDisease(Double coronaryHeartDisease) {
		this.coronaryHeartDisease = coronaryHeartDisease;
	}

	public Double getAcuteMyocardialInfarction() {
		return acuteMyocardialInfarction;
	}

	public void setAcuteMyocardialInfarction(Double acuteMyocardialInfarction) {
		this.acuteMyocardialInfarction = acuteMyocardialInfarction;
	}

	public Double getMbd() {
		return mbd;
	}

	public void setMbd(Double mbd) {
		this.mbd = mbd;
	}

	public Double getMbdSu() {
		return mbdSu;
	}

	public void setMbdSu(Double mbdSu) {
		this.mbdSu = mbdSu;
	}

	public Double getTuberculosis() {
		return tuberculosis;
	}

	public void setTuberculosis(Double tuberculosis) {
		this.tuberculosis = tuberculosis;
	}

	public Double getCancer() {
		return cancer;
	}

	public void setCancer(Double cancer) {
		this.cancer = cancer;
	}

	public Double getHiv() {
		return hiv;
	}

	public void setHiv(Double hiv) {
		this.hiv = hiv;
	}
	
}
