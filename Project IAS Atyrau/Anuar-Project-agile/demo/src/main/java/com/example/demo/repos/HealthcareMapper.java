package com.example.demo.repos;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.Demography;
import com.example.demo.domain.Morbidity;
import com.example.demo.domain.Mortality;
import com.example.demo.domain.OrganizationsInfo;
import com.example.demo.domain.Personnel;

public interface HealthcareMapper {

	String selectDemographicsRows = "select o_area AS area, o_region AS region, o_year AS year, o_fertility AS fertility, "
			+ "o_overall_mortality_rate AS overallMortalityRate, o_natural_population_growth AS naturalPopulationGrowth, "
			+ "o_life_expectancy AS lifeExpectancy "
			+ "FROM zdrav_kpi";

	String selectMortalitiesRows = "select o_area AS area, o_region AS region, "
			+ "o_year AS year, o_maternal_mortality AS maternalMortality, "
			+ "o_infant_mortality AS infantMortality, o_mortality_from_tuberculosis AS tuberculosisMortality, "
			+ "o_death_from_cancer AS cancerMortality, o_mortality_from_injuries AS injuriesMortality,"
			+ "o_mortality_from_of_the AS circulatoryDiseaseMortality, "
			+ "o_mortality_heart_disease AS heartDiseaseMortality FROM zdrav_kpi";
	
	String selectMorbidityRows = "SELECT o_area AS area, o_region AS region, o_year AS year, o_total_morbidity_population AS total, "
			+ "o_lncidence_of_tuberculosis AS tuberculosis, "
			+ "o_incidence_of_cancer AS cancer, o_morbidity_mbd AS mbd, o_morbidity_mbdsu AS mbdSu, "
			+ "o_morbidity_from_injuries AS injuries, o_morbidity_blood_circulation AS bloodCirculation, "
			+ "o_morbidity_arterial_hypertension AS arterialhypertension, o_morbidity_coronary_heart_disease AS "
			+ "coronaryHeartDisease, o_morbidity_acute_myocardial_infarction AS acuteMyocardialInfarction, "
			+ "o_prevalence_of_hiv As hiv FROM zdrav_kpi";
	
	String selectOrganizationsRows = "SELECT o_area AS area, o_region AS region , o_year AS year, o_number_providing_inpatient_care AS inpatientCare, "
			+ "o_number_organizations_patient_polyclinic_help AS patientPolyclinicHelp, "
			+ "o_number_of_hospital_beds AS totalNumberOfHospitalBeds, "
			+ "o_number_dhb_mon_system AS hospitalOrganizationsWithBeds, o_number_oo_hbdh AS patientPolyclinicsWithBeds, "
			+ "o_provision_hospital_beds AS provisionHospitalBeds FROM zdrav_kpi";

	String selectPersonnelRows = "SELECT o_area AS area, o_region AS region, o_year AS year, "
			+ "o_number_doctors AS numberOfDoctors, o_number_nurses AS numberOfAverageMedicalStaff, "
			+ "o_staffing_medical_personnel AS StaffingOfDoctors, o_provision_medical_personnel AS provisionOfAverageMedicalStaff, "
			+ "o_provision_population_doctors AS provisionOfDoctors, o_number_medical_staff_positions AS numberOfMedicalStaffPositions, "
			+ "o_number_medical_positions_held AS numberOfHeldMedicalPositions FROM zdrav_kpi";
	
//	Methods for demography statistics
	
	@Select(selectDemographicsRows + " WHERE o_year = #{year} ORDER BY o_region")
	public List<Demography> getDemographicsByYear(String year);
	
	@Select(selectDemographicsRows + " WHERE o_region = #{region} ORDER BY o_year")
	public List<Demography> getDemographicsByRegion(String region);
	
//	Methods for mortality statistics
	
	@Select(selectMortalitiesRows + " WHERE o_year = #{year} ORDER BY o_region")
	public List<Mortality> getMortalitiesByYear(String year);

	@Select(selectMortalitiesRows + " WHERE o_region = #{region} ORDER BY o_year")
	public List<Mortality> getMortalitiesByRegion(String region);
	
//	Methods for morbidity statistics
	
	@Select(selectMorbidityRows + " WHERE o_year = #{year} ORDER BY o_region")
	public List<Morbidity> getMorbiditiesByYear(String year);
	
	@Select(selectMorbidityRows + " WHERE o_region = #{region} ORDER BY o_year")
	public List<Morbidity> getMorbiditiesByRegion(String region);
	
//	Methods for organization statistics
	
	@Select(selectOrganizationsRows + " WHERE o_year = #{year} ORDER BY o_region")
	public List<OrganizationsInfo> getOrganizationsInfoByYear(String year);
	
//	Methods for personnel statistics
	
	@Select(selectPersonnelRows + " WHERE o_region = #{region} ORDER BY o_year")
	public List<Personnel> getPersonnelByRegion(String region);
	
	@Select(selectPersonnelRows + " WHERE o_year = #{year} ORDER BY o_region")
	public List<Personnel> getPersonnelByYear(String year);
	
}
