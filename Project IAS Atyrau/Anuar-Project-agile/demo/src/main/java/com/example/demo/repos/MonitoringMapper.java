package com.example.demo.repos;
	
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.AgriculturalIndustryMonitoring;
import com.example.demo.domain.ArchitectureMonitoring;
import com.example.demo.domain.BudgetMonitoring;
import com.example.demo.domain.ConstructionMonitoring;
import com.example.demo.domain.ControlOverLandUseMonitoring;
import com.example.demo.domain.EconomicMonitoring;
import com.example.demo.domain.EconomicMonitoring2;
import com.example.demo.domain.EducationMonitoring;
import com.example.demo.domain.GovermentPurchases;
import com.example.demo.domain.HealthcareMonitoring;
import com.example.demo.domain.HealthcareMonitoring2;
import com.example.demo.domain.HealthcareMonitoring3;
import com.example.demo.domain.HealthcareMonitoringUnits;
import com.example.demo.domain.LandRelations;
import com.example.demo.domain.ReligionMonitoring;
import com.example.demo.domain.StateLaborInspectorate;
import com.example.demo.domain.TransportMonitoring;
import com.example.demo.domain.TransportMonitoring2;
import com.example.demo.domain.VeterenaryMonitoring;

public interface MonitoringMapper {

//	Healthcare monthes
	
	@Select("SELECT DISTINCT o_year AS year "
			+ "FROM sed_m_uzdrav WHERE o_year = #{year}")
	public HealthcareMonitoring getHealthcareMonitoringByYear(String year);
	
	@Select("SELECT ARRAY[SUM(o_number_calls_ambulance_station), SUM(o_of_them_adults), SUM(o_of_them_children), SUM(o_ofthem_taken_hospital), "
			+ "SUM(o_ofthem_placed_hospital), SUM(o_ofthem_dtp), SUM(o_ofthese_industrial_injuries), SUM(o_ofthese_domestic_injuries), "
			+ "SUM(o_ofthem_burns), SUM(o_number_ambulances), SUM(o_number_ambulance_crews_ssmp)] AS myValues "
			+ "FROM sed_m_uzdrav "
			+ "WHERE o_year = #{year} AND o_month = #{month}")
	public String getHealthcareValuesByYearAndMonth(String year, String month);

	@Select("SELECT DISTINCT o_year FROM sed_m_uzdrav")
	public String[] getMonthHealthcareYears();
	

//	Healthcare quarters
	
	@Select("SELECT DISTINCT o_year AS year "
			+ "FROM sed_q_uzdrav WHERE o_year = #{year}")
	public HealthcareMonitoring2 getHealthcareMonitoring2ByYear(String year);
	
	@Select("SELECT ARRAY[o_mortality_from_cancer, o_child_mortality, o_mortality_from_circulatory, "
			+ "o_mortality_heart_disease, o_incidence_of_cancer, o_incidence_tuberculosis, "
			+ "o_infant_mortality, o_mortality_from_injuries, o_life_expectancy_atbirth, o_maternal_mortality, "
			+ "o_medical, o_morbidity_acute_myocardial_infarction, o_morbidity_arterial_hypertension, "
			+ "o_morbidity_blood_circulation, o_morbidity_coronary_heart_disease, o_morbidity_from_injuries, "
			+ "o_morbidity_mbd, o_morbidity_mbdsu, o_mortality_rate, "
			+ "o_natural_population_growth, o_number_doctors_alldepartments, o_number_doctors_system_mz, "
			+ "o_number_teams, o_number_units, o_sistema_mz, "
			+ "o_number_independent_stations, o_number_nurses_alldepartments, o_number_nurses_systemmz, "
			+ "o_number_dhb_mon_system, o_number_organizations_patient_polyclinic_help, "
			+ "o_number_organizations_pph_other, "
			+ "o_number_organizations_pph_private, "
			+ "o_number_organizations_pph_systemmz, "
			+ "o_number_oo_hbdh, o_private_organization, "
			+ "o_number_providing_inpatient_care, o_number_providing_inpatient_care_systemmz, "
			+ "o_resident_private, o_resident_state, o_number_residents_aho, "
			+ "o_self_supporting_systemmz, o_number_persons_served, "
			+ "o_number_visit_doctors_a, o_number_visit_doctors, o_number_completed_visits, "
			+ "o_medical_assistant, o_pediatric, o_provision_doctors_alldepartments, o_provision_doctors_systemmz, "
			+ "o_provision_hospital_beds, o_systemmz, o_provision_average_medicalstaff, "
			+ "o_provision_average_medicall_systemmz, o_total_morbidity_population, o_total_number_beds, "
			+ "o_total_number_bds_tna, o_number_of_hospital_beds, o_mortality_rate_tuberculosis] "
			+ "FROM sed_q_uzdrav "
			+ "WHERE o_year = #{year} AND o_quarter = #{quarter}")
	public String getHealthcareValuesByYearAndQuarter(String year, String quarter);
	
