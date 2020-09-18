package com.example.demo.domain;

public class HealthcareMonitoring3 {

	private String year;
	
	private Double mortalityRate; // o_mortality_rate | Уровень смертности
	private Double maternalMortality; // o_maternal_mortality | Материнская смертность
	private Double infantMortality; // o_infant_mortality | Младенческая смертность
	private Double incidenceTuberculosis; // o_incidence_tuberculosis | Заболеваемость туберкулезом
	private Double lifeExpectancyAtBirth; // o_life_expectancy_atbirth | Ожидаемая продолжительность жизни при рождении
	private Double childMortality; // o_child_mortality | Детская смертность
	private Double tuberculosisMortalityRate; // o_mortality_rate_tuberculosis | Уровень сиортности от туберкулеза
	private Double circulatoryMortality; // o_mortality_from_circulatory | Заболеваемость от болезенй системы кровообращения
	private Double cancerMortality; // o_mortality_from_cancer | Уровень смортности от онкологических заболеваний
	private Double naturalPopulationGrowth; // o_natural_population_growth | Естественный прирост населения
	private Double heartDiseaseMortality; // o_mortality_heart_disease | Ишемическая болезнь сердца
	private Double injuriesMortality; // o_mortality_from_injuries | Смертность от травм, отравлений и других внешних причин
	private Double numberOfDoctorsFromAllDepartments; // o_number_doctors_alldepartments | Численность врачей (все ведомства)
	private Double numberOfDoctorsFromSystemMZ; // o_number_doctors_system_mz | Численность врачей (все ведомства): системв МЗ
	private Double provisionOfDoctorsFromAllDepartments; // o_provision_doctors_alldepartments | Обеспеченность начеления врачами все ведомства
	private Double provisionOfDoctorsFromSystemMZ; // o_provision_doctors_systemmz | Обеспеченность начеления врачами все ведомства: системв МЗ
	private Double numberOfNursesFromAllDepartments; // o_number_nurses_alldepartments | Численность среднего медперсонала (все ведомства)
	private Double numberOfNursesFromSystemMZ; // o_number_nurses_systemmz | Численность среднего медперсонала: системв МЗ
	private Double provisionOfNursesFromAllDepartments; // o_provision_average_medicalstaff | Обеспеченность начеления средним медперсоналом (все ведомства)
	private Double provisionOfNursesFromSystemMZ; // o_provision_average_medicall_systemmz | Обеспеченность начеления средним медперсоналом: системв МЗ
	private Double numberOfProvidingInpatientCare; // o_number_providing_inpatient_care | Количество организаций оказывающие стационарную помощь
	private Double numberOfProvidingInpatientCareFromSystemMZ; // o_number_providing_inpatient_care_systemmz |  Количество организаций оказывающие стационарную помощь: системв МЗ
	private Double totalNumberOfHospitalBeds; // o_number_of_hospital_beds | Общее количество больничных коек
	private Double numberOfHospitalBedsFromSystemMZ; // o_sistema_mz | Общее количество больничных коек (система МЗ)
	private Double numberOfSelfSupportingSystemMZ; // o_self_supporting_systemmz |  Количество самостоятельных станций скорой медицинской помощи: системв МЗ
	private Double numberOfPrivateOrganizations; // o_private_organization | частные организации
	
