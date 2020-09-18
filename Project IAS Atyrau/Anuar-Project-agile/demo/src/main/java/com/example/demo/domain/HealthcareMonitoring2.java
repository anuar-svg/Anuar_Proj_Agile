package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;

public class HealthcareMonitoring2 {

	private String year;
	
	private Map<String, Double> mortalityRate; // o_mortality_rate | Уровень смертности
	private Map<String, Double> maternalMortality; // o_maternal_mortality | Материнская смертность
	private Map<String, Double> infantMortality; // o_infant_mortality | Младенческая смертность
	private Map<String, Double> incidenceTuberculosis; // o_incidence_tuberculosis | Заболеваемость туберкулезом
	private Map<String, Double> lifeExpectancyAtBirth; // o_life_expectancy_atbirth | Ожидаемая продолжительность жизни при рождении
	private Map<String, Double> childMortality; // o_child_mortality | Детская смертность
	private Map<String, Double> tuberculosisMortalityRate; // o_mortality_rate_tuberculosis | Уровень сиортности от туберкулеза
	private Map<String, Double> circulatoryMortality; // o_mortality_from_circulatory | Заболеваемость от болезенй системы кровообращения
	private Map<String, Double> cancerMortality; // o_mortality_from_cancer | Уровень смортности от онкологических заболеваний
	private Map<String, Double> naturalPopulationGrowth; // o_natural_population_growth | Естественный прирост населения
	private Map<String, Double> heartDiseaseMortality; // o_mortality_heart_disease | Ишемическая болезнь сердца
	private Map<String, Double> injuriesMortality; // o_mortality_from_injuries | Смертность от травм, отравлений и других внешних причин
	private Map<String, Double> numberOfDoctorsFromAllDepartments; // o_number_doctors_alldepartments | Численность врачей (все ведомства)
	private Map<String, Double> numberOfDoctorsFromSystemMZ; // o_number_doctors_system_mz | Численность врачей (все ведомства): системв МЗ
	private Map<String, Double> provisionOfDoctorsFromAllDepartments; // o_provision_doctors_alldepartments | Обеспеченность начеления врачами все ведомства
	private Map<String, Double> provisionOfDoctorsFromSystemMZ; // o_provision_doctors_systemmz | Обеспеченность начеления врачами все ведомства: системв МЗ
	private Map<String, Double> numberOfNursesFromAllDepartments; // o_number_nurses_alldepartments | Численность среднего медперсонала (все ведомства)
	private Map<String, Double> numberOfNursesFromSystemMZ; // o_number_nurses_systemmz | Численность среднего медперсонала: системв МЗ
	private Map<String, Double> provisionOfNursesFromAllDepartments; // o_provision_average_medicalstaff | Обеспеченность начеления средним медперсоналом (все ведомства)
	private Map<String, Double> provisionOfNursesFromSystemMZ; // o_provision_average_medicall_systemmz | Обеспеченность начеления средним медперсоналом: системв МЗ
	private Map<String, Double> numberOfProvidingInpatientCare; // o_number_providing_inpatient_care | Количество организаций оказывающие стационарную помощь
	private Map<String, Double> numberOfProvidingInpatientCareFromSystemMZ; // o_number_providing_inpatient_care_systemmz |  Количество организаций оказывающие стационарную помощь: системв МЗ
	private Map<String, Double> totalNumberOfHospitalBeds; // o_number_of_hospital_beds | Общее количество больничных коек
	private Map<String, Double> numberOfHospitalBedsFromSystemMZ; // o_sistema_mz | Общее количество больничных коек (система МЗ)
	private Map<String, Double> numberOfSelfSupportingSystemMZ; // o_self_supporting_systemmz | хозрасчетные в системв МЗ
	private Map<String, Double> numberOfPrivateOrganizations; // o_private_organization | частные организации
	