	@Select("SELECT DISTINCT sed_q.o_unit AS mortalityRateUnit, sed_q.o_unit_a AS maternalMortalityUnit, " 
			+ "sed_q.o_unit_b AS infantMortalityUnit, sed_q.o_unit_c AS tuberculosisUnit, sed_q.o_unit_d AS lifeExpectancyAtBirthUnit, "
			+ "sed_q.o_unit_e AS childMortalityUnit, sed_q.o_unit_f AS tuberculosisMortalityRateUnit, sed_q.o_unit_g AS circulatoryMortalityUnit, "
			+ "sed_q.o_unit_h AS cancerMortalityUnit, sed_q.o_unit_i AS naturalPopulationGrowthUnit, sed_q.o_unit_j AS heartDiseaseMortalityUnit, "
			+ "sed_q.o_unit_k AS injuriesMortalityUnit, sed_q.o_unit_l AS numberOfDoctorsFromAllDepartmentsUnit, sed_q.o_unit_n AS numberOfDoctorsFromSystemMZUnit, "
			+ "sed_q.o_unit_m AS provisionOfDoctorsFromAllDepartmentsUnit, sed_q.o_unit_m AS provisionOfDoctorsFromSystemMZUnit, "
			+ "sed_q.o_unit_n AS numberOfNursesFromAllDepartmentsUnit, sed_q.o_unit_n AS numberOfNursesFromSystemMZUnit, "
			+ "sed_q.o_unit_o AS provisionOfNursesFromAllDepartmentsUnit, sed_q.o_unit_o AS provisionOfNursesFromSystemMZUnit, "
			+ "sed_q.o_unit_p AS numberOfProvidingInpatientCareUnit, sed_q.o_unit_r AS numberOfProvidingInpatientCareFromSystemMZUnit, "
			+ "sed_q.o_unit_r AS totalNumberOfHospitalBedsUnit, sed_q.o_unit_r AS numberOfHospitalBedsFromSystemMZUnit, "
			+ "sed_q.o_unit_r AS numberOfSelfSupportingSystemMZUnit, sed_q.o_unit_r AS numberOfPrivateOrganizationsUnit,"
			+ "sed_q.o_unit_s AS provisionOfHospitalBedsUnit, sed_q.o_unit_t AS provisionOfHospitalBedsSystemMZUnit, "
			+ "sed_q.o_unit_u AS numberOfResidentsSystemMZUnit, sed_q.o_unit_u AS numberOfResidentsStateUnit, "
			+ "sed_q.o_unit_u AS numberOfResidentsPrivateUnit, sed_q.o_unit_v AS numberOfOrganizationsWithDayHospitalBedsUnit, "
			+ "sed_q.o_unit_w AS totalNumberOfDayBedsInHospitalOrganizationsUnit, sed_q.o_unit_x AS numberOfOrganizationsWithPatientPolyclinicHelpUnit, "
			+ "sed_q.o_unit_x AS numberOfOrganizationsWithPatientPolyclinicHelpSystemMZUnit, "
			+ "sed_q.o_unit_x AS numberOfOrganizationsWithPatientPolyclinicHelpOthersUnit, "
			+ "sed_q.o_unit_x AS numberOfOrganizationsWithPatientPolyclinicHelpPrivateUnit, sed_q.o_unit_y AS numberOfVisitDoctorsFor1000Unit, "
			+ "sed_q.o_unit_yy AS numberOfVisitDoctorsFor1Unit, sed_q.o_unit_z AS numberOfPolyclinicsWithDayHospitalBedsUnit, "
			+ "sed_q.o_unit_aa AS totalNumberDayPoliclinicBedsUnit, sed_q.o_unit_bb AS totalMorbidityOfPopulationUnit, "
			+ "sed_q.o_unit_cc AS incidenceOfCancerUnit, sed_q.o_unit_dd AS morbidityFromMentalDisordersUnit, "
			+ "sed_q.o_unit_ee AS morbidityFromMentalDisordersWithSubstanceUseUnit, sed_q.o_unit_ff AS morbidityFromInjuriesUnit, "
			+ "sed_q.o_unit_gg AS morbidityFromBloodCirculationUnit, sed_q.o_unit_gg AS morbidity_arterial_hypertension, "
			+ "sed_q.o_unit_gg AS morbidityFromCoronaryHeartDiseaseUnit, sed_q.o_unit_gg AS morbidityFromAcuteMyocardialInfarctionUnit, "
			+ "sed_q.o_unit_ii AS numberOfIndependentStationsUnit, sed_q.o_unit_jj AS numberOfEmergencyDepartmentsUnit, "
			+ "sed_q.o_unit_kk AS numberOfEmergencyBrigadesUnit, sed_q.o_unit_kk AS medicalUnit, sed_q.o_unit_kk AS pediatricUnit, "
			+ "sed_q.o_unit_kk AS paramedicsUnit, sed_q.o_unit_kk AS numberOfcompletedEmergencyVisitsUnit, "
			+ "sed_q.o_unit_ll AS numberOfServedPersonsByEmergencyDepartmentsUnit, "
			+ "sed_y.o_unit_zz AS fertilityUnit, sed_y.o_unit_mm AS prevalenceOfInfectionUnit, "
			+ "sed_y.o_unit_l AS numberOfDoctorsInPrivateOrganizationsUnit, sed_y.o_unit_q AS medicalStaffingUnit, "
			+ "sed_y.o_unit_p AS numberOfMedicalStaffPositionsUnit, sed_y.o_unit_p AS numberMedicalPositionsHeldUnit, "
			+ "sed_y.o_unit_o AS numberOfNursesInPrivateOrganizationsUnit, sed_y.o_unit_r AS numberOfProvidingInpatientCareOthersUnit, "
			+ "sed_y.o_unit_vv AS numberOfPatientsInTheDUnit, sed_y.o_unit_vv AS numberOfPatientsFrom0TO14Unit, "
			+ "sed_y.o_unit_vv AS numberOfPatientsFrom15To17Unit, sed_y.o_unit_vv AS numberOfPatientsAfter18Unit, "
			+ "sed_y.o_unit_w AS totalNumberOfPharmaciesUnit, sed_y.o_unit_w AS numberOfStatePharmaciesUnit, "
			+ "sed_y.o_unit_w AS numberOfPrivatePharmaciesUnit "
			+ "FROM sed_q_uzdrav sed_q, sed_y_zdrav sed_y")
	public HealthcareMonitoringUnits getHealthcareMonitoringUnits();
	
	@Select("SELECT DISTINCT o_year FROM sed_q_uzdrav")
	public String[] getQuarterHealthcareYears();
	
//	Healthcare years
	