	private Double provisionOfHospitalBeds; // o_provision_hospital_beds | Обеспеченность населения больничными койками
	private Double provisionOfHospitalBedsSystemMZ; // o_provision_hospital_beds_systemmz | Обеспеченность населения больничными койками (Система МЗ)
	private Double numberOfResidentsSystemMZ; // o_number_residents_aho | Количество поступивших жителей в больничные организации (система МЗ)
	private Double numberOfResidentsState; // o_resident_state | Количество поступивших жителей в больничные организации (в государственные)
	private Double numberOfResidentsPrivate; // o_resident_private | Количество поступивших жителей в больничные организации (в частные)
	private Double numberOfOrganizationsWithDayHospitalBeds; // o_number_dhb_mon_system | Количество организаций, имеющих койки дневного стационара
	private Double totalNumberOfDayBedsInHospitalOrganizations; // o_total_number_bds_tna | Общее количество коек двевного пребывания в больничных организациях (система МЗ)
	private Double numberOfOrganizationsWithPatientPolyclinicHelp; // o_number_organizations_patient_polyclinic_help | Количество организаций, оказывающих амбулаторно-поликлиническую помощь (все ведомства)
	private Double numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ; // o_number_organizations_pph_systemmz | Количество организаций, оказывающих амбулаторно-поликлиническую помощь (система МЗ)
	private Double numberOfOrganizationsWithPatientPolyclinicHelpOthers; // o_number_organizations_pph_other | Количество организаций, оказывающих амбулаторно-поликлиническую помощь (Другие ведомства)
	private Double numberOfOrganizationsWithPatientPolyclinicHelpPrivate; // o_number_organizations_pph_private | Количество организаций, оказывающих амбулаторно-поликлиническую помощь (частные организации)
	private Double numberOfVisitDoctorsFor1000; // o_number_visit_doctors | Количество обращений к врачам  АПО (система МЗ), на 1000 населения
	private Double numberOfVisitDoctorsFor1; // o_number_visit_doctors_a | Количество обращений к врачам  АПО (система МЗ), на 1 жителя
	private Double numberOfPolyclinicsWithDayHospitalBeds; // o_number_oo_hbdh | Количество амбулаторно-поликлинических организаций, имеющие койки дневного стационара
	private Double totalNumberDayPoliclinicBeds; // o_total_number_beds | Общее количество коек дневного пребывания АПО
	private Double totalMorbidityOfPopulation; // o_total_morbidity_population | Общая заболеваемость населения
	private Double incidenceOfCancer; // o_incidence_of_cancer | Заболеваемость от онкологических заболеваний
	private Double morbidityFromMentalDisorders; // o_morbidity_mbd | Заболеваемость от психическиъ расстройств и расстройств поведения
	private Double morbidityFromMentalDisordersWithSubstanceUse; // o_morbidity_mbdsu | Заболеваемость от психическиъ расстройств и расстройств поведения с употреблением психоактивных веществ
	private Double morbidityFromInjuries; // o_morbidity_from_injuries | Заболеваемость от травм, отравлений м других внешних причин
	private Double morbidityFromBloodCirculation; // o_morbidity_blood_circulation | Заболеваемость от болезней системы кровообращения
	private Double morbidityFromArterialHypertension; // o_morbidity_arterial_hypertension | Артериальная гипертензия
	private Double morbidityFromCoronaryHeartDisease; // o_morbidity_coronary_heart_disease | Заболеваемость от болезней системы кровообращения (Ишемическая болезнь сердца)
	private Double morbidityFromAcuteMyocardialInfarction; // o_morbidity_acute_myocardial_infarction | Острый инфоркт миокарда
	private Double numberOfIndependentStations; // o_number_independent_stations | Количество самостоятельных станций
	private Double numberOfEmergencyDepartments; // o_number_units | Количество отделении СМП
	private Double numberOfEmergencyBrigades; // o_number_teams | Количество бригад СМП
	private Double medical; // o_medical | врачебные
	private Double pediatric; // o_pediatric | педиатрические
	private Double paramedics; // o_medical_assistant | фельдшерские
	private Double numberOfcompletedEmergencyVisits; // o_number_completed_visits | Количество выполненных выездов бригад СМП
	private Double numberOfServedPersonsByEmergencyDepartments; // o_number_persons_served | Количество обслуженных лиц, при выездах бригадами СМП
	
	private Double fertility; // o_fertility | Рождаемость
	private Double prevalenceOfInfection; // o_prevalence_infection | Распространенность ВИЧ-инфекции
	private Double numberOfDoctorsInPrivateOrganizations; // o_number_doctors_private_organizations | Количество врачей (в частных организациях)
	private Double medicalStaffing; // o_staffing_medical_personnel | Укомплектованность врачебными кадрами
	private Double numberOfMedicalStaffPositions; // o_number_medical_staff_positions | количество врачебных штатных должностей
	private Double numberMedicalPositionsHeld; // o_number_medical_positions_held | количество врачебных занятых должностей
	private Double numberOfNursesInPrivateOrganizations; // o_number_nurses_private_organizations| Численность среднего медперсонала (в частных организациях)
	private Double numberOfProvidingInpatientCareOthers; // o_number_providing_inpatient_care_other| Количество организаций, оказывающих стационарную помощь (другие ведомства)
	private Double numberOfPatientsInTheD; // o_non_consideration_d | Количество больных, состоящих в "Д" учете на конец года
	private Double numberOfPatientsFrom0TO14; // o_number_patients_14years | количество больных 0-14 лет
	private Double numberOfPatientsFrom15To17; // o_number_patients_1517years | количество больных 15-17 лет
	private Double numberOfPatientsAfter18; // o_number_patients_18years| количество больных с 18 лет
	private Double totalNumberOfPharmacies; // o_total_number_pharmacies | Общее количество аптек
	private Double numberOfStatePharmacies; // o_state_pharmacies | государственные аптеки
	private Double numberOfPrivatePharmacies; // o_private_pharmacies | Частные аптеки
	
