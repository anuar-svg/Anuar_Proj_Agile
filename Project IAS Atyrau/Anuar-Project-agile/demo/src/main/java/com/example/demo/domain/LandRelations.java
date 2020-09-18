package com.example.demo.domain;

public class LandRelations {

	private String year;
	private String area;
	
	private String agriculturalLandTotal; // o_agricultural_land_total_area | Земли сельскохозяйственного назначения (общая площадь)
	private String agriculturalLandTotalUnit; // o_unit | тыс. га

	private String landsOfCitizensForConstruction; // o_land_construction | Земли граждан для ведения садоводства и дачного строитлеьство
	private String landsOfCitizensForConstructionUnit; // o_unit_a | тыс. га
	
	private String landOfCitizensForFarmingTotal; // o_land_farming | Земли граждан для ведения крестьянского хозяйства (общая площадь)
	private String landOfCitizensForFarmingTotalUnit; // o_unit_b | тыс. га
	
	private String arableLands; // o_arables | Земли граждан для ведения крестьянского хозяйства (пашни)
	private String arableLandsUnit; // o_unit_c | тыс. га
	
	private String pastureLands; // o_pastures | Земли граждан для ведения крестьянского хозяйства (пастбища)
	private String pastureLandsUnit; // o_unit_c | тыс. га
	
	private String LandsOfNonStateAgriculturalLegalEntitiesTotal; // o_nonstate_agricultural_legal_entities | Земли негосударственных сельскохозяйственных юридических лиц (общая площадь)
	private String LandsOfNonStateAgriculturalLegalEntitiesTotalUnit; // o_unit_d | тыс. га
	
	private String LandsOfNonStateAgriculturalLegalEntitiesArable; // o_nonstate_agricultural_land_arables | Земли негосударственных сельскохозяйственных юридических лиц (пашни)
	private String LandsOfNonStateAgriculturalLegalEntitiesArableUnit; // o_unit_d | тыс. га
	
	private String LandsOfNonStateAgriculturalLegalEntitiesPasture; // o_nonstate_agricultural_land_pastures | Земли негосударственных сельскохозяйственных юридических лиц (пастбища)
	private String LandsOfNonStateAgriculturalLegalEntitiesPastureUnit; // o_unit_d | тыс. га
	
	private String LandsOfStateAgriculturalLegalEntitiesTotal; // o_state_agricultural_land | Земли государственных сельскохозяйственных юридических лиц (общая площадь)
	private String LandsOfStateAgriculturalLegalEntitiesTotalUnit; // o_unit_e | тыс. га
	
	private String LandsOfStateAgriculturalLegalEntitiesArables; // o_state_agricultural_land_arables | Земли государственных сельскохозяйственных юридических лиц (пашни)
	private String LandsOfStateAgriculturalLegalEntitiesArablesUnit; // o_unit_e | тыс. га
	
	private String LandsOfStateAgriculturalLegalEntitiesPastures; // o_state_agricultural_land_pastures | Земли государственных сельскохозяйственных юридических лиц (пастбища)
	private String LandsOfStateAgriculturalLegalEntitiesPasturesUnit; // o_unit_e | тыс. га
	
	private String landsOfSettlements; // o_lands_settlements | Земли населенных пунктов
	private String landsOfSettlementsUnit; // o_unit_f | тыс. га

	private String nonAgriculturalLand; // o_non_agricultural_land | Земли промышленности, транспорта и иного несельскохозяйственного назначения
	private String nonAgriculturalLandUnit; // o_unit_g | тыс. га
	
	private String nonAgriculturalLandIndustries; // o_non_agricultural_land_industries | промышленности
	private String nonAgriculturalLandIndustriesUnit; // o_unit_g | тыс. га
	
	private String roadTransport; // o_road_transport | автомобильного транспорта
	private String roadTransportUnit; // o_unit_g | тыс. га
	