	@Select("SELECT o_year, o_mortality_from_cancer, o_child_mortality, o_mortality_from_circulatory, "
			+ "o_mortality_heart_disease, o_incidence_of_cancer, o_incidence_tuberculosis, "
			+ "o_infant_mortality, o_mortality_from_injuries, o_life_expectancy_atbirth, o_maternal_mortality, "
			+ "o_medical, o_morbidity_acute_myocardial_infarction, o_morbidity_arterial_hypertension, "
			+ "o_morbidity_blood_circulation, o_morbidity_coronary_heart_disease, o_morbidity_from_injuries, "
			+ "o_morbidity_mbd, o_morbidity_mbdsu, o_mortality_rate, "
			+ "o_natural_population_growth, o_number_doctors_alldepartments, o_number_doctors_system_mz, "
			+ "o_number_teams, o_number_units, o_sistema_mz, "
			+ "o_number_independent_stations, o_number_nurses_alldepartments, o_number_nurses_systemmz, "
			+ "o_number_dhb_mon_system, o_number_organizations_patient_polyclinic_help, "
			+ "o_number_organizations_pph_other, "
			+ "o_number_organizations_pph_private, "
			+ "o_number_organizations_pph_systemmz, "
			+ "o_number_oo_hbdh, o_private_organization, "
			+ "o_number_providing_inpatient_care, o_number_providing_inpatient_care_systemmz, "
			+ "o_resident_private, o_resident_state, o_number_residents_aho, "
			+ "o_self_supporting_systemmz, o_number_persons_served, "
			+ "o_number_visit_doctors_a, o_number_visit_doctors, o_number_completed_visits, "
			+ "o_medical_assistant, o_pediatric, o_provision_doctors_alldepartments, o_provision_doctors_systemmz, "
			+ "o_provision_hospital_beds, o_provision_hospital_beds_systemmz, o_provision_average_medicalstaff, "
			+ "o_provision_average_medicall_systemmz, o_total_morbidity_population, o_total_number_beds, "
			+ "o_total_number_bds_tna, o_number_of_hospital_beds, o_mortality_rate_tuberculosis,"
			+ "o_fertility, o_prevalence_infection, o_number_doctors_private_organizations, "
			+ "o_staffing_medical_personnel, o_number_medical_staff_positions, o_number_medical_positions_held, "
			+ "o_number_nurses_private_organizations, o_number_providing_inpatient_care_other, o_non_consideration_d, "
			+ "o_number_patients_14years, o_number_patients_1517years, o_number_patients_18years, o_total_number_pharmacies, "
			+ "o_state_pharmacies, o_private_pharmacies "
			+ "FROM sed_y_zdrav")
	@Results(value = {
		      @Result(property = "year", column = "o_year"),
		      @Result(property = "mortalityRate", column = "o_mortality_rate"),
		      @Result(property = "maternalMortality", column = "o_maternal_mortality"),
		      @Result(property = "infantMortality", column = "o_infant_mortality"),       
		      @Result(property = "incidenceTuberculosis", column = "o_incidence_tuberculosis"),
		      @Result(property = "lifeExpectancyAtBirth", column = "o_life_expectancy_atbirth"),
		      @Result(property = "childMortality", column = "o_child_mortality"),
		      @Result(property = "tuberculosisMortalityRate", column = "o_mortality_rate_tuberculosis"),
		      @Result(property = "circulatoryMortality", column = "o_mortality_from_circulatory"),
		      @Result(property = "cancerMortality", column = "o_mortality_from_cancer"),
		      @Result(property = "naturalPopulationGrowth", column = "o_natural_population_growth"),
		      @Result(property = "heartDiseaseMortality", column = "o_mortality_heart_disease"),
		      @Result(property = "injuriesMortality", column = "o_mortality_from_injuries"),
		      @Result(property = "numberOfDoctorsFromAllDepartments", column = "o_number_doctors_alldepartments"),
		      @Result(property = "numberOfDoctorsFromSystemMZ", column = "o_number_doctors_system_mz"),
		      @Result(property = "provisionOfDoctorsFromAllDepartments", column = "o_provision_doctors_alldepartments"),
		      @Result(property = "provisionOfDoctorsFromSystemMZ", column = "o_provision_doctors_systemmz"),
		      @Result(property = "numberOfNursesFromAllDepartments", column = "o_number_nurses_alldepartments"),
		      @Result(property = "numberOfNursesFromSystemMZ", column = "o_number_nurses_systemmz"),
		      @Result(property = "provisionOfNursesFromAllDepartments", column = "o_provision_average_medicalstaff"),
		      @Result(property = "provisionOfNursesFromSystemMZ", column = "o_provision_average_medicall_systemmz"),
		      @Result(property = "numberOfProvidingInpatientCare", column = "o_number_providing_inpatient_care"),
		      @Result(property = "numberOfProvidingInpatientCareFromSystemMZ", column = "o_number_providing_inpatient_care_systemmz"),
		      @Result(property = "totalNumberOfHospitalBeds", column = "o_number_of_hospital_beds"),
		      @Result(property = "numberOfHospitalBedsFromSystemMZ", column = "o_sistema_mz"),
		      @Result(property = "numberOfSelfSupportingSystemMZ", column = "o_self_supporting_systemmz"),
		      @Result(property = "numberOfPrivateOrganizations", column = "o_private_organization"),
		      @Result(property = "provisionOfHospitalBeds", column = "o_provision_hospital_beds"),
		      @Result(property = "provisionOfHospitalBedsSystemMZ", column = "o_provision_hospital_beds_systemmz"),
		      @Result(property = "numberOfResidentsSystemMZ", column = "o_number_residents_aho"),
		      @Result(property = "numberOfResidentsState", column = "o_resident_state"),
		      @Result(property = "numberOfResidentsPrivate", column = "o_resident_private"),
		      @Result(property = "numberOfOrganizationsWithDayHospitalBeds", column = "o_number_dhb_mon_system"),
		      @Result(property = "totalNumberOfDayBedsInHospitalOrganizations", column = "o_total_number_bds_tna"),
		      @Result(property = "numberOfOrganizationsWithPatientPolyclinicHelp", column = "o_number_organizations_patient_polyclinic_help"),
		      @Result(property = "numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ", column = "o_number_organizations_pph_systemmz"),
		      @Result(property = "numberOfOrganizationsWithPatientPolyclinicHelpOthers", column = "o_number_organizations_pph_other"),
		      @Result(property = "numberOfOrganizationsWithPatientPolyclinicHelpPrivate", column = "o_number_organizations_pph_private"),
		      @Result(property = "numberOfVisitDoctorsFor1000", column = "o_number_visit_doctors"),
		      @Result(property = "numberOfVisitDoctorsFor1", column = "o_number_visit_doctors_a"),
		      @Result(property = "numberOfPolyclinicsWithDayHospitalBeds", column = "o_number_oo_hbdh"),
		      @Result(property = "totalNumberDayPoliclinicBeds", column = "o_total_number_beds"),
		      @Result(property = "totalMorbidityOfPopulation", column = "o_total_morbidity_population"),
		      @Result(property = "incidenceOfCancer", column = "o_incidence_of_cancer"),
		      @Result(property = "morbidityFromMentalDisorders", column = "o_morbidity_mbd"),
		      @Result(property = "morbidityFromMentalDisordersWithSubstanceUse", column = "o_morbidity_mbdsu"),
		      @Result(property = "morbidityFromInjuries", column = "o_morbidity_from_injuries"),
		      @Result(property = "morbidityFromBloodCirculation", column = "o_morbidity_blood_circulation"),
		      @Result(property = "morbidityFromArterialHypertension", column = "o_morbidity_arterial_hypertension"),
		      @Result(property = "morbidityFromCoronaryHeartDisease", column = "o_morbidity_coronary_heart_disease"),
		      @Result(property = "morbidityFromAcuteMyocardialInfarction", column = "o_morbidity_acute_myocardial_infarction"),
		      @Result(property = "numberOfIndependentStations", column = "o_number_independent_stations"),
		      @Result(property = "numberOfEmergencyDepartments", column = "o_number_units"),
		      @Result(property = "numberOfEmergencyBrigades", column = "o_number_teams"),
		      @Result(property = "medical", column = "o_medical"),
		      @Result(property = "pediatric", column = "o_pediatric"),
		      @Result(property = "paramedics", column = "o_medical_assistant"),
		      @Result(property = "numberOfcompletedEmergencyVisits", column = "o_number_completed_visits"),
		      @Result(property = "numberOfServedPersonsByEmergencyDepartments", column = "o_number_persons_served"),
		      @Result(property = "fertility", column = "o_fertility"),
		      @Result(property = "prevalenceOfInfection", column = "o_prevalence_infection"),
		      @Result(property = "numberOfDoctorsInPrivateOrganizations", column = "o_number_doctors_private_organizations"),
		      @Result(property = "medicalStaffing", column = "o_staffing_medical_personnel"),
		      @Result(property = "numberOfMedicalStaffPositions", column = "o_number_medical_staff_positions"),
		      @Result(property = "numberMedicalPositionsHeld", column = "o_number_medical_positions_held"),
		      @Result(property = "numberOfNursesInPrivateOrganizations", column = "o_number_nurses_private_organizations"),
		      @Result(property = "numberOfProvidingInpatientCareOthers", column = "o_number_providing_inpatient_care_other"),
		      @Result(property = "numberOfPatientsInTheD", column = "o_non_consideration_d"),
		      @Result(property = "numberOfPatientsFrom0TO14", column = "o_number_patients_14years"),
		      @Result(property = "numberOfPatientsFrom15To17", column = "o_number_patients_1517years"),
		      @Result(property = "numberOfPatientsAfter18", column = "o_number_patients_18years"),
		      @Result(property = "totalNumberOfPharmacies", column = "o_total_number_pharmacies"),
		      @Result(property = "numberOfStatePharmacies", column = "o_state_pharmacies"),
		      @Result(property = "numberOfPrivatePharmacies", column = "o_private_pharmacies")
		   })
	public List<HealthcareMonitoring3> getHealthcareMonitoring3();
	
//	Budget monitoring
	