	private Map<String, Double> provisionOfHospitalBeds; // o_provision_hospital_beds | Обеспеченность населения больничными койками
	private Map<String, Double> provisionOfHospitalBedsSystemMZ; // o_systemmz | Обеспеченность населения больничными койками (Система МЗ)
	private Map<String, Double> numberOfResidentsSystemMZ; // o_number_residents_aho | Количество поступивших жителей в больничные организации (система МЗ)
	private Map<String, Double> numberOfResidentsState; // o_resident_state | Количество поступивших жителей в больничные организации (в государственные)
	private Map<String, Double> numberOfResidentsPrivate; // o_resident_private | Количество поступивших жителей в больничные организации (в частные)
	private Map<String, Double> numberOfOrganizationsWithDayHospitalBeds ; // o_number_dhb_mon_system | Количество организаций, имеющих койки дневного стационара
	private Map<String, Double> totalNumberOfDayBedsInHospitalOrganizations ; // o_total_number_bds_tna | Общее количество коек двевного пребывания в больничных организациях (система МЗ)
	private Map<String, Double> numberOfOrganizationsWithPatientPolyclinicHelp; // o_number_organizations_patient_polyclinic_help | Количество организаций, оказывающих амбулаторно-поликлиническую помощь (все ведомства)
	private Map<String, Double> numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ; // o_number_organizations_pph_systemmz | Количество организаций, оказывающих амбулаторно-поликлиническую помощь (система МЗ)
	private Map<String, Double> numberOfOrganizationsWithPatientPolyclinicHelpOthers; // o_number_organizations_pph_other | Количество организаций, оказывающих амбулаторно-поликлиническую помощь (Другие ведомства)
	private Map<String, Double> numberOfOrganizationsWithPatientPolyclinicHelpPrivate; // o_number_organizations_pph_private | Количество организаций, оказывающих амбулаторно-поликлиническую помощь (частные организации)
	private Map<String, Double> numberOfVisitDoctorsFor1000; // o_number_visit_doctors | Количество обращений к врачам  АПО (система МЗ), на 1000 населения
	private Map<String, Double> numberOfVisitDoctorsFor1; // o_number_visit_doctors_a | Количество обращений к врачам  АПО (система МЗ), на 1 жителя
	private Map<String, Double> numberOfPolyclinicsWithDayHospitalBeds; // o_number_oo_hbdh | Количество амбулаторно-поликлинических организаций, имеющие койки дневного стационара
	private Map<String, Double> totalNumberDayPoliclinicBeds; // o_total_number_beds | Общее количество коек дневного пребывания АПО
	private Map<String, Double> totalMorbidityOfPopulation; // o_total_morbidity_population | Общая заболеваемость населения
	private Map<String, Double> incidenceOfCancer; // o_incidence_of_cancer | Заболеваемость от онкологических заболеваний
	private Map<String, Double> morbidityFromMentalDisorders; // o_morbidity_mbd | Заболеваемость от психическиъ расстройств и расстройств поведения
	private Map<String, Double> morbidityFromMentalDisordersWithSubstanceUse; // o_morbidity_mbdsu | Заболеваемость от психическиъ расстройств и расстройств поведения с употреблением психоактивных веществ
	private Map<String, Double> morbidityFromInjuries; // o_morbidity_from_injuries | Заболеваемость от травм, отравлений м других внешних причин
	private Map<String, Double> morbidityFromBloodCirculation; // o_morbidity_blood_circulation | Заболеваемость от болезней системы кровообращения
	private Map<String, Double> morbidityFromArterialHypertension; // o_morbidity_arterial_hypertension | Артериальная гипертензия
	private Map<String, Double> morbidityFromCoronaryHeartDisease; // o_morbidity_coronary_heart_disease | Заболеваемость от болезней системы кровообращения (Ишемическая болезнь сердца)
	private Map<String, Double> morbidityFromAcuteMyocardialInfarction; // o_morbidity_acute_myocardial_infarction | Острый инфоркт миокарда
	private Map<String, Double> numberOfIndependentStations; // o_number_independent_stations | Количество самостоятельных станций
	private Map<String, Double> numberOfEmergencyDepartments; // o_number_units | Количество отделении СМП
	private Map<String, Double> numberOfEmergencyBrigades; // o_number_teams | Количество бригад СМП
	private Map<String, Double> medical; // o_medical | врачебные
	private Map<String, Double> pediatric; // o_pediatric | педиатрические
	private Map<String, Double> paramedics; // o_medical_assistant | фельдшерские
	private Map<String, Double> numberOfcompletedEmergencyVisits; // o_number_completed_visits | Количество выполненных выездов бригад СМП
	private Map<String, Double> numberOfServedPersonsByEmergencyDepartments; // o_number_persons_served | Количество обслуженных лиц, при выездах бригадами СМП
	
