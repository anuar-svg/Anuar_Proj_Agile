package com.example.demo.domain;

public class AgriculturalIndustryMonitoring {

	private String year;
	private String area;
	private String month;
	
	private Double meatProduction; // o_meat_production | Производство мяса
	private Double milkProduction; // o_milk_production | Произодство молока
	private Double eggProduction; // o_egg_production | Производство яиц
	private Double numberOfCattle; // o_cattle | Численность скота
	private Double sheepAndGoats; // o_sheep_goats | Овцы и козы
	private Double horses; // o_horses | Лошади
	private Double camels; // o_camels | Верблюды
	private Double pigs; // o_pigs | Свиньи
	private Double volumeOfGrossOutputOfAgriculture; // o_volume_agriculture | Обьем валовой продукции сельского хозяйства
	private Double volumeOfProductionOfCropProducts; // o_volume_production | Обьем производственной продукции растениеводства
	private Double volumeOfProductionOfLivestockProducts; // o_volume_animalhusbandry | Обьем производственной продукции животноводства
	
	public AgriculturalIndustryMonitoring() {
	
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

	public Double getMeatProduction() {
		return meatProduction;
	}

	public void setMeatProduction(Double meatProduction) {
		this.meatProduction = meatProduction;
	}

	public Double getMilkProduction() {
		return milkProduction;
	}

	public void setMilkProduction(Double milkProduction) {
		this.milkProduction = milkProduction;
	}

	public Double getEggProduction() {
		return eggProduction;
	}

	public void setEggProduction(Double eggProduction) {
		this.eggProduction = eggProduction;
	}

	public Double getNumberOfCattle() {
		return numberOfCattle;
	}

	public void setNumberOfCattle(Double numberOfCattle) {
		this.numberOfCattle = numberOfCattle;
	}

	public Double getSheepAndGoats() {
		return sheepAndGoats;
	}

	public void setSheepAndGoats(Double sheepAndGoats) {
		this.sheepAndGoats = sheepAndGoats;
	}

	public Double getHorses() {
		return horses;
	}

	public void setHorses(Double horses) {
		this.horses = horses;
	}

	public Double getCamels() {
		return camels;
	}

	public void setCamels(Double camels) {
		this.camels = camels;
	}

	public Double getPigs() {
		return pigs;
	}

	public void setPigs(Double pigs) {
		this.pigs = pigs;
	}

	public Double getVolumeOfGrossOutputOfAgriculture() {
		return volumeOfGrossOutputOfAgriculture;
	}

	public void setVolumeOfGrossOutputOfAgriculture(Double volumeOfGrossOutputOfAgriculture) {
		this.volumeOfGrossOutputOfAgriculture = volumeOfGrossOutputOfAgriculture;
	}

	public Double getVolumeOfProductionOfCropProducts() {
		return volumeOfProductionOfCropProducts;
	}

	public void setVolumeOfProductionOfCropProducts(Double volumeOfProductionOfCropProducts) {
		this.volumeOfProductionOfCropProducts = volumeOfProductionOfCropProducts;
	}

	public Double getVolumeOfProductionOfLivestockProducts() {
		return volumeOfProductionOfLivestockProducts;
	}

	public void setVolumeOfProductionOfLivestockProducts(Double volumeOfProductionOfLivestockProducts) {
		this.volumeOfProductionOfLivestockProducts = volumeOfProductionOfLivestockProducts;
	}
	
}