	@Select("SELECT * FROM sed_y_budget")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "budgetExecution", column = "o_budget_execution"),
			@Result(property = "budgetExecutionUnit", column = "o_unit"),
			@Result(property = "disbursementOfRepublicanBudget", column = "o_development_means_rb"),
			@Result(property = "disbursementOfRepublicanBudgetUnit", column = "o_unit_a"),
			@Result(property = "disbursementOfLocalBudget", column = "o_development_means_mb"),
			@Result(property = "disbursementOfLocalBudgetUnit", column = "o_unit_b"),
			@Result(property = "regionalBudget", column = "o_volume_budget_region"),
			@Result(property = "regionalBudgetUnit", column = "o_unit_c"),
			@Result(property = "developmentBudget", column = "o_development_budget"),
			@Result(property = "developmentBudgetUnit", column = "o_unit_d"),
			@Result(property = "currentBudget", column = "o_current_budget"),
			@Result(property = "currentBudgetUnit", column = "o_unit_e")
	})
	public List<BudgetMonitoring> getBudgetMonitoring();
	
//	Land Realtions
	
	@Select("SELECT * FROM sed_y_uzo")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "agriculturalLandTotal", column = "o_agricultural_land_total_area"),
			@Result(property = "agriculturalLandTotalUnit", column = "o_unit"),
			@Result(property = "landsOfCitizensForConstruction", column = "o_land_construction"),
			@Result(property = "landsOfCitizensForConstructionUnit", column = "o_unit_a"),
			@Result(property = "landOfCitizensForFarmingTotal", column = "o_land_farming"),
			@Result(property = "landOfCitizensForFarmingTotalUnit", column = "o_unit_b"),
			@Result(property = "arableLands", column = "o_arables"),
			@Result(property = "arableLandsUnit", column = "o_unit_c"),
			@Result(property = "pastureLands", column = "o_pastures"),
			@Result(property = "pastureLandsUnit", column = "o_unit_c"),
			@Result(property = "LandsOfNonStateAgriculturalLegalEntitiesTotal", column = "o_nonstate_agricultural_legal_entities"),
			@Result(property = "LandsOfNonStateAgriculturalLegalEntitiesTotalUnit", column = "o_unit_d"),
			@Result(property = "LandsOfNonStateAgriculturalLegalEntitiesArable", column = "o_nonstate_agricultural_land_arables"),
			@Result(property = "LandsOfNonStateAgriculturalLegalEntitiesArableUnit", column = "o_unit_d"),
			@Result(property = "LandsOfNonStateAgriculturalLegalEntitiesPasture", column = "o_nonstate_agricultural_land_pastures"),
			@Result(property = "LandsOfNonStateAgriculturalLegalEntitiesPastureUnit", column = "o_unit_d"),
			@Result(property = "LandsOfStateAgriculturalLegalEntitiesTotal", column = "o_state_agricultural_land"),
			@Result(property = "LandsOfStateAgriculturalLegalEntitiesTotalUnit", column = "o_unit_e"),
			@Result(property = "LandsOfStateAgriculturalLegalEntitiesArables", column = "o_state_agricultural_land_arables"),
			@Result(property = "LandsOfStateAgriculturalLegalEntitiesArablesUnit", column = "o_unit_e"),
			@Result(property = "LandsOfStateAgriculturalLegalEntitiesPastures", column = "o_state_agricultural_land_pastures"),
			@Result(property = "LandsOfStateAgriculturalLegalEntitiesPasturesUnit", column = "o_unit_e"),
			@Result(property = "landsOfSettlements", column = "o_lands_settlements"),
			@Result(property = "landsOfSettlementsUnit", column = "o_unit_f"),
			@Result(property = "nonAgriculturalLand", column = "o_non_agricultural_land"),
			@Result(property = "nonAgriculturalLandUnit", column = "o_unit_g"),
			@Result(property = "nonAgriculturalLandIndustries", column = "o_non_agricultural_land_industries"),
			@Result(property = "nonAgriculturalLandIndustriesUnit", column = "o_unit_g"),
			@Result(property = "roadTransport", column = "o_road_transport"),
			@Result(property = "roadTransportUnit", column = "o_unit_g"),
			@Result(property = "railwayTransport", column = "o_railway_transport"),
			@Result(property = "railwayTransportUnit", column = "o_unit_g"),
			@Result(property = "communication", column = "o_communication"),
			@Result(property = "communicationUnit", column = "o_unit_g"),
			@Result(property = "otherNonAgriculturalEnterprises", column = "o_other_nonagricultural_enterprises"),
			@Result(property = "otherNonAgriculturalEnterprisesUnit", column = "o_unit_g"),
			@Result(property = "protectedAreas", column = "o_lands_specially_protected_areas"),
			@Result(property = "protectedAreasUnit", column = "o_unit_h"),
			@Result(property = "landsOfForestFund", column = "o_lands_forest_fund"),
			@Result(property = "landsOfForestFundUnit", column = "o_unit_j"),
			@Result(property = "landsOfWaterFund", column = "o_lands_water_fund"),
			@Result(property = "landsOfWaterFundUnit", column = "o_unit_k"),
			@Result(property = "reserveLands", column = "o_stock_lands"),
			@Result(property = "reserveLandsUnit", column = "o_unit_l"),
			@Result(property = "landsOfLandowners", column = "o_land_used_landowners"),
			@Result(property = "landsOfLandownersUnit", column = "o_unit_m"),
			@Result(property = "territoryTotalArea", column = "o_territory_total_area"),
			@Result(property = "territoryTotalAreaUnit", column = "o_unit_m")
	})
	public List<LandRelations> getLandRelations();
	