	private String railwayTransport; // o_railway_transport | железнодорожного транспорта
	private String railwayTransportUnit; // o_unit_g | тыс. га
	
	private String communication; // o_communication | связи
	private String communicationUnit; // o_unit_g | тыс. га
	
	private String otherNonAgriculturalEnterprises; // o_other_nonagricultural_enterprises | Других несельскохозяйственных предприятий
	private String otherNonAgriculturalEnterprisesUnit; // o_unit_g | тыс. га
	
	private String protectedAreas; // o_lands_specially_protected_areas | Земли особо озраняемых природных территорий 
	private String protectedAreasUnit; // o_unit_h | тыс. га
	
	private String landsOfForestFund; // o_lands_forest_fund | Земли лесного фонда
	private String landsOfForestFundUnit; // o_unit_j | тыс. га
	
	private String landsOfWaterFund; // o_lands_water_fund | Земли водного фонда
	private String landsOfWaterFundUnit; // o_unit_k | тыс. га
	
	private String reserveLands; // o_stock_lands | Земли запаса
	private String reserveLandsUnit; // o_unit_l | тыс. га
	
	private String landsOfLandowners; // o_land_used_landowners | Земли, используемые землевладельцами других районов
	private String landsOfLandownersUnit; // o_unit_m | тыс. га
	
	private String territoryTotalArea; // o_territory_total_area | Территория района, области, республики (общая площадь)
	private String territoryTotalAreaUnit; // o_unit_m | тыс. га
	