	public HealthcareMonitoring3() {
		
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Double getMortalityRate() {
		return mortalityRate;
	}

	public void setMortalityRate(Double mortalityRate) {
		this.mortalityRate = mortalityRate;
	}

	public Double getMaternalMortality() {
		return maternalMortality;
	}

	public void setMaternalMortality(Double maternalMortality) {
		this.maternalMortality = maternalMortality;
	}

	public Double getInfantMortality() {
		return infantMortality;
	}

	public void setInfantMortality(Double infantMortality) {
		this.infantMortality = infantMortality;
	}

	public Double getIncidenceTuberculosis() {
		return incidenceTuberculosis;
	}

	public void setIncidenceTuberculosis(Double incidenceTuberculosis) {
		this.incidenceTuberculosis = incidenceTuberculosis;
	}

	public Double getLifeExpectancyAtBirth() {
		return lifeExpectancyAtBirth;
	}

	public void setLifeExpectancyAtBirth(Double lifeExpectancyAtBirth) {
		this.lifeExpectancyAtBirth = lifeExpectancyAtBirth;
	}

	public Double getChildMortality() {
		return childMortality;
	}

	public void setChildMortality(Double childMortality) {
		this.childMortality = childMortality;
	}

	public Double getTuberculosisMortalityRate() {
		return tuberculosisMortalityRate;
	}

	public void setTuberculosisMortalityRate(Double tuberculosisMortalityRate) {
		this.tuberculosisMortalityRate = tuberculosisMortalityRate;
	}

	public Double getCirculatoryMortality() {
		return circulatoryMortality;
	}

	public void setCirculatoryMortality(Double circulatoryMortality) {
		this.circulatoryMortality = circulatoryMortality;
	}

	public Double getCancerMortality() {
		return cancerMortality;
	}

	public void setCancerMortality(Double cancerMortality) {
		this.cancerMortality = cancerMortality;
	}

	public Double getNaturalPopulationGrowth() {
		return naturalPopulationGrowth;
	}

	public void setNaturalPopulationGrowth(Double naturalPopulationGrowth) {
		this.naturalPopulationGrowth = naturalPopulationGrowth;
	}

	public Double getHeartDiseaseMortality() {
		return heartDiseaseMortality;
	}

	public void setHeartDiseaseMortality(Double heartDiseaseMortality) {
		this.heartDiseaseMortality = heartDiseaseMortality;
	}

	public Double getInjuriesMortality() {
		return injuriesMortality;
	}

	public void setInjuriesMortality(Double injuriesMortality) {
		this.injuriesMortality = injuriesMortality;
	}

	public Double getNumberOfDoctorsFromAllDepartments() {
		return numberOfDoctorsFromAllDepartments;
	}

	public void setNumberOfDoctorsFromAllDepartments(Double numberOfDoctorsFromAllDepartments) {
		this.numberOfDoctorsFromAllDepartments = numberOfDoctorsFromAllDepartments;
	}

	public Double getNumberOfDoctorsFromSystemMZ() {
		return numberOfDoctorsFromSystemMZ;
	}

	public void setNumberOfDoctorsFromSystemMZ(Double numberOfDoctorsFromSystemMZ) {
		this.numberOfDoctorsFromSystemMZ = numberOfDoctorsFromSystemMZ;
	}

	public Double getProvisionOfDoctorsFromAllDepartments() {
		return provisionOfDoctorsFromAllDepartments;
	}

	public void setProvisionOfDoctorsFromAllDepartments(Double provisionOfDoctorsFromAllDepartments) {
		this.provisionOfDoctorsFromAllDepartments = provisionOfDoctorsFromAllDepartments;
	}

	public Double getProvisionOfDoctorsFromSystemMZ() {
		return provisionOfDoctorsFromSystemMZ;
	}

	public void setProvisionOfDoctorsFromSystemMZ(Double provisionOfDoctorsFromSystemMZ) {
		this.provisionOfDoctorsFromSystemMZ = provisionOfDoctorsFromSystemMZ;
	}

	public Double getNumberOfNursesFromAllDepartments() {
		return numberOfNursesFromAllDepartments;
	}

	public void setNumberOfNursesFromAllDepartments(Double numberOfNursesFromAllDepartments) {
		this.numberOfNursesFromAllDepartments = numberOfNursesFromAllDepartments;
	}

	public Double getNumberOfNursesFromSystemMZ() {
		return numberOfNursesFromSystemMZ;
	}

	public void setNumberOfNursesFromSystemMZ(Double numberOfNursesFromSystemMZ) {
		this.numberOfNursesFromSystemMZ = numberOfNursesFromSystemMZ;
	}

	public Double getProvisionOfNursesFromAllDepartments() {
		return provisionOfNursesFromAllDepartments;
	}

	public void setProvisionOfNursesFromAllDepartments(Double provisionOfNursesFromAllDepartments) {
		this.provisionOfNursesFromAllDepartments = provisionOfNursesFromAllDepartments;
	}

	public Double getProvisionOfNursesFromSystemMZ() {
		return provisionOfNursesFromSystemMZ;
	}

	public void setProvisionOfNursesFromSystemMZ(Double provisionOfNursesFromSystemMZ) {
		this.provisionOfNursesFromSystemMZ = provisionOfNursesFromSystemMZ;
	}

	public Double getNumberOfProvidingInpatientCare() {
		return numberOfProvidingInpatientCare;
	}

	public void setNumberOfProvidingInpatientCare(Double numberOfProvidingInpatientCare) {
		this.numberOfProvidingInpatientCare = numberOfProvidingInpatientCare;
	}

	public Double getNumberOfProvidingInpatientCareFromSystemMZ() {
		return numberOfProvidingInpatientCareFromSystemMZ;
	}

	public void setNumberOfProvidingInpatientCareFromSystemMZ(Double numberOfProvidingInpatientCareFromSystemMZ) {
		this.numberOfProvidingInpatientCareFromSystemMZ = numberOfProvidingInpatientCareFromSystemMZ;
	}

	public Double getTotalNumberOfHospitalBeds() {
		return totalNumberOfHospitalBeds;
	}

	public void setTotalNumberOfHospitalBeds(Double totalNumberOfHospitalBeds) {
		this.totalNumberOfHospitalBeds = totalNumberOfHospitalBeds;
	}

	public Double getNumberOfHospitalBedsFromSystemMZ() {
		return numberOfHospitalBedsFromSystemMZ;
	}

	public void setNumberOfHospitalBedsFromSystemMZ(Double numberOfHospitalBedsFromSystemMZ) {
		this.numberOfHospitalBedsFromSystemMZ = numberOfHospitalBedsFromSystemMZ;
	}

	public Double getNumberOfSelfSupportingSystemMZ() {
		return numberOfSelfSupportingSystemMZ;
	}

	public void setNumberOfSelfSupportingSystemMZ(Double numberOfSelfSupportingSystemMZ) {
		this.numberOfSelfSupportingSystemMZ = numberOfSelfSupportingSystemMZ;
	}

	public Double getNumberOfPrivateOrganizations() {
		return numberOfPrivateOrganizations;
	}

	public void setNumberOfPrivateOrganizations(Double numberOfPrivateOrganizations) {
		this.numberOfPrivateOrganizations = numberOfPrivateOrganizations;
	}

	public Double getProvisionOfHospitalBeds() {
		return provisionOfHospitalBeds;
	}

	public void setProvisionOfHospitalBeds(Double provisionOfHospitalBeds) {
		this.provisionOfHospitalBeds = provisionOfHospitalBeds;
	}

	public Double getProvisionOfHospitalBedsSystemMZ() {
		return provisionOfHospitalBedsSystemMZ;
	}

	public void setProvisionOfHospitalBedsSystemMZ(Double provisionOfHospitalBedsSystemMZ) {
		this.provisionOfHospitalBedsSystemMZ = provisionOfHospitalBedsSystemMZ;
	}

	public Double getNumberOfResidentsSystemMZ() {
		return numberOfResidentsSystemMZ;
	}

	public void setNumberOfResidentsSystemMZ(Double numberOfResidentsSystemMZ) {
		this.numberOfResidentsSystemMZ = numberOfResidentsSystemMZ;
	}

	public Double getNumberOfResidentsState() {
		return numberOfResidentsState;
	}

	public void setNumberOfResidentsState(Double numberOfResidentsState) {
		this.numberOfResidentsState = numberOfResidentsState;
	}

	public Double getNumberOfResidentsPrivate() {
		return numberOfResidentsPrivate;
	}

	public void setNumberOfResidentsPrivate(Double numberOfResidentsPrivate) {
		this.numberOfResidentsPrivate = numberOfResidentsPrivate;
	}

	public Double getNumberOfOrganizationsWithDayHospitalBeds() {
		return numberOfOrganizationsWithDayHospitalBeds;
	}

	public void setNumberOfOrganizationsWithDayHospitalBeds(Double numberOfOrganizationsWithDayHospitalBeds) {
		this.numberOfOrganizationsWithDayHospitalBeds = numberOfOrganizationsWithDayHospitalBeds;
	}

	public Double getTotalNumberOfDayBedsInHospitalOrganizations() {
		return totalNumberOfDayBedsInHospitalOrganizations;
	}

	public void setTotalNumberOfDayBedsInHospitalOrganizations(Double totalNumberOfDayBedsInHospitalOrganizations) {
		this.totalNumberOfDayBedsInHospitalOrganizations = totalNumberOfDayBedsInHospitalOrganizations;
	}

	public Double getNumberOfOrganizationsWithPatientPolyclinicHelp() {
		return numberOfOrganizationsWithPatientPolyclinicHelp;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelp(Double numberOfOrganizationsWithPatientPolyclinicHelp) {
		this.numberOfOrganizationsWithPatientPolyclinicHelp = numberOfOrganizationsWithPatientPolyclinicHelp;
	}

	public Double getNumberOfOrganizationsWithPatientPolyclinicHelpSystemMZ() {
		return numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpSystemMZ(
			Double numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ = numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ;
	}

	public Double getNumberOfOrganizationsWithPatientPolyclinicHelpOthers() {
		return numberOfOrganizationsWithPatientPolyclinicHelpOthers;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpOthers(
			Double numberOfOrganizationsWithPatientPolyclinicHelpOthers) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpOthers = numberOfOrganizationsWithPatientPolyclinicHelpOthers;
	}

	public Double getNumberOfOrganizationsWithPatientPolyclinicHelpPrivate() {
		return numberOfOrganizationsWithPatientPolyclinicHelpPrivate;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpPrivate(
			Double numberOfOrganizationsWithPatientPolyclinicHelpPrivate) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpPrivate = numberOfOrganizationsWithPatientPolyclinicHelpPrivate;
	}

	public Double getNumberOfVisitDoctorsFor1000() {
		return numberOfVisitDoctorsFor1000;
	}

	public void setNumberOfVisitDoctorsFor1000(Double numberOfVisitDoctorsFor1000) {
		this.numberOfVisitDoctorsFor1000 = numberOfVisitDoctorsFor1000;
	}

	public Double getNumberOfVisitDoctorsFor1() {
		return numberOfVisitDoctorsFor1;
	}

	public void setNumberOfVisitDoctorsFor1(Double numberOfVisitDoctorsFor1) {
		this.numberOfVisitDoctorsFor1 = numberOfVisitDoctorsFor1;
	}

	public Double getNumberOfPolyclinicsWithDayHospitalBeds() {
		return numberOfPolyclinicsWithDayHospitalBeds;
	}

	public void setNumberOfPolyclinicsWithDayHospitalBeds(Double numberOfPolyclinicsWithDayHospitalBeds) {
		this.numberOfPolyclinicsWithDayHospitalBeds = numberOfPolyclinicsWithDayHospitalBeds;
	}

	public Double getTotalNumberDayPoliclinicBeds() {
		return totalNumberDayPoliclinicBeds;
	}

	public void setTotalNumberDayPoliclinicBeds(Double totalNumberDayPoliclinicBeds) {
		this.totalNumberDayPoliclinicBeds = totalNumberDayPoliclinicBeds;
	}

	public Double getTotalMorbidityOfPopulation() {
		return totalMorbidityOfPopulation;
	}

	public void setTotalMorbidityOfPopulation(Double totalMorbidityOfPopulation) {
		this.totalMorbidityOfPopulation = totalMorbidityOfPopulation;
	}

	public Double getIncidenceOfCancer() {
		return incidenceOfCancer;
	}

	public void setIncidenceOfCancer(Double incidenceOfCancer) {
		this.incidenceOfCancer = incidenceOfCancer;
	}

	public Double getMorbidityFromMentalDisorders() {
		return morbidityFromMentalDisorders;
	}

	public void setMorbidityFromMentalDisorders(Double morbidityFromMentalDisorders) {
		this.morbidityFromMentalDisorders = morbidityFromMentalDisorders;
	}

	public Double getMorbidityFromMentalDisordersWithSubstanceUse() {
		return morbidityFromMentalDisordersWithSubstanceUse;
	}

	public void setMorbidityFromMentalDisordersWithSubstanceUse(Double morbidityFromMentalDisordersWithSubstanceUse) {
		this.morbidityFromMentalDisordersWithSubstanceUse = morbidityFromMentalDisordersWithSubstanceUse;
	}

	public Double getMorbidityFromInjuries() {
		return morbidityFromInjuries;
	}

	public void setMorbidityFromInjuries(Double morbidityFromInjuries) {
		this.morbidityFromInjuries = morbidityFromInjuries;
	}

	public Double getMorbidityFromBloodCirculation() {
		return morbidityFromBloodCirculation;
	}

	public void setMorbidityFromBloodCirculation(Double morbidityFromBloodCirculation) {
		this.morbidityFromBloodCirculation = morbidityFromBloodCirculation;
	}

	public Double getMorbidityFromArterialHypertension() {
		return morbidityFromArterialHypertension;
	}

	public void setMorbidityFromArterialHypertension(Double morbidityFromArterialHypertension) {
		this.morbidityFromArterialHypertension = morbidityFromArterialHypertension;
	}

	public Double getMorbidityFromCoronaryHeartDisease() {
		return morbidityFromCoronaryHeartDisease;
	}

	public void setMorbidityFromCoronaryHeartDisease(Double morbidityFromCoronaryHeartDisease) {
		this.morbidityFromCoronaryHeartDisease = morbidityFromCoronaryHeartDisease;
	}

	public Double getMorbidityFromAcuteMyocardialInfarction() {
		return morbidityFromAcuteMyocardialInfarction;
	}

	public void setMorbidityFromAcuteMyocardialInfarction(Double morbidityFromAcuteMyocardialInfarction) {
		this.morbidityFromAcuteMyocardialInfarction = morbidityFromAcuteMyocardialInfarction;
	}

	public Double getNumberOfIndependentStations() {
		return numberOfIndependentStations;
	}

	public void setNumberOfIndependentStations(Double numberOfIndependentStations) {
		this.numberOfIndependentStations = numberOfIndependentStations;
	}

	public Double getNumberOfEmergencyDepartments() {
		return numberOfEmergencyDepartments;
	}

	public void setNumberOfEmergencyDepartments(Double numberOfEmergencyDepartments) {
		this.numberOfEmergencyDepartments = numberOfEmergencyDepartments;
	}

	public Double getNumberOfEmergencyBrigades() {
		return numberOfEmergencyBrigades;
	}

	public void setNumberOfEmergencyBrigades(Double numberOfEmergencyBrigades) {
		this.numberOfEmergencyBrigades = numberOfEmergencyBrigades;
	}

	public Double getMedical() {
		return medical;
	}

	public void setMedical(Double medical) {
		this.medical = medical;
	}

	public Double getPediatric() {
		return pediatric;
	}

	public void setPediatric(Double pediatric) {
		this.pediatric = pediatric;
	}

	public Double getParamedics() {
		return paramedics;
	}

	public void setParamedics(Double paramedics) {
		this.paramedics = paramedics;
	}

	public Double getNumberOfcompletedEmergencyVisits() {
		return numberOfcompletedEmergencyVisits;
	}

	public void setNumberOfcompletedEmergencyVisits(Double numberOfcompletedEmergencyVisits) {
		this.numberOfcompletedEmergencyVisits = numberOfcompletedEmergencyVisits;
	}

	public Double getNumberOfServedPersonsByEmergencyDepartments() {
		return numberOfServedPersonsByEmergencyDepartments;
	}

	public void setNumberOfServedPersonsByEmergencyDepartments(Double numberOfServedPersonsByEmergencyDepartments) {
		this.numberOfServedPersonsByEmergencyDepartments = numberOfServedPersonsByEmergencyDepartments;
	}

	public Double getFertility() {
		return fertility;
	}

	public void setFertility(Double fertility) {
		this.fertility = fertility;
	}

	public Double getPrevalenceOfInfection() {
		return prevalenceOfInfection;
	}

	public void setPrevalenceOfInfection(Double prevalenceOfInfection) {
		this.prevalenceOfInfection = prevalenceOfInfection;
	}

	public Double getNumberOfDoctorsInPrivateOrganizations() {
		return numberOfDoctorsInPrivateOrganizations;
	}

	public void setNumberOfDoctorsInPrivateOrganizations(Double numberOfDoctorsInPrivateOrganizations) {
		this.numberOfDoctorsInPrivateOrganizations = numberOfDoctorsInPrivateOrganizations;
	}

	public Double getMedicalStaffing() {
		return medicalStaffing;
	}

	public void setMedicalStaffing(Double medicalStaffing) {
		this.medicalStaffing = medicalStaffing;
	}

	public Double getNumberOfMedicalStaffPositions() {
		return numberOfMedicalStaffPositions;
	}

	public void setNumberOfMedicalStaffPositions(Double numberOfMedicalStaffPositions) {
		this.numberOfMedicalStaffPositions = numberOfMedicalStaffPositions;
	}

	public Double getNumberMedicalPositionsHeld() {
		return numberMedicalPositionsHeld;
	}

	public void setNumberMedicalPositionsHeld(Double numberMedicalPositionsHeld) {
		this.numberMedicalPositionsHeld = numberMedicalPositionsHeld;
	}

	public Double getNumberOfNursesInPrivateOrganizations() {
		return numberOfNursesInPrivateOrganizations;
	}

	public void setNumberOfNursesInPrivateOrganizations(Double numberOfNursesInPrivateOrganizations) {
		this.numberOfNursesInPrivateOrganizations = numberOfNursesInPrivateOrganizations;
	}

	public Double getNumberOfProvidingInpatientCareOthers() {
		return numberOfProvidingInpatientCareOthers;
	}

	public void setNumberOfProvidingInpatientCareOthers(Double numberOfProvidingInpatientCareOthers) {
		this.numberOfProvidingInpatientCareOthers = numberOfProvidingInpatientCareOthers;
	}

	public Double getNumberOfPatientsInTheD() {
		return numberOfPatientsInTheD;
	}

	public void setNumberOfPatientsInTheD(Double numberOfPatientsInTheD) {
		this.numberOfPatientsInTheD = numberOfPatientsInTheD;
	}

	public Double getNumberOfPatientsFrom0TO14() {
		return numberOfPatientsFrom0TO14;
	}

	public void setNumberOfPatientsFrom0TO14(Double numberOfPatientsFrom0TO14) {
		this.numberOfPatientsFrom0TO14 = numberOfPatientsFrom0TO14;
	}

	public Double getNumberOfPatientsFrom15To17() {
		return numberOfPatientsFrom15To17;
	}

	public void setNumberOfPatientsFrom15To17(Double numberOfPatientsFrom15To17) {
		this.numberOfPatientsFrom15To17 = numberOfPatientsFrom15To17;
	}

	public Double getNumberOfPatientsAfter18() {
		return numberOfPatientsAfter18;
	}

	public void setNumberOfPatientsAfter18(Double numberOfPatientsAfter18) {
		this.numberOfPatientsAfter18 = numberOfPatientsAfter18;
	}

	public Double getTotalNumberOfPharmacies() {
		return totalNumberOfPharmacies;
	}

	public void setTotalNumberOfPharmacies(Double totalNumberOfPharmacies) {
		this.totalNumberOfPharmacies = totalNumberOfPharmacies;
	}

	public Double getNumberOfStatePharmacies() {
		return numberOfStatePharmacies;
	}

	public void setNumberOfStatePharmacies(Double numberOfStatePharmacies) {
		this.numberOfStatePharmacies = numberOfStatePharmacies;
	}

	public Double getNumberOfPrivatePharmacies() {
		return numberOfPrivatePharmacies;
	}

	public void setNumberOfPrivatePharmacies(Double numberOfPrivatePharmacies) {
		this.numberOfPrivatePharmacies = numberOfPrivatePharmacies;
	}
	
}