//	Architecture
	
	@Select("SELECT * FROM sed_m_uag WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "month", column = "o_month"),
			@Result(property = "volumeOfHousingCommissioned", column = "o_volume_housing_commissioned"),
			@Result(property = "volumeOfHousingCommissionedUnit", column = "o_unit"),
			@Result(property = "housingOnBudget", column = "o_housing_expense_budget"),
			@Result(property = "housingOnBudgetUnit", column = "o_unit_a"),
			@Result(property = "departmentalHousing", column = "o_departmental_housing"),
			@Result(property = "departmentalHousingUnit", column = "o_unit_b"),
			@Result(property = "IHS", column = "o_ihs"),
			@Result(property = "IHSUnit", column = "o_unit_d"),
			@Result(property = "commercialHousing", column = "o_commercial_housing"),
			@Result(property = "commercialHousingUnit", column = "o_unit_e")
	})	
	public List<ArchitectureMonitoring> getArchitectureByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_m_uag")
	public List<String> getArchitectureYears();
	
//	Goverment Purchases
	
	@Select("SELECT o_year AS year, o_month AS month, "
			+ "SUM(o_number_competitions_held) AS numberOfCompetitionsHeld, "
			+ "o_unit AS numberOfCompetitionsHeldUnit, SUM(o_total_amount_competitionsheld) AS totalNumberOfCompetitions, "
			+ "o_unit_a AS totalNumberOfCompetitionsUnit "
			+ "FROM sed_m_ugz WHERE o_year = #{year} "
			+ "GROUP BY o_year, o_month, o_unit, o_unit_a")
	public List<GovermentPurchases> getGovermentPurchasesByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_m_ugz")
	public List<String> getGovermentPurchasesYears();
	
