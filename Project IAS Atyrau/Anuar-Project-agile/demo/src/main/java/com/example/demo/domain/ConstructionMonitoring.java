package com.example.demo.domain;

public class ConstructionMonitoring {

	private String year;
	private String area;
	private String month;
	
	private Double scopeOfConstructionWorks; // o_scope_construction_works | Обьем строительных работ
	private String scopeOfConstructionWorksUnit; // o_unit | млрд. тенге
	
	private Double scopeOfConstructionWorksStates; // o_states | Обьем строительных работ (Государственная)
	private String scopeOfConstructionWorksStatesUnit; // o_unit | млрд. тенге
	
	private Double scopeOfConstructionWorksPrivate; // o_private | Обьем строительных работ ( Частаная)
	private String scopeOfConstructionWorksPrivateUnit; // o_unit | млрд. тенге
	
	private Double scopeOfConstructionWorksForeign; // o_foreign | Обьем строительных работ ( Иностранная)
	private String scopeOfConstructionWorksForeignUnit; // o_unit | млрд. тенге
	
	private Double сonstructionAndInstallationWorks; // o_construction_installationworks | Строительно-монтажные работы
	private String сonstructionAndInstallationWorksUnit; // o_unit_a | млрд. тенге
	
	private Double constructionOfNonResidentialBuildings; // o_construction_nonresidentialbuildings | Строительство нежилиых зданий
	private String constructionOfNonResidentialBuildingsUnit; // o_unit_b | млрд. тенге
	
	private Double constructionOfResidentialBuildings; // o_construction_residentialbuildings | Строительство жилиых зданий
	private String constructionOfResidentialBuildingsUnit; // o_unit_d | млрд. тенге
	 
	private Double overhaul; // o_overhaul | Капитальный ремонт
	private String overhaulUnit; // o_unit_e | млрд. тенге
	
	private Double maintenance; // o_maintenance | Текущий ремонт
	private String maintenanceUnit; // o_unit_c | млрд. тенге
	
	private Double otherConstructionWorks; // o_other_constructionworks | Прочие строительные работы
	private String otherConstructionWorksUnit; // o_unit_f | млрд. тенге
	
	private Double otherConstructionProjects; // o_other_constructionprojects | Прочие обьекты строительства
	private String otherConstructionProjectsUnit; // o_unit_g | млрд. тенге
	
