package com.example.demo.domain;

public class VeterenaryMonitoring {

	private String year;
	private String area;
	private String month;
	
	private Double rabiesOfCattle; // o_rabies_cattle | Бешенство крупного рогатого скота
	private Double rabiesOfSmallCattle; // o_rabies_small_cattle | бешенство мелкого рогатого скота
	private Double rabiesOfHorse; // o_rabies_horse | Бешенство лошади
	private Double rabiesOfCamels; // o_rabies_camel | Бешенство верблюдов
	private Double rabiesOfDogs; // o_rabies_dogs | Бешенство собак
	private Double rabiesOfCats; // o_rabies_cat | Бешенство кошек
		
	private Double anthraxOfCattle; // o_anthrax_cattle | Сибирская язва крупного рогатого скота
	private Double anthraxOfSmallCattle; // o_anthrax_small_cattle | Сибирская язва мелкого рогатого скота
	private Double anthraxOfHorses; // o_anthrax_horse | Сибирская язва лошодей
	private Double anthraxOfPigs; // o_anthrax_pigs | Сибирская язва свиней
	private Double anthraxOfCamels; // o_anthrax_camel | Сибирская язва верблюдов
	
	private Double tuberculinizationOfCattle; // o_tuberculinization_cattle | Туберкулинизация крупного рогатого скота
	private Double tuberculinizationOfCamels; // o_tuberculinization_camels | Туберкулинизация верблюдов

	private Double echinococcosisOfCarnivores; // o_enhinococcosis_carnivores | Эхинококкоз плотоядных
	private Double vaccinationOfAnimals; // o_vaccination_animals | Вакцинация животных против особо опасных заболеваний
	private Double pasteurellosisOfCattle; // o_pasteurellosis_cattle | Пастереллез крупного рогатого скота
	private Double nodularDermatitis; // o_nodular_dermatitis | Нодулярный дерматит
	private Double SAPOfHorses; // o_glanders_horses | Сап лошадей
	private Double highlyPathogenicAvianInfluenza; // o_pathogenic_influenza | Высокопатогенный грипп птиц
	private Double emphysematousBovineCarbuncle; // o_emphysematous_carbuncle_cattle | Эмфизематозного карбункул крупного рогатого
	private Double plagueOfCamels; // o_plague_camels | Чума верблюдоы
	
	public VeterenaryMonitoring() {
	
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

	public Double getRabiesOfCattle() {
		return rabiesOfCattle;
	}

	public void setRabiesOfCattle(Double rabiesOfCattle) {
		this.rabiesOfCattle = rabiesOfCattle;
	}

	public Double getRabiesOfSmallCattle() {
		return rabiesOfSmallCattle;
	}

	public void setRabiesOfSmallCattle(Double rabiesOfSmallCattle) {
		this.rabiesOfSmallCattle = rabiesOfSmallCattle;
	}

	public Double getRabiesOfHorse() {
		return rabiesOfHorse;
	}

	public void setRabiesOfHorse(Double rabiesOfHorse) {
		this.rabiesOfHorse = rabiesOfHorse;
	}

	public Double getRabiesOfCamels() {
		return rabiesOfCamels;
	}

	public void setRabiesOfCamels(Double rabiesOfCamels) {
		this.rabiesOfCamels = rabiesOfCamels;
	}

	public Double getRabiesOfDogs() {
		return rabiesOfDogs;
	}

	public void setRabiesOfDogs(Double rabiesOfDogs) {
		this.rabiesOfDogs = rabiesOfDogs;
	}

	public Double getRabiesOfCats() {
		return rabiesOfCats;
	}

	public void setRabiesOfCats(Double rabiesOfCats) {
		this.rabiesOfCats = rabiesOfCats;
	}

	public Double getAnthraxOfCattle() {
		return anthraxOfCattle;
	}

	public void setAnthraxOfCattle(Double anthraxOfCattle) {
		this.anthraxOfCattle = anthraxOfCattle;
	}

	public Double getAnthraxOfSmallCattle() {
		return anthraxOfSmallCattle;
	}

	public void setAnthraxOfSmallCattle(Double anthraxOfSmallCattle) {
		this.anthraxOfSmallCattle = anthraxOfSmallCattle;
	}

	public Double getAnthraxOfHorses() {
		return anthraxOfHorses;
	}

	public void setAnthraxOfHorses(Double anthraxOfHorses) {
		this.anthraxOfHorses = anthraxOfHorses;
	}

	public Double getAnthraxOfPigs() {
		return anthraxOfPigs;
	}

	public void setAnthraxOfPigs(Double anthraxOfPigs) {
		this.anthraxOfPigs = anthraxOfPigs;
	}

	public Double getAnthraxOfCamels() {
		return anthraxOfCamels;
	}

	public void setAnthraxOfCamels(Double anthraxOfCamels) {
		this.anthraxOfCamels = anthraxOfCamels;
	}

	public Double getTuberculinizationOfCattle() {
		return tuberculinizationOfCattle;
	}

	public void setTuberculinizationOfCattle(Double tuberculinizationOfCattle) {
		this.tuberculinizationOfCattle = tuberculinizationOfCattle;
	}

	public Double getTuberculinizationOfCamels() {
		return tuberculinizationOfCamels;
	}

	public void setTuberculinizationOfCamels(Double tuberculinizationOfCamels) {
		this.tuberculinizationOfCamels = tuberculinizationOfCamels;
	}

	public Double getEchinococcosisOfCarnivores() {
		return echinococcosisOfCarnivores;
	}

	public void setEchinococcosisOfCarnivores(Double echinococcosisOfCarnivores) {
		this.echinococcosisOfCarnivores = echinococcosisOfCarnivores;
	}

	public Double getVaccinationOfAnimals() {
		return vaccinationOfAnimals;
	}

	public void setVaccinationOfAnimals(Double vaccinationOfAnimals) {
		this.vaccinationOfAnimals = vaccinationOfAnimals;
	}

	public Double getPasteurellosisOfCattle() {
		return pasteurellosisOfCattle;
	}

	public void setPasteurellosisOfCattle(Double pasteurellosisOfCattle) {
		this.pasteurellosisOfCattle = pasteurellosisOfCattle;
	}

	public Double getNodularDermatitis() {
		return nodularDermatitis;
	}

	public void setNodularDermatitis(Double nodularDermatitis) {
		this.nodularDermatitis = nodularDermatitis;
	}

	public Double getSAPOfHorses() {
		return SAPOfHorses;
	}

	public void setSAPOfHorses(Double sAPOfHorses) {
		SAPOfHorses = sAPOfHorses;
	}

	public Double getHighlyPathogenicAvianInfluenza() {
		return highlyPathogenicAvianInfluenza;
	}

	public void setHighlyPathogenicAvianInfluenza(Double highlyPathogenicAvianInfluenza) {
		this.highlyPathogenicAvianInfluenza = highlyPathogenicAvianInfluenza;
	}

	public Double getEmphysematousBovineCarbuncle() {
		return emphysematousBovineCarbuncle;
	}

	public void setEmphysematousBovineCarbuncle(Double emphysematousBovineCarbuncle) {
		this.emphysematousBovineCarbuncle = emphysematousBovineCarbuncle;
	}

	public Double getPlagueOfCamels() {
		return plagueOfCamels;
	}

	public void setPlagueOfCamels(Double plagueOfCamels) {
		this.plagueOfCamels = plagueOfCamels;
	}
	
}