//	Construction
	
	@Select("SELECT * FROM sed_m_ustroi WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "month", column = "o_month"),
			@Result(property = "scopeOfConstructionWorks", column = "o_scope_construction_works"),
			@Result(property = "scopeOfConstructionWorksUnit", column = "o_unit"),
			@Result(property = "scopeOfConstructionWorksStates", column = "o_states"),
			@Result(property = "scopeOfConstructionWorksStatesUnit", column = "o_unit"),
			@Result(property = "scopeOfConstructionWorksPrivate", column = "o_private"),
			@Result(property = "scopeOfConstructionWorksPrivateUnit", column = "o_unit"),
			@Result(property = "scopeOfConstructionWorksForeign", column = "o_foreign"),
			@Result(property = "scopeOfConstructionWorksForeignUnit", column = "o_unit"),
			@Result(property = "сonstructionAndInstallationWorks", column = "o_construction_installationworks"),
			@Result(property = "сonstructionAndInstallationWorksUnit", column = "o_unit_a"),
			@Result(property = "constructionOfNonResidentialBuildings", column = "o_construction_nonresidentialbuildings"),
			@Result(property = "constructionOfNonResidentialBuildingsUnit", column = "o_unit_b"),
			@Result(property = "constructionOfResidentialBuildings", column = "o_construction_residentialbuildings"),
			@Result(property = "constructionOfResidentialBuildingsUnit", column = "o_unit_d"),
			@Result(property = "overhaul", column = "o_overhaul"),
			@Result(property = "overhaulUnit", column = "o_unit_e"),
			@Result(property = "maintenance", column = "o_maintenance"),
			@Result(property = "maintenanceUnit", column = "o_unit_c"),
			@Result(property = "otherConstructionWorks", column = "o_other_constructionworks"),
			@Result(property = "otherConstructionWorksUnit", column = "o_unit_f"),
			@Result(property = "otherConstructionProjects", column = "o_other_constructionprojects"),
			@Result(property = "otherConstructionProjectsUnit", column = "o_unit_g")
	})	
	public List<ConstructionMonitoring> getConstructionsByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_m_ustroi")
	public List<String> getConstructionYears();
	
//	State Labor Inspectorate
	
	@Select("SELECT * FROM sed_m_ugit WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "month", column = "o_month"),
			@Result(property = "numberOfAccidents", column = "o_number_accidents"),
			@Result(property = "numberOfAccidentsUnit", column = "o_unit"),
			@Result(property = "numberOfTeamAccidents", column = "o_number_accidents_team"),
			@Result(property = "numberOfTeamAccidentsUnit", column = "o_unit_b"),
			@Result(property = "numberOfVictims", column = "o_number_victims"),
			@Result(property = "numberOfVictimsUnit", column = "o_unit_c"),
			@Result(property = "numberOfVictimsDead", column = "o_number_victims_dead"),
			@Result(property = "numberOfVictimsDeadUnit", column = "o_unit_d"),
			@Result(property = "monitoringOfCollectiveAgreements", column = "o_monitoring_collective_agreements"),
			@Result(property = "monitoringOfCollectiveAgreementsUnit", column = "o_unit_e"),
			@Result(property = "administrativeFinesImposed", column = "o_administrative_fines_imposed"),
			@Result(property = "administrativeFinesImposedUnit", column = "o_unit_f"),
			@Result(property = "untimelyPayments", column = "o_identification_untimely_payment"),
			@Result(property = "untimelyPaymentsUnit", column = "o_unit_g"),
			@Result(property = "socialTension", column = "o_social_tension"),
			@Result(property = "socialTensionUnit", column = "o_unit_h")
	})	
	public List<StateLaborInspectorate> getStateLaborInspectorateByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_m_ugit")
	public List<String> getStateLaborInspectorateYears();
	
//	Education
	
	@Select("SELECT * FROM sed_y_uobr")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "suicideBefore18", column = "o_suicide"),
			@Result(property = "ENTParticipantsFromAllStudents", column = "o_share_participants_ent"),
			@Result(property = "ENTParticipantsComparedToLastYear", column = "o_number_participants"),
			@Result(property = "numberOfENTParticipants", column = "o_number_participants_ent"),
			@Result(property = "averagENTScoreInComparedToLastYear", column = "o_average_score_compared_lastyear"),
			@Result(property = "averageENTScore", column = "o_average_score_ent"),
			@Result(property = "AltynBelgiApplicantsComparedToLastYear", column = "o_applicants_altynbelgi_comparison_lastyear"),
			@Result(property = "AltynBelgiApplicants", column = "o_number_applicants_altynbelgi"),
			@Result(property = "numberOfConfirmedAltynBelgi", column = "o_number_confirmed_altynbelgi"),
			@Result(property = "numberOfConfirmedAltynBelgiComparedToTotalNumber", column = "o_number_confirmed_altynbelgi_total"),
			@Result(property = "certificateWithHonorsApplicantsComparedToLastYear", column = "o_number_applicants_certificate_honors_lastyear"),
			@Result(property = "numberOfConfirmedCertificateWithHonors", column = "o_confirmed_certificate_honors"),
			@Result(property = "graduatesWithUnsatisfactoryResult", column = "o_with_result_unsatisfactory"),
			@Result(property = "graduatesWithBelowTheThreshold", column = "o_scores_below_threshold"),
			@Result(property = "coverageChildrenWithEducationFrom1To6", column = "o_coverage_children_1_6"),
			@Result(property = "coverageChildrenWithEducationFrom3To6", column = "o_coverage_children_3_6"),
			@Result(property = "providingPreschoolEducationInUrbanAndRuralAreas", column = "o_provision_education_urban_rural"),
			@Result(property = "shareOfEmployedGraduatesFromTotal", column = "o_share_employed_graduates"),
			@Result(property = "totalNumberOfGraduates", column = "o_number_graduates_total"),
			@Result(property = "numberOfGraduatesComparedToLasttYear", column = "o_number_graduates_compared_lastyear"),
			@Result(property = "numberOfEducationalFacilities", column = "o_number_educational_facilities"),
			@Result(property = "numbrOfSchools", column = "o_number_schools"),
			@Result(property = "numberOfKindergartens", column = "o_number_kindergartens"),
			@Result(property = "numberOfEmergencyFaciliies", column = "o_number_emergency_facilities"),
			@Result(property = "numberOfEmergencyKindrgartens", column = "o_number_emergency_kindergartens"),
			@Result(property = "numberOfEmergencySchools", column = "o_number_emergency_schools"),
			@Result(property = "overageOfChildrenWithAdditionalEducation", column = "o_coverage_additional_education"),
			@Result(property = "organizationsOfHotMealsForPupils", column = "o_hot_feed_data")
	})	
	public List<EducationMonitoring> getEducationStatistics();
	