	public HealthcareMonitoring2() {
		this.mortalityRate = new HashMap<>();
		this.maternalMortality = new HashMap<>();
		this.infantMortality = new HashMap<>();
		this.incidenceTuberculosis = new HashMap<>();
		this.lifeExpectancyAtBirth = new HashMap<>();
		this.childMortality = new HashMap<>();
		this.tuberculosisMortalityRate = new HashMap<>();
		this.circulatoryMortality = new HashMap<>();
		this.cancerMortality = new HashMap<>();
		this.naturalPopulationGrowth = new HashMap<>();
		this.heartDiseaseMortality = new HashMap<>();
		this.injuriesMortality = new HashMap<>();
		this.numberOfDoctorsFromAllDepartments = new HashMap<>();
		this.numberOfDoctorsFromSystemMZ = new HashMap<>();
		this.provisionOfDoctorsFromAllDepartments = new HashMap<>();
		this.provisionOfDoctorsFromSystemMZ = new HashMap<>();
		this.numberOfNursesFromAllDepartments = new HashMap<>();
		this.numberOfNursesFromSystemMZ = new HashMap<>();
		this.provisionOfNursesFromAllDepartments = new HashMap<>();
		this.provisionOfNursesFromSystemMZ = new HashMap<>();
		this.numberOfProvidingInpatientCare = new HashMap<>();
		this.numberOfProvidingInpatientCareFromSystemMZ = new HashMap<>();
		this.totalNumberOfHospitalBeds = new HashMap<>();
		this.numberOfHospitalBedsFromSystemMZ = new HashMap<>();
		this.numberOfSelfSupportingSystemMZ = new HashMap<>();
		this.numberOfPrivateOrganizations = new HashMap<>();
		this.provisionOfHospitalBeds = new HashMap<>();
		this.provisionOfHospitalBedsSystemMZ = new HashMap<>();
		this.numberOfResidentsSystemMZ = new HashMap<>(); 
		this.numberOfResidentsState = new HashMap<>();
		this.numberOfResidentsPrivate = new HashMap<>();
		this.numberOfOrganizationsWithDayHospitalBeds = new HashMap<>();
		this.totalNumberOfDayBedsInHospitalOrganizations = new HashMap<>();
		this.numberOfOrganizationsWithPatientPolyclinicHelp = new HashMap<>();
		this.numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ = new HashMap<>();
		this.numberOfOrganizationsWithPatientPolyclinicHelpOthers = new HashMap<>();
		this.numberOfOrganizationsWithPatientPolyclinicHelpPrivate = new HashMap<>();
		this.numberOfVisitDoctorsFor1000 = new HashMap<>();
		this.numberOfVisitDoctorsFor1 = new HashMap<>();
		this.numberOfPolyclinicsWithDayHospitalBeds = new HashMap<>();
		this.totalNumberDayPoliclinicBeds = new HashMap<>();
		this.totalMorbidityOfPopulation = new HashMap<>();
		this.incidenceOfCancer = new HashMap<>();
		this.morbidityFromMentalDisorders = new HashMap<>();
		this.morbidityFromMentalDisordersWithSubstanceUse = new HashMap<>();
		this.morbidityFromInjuries = new HashMap<>();
		this.morbidityFromBloodCirculation = new HashMap<>();
		this.morbidityFromArterialHypertension = new HashMap<>();
		this.morbidityFromCoronaryHeartDisease = new HashMap<>();
		this.morbidityFromAcuteMyocardialInfarction = new HashMap<>();
		this.numberOfIndependentStations = new HashMap<>();
		this.numberOfEmergencyDepartments = new HashMap<>();
		this.numberOfEmergencyBrigades = new HashMap<>();
		this.medical = new HashMap<>();           
		this.pediatric = new HashMap<>();
		this.paramedics = new HashMap<>();
		this.numberOfcompletedEmergencyVisits = new HashMap<>();
		this.numberOfServedPersonsByEmergencyDepartments = new HashMap<>();
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Map<String, Double> getMortalityRate() {
		return mortalityRate;
	}

	public void setMortalityRate(Map<String, Double> mortalityRate) {
		this.mortalityRate = mortalityRate;
	}

	public Map<String, Double> getMaternalMortality() {
		return maternalMortality;
	}

	public void setMaternalMortality(Map<String, Double> maternalMortality) {
		this.maternalMortality = maternalMortality;
	}

	public Map<String, Double> getInfantMortality() {
		return infantMortality;
	}

	public void setInfantMortality(Map<String, Double> infantMortality) {
		this.infantMortality = infantMortality;
	}

	public Map<String, Double> getIncidenceTuberculosis() {
		return incidenceTuberculosis;
	}

	public void setIncidenceTuberculosis(Map<String, Double> incidenceTuberculosis) {
		this.incidenceTuberculosis = incidenceTuberculosis;
	}

	public Map<String, Double> getLifeExpectancyAtBirth() {
		return lifeExpectancyAtBirth;
	}

	public void setLifeExpectancyAtBirth(Map<String, Double> lifeExpectancyAtBirth) {
		this.lifeExpectancyAtBirth = lifeExpectancyAtBirth;
	}

	public Map<String, Double> getChildMortality() {
		return childMortality;
	}

	public void setChildMortality(Map<String, Double> childMortality) {
		this.childMortality = childMortality;
	}

	public Map<String, Double> getTuberculosisMortalityRate() {
		return tuberculosisMortalityRate;
	}

	public void setTuberculosisMortalityRate(Map<String, Double> tuberculosisMortalityRate) {
		this.tuberculosisMortalityRate = tuberculosisMortalityRate;
	}

	public Map<String, Double> getCirculatoryMortality() {
		return circulatoryMortality;
	}

	public void setCirculatoryMortality(Map<String, Double> circulatoryMortality) {
		this.circulatoryMortality = circulatoryMortality;
	}

	public Map<String, Double> getCancerMortality() {
		return cancerMortality;
	}

	public void setCancerMortality(Map<String, Double> cancerMortality) {
		this.cancerMortality = cancerMortality;
	}

	public Map<String, Double> getNaturalPopulationGrowth() {
		return naturalPopulationGrowth;
	}

	public void setNaturalPopulationGrowth(Map<String, Double> naturalPopulationGrowth) {
		this.naturalPopulationGrowth = naturalPopulationGrowth;
	}

	public Map<String, Double> getHeartDiseaseMortality() {
		return heartDiseaseMortality;
	}

	public void setHeartDiseaseMortality(Map<String, Double> heartDiseaseMortality) {
		this.heartDiseaseMortality = heartDiseaseMortality;
	}

	public Map<String, Double> getInjuriesMortality() {
		return injuriesMortality;
	}

	public void setInjuriesMortality(Map<String, Double> injuriesMortality) {
		this.injuriesMortality = injuriesMortality;
	}

	public Map<String, Double> getNumberOfDoctorsFromAllDepartments() {
		return numberOfDoctorsFromAllDepartments;
	}

	public void setNumberOfDoctorsFromAllDepartments(Map<String, Double> numberOfDoctorsFromAllDepartments) {
		this.numberOfDoctorsFromAllDepartments = numberOfDoctorsFromAllDepartments;
	}

	public Map<String, Double> getNumberOfDoctorsFromSystemMZ() {
		return numberOfDoctorsFromSystemMZ;
	}

	public void setNumberOfDoctorsFromSystemMZ(Map<String, Double> numberOfDoctorsFromSystemMZ) {
		this.numberOfDoctorsFromSystemMZ = numberOfDoctorsFromSystemMZ;
	}

	public Map<String, Double> getProvisionOfDoctorsFromAllDepartments() {
		return provisionOfDoctorsFromAllDepartments;
	}

	public void setProvisionOfDoctorsFromAllDepartments(Map<String, Double> provisionOfDoctorsFromAllDepartments) {
		this.provisionOfDoctorsFromAllDepartments = provisionOfDoctorsFromAllDepartments;
	}

	public Map<String, Double> getProvisionOfDoctorsFromSystemMZ() {
		return provisionOfDoctorsFromSystemMZ;
	}

	public void setProvisionOfDoctorsFromSystemMZ(Map<String, Double> provisionOfDoctorsFromSystemMZ) {
		this.provisionOfDoctorsFromSystemMZ = provisionOfDoctorsFromSystemMZ;
	}

	public Map<String, Double> getNumberOfNursesFromAllDepartments() {
		return numberOfNursesFromAllDepartments;
	}

	public void setNumberOfNursesFromAllDepartments(Map<String, Double> numberOfNursesFromAllDepartments) {
		this.numberOfNursesFromAllDepartments = numberOfNursesFromAllDepartments;
	}

	public Map<String, Double> getNumberOfNursesFromSystemMZ() {
		return numberOfNursesFromSystemMZ;
	}

	public void setNumberOfNursesFromSystemMZ(Map<String, Double> numberOfNursesFromSystemMZ) {
		this.numberOfNursesFromSystemMZ = numberOfNursesFromSystemMZ;
	}

	public Map<String, Double> getProvisionOfNursesFromAllDepartments() {
		return provisionOfNursesFromAllDepartments;
	}

	public void setProvisionOfNursesFromAllDepartments(Map<String, Double> provisionOfNursesFromAllDepartments) {
		this.provisionOfNursesFromAllDepartments = provisionOfNursesFromAllDepartments;
	}

	public Map<String, Double> getProvisionOfNursesFromSystemMZ() {
		return provisionOfNursesFromSystemMZ;
	}

	public void setProvisionOfNursesFromSystemMZ(Map<String, Double> provisionOfNursesFromSystemMZ) {
		this.provisionOfNursesFromSystemMZ = provisionOfNursesFromSystemMZ;
	}

	public Map<String, Double> getNumberOfProvidingInpatientCare() {
		return numberOfProvidingInpatientCare;
	}

	public void setNumberOfProvidingInpatientCare(Map<String, Double> numberOfProvidingInpatientCare) {
		this.numberOfProvidingInpatientCare = numberOfProvidingInpatientCare;
	}

	public Map<String, Double> getNumberOfProvidingInpatientCareFromSystemMZ() {
		return numberOfProvidingInpatientCareFromSystemMZ;
	}

	public void setNumberOfProvidingInpatientCareFromSystemMZ(
			Map<String, Double> numberOfProvidingInpatientCareFromSystemMZ) {
		this.numberOfProvidingInpatientCareFromSystemMZ = numberOfProvidingInpatientCareFromSystemMZ;
	}

	public Map<String, Double> getTotalNumberOfHospitalBeds() {
		return totalNumberOfHospitalBeds;
	}

	public void setTotalNumberOfHospitalBeds(Map<String, Double> totalNumberOfHospitalBeds) {
		this.totalNumberOfHospitalBeds = totalNumberOfHospitalBeds;
	}

	public Map<String, Double> getNumberOfHospitalBedsFromSystemMZ() {
		return numberOfHospitalBedsFromSystemMZ;
	}

	public void setNumberOfHospitalBedsFromSystemMZ(Map<String, Double> numberOfHospitalBedsFromSystemMZ) {
		this.numberOfHospitalBedsFromSystemMZ = numberOfHospitalBedsFromSystemMZ;
	}

	public Map<String, Double> getNumberOfSelfSupportingSystemMZ() {
		return numberOfSelfSupportingSystemMZ;
	}

	public void setNumberOfSelfSupportingSystemMZ(Map<String, Double> numberOfSelfSupportingSystemMZ) {
		this.numberOfSelfSupportingSystemMZ = numberOfSelfSupportingSystemMZ;
	}

	public Map<String, Double> getNumberOfPrivateOrganizations() {
		return numberOfPrivateOrganizations;
	}

	public void setNumberOfPrivateOrganizations(Map<String, Double> numberOfPrivateOrganizations) {
		this.numberOfPrivateOrganizations = numberOfPrivateOrganizations;
	}

	public Map<String, Double> getProvisionOfHospitalBeds() {
		return provisionOfHospitalBeds;
	}

	public void setProvisionOfHospitalBeds(Map<String, Double> provisionOfHospitalBeds) {
		this.provisionOfHospitalBeds = provisionOfHospitalBeds;
	}

	public Map<String, Double> getProvisionOfHospitalBedsSystemMZ() {
		return provisionOfHospitalBedsSystemMZ;
	}

	public void setProvisionOfHospitalBedsSystemMZ(Map<String, Double> provisionOfHospitalBedsSystemMZ) {
		this.provisionOfHospitalBedsSystemMZ = provisionOfHospitalBedsSystemMZ;
	}

	public Map<String, Double> getNumberOfResidentsSystemMZ() {
		return numberOfResidentsSystemMZ;
	}

	public void setNumberOfResidentsSystemMZ(Map<String, Double> numberOfResidentsSystemMZ) {
		this.numberOfResidentsSystemMZ = numberOfResidentsSystemMZ;
	}

	public Map<String, Double> getNumberOfResidentsState() {
		return numberOfResidentsState;
	}

	public void setNumberOfResidentsState(Map<String, Double> numberOfResidentsState) {
		this.numberOfResidentsState = numberOfResidentsState;
	}

	public Map<String, Double> getNumberOfResidentsPrivate() {
		return numberOfResidentsPrivate;
	}

	public void setNumberOfResidentsPrivate(Map<String, Double> numberOfResidentsPrivate) {
		this.numberOfResidentsPrivate = numberOfResidentsPrivate;
	}

	public Map<String, Double> getNumberOfOrganizationsWithDayHospitalBeds() {
		return numberOfOrganizationsWithDayHospitalBeds;
	}

	public void setNumberOfOrganizationsWithDayHospitalBeds(Map<String, Double> numberOfOrganizationsWithDayHospitalBeds) {
		this.numberOfOrganizationsWithDayHospitalBeds = numberOfOrganizationsWithDayHospitalBeds;
	}

	public Map<String, Double> getTotalNumberOfDayBedsInHospitalOrganizations() {
		return totalNumberOfDayBedsInHospitalOrganizations;
	}

	public void setTotalNumberOfDayBedsInHospitalOrganizations(
			Map<String, Double> totalNumberOfDayBedsInHospitalOrganizations) {
		this.totalNumberOfDayBedsInHospitalOrganizations = totalNumberOfDayBedsInHospitalOrganizations;
	}

	public Map<String, Double> getNumberOfOrganizationsWithPatientPolyclinicHelp() {
		return numberOfOrganizationsWithPatientPolyclinicHelp;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelp(
			Map<String, Double> numberOfOrganizationsWithPatientPolyclinicHelp) {
		this.numberOfOrganizationsWithPatientPolyclinicHelp = numberOfOrganizationsWithPatientPolyclinicHelp;
	}

	public Map<String, Double> getNumberOfOrganizationsWithPatientPolyclinicHelpSystemMZ() {
		return numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpSystemMZ(
			Map<String, Double> numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ = numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ;
	}

	public Map<String, Double> getNumberOfOrganizationsWithPatientPolyclinicHelpOthers() {
		return numberOfOrganizationsWithPatientPolyclinicHelpOthers;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpOthers(
			Map<String, Double> numberOfOrganizationsWithPatientPolyclinicHelpOthers) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpOthers = numberOfOrganizationsWithPatientPolyclinicHelpOthers;
	}

	public Map<String, Double> getNumberOfOrganizationsWithPatientPolyclinicHelpPrivate() {
		return numberOfOrganizationsWithPatientPolyclinicHelpPrivate;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpPrivate(
			Map<String, Double> numberOfOrganizationsWithPatientPolyclinicHelpPrivate) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpPrivate = numberOfOrganizationsWithPatientPolyclinicHelpPrivate;
	}

	public Map<String, Double> getNumberOfVisitDoctorsFor1000() {
		return numberOfVisitDoctorsFor1000;
	}

	public void setNumberOfVisitDoctorsFor1000(Map<String, Double> numberOfVisitDoctorsFor1000) {
		this.numberOfVisitDoctorsFor1000 = numberOfVisitDoctorsFor1000;
	}

	public Map<String, Double> getNumberOfVisitDoctorsFor1() {
		return numberOfVisitDoctorsFor1;
	}

	public void setNumberOfVisitDoctorsFor1(Map<String, Double> numberOfVisitDoctorsFor1) {
		this.numberOfVisitDoctorsFor1 = numberOfVisitDoctorsFor1;
	}

	public Map<String, Double> getNumberOfPolyclinicsWithDayHospitalBeds() {
		return numberOfPolyclinicsWithDayHospitalBeds;
	}

	public void setNumberOfPolyclinicsWithDayHospitalBeds(Map<String, Double> numberOfPolyclinicsWithDayHospitalBeds) {
		this.numberOfPolyclinicsWithDayHospitalBeds = numberOfPolyclinicsWithDayHospitalBeds;
	}

	public Map<String, Double> getTotalNumberDayPoliclinicBeds() {
		return totalNumberDayPoliclinicBeds;
	}

	public void setTotalNumberDayPoliclinicBeds(Map<String, Double> totalNumberDayPoliclinicBeds) {
		this.totalNumberDayPoliclinicBeds = totalNumberDayPoliclinicBeds;
	}

	public Map<String, Double> getTotalMorbidityOfPopulation() {
		return totalMorbidityOfPopulation;
	}

	public void setTotalMorbidityOfPopulation(Map<String, Double> totalMorbidityOfPopulation) {
		this.totalMorbidityOfPopulation = totalMorbidityOfPopulation;
	}

	public Map<String, Double> getIncidenceOfCancer() {
		return incidenceOfCancer;
	}

	public void setIncidenceOfCancer(Map<String, Double> incidenceOfCancer) {
		this.incidenceOfCancer = incidenceOfCancer;
	}

	public Map<String, Double> getMorbidityFromMentalDisorders() {
		return morbidityFromMentalDisorders;
	}

	public void setMorbidityFromMentalDisorders(Map<String, Double> morbidityFromMentalDisorders) {
		this.morbidityFromMentalDisorders = morbidityFromMentalDisorders;
	}

	public Map<String, Double> getMorbidityFromMentalDisordersWithSubstanceUse() {
		return morbidityFromMentalDisordersWithSubstanceUse;
	}

	public void setMorbidityFromMentalDisordersWithSubstanceUse(
			Map<String, Double> morbidityFromMentalDisordersWithSubstanceUse) {
		this.morbidityFromMentalDisordersWithSubstanceUse = morbidityFromMentalDisordersWithSubstanceUse;
	}

	public Map<String, Double> getMorbidityFromInjuries() {
		return morbidityFromInjuries;
	}

	public void setMorbidityFromInjuries(Map<String, Double> morbidityFromInjuries) {
		this.morbidityFromInjuries = morbidityFromInjuries;
	}

	public Map<String, Double> getMorbidityFromBloodCirculation() {
		return morbidityFromBloodCirculation;
	}

	public void setMorbidityFromBloodCirculation(Map<String, Double> morbidityFromBloodCirculation) {
		this.morbidityFromBloodCirculation = morbidityFromBloodCirculation;
	}

	public Map<String, Double> getMorbidityFromArterialHypertension() {
		return morbidityFromArterialHypertension;
	}

	public void setMorbidityFromArterialHypertension(Map<String, Double> morbidityFromArterialHypertension) {
		this.morbidityFromArterialHypertension = morbidityFromArterialHypertension;
	}

	public Map<String, Double> getMorbidityFromCoronaryHeartDisease() {
		return morbidityFromCoronaryHeartDisease;
	}

	public void setMorbidityFromCoronaryHeartDisease(Map<String, Double> morbidityFromCoronaryHeartDisease) {
		this.morbidityFromCoronaryHeartDisease = morbidityFromCoronaryHeartDisease;
	}

	public Map<String, Double> getMorbidityFromAcuteMyocardialInfarction() {
		return morbidityFromAcuteMyocardialInfarction;
	}

	public void setMorbidityFromAcuteMyocardialInfarction(Map<String, Double> morbidityFromAcuteMyocardialInfarction) {
		this.morbidityFromAcuteMyocardialInfarction = morbidityFromAcuteMyocardialInfarction;
	}

	public Map<String, Double> getNumberOfIndependentStations() {
		return numberOfIndependentStations;
	}

	public void setNumberOfIndependentStations(Map<String, Double> numberOfIndependentStations) {
		this.numberOfIndependentStations = numberOfIndependentStations;
	}

	public Map<String, Double> getNumberOfEmergencyDepartments() {
		return numberOfEmergencyDepartments;
	}

	public void setNumberOfEmergencyDepartments(Map<String, Double> numberOfEmergencyDepartments) {
		this.numberOfEmergencyDepartments = numberOfEmergencyDepartments;
	}

	public Map<String, Double> getNumberOfEmergencyBrigades() {
		return numberOfEmergencyBrigades;
	}

	public void setNumberOfEmergencyBrigades(Map<String, Double> numberOfEmergencyBrigades) {
		this.numberOfEmergencyBrigades = numberOfEmergencyBrigades;
	}

	public Map<String, Double> getMedical() {
		return medical;
	}

	public void setMedical(Map<String, Double> medical) {
		this.medical = medical;
	}

	public Map<String, Double> getPediatric() {
		return pediatric;
	}

	public void setPediatric(Map<String, Double> pediatric) {
		this.pediatric = pediatric;
	}

	public Map<String, Double> getParamedics() {
		return paramedics;
	}

	public void setParamedics(Map<String, Double> paramedics) {
		this.paramedics = paramedics;
	}

	public Map<String, Double> getNumberOfcompletedEmergencyVisits() {
		return numberOfcompletedEmergencyVisits;
	}

	public void setNumberOfcompletedEmergencyVisits(Map<String, Double> numberOfcompletedEmergencyVisits) {
		this.numberOfcompletedEmergencyVisits = numberOfcompletedEmergencyVisits;
	}

	public Map<String, Double> getNumberOfServedPersonsByEmergencyDepartments() {
		return numberOfServedPersonsByEmergencyDepartments;
	}

	public void setNumberOfServedPersonsByEmergencyDepartments(
			Map<String, Double> numberOfServedPersonsByEmergencyDepartments) {
		this.numberOfServedPersonsByEmergencyDepartments = numberOfServedPersonsByEmergencyDepartments;
	}
	
}