	public LandRelations() {
	
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

	public String getAgriculturalLandTotal() {
		return agriculturalLandTotal;
	}

	public void setAgriculturalLandTotal(String agriculturalLandTotal) {
		this.agriculturalLandTotal = agriculturalLandTotal;
	}

	public String getAgriculturalLandTotalUnit() {
		return agriculturalLandTotalUnit;
	}

	public void setAgriculturalLandTotalUnit(String agriculturalLandTotalUnit) {
		this.agriculturalLandTotalUnit = agriculturalLandTotalUnit;
	}

	public String getLandsOfCitizensForConstruction() {
		return landsOfCitizensForConstruction;
	}

	public void setLandsOfCitizensForConstruction(String landsOfCitizensForConstruction) {
		this.landsOfCitizensForConstruction = landsOfCitizensForConstruction;
	}

	public String getLandsOfCitizensForConstructionUnit() {
		return landsOfCitizensForConstructionUnit;
	}

	public void setLandsOfCitizensForConstructionUnit(String landsOfCitizensForConstructionUnit) {
		this.landsOfCitizensForConstructionUnit = landsOfCitizensForConstructionUnit;
	}

	public String getLandOfCitizensForFarmingTotal() {
		return landOfCitizensForFarmingTotal;
	}

	public void setLandOfCitizensForFarmingTotal(String landOfCitizensForFarmingTotal) {
		this.landOfCitizensForFarmingTotal = landOfCitizensForFarmingTotal;
	}

	public String getLandOfCitizensForFarmingTotalUnit() {
		return landOfCitizensForFarmingTotalUnit;
	}

	public void setLandOfCitizensForFarmingTotalUnit(String landOfCitizensForFarmingTotalUnit) {
		this.landOfCitizensForFarmingTotalUnit = landOfCitizensForFarmingTotalUnit;
	}

	public String getArableLands() {
		return arableLands;
	}

	public void setArableLands(String arableLands) {
		this.arableLands = arableLands;
	}

	public String getArableLandsUnit() {
		return arableLandsUnit;
	}

	public void setArableLandsUnit(String arableLandsUnit) {
		this.arableLandsUnit = arableLandsUnit;
	}

	public String getPastureLands() {
		return pastureLands;
	}

	public void setPastureLands(String pastureLands) {
		this.pastureLands = pastureLands;
	}

	public String getPastureLandsUnit() {
		return pastureLandsUnit;
	}

	public void setPastureLandsUnit(String pastureLandsUnit) {
		this.pastureLandsUnit = pastureLandsUnit;
	}

	public String getLandsOfNonStateAgriculturalLegalEntitiesTotal() {
		return LandsOfNonStateAgriculturalLegalEntitiesTotal;
	}

	public void setLandsOfNonStateAgriculturalLegalEntitiesTotal(String landsOfNonStateAgriculturalLegalEntitiesTotal) {
		LandsOfNonStateAgriculturalLegalEntitiesTotal = landsOfNonStateAgriculturalLegalEntitiesTotal;
	}

	public String getLandsOfNonStateAgriculturalLegalEntitiesTotalUnit() {
		return LandsOfNonStateAgriculturalLegalEntitiesTotalUnit;
	}

	public void setLandsOfNonStateAgriculturalLegalEntitiesTotalUnit(
			String landsOfNonStateAgriculturalLegalEntitiesTotalUnit) {
		LandsOfNonStateAgriculturalLegalEntitiesTotalUnit = landsOfNonStateAgriculturalLegalEntitiesTotalUnit;
	}

	public String getLandsOfNonStateAgriculturalLegalEntitiesArable() {
		return LandsOfNonStateAgriculturalLegalEntitiesArable;
	}

	public void setLandsOfNonStateAgriculturalLegalEntitiesArable(String landsOfNonStateAgriculturalLegalEntitiesArable) {
		LandsOfNonStateAgriculturalLegalEntitiesArable = landsOfNonStateAgriculturalLegalEntitiesArable;
	}

	public String getLandsOfNonStateAgriculturalLegalEntitiesArableUnit() {
		return LandsOfNonStateAgriculturalLegalEntitiesArableUnit;
	}

	public void setLandsOfNonStateAgriculturalLegalEntitiesArableUnit(
			String landsOfNonStateAgriculturalLegalEntitiesArableUnit) {
		LandsOfNonStateAgriculturalLegalEntitiesArableUnit = landsOfNonStateAgriculturalLegalEntitiesArableUnit;
	}

	public String getLandsOfNonStateAgriculturalLegalEntitiesPasture() {
		return LandsOfNonStateAgriculturalLegalEntitiesPasture;
	}

	public void setLandsOfNonStateAgriculturalLegalEntitiesPasture(String landsOfNonStateAgriculturalLegalEntitiesPasture) {
		LandsOfNonStateAgriculturalLegalEntitiesPasture = landsOfNonStateAgriculturalLegalEntitiesPasture;
	}

	public String getLandsOfNonStateAgriculturalLegalEntitiesPastureUnit() {
		return LandsOfNonStateAgriculturalLegalEntitiesPastureUnit;
	}

	public void setLandsOfNonStateAgriculturalLegalEntitiesPastureUnit(
			String landsOfNonStateAgriculturalLegalEntitiesPastureUnit) {
		LandsOfNonStateAgriculturalLegalEntitiesPastureUnit = landsOfNonStateAgriculturalLegalEntitiesPastureUnit;
	}

	public String getLandsOfStateAgriculturalLegalEntitiesTotal() {
		return LandsOfStateAgriculturalLegalEntitiesTotal;
	}

	public void setLandsOfStateAgriculturalLegalEntitiesTotal(String landsOfStateAgriculturalLegalEntitiesTotal) {
		LandsOfStateAgriculturalLegalEntitiesTotal = landsOfStateAgriculturalLegalEntitiesTotal;
	}

	public String getLandsOfStateAgriculturalLegalEntitiesTotalUnit() {
		return LandsOfStateAgriculturalLegalEntitiesTotalUnit;
	}

	public void setLandsOfStateAgriculturalLegalEntitiesTotalUnit(String landsOfStateAgriculturalLegalEntitiesTotalUnit) {
		LandsOfStateAgriculturalLegalEntitiesTotalUnit = landsOfStateAgriculturalLegalEntitiesTotalUnit;
	}

	public String getLandsOfStateAgriculturalLegalEntitiesArables() {
		return LandsOfStateAgriculturalLegalEntitiesArables;
	}

	public void setLandsOfStateAgriculturalLegalEntitiesArables(String landsOfStateAgriculturalLegalEntitiesArables) {
		LandsOfStateAgriculturalLegalEntitiesArables = landsOfStateAgriculturalLegalEntitiesArables;
	}

	public String getLandsOfStateAgriculturalLegalEntitiesArablesUnit() {
		return LandsOfStateAgriculturalLegalEntitiesArablesUnit;
	}

	public void setLandsOfStateAgriculturalLegalEntitiesArablesUnit(
			String landsOfStateAgriculturalLegalEntitiesArablesUnit) {
		LandsOfStateAgriculturalLegalEntitiesArablesUnit = landsOfStateAgriculturalLegalEntitiesArablesUnit;
	}

	public String getLandsOfStateAgriculturalLegalEntitiesPastures() {
		return LandsOfStateAgriculturalLegalEntitiesPastures;
	}

	public void setLandsOfStateAgriculturalLegalEntitiesPastures(String landsOfStateAgriculturalLegalEntitiesPastures) {
		LandsOfStateAgriculturalLegalEntitiesPastures = landsOfStateAgriculturalLegalEntitiesPastures;
	}

	public String getLandsOfStateAgriculturalLegalEntitiesPasturesUnit() {
		return LandsOfStateAgriculturalLegalEntitiesPasturesUnit;
	}

	public void setLandsOfStateAgriculturalLegalEntitiesPasturesUnit(
			String landsOfStateAgriculturalLegalEntitiesPasturesUnit) {
		LandsOfStateAgriculturalLegalEntitiesPasturesUnit = landsOfStateAgriculturalLegalEntitiesPasturesUnit;
	}

	public String getLandsOfSettlements() {
		return landsOfSettlements;
	}

	public void setLandsOfSettlements(String landsOfSettlements) {
		this.landsOfSettlements = landsOfSettlements;
	}

	public String getLandsOfSettlementsUnit() {
		return landsOfSettlementsUnit;
	}

	public void setLandsOfSettlementsUnit(String landsOfSettlementsUnit) {
		this.landsOfSettlementsUnit = landsOfSettlementsUnit;
	}

	public String getNonAgriculturalLand() {
		return nonAgriculturalLand;
	}

	public void setNonAgriculturalLand(String nonAgriculturalLand) {
		this.nonAgriculturalLand = nonAgriculturalLand;
	}

	public String getNonAgriculturalLandUnit() {
		return nonAgriculturalLandUnit;
	}

	public void setNonAgriculturalLandUnit(String nonAgriculturalLandUnit) {
		this.nonAgriculturalLandUnit = nonAgriculturalLandUnit;
	}

	public String getNonAgriculturalLandIndustries() {
		return nonAgriculturalLandIndustries;
	}

	public void setNonAgriculturalLandIndustries(String nonAgriculturalLandIndustries) {
		this.nonAgriculturalLandIndustries = nonAgriculturalLandIndustries;
	}

	public String getNonAgriculturalLandIndustriesUnit() {
		return nonAgriculturalLandIndustriesUnit;
	}

	public void setNonAgriculturalLandIndustriesUnit(String nonAgriculturalLandIndustriesUnit) {
		this.nonAgriculturalLandIndustriesUnit = nonAgriculturalLandIndustriesUnit;
	}

	public String getRoadTransport() {
		return roadTransport;
	}

	public void setRoadTransport(String roadTransport) {
		this.roadTransport = roadTransport;
	}

	public String getRoadTransportUnit() {
		return roadTransportUnit;
	}

	public void setRoadTransportUnit(String roadTransportUnit) {
		this.roadTransportUnit = roadTransportUnit;
	}

	public String getRailwayTransport() {
		return railwayTransport;
	}

	public void setRailwayTransport(String railwayTransport) {
		this.railwayTransport = railwayTransport;
	}

	public String getRailwayTransportUnit() {
		return railwayTransportUnit;
	}

	public void setRailwayTransportUnit(String railwayTransportUnit) {
		this.railwayTransportUnit = railwayTransportUnit;
	}

	public String getCommunication() {
		return communication;
	}

	public void setCommunication(String communication) {
		this.communication = communication;
	}

	public String getCommunicationUnit() {
		return communicationUnit;
	}

	public void setCommunicationUnit(String communicationUnit) {
		this.communicationUnit = communicationUnit;
	}

	public String getOtherNonAgriculturalEnterprises() {
		return otherNonAgriculturalEnterprises;
	}

	public void setOtherNonAgriculturalEnterprises(String otherNonAgriculturalEnterprises) {
		this.otherNonAgriculturalEnterprises = otherNonAgriculturalEnterprises;
	}

	public String getOtherNonAgriculturalEnterprisesUnit() {
		return otherNonAgriculturalEnterprisesUnit;
	}

	public void setOtherNonAgriculturalEnterprisesUnit(String otherNonAgriculturalEnterprisesUnit) {
		this.otherNonAgriculturalEnterprisesUnit = otherNonAgriculturalEnterprisesUnit;
	}

	public String getProtectedAreas() {
		return protectedAreas;
	}

	public void setProtectedAreas(String protectedAreas) {
		this.protectedAreas = protectedAreas;
	}

	public String getProtectedAreasUnit() {
		return protectedAreasUnit;
	}

	public void setProtectedAreasUnit(String protectedAreasUnit) {
		this.protectedAreasUnit = protectedAreasUnit;
	}

	public String getLandsOfForestFund() {
		return landsOfForestFund;
	}

	public void setLandsOfForestFund(String landsOfForestFund) {
		this.landsOfForestFund = landsOfForestFund;
	}

	public String getLandsOfForestFundUnit() {
		return landsOfForestFundUnit;
	}

	public void setLandsOfForestFundUnit(String landsOfForestFundUnit) {
		this.landsOfForestFundUnit = landsOfForestFundUnit;
	}

	public String getLandsOfWaterFund() {
		return landsOfWaterFund;
	}

	public void setLandsOfWaterFund(String landsOfWaterFund) {
		this.landsOfWaterFund = landsOfWaterFund;
	}

	public String getLandsOfWaterFundUnit() {
		return landsOfWaterFundUnit;
	}

	public void setLandsOfWaterFundUnit(String landsOfWaterFundUnit) {
		this.landsOfWaterFundUnit = landsOfWaterFundUnit;
	}

	public String getReserveLands() {
		return reserveLands;
	}

	public void setReserveLands(String reserveLands) {
		this.reserveLands = reserveLands;
	}

	public String getReserveLandsUnit() {
		return reserveLandsUnit;
	}

	public void setReserveLandsUnit(String reserveLandsUnit) {
		this.reserveLandsUnit = reserveLandsUnit;
	}

	public String getLandsOfLandowners() {
		return landsOfLandowners;
	}

	public void setLandsOfLandowners(String landsOfLandowners) {
		this.landsOfLandowners = landsOfLandowners;
	}

	public String getLandsOfLandownersUnit() {
		return landsOfLandownersUnit;
	}

	public void setLandsOfLandownersUnit(String landsOfLandownersUnit) {
		this.landsOfLandownersUnit = landsOfLandownersUnit;
	}

	public String getTerritoryTotalArea() {
		return territoryTotalArea;
	}

	public void setTerritoryTotalArea(String territoryTotalArea) {
		this.territoryTotalArea = territoryTotalArea;
	}

	public String getTerritoryTotalAreaUnit() {
		return territoryTotalAreaUnit;
	}

	public void setTerritoryTotalAreaUnit(String territoryTotalAreaUnit) {
		this.territoryTotalAreaUnit = territoryTotalAreaUnit;
	}

}