//	Religion
	
	@Select("SELECT * FROM sed_q_updr WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "quarter", column = "o_quarter"),
			@Result(property = "numberOfReligiousAssociations", column = "o_number_religious_associations"),
			@Result(property = "numberOfIslamicReligiousAssociations", column = "o_associations_islam"),
			@Result(property = "numberOfOrthodoxReligiousAssociations", column = "o_associations_orthodox"),
			@Result(property = "numberOfCatholicReligiousAssociations", column = "o_associations_catholic"),
			@Result(property = "numberOfProtestantReligiousAssociations", column = "o_associations_protestant"),
			@Result(property = "numberOfReligiousBuildings", column = "o_places_worship"),
			@Result(property = "numberOfIslamicReligiousBuildings", column = "o_places_worship_islam"),
			@Result(property = "numberOfOrthodoxReligiousBuildings", column = "o_places_worship_orthodox"),
			@Result(property = "numberOfCatholicReligiousBuildings", column = "o_places_worship_catholic"),
			@Result(property = "numberOfProtestantReligiousBuildings", column = "o_places_worship_protestant"),
			@Result(property = "numberOfMissionaries", column = "o_number_missionaries"),
			@Result(property = "numberOfIslamicMissionaries", column = "o_missionaries_islam"),
			@Result(property = "numberOfOrthodoxMissionaries", column = "o_missionaries_orthodox"),
			@Result(property = "numberOfCatholicMissionaries", column = "o_missionaries_catholic"),
			@Result(property = "numberOfProtestantMissionaries", column = "o_missionaries_protestant"),
			@Result(property = "informationAndExplanatoryEvents", column = "o_awareness_raising_activities"),
			@Result(property = "conferences", column = "o_conferences"),
			@Result(property = "seminars", column = "o_seminars"),
			@Result(property = "lectures", column = "o_lectures"),
			@Result(property = "roundTables", column = "o_round_table"),
			@Result(property = "briefings", column = "o_briefings"),
			@Result(property = "stocks", column = "o_stock"),
			@Result(property = "forums", column = "o_forums"),
			@Result(property = "otherEvents", column = "o_other_event"),
			@Result(property = "individualMeeting", column = "o_individual_meeting"),
			@Result(property = "numberOfCoveredPeople", column = "o_number_people_covered"),
			@Result(property = "numberOfCoveredPeopleIslam", column = "o_covered_islam"),
			@Result(property = "numberOfCoveredPeopleOrthodox", column = "o_covered_orthodox"),
			@Result(property = "numberOfCoveredPeopleCatholic", column = "o_covered_catholic"),
			@Result(property = "numberOfCoveredPeopleProtestant", column = "o_covered_protestant"),
			@Result(property = "numberOfMaintenanceWork", column = "o_number_preventivework"),
			@Result(property = "numberOfMaintenanceWorkIslam", column = "o_number_preventivework_islam"),
			@Result(property = "numberOfMaintenanceWorkOrthodox", column = "o_number_preventivework_orthodox"),
			@Result(property = "numberOfMaintenanceWorkCatholic", column = "o_number_preventivework_catholic"),
			@Result(property = "numberOfMaintenanceWorkProtestant", column = "o_number_preventivework_protestant"),
			@Result(property = "meetings", column = "o_meetings"),
			@Result(property = "meetingsWithYouth", column = "o_meetings_with_young"),
			@Result(property = "meetingsWithAulDistricts", column = "o_meetings_population_rural_districts"),
			@Result(property = "socialPolls", column = "o_sociological_surveys"),
			@Result(property = "workingWithMedia", column = "o_working_with_media"),
			@Result(property = "article", column = "o_article"),
			@Result(property = "interview", column = "o_interview"),
			@Result(property = "InformationNews", column = "o_information_news"),
			@Result(property = "internetMaterials", column = "o_internet_material"),
			@Result(property = "programImanNury", column = "o_transfer_iman_nury"),
			@Result(property = "disseminationOfMethodologicalMaterials", column = "o_dissemination_materials"),
			@Result(property = "expertiseOnSites", column = "o_examination_sites")
	})
	public List<ReligionMonitoring> getReligionByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_q_updr")
	public List<String> getReligionYears();
	
//	Control Over Land Use Monitoring
	
	@Select("SELECT * FROM sed_q_ohranz WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "quarter", column = "o_quarter"),
			@Result(property = "checksCarriedOut", column = "o_carried_out_inspections"),
			@Result(property = "actsOnRevealedOffenses", column = "o_issued_acts_offenses"),
			@Result(property = "imposeFines", column = "o_impose_fine"),
			@Result(property = "administrativeFines", column = "o_administrative_offence"),
			@Result(property = "regulationsForTheUseOfLand", column = "o_issued_orders"),
			@Result(property = "refulationsToEliminateViolationsOfTheLaw", column = "o_issued_orders_violations"),
			@Result(property = "claimsForCompulsoryLandAcquisition", column = "o_lawsuits_filed")
	})
	public List<ControlOverLandUseMonitoring> getControlOverLandUseMonitoringByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_q_ohranz WHERE o_year <> ''")
	public List<String> getControlOverLandUseMonitoringYears();
	