	public ConstructionMonitoring() {
		
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

	public Double getScopeOfConstructionWorks() {
		return scopeOfConstructionWorks;
	}

	public void setScopeOfConstructionWorks(Double scopeOfConstructionWorks) {
		this.scopeOfConstructionWorks = scopeOfConstructionWorks;
	}

	public String getScopeOfConstructionWorksUnit() {
		return scopeOfConstructionWorksUnit;
	}

	public void setScopeOfConstructionWorksUnit(String scopeOfConstructionWorksUnit) {
		this.scopeOfConstructionWorksUnit = scopeOfConstructionWorksUnit;
	}

	public Double getScopeOfConstructionWorksStates() {
		return scopeOfConstructionWorksStates;
	}

	public void setScopeOfConstructionWorksStates(Double scopeOfConstructionWorksStates) {
		this.scopeOfConstructionWorksStates = scopeOfConstructionWorksStates;
	}

	public String getScopeOfConstructionWorksStatesUnit() {
		return scopeOfConstructionWorksStatesUnit;
	}

	public void setScopeOfConstructionWorksStatesUnit(String scopeOfConstructionWorksStatesUnit) {
		this.scopeOfConstructionWorksStatesUnit = scopeOfConstructionWorksStatesUnit;
	}

	public Double getScopeOfConstructionWorksPrivate() {
		return scopeOfConstructionWorksPrivate;
	}

	public void setScopeOfConstructionWorksPrivate(Double scopeOfConstructionWorksPrivate) {
		this.scopeOfConstructionWorksPrivate = scopeOfConstructionWorksPrivate;
	}

	public String getScopeOfConstructionWorksPrivateUnit() {
		return scopeOfConstructionWorksPrivateUnit;
	}

	public void setScopeOfConstructionWorksPrivateUnit(String scopeOfConstructionWorksPrivateUnit) {
		this.scopeOfConstructionWorksPrivateUnit = scopeOfConstructionWorksPrivateUnit;
	}

	public Double getScopeOfConstructionWorksForeign() {
		return scopeOfConstructionWorksForeign;
	}

	public void setScopeOfConstructionWorksForeign(Double scopeOfConstructionWorksForeign) {
		this.scopeOfConstructionWorksForeign = scopeOfConstructionWorksForeign;
	}

	public String getScopeOfConstructionWorksForeignUnit() {
		return scopeOfConstructionWorksForeignUnit;
	}

	public void setScopeOfConstructionWorksForeignUnit(String scopeOfConstructionWorksForeignUnit) {
		this.scopeOfConstructionWorksForeignUnit = scopeOfConstructionWorksForeignUnit;
	}

	public Double getСonstructionAndInstallationWorks() {
		return сonstructionAndInstallationWorks;
	}

	public void setСonstructionAndInstallationWorks(Double сonstructionAndInstallationWorks) {
		this.сonstructionAndInstallationWorks = сonstructionAndInstallationWorks;
	}

	public String getСonstructionAndInstallationWorksUnit() {
		return сonstructionAndInstallationWorksUnit;
	}

	public void setСonstructionAndInstallationWorksUnit(String сonstructionAndInstallationWorksUnit) {
		this.сonstructionAndInstallationWorksUnit = сonstructionAndInstallationWorksUnit;
	}

	public Double getConstructionOfNonResidentialBuildings() {
		return constructionOfNonResidentialBuildings;
	}

	public void setConstructionOfNonResidentialBuildings(Double constructionOfNonResidentialBuildings) {
		this.constructionOfNonResidentialBuildings = constructionOfNonResidentialBuildings;
	}

	public String getConstructionOfNonResidentialBuildingsUnit() {
		return constructionOfNonResidentialBuildingsUnit;
	}

	public void setConstructionOfNonResidentialBuildingsUnit(String constructionOfNonResidentialBuildingsUnit) {
		this.constructionOfNonResidentialBuildingsUnit = constructionOfNonResidentialBuildingsUnit;
	}

	public Double getConstructionOfResidentialBuildings() {
		return constructionOfResidentialBuildings;
	}

	public void setConstructionOfResidentialBuildings(Double constructionOfResidentialBuildings) {
		this.constructionOfResidentialBuildings = constructionOfResidentialBuildings;
	}

	public String getConstructionOfResidentialBuildingsUnit() {
		return constructionOfResidentialBuildingsUnit;
	}

	public void setConstructionOfResidentialBuildingsUnit(String constructionOfResidentialBuildingsUnit) {
		this.constructionOfResidentialBuildingsUnit = constructionOfResidentialBuildingsUnit;
	}

	public Double getOverhaul() {
		return overhaul;
	}

	public void setOverhaul(Double overhaul) {
		this.overhaul = overhaul;
	}

	public String getOverhaulUnit() {
		return overhaulUnit;
	}

	public void setOverhaulUnit(String overhaulUnit) {
		this.overhaulUnit = overhaulUnit;
	}

	public Double getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(Double maintenance) {
		this.maintenance = maintenance;
	}

	public String getMaintenanceUnit() {
		return maintenanceUnit;
	}

	public void setMaintenanceUnit(String maintenanceUnit) {
		this.maintenanceUnit = maintenanceUnit;
	}

	public Double getOtherConstructionWorks() {
		return otherConstructionWorks;
	}

	public void setOtherConstructionWorks(Double otherConstructionWorks) {
		this.otherConstructionWorks = otherConstructionWorks;
	}

	public String getOtherConstructionWorksUnit() {
		return otherConstructionWorksUnit;
	}

	public void setOtherConstructionWorksUnit(String otherConstructionWorksUnit) {
		this.otherConstructionWorksUnit = otherConstructionWorksUnit;
	}

	public Double getOtherConstructionProjects() {
		return otherConstructionProjects;
	}

	public void setOtherConstructionProjects(Double otherConstructionProjects) {
		this.otherConstructionProjects = otherConstructionProjects;
	}

	public String getOtherConstructionProjectsUnit() {
		return otherConstructionProjectsUnit;
	}

	public void setOtherConstructionProjectsUnit(String otherConstructionProjectsUnit) {
		this.otherConstructionProjectsUnit = otherConstructionProjectsUnit;
	}

}