//	Economic
	
	@Select("SELECT * FROM sed_m_ueibp WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "month", column = "o_month"),
			@Result(property = "consumerPriceIndex", column = "o_consumer_price_index"),
			@Result(property = "consumerPriceIndexArticleOfFood", column = "o_consumer_price_index_c"),
			@Result(property = "consumerPriceIndexNonFood", column = "o_consumer_price_index_a"),
			@Result(property = "consumerPriceIndexNonFoodPaidService", column = "o_consumer_price_index_b"),
			@Result(property = "receiptOfTaxesAndOtherPayments", column = "o_tax_receipts"),
			@Result(property = "forecastOfRB", column = "o_the_forecast_rb"),
			@Result(property = "forecastOfMB", column = "o_the_forecast_mb"),
			@Result(property = "nationalFund", column = "o_national_fund"),
			@Result(property = "taxRevenue", column = "o_tax_revenue"),
			@Result(property = "NonTaxReceipts", column = "o_nontax_revenue"),
			@Result(property = "proceedsFromTheSale", column = "o_proceeds_fromsale"),
			@Result(property = "growthOfTaxAndNonTaxRevenues", column = "o_growth_tax_nontaxrevenues"),
			@Result(property = "worldPriceOfOil", column = "o_world_price_oil"),
			@Result(property = "RB", column = "o_rb"),
			@Result(property = "MB", column = "o_mb")
	})
	public List<EconomicMonitoring> getEconomicMonthesByYear(String year);
	
	@Select("SELECT * FROM sed_q_econom WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "quarter", column = "o_quarter"),
			@Result(property = "GRPVolume", column = "o_volume"),
			@Result(property = "GRPPerCapita", column = "o_per_capita_vrp")
	})
	public List<EconomicMonitoring2> getEconomicQuartersByYear(String year);
	
	@Select("SELEct DISTINCT o_year FROM sed_m_ueibp")
	public List<String> getYearsOfEconomicMonthes();
	

	@Select("SELEct DISTINCT o_year FROM sed_q_econom")
	public List<String> getYearsOfEconomicQuarters();
	
//	Transport
	
	@Select("SELECT * FROM sed_m_uptiad WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "month", column = "o_month"),
			@Result(property = "roadBuilding", column = "o_road_building"),
			@Result(property = "constructionOfBridges", column = "o_construction_bridges"),
			@Result(property = "transportationByAllTypes", column = "o_transportation_goods_modestransport"),
			@Result(property = "turnoverVolume", column = "o_volume_turnover"),
			@Result(property = "passengerTurnover", column = "o_passenger_turnover"),
			@Result(property = "passengersTransportedByRoad", column = "o_transported_passengers_road")
	})
	public List<TransportMonitoring> getTransportMonthesByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_m_uptiad")
	public List<String> getTransportYears();
	
	@Select("SELECT * FROM sed_y_uptiad")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "totalLengthOfRoads", column = "o_total_length_roads"),
			@Result(property = "percentageOfHighways", column = "o_share_roads"),
			@Result(property = "lengthOfRoadsOfRegionalSignificance", column = "o_length_roads"),
			@Result(property = "reconstructedRoads", column = "o_reconstructed_repairedroads")
	})
	public List<TransportMonitoring2> getTransportsByYears();
	
//	Agricultural Industry (Сель хоз)
	
	@Select("SELECT * FROM sed_m_ush WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "month", column = "o_month"),
			@Result(property = "meatProduction", column = "o_meat_production"),
			@Result(property = "milkProduction", column = "o_milk_production"),
			@Result(property = "eggProduction", column = "o_egg_production"),
			@Result(property = "numberOfCattle", column = "o_cattle"),
			@Result(property = "sheepAndGoats", column = "o_sheep_goats"),
			@Result(property = "horses", column = "o_horses"),
			@Result(property = "camels", column = "o_camels"),
			@Result(property = "pigs", column = "o_pigs"),
			@Result(property = "volumeOfGrossOutputOfAgriculture", column = "o_volume_agriculture"),
			@Result(property = "volumeOfProductionOfCropProducts", column = "o_volume_production"),
			@Result(property = "volumeOfProductionOfLivestockProducts", column = "o_volume_animalhusbandry")
	})
	public List<AgriculturalIndustryMonitoring> getAgriculturalIndustryByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_m_ush")
	public List<String> getAgriculturalIndustryYears();
	
//	Veterenary
	
	@Select("SELECT * FROM sed_m_uv WHERE o_year = #{year}")
	@Results(value = {
			@Result(property = "year", column = "o_year"),
			@Result(property = "area", column = "o_area"),
			@Result(property = "month", column = "o_month"),
			@Result(property = "rabiesOfCattle", column = "o_rabies_cattle"),
			@Result(property = "rabiesOfSmallCattle", column = "o_rabies_small_cattle"),
			@Result(property = "rabiesOfHorse", column = "o_rabies_horse"),
			@Result(property = "rabiesOfCamels", column = "o_rabies_camel"),
			@Result(property = "rabiesOfDogs", column = "o_rabies_dogs"),
			@Result(property = "rabiesOfCats", column = "o_rabies_cat"),
			@Result(property = "anthraxOfCattle", column = "o_anthrax_cattle"),
			@Result(property = "anthraxOfSmallCattle", column = "o_anthrax_small_cattle"),
			@Result(property = "anthraxOfHorses", column = "o_anthrax_horse"),
			@Result(property = "anthraxOfPigs", column = "o_anthrax_pigs"),
			@Result(property = "anthraxOfCamels", column = "o_anthrax_camel"),
			@Result(property = "tuberculinizationOfCattle", column = "o_tuberculinization_cattle"),
			@Result(property = "tuberculinizationOfCamels", column = "o_tuberculinization_camels"),
			@Result(property = "echinococcosisOfCarnivores", column = "o_enhinococcosis_carnivores"),
			@Result(property = "vaccinationOfAnimals", column = "o_vaccination_animals"),
			@Result(property = "pasteurellosisOfCattle", column = "o_pasteurellosis_cattle"),
			@Result(property = "nodularDermatitis", column = "o_nodular_dermatitis"),
			@Result(property = "SAPOfHorses", column = "o_glanders_horses"),
			@Result(property = "highlyPathogenicAvianInfluenza", column = "o_pathogenic_influenza"),
			@Result(property = "emphysematousBovineCarbuncle", column = "o_emphysematous_carbuncle_cattle"),
			@Result(property = "plagueOfCamels", column = "o_plague_camels")
	})
	public List<VeterenaryMonitoring> getVeterenaryByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM sed_m_uv")
	public List<String> getVeterenaryYears();
	
}
