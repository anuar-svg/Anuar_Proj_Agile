package com.example.demo.domain;

public class HealthcareMonitoringUnits {

	private String mortalityRateUnit; // o_unit | на 1 тыс. человек
	private String maternalMortalityUnit; // o_unit_a | человек на 100 тыс. человек
	private String infantMortalityUnit; // o_unit_b | человек на 1 тыс. человек
	private String tuberculosisUnit; // o_unit_c | человек на 100 тыс. человек
	private String lifeExpectancyAtBirthUnit; // o_unit_d | лет
	private String childMortalityUnit; // o_unit_e | человек на 1 тыс. человек
	private String tuberculosisMortalityRateUnit; // o_unit_f | человек на 100 тыс. человек
	private String circulatoryMortalityUnit; // o_unit_g | человек на 100 тыс. человек
	private String cancerMortalityUnit; // o_unit_h | человек на 100 тыс. человек
	private String naturalPopulationGrowthUnit; // o_unit_i | человек на 1 тыс. человек
	private String heartDiseaseMortalityUnit; // o_unit_j | человек на 100 тыс. человек
	private String injuriesMortalityUnit; // o_unit_k | человек на 100 тыс. человек
	private String numberOfDoctorsFromAllDepartmentsUnit; // o_unit_l | человек
	private String numberOfDoctorsFromSystemMZUnit; // o_unit_n | человек
	private String provisionOfDoctorsFromAllDepartmentsUnit; // o_unit_m | человек на 100 тыс. человек
	private String provisionOfDoctorsFromSystemMZUnit; // o_unit_m | человек на 100 тыс. человек
	private String numberOfNursesFromAllDepartmentsUnit; // o_unit_n | человек
	private String numberOfNursesFromSystemMZUnit; // o_unit_n | человек
	private String provisionOfNursesFromAllDepartmentsUnit; // o_unit_o | человек на 10 тыс. человек
	private String provisionOfNursesFromSystemMZUnit; // o_unit_o | человек на 10 тыс. человек
	private String numberOfProvidingInpatientCareUnit; // o_unit_p | единиц
	private String numberOfProvidingInpatientCareFromSystemMZUnit; // o_unit_r | единиц
	private String totalNumberOfHospitalBedsUnit; // o_unit_r | единиц
	private String numberOfHospitalBedsFromSystemMZUnit; // o_unit_r | единиц
	private String numberOfSelfSupportingSystemMZUnit; // o_unit_r | единиц
	private String numberOfPrivateOrganizationsUnit; // o_unit_r | единиц
	
	private String provisionOfHospitalBedsUnit; // o_unit_s | человек на 10 тыс. человек
	private String provisionOfHospitalBedsSystemMZUnit; // o_unit_t | человек на 10 тыс. человек
	private String numberOfResidentsSystemMZUnit; // o_unit_u | тыс. человек
	private String numberOfResidentsStateUnit; // o_unit_u | тыс. человек
	private String numberOfResidentsPrivateUnit; // o_unit_u | тыс. человек
	private String numberOfOrganizationsWithDayHospitalBedsUnit; // o_unit_v | единиц
	private String totalNumberOfDayBedsInHospitalOrganizationsUnit; // o_unit_w | единиц
	private String numberOfOrganizationsWithPatientPolyclinicHelpUnit; // o_unit_x | единиц
	private String numberOfOrganizationsWithPatientPolyclinicHelpSystemMZUnit; // o_unit_x | единиц
	private String numberOfOrganizationsWithPatientPolyclinicHelpOthersUnit; // o_unit_x | единиц
	private String numberOfOrganizationsWithPatientPolyclinicHelpPrivateUnit; // o_unit_x | единиц
	private String numberOfVisitDoctorsFor1000Unit; // o_unit_y | на 1000 населения
	private String numberOfVisitDoctorsFor1Unit; // o_unit_yy | на 1 жителя
	private String numberOfPolyclinicsWithDayHospitalBedsUnit; // o_unit_z | единиц
	private String totalNumberDayPoliclinicBedsUnit; // o_unit_aa | единиц
	private String totalMorbidityOfPopulationUnit; // o_unit_bb | человек на 100 тыс. человек
	private String incidenceOfCancerUnit; // o_unit_cc | человек на 100 тыс. человек
	private String morbidityFromMentalDisordersUnit; // o_unit_dd | человек на 100 тыс. человек
	private String morbidityFromMentalDisordersWithSubstanceUseUnit; // o_unit_ee | человек на 100 тыс. человек
	private String morbidityFromInjuriesUnit; // o_unit_ff | человек на 100 тыс. человек
	private String morbidityFromBloodCirculationUnit; // o_unit_gg | человек на 100 тыс. человек
	private String morbidity_arterial_hypertension; // o_unit_gg | человек на 100 тыс. человек
	private String morbidityFromCoronaryHeartDiseaseUnit; // o_unit_gg | человек на 100 тыс. человек
	private String morbidityFromAcuteMyocardialInfarctionUnit; // o_unit_gg | человек на 100 тыс. человек
	private String numberOfIndependentStationsUnit; // o_unit_ii | единиц
	private String numberOfEmergencyDepartmentsUnit; // o_unit_jj | единиц
	private String numberOfEmergencyBrigadesUnit; // o_unit_kk | единиц
	private String medicalUnit; // o_unit_kk | единиц
	private String pediatricUnit; // o_unit_kk | единиц
	private String paramedicsUnit; // o_unit_kk | единиц
	private String numberOfcompletedEmergencyVisitsUnit; // o_unit_kk | единиц
	private String numberOfServedPersonsByEmergencyDepartmentsUnit; // o_unit_ll | человек на 1 тыс.человек
	
	private String fertilityUnit; // o_unit_zz | на 1 тыс. человек
	private String prevalenceOfInfectionUnit; // o_unit_mm / %
	private String numberOfDoctorsInPrivateOrganizationsUnit; // o_unit_l | человек
	private String medicalStaffingUnit; // o_unit_q | %
	private String numberOfMedicalStaffPositionsUnit; // o_unit_p | единиц
	private String numberMedicalPositionsHeldUnit; // o_unit_p | единиц
	private String numberOfNursesInPrivateOrganizationsUnit; // o_unit_o | человек
	private String numberOfProvidingInpatientCareOthersUnit; // o_unit_r | единиц
	private String numberOfPatientsInTheDUnit; // o_unit_vv | человек на 100 тыс. человек
	private String numberOfPatientsFrom0TO14Unit; // o_unit_vv | человек на 100 тыс. человек
	private String numberOfPatientsFrom15To17Unit; // o_unit_vv | человек на 100 тыс. человек
	private String numberOfPatientsAfter18Unit; // o_unit_vv | человек на 100 тыс. человек
	private String totalNumberOfPharmaciesUnit; // o_unit_w | единиц
	private String numberOfStatePharmaciesUnit; // o_unit_w | единиц
	private String numberOfPrivatePharmaciesUnit; // o_unit_w | единиц
	
	public HealthcareMonitoringUnits() {
		
	}

	public String getMortalityRateUnit() {
		return mortalityRateUnit;
	}

	public void setMortalityRateUnit(String mortalityRateUnit) {
		this.mortalityRateUnit = mortalityRateUnit;
	}

	public String getMaternalMortalityUnit() {
		return maternalMortalityUnit;
	}

	public void setMaternalMortalityUnit(String maternalMortalityUnit) {
		this.maternalMortalityUnit = maternalMortalityUnit;
	}

	public String getInfantMortalityUnit() {
		return infantMortalityUnit;
	}

	public void setInfantMortalityUnit(String infantMortalityUnit) {
		this.infantMortalityUnit = infantMortalityUnit;
	}

	public String getTuberculosisUnit() {
		return tuberculosisUnit;
	}

	public void setTuberculosisUnit(String tuberculosisUnit) {
		this.tuberculosisUnit = tuberculosisUnit;
	}

	public String getLifeExpectancyAtBirthUnit() {
		return lifeExpectancyAtBirthUnit;
	}

	public void setLifeExpectancyAtBirthUnit(String lifeExpectancyAtBirthUnit) {
		this.lifeExpectancyAtBirthUnit = lifeExpectancyAtBirthUnit;
	}

	public String getChildMortalityUnit() {
		return childMortalityUnit;
	}

	public void setChildMortalityUnit(String childMortalityUnit) {
		this.childMortalityUnit = childMortalityUnit;
	}

	public String getTuberculosisMortalityRateUnit() {
		return tuberculosisMortalityRateUnit;
	}

	public void setTuberculosisMortalityRateUnit(String tuberculosisMortalityRateUnit) {
		this.tuberculosisMortalityRateUnit = tuberculosisMortalityRateUnit;
	}

	public String getCirculatoryMortalityUnit() {
		return circulatoryMortalityUnit;
	}

	public void setCirculatoryMortalityUnit(String circulatoryMortalityUnit) {
		this.circulatoryMortalityUnit = circulatoryMortalityUnit;
	}

	public String getCancerMortalityUnit() {
		return cancerMortalityUnit;
	}

	public void setCancerMortalityUnit(String cancerMortalityUnit) {
		this.cancerMortalityUnit = cancerMortalityUnit;
	}

	public String getNaturalPopulationGrowthUnit() {
		return naturalPopulationGrowthUnit;
	}

	public void setNaturalPopulationGrowthUnit(String naturalPopulationGrowthUnit) {
		this.naturalPopulationGrowthUnit = naturalPopulationGrowthUnit;
	}

	public String getHeartDiseaseMortalityUnit() {
		return heartDiseaseMortalityUnit;
	}

	public void setHeartDiseaseMortalityUnit(String heartDiseaseMortalityUnit) {
		this.heartDiseaseMortalityUnit = heartDiseaseMortalityUnit;
	}

	public String getInjuriesMortalityUnit() {
		return injuriesMortalityUnit;
	}

	public void setInjuriesMortalityUnit(String injuriesMortalityUnit) {
		this.injuriesMortalityUnit = injuriesMortalityUnit;
	}

	public String getNumberOfDoctorsFromAllDepartmentsUnit() {
		return numberOfDoctorsFromAllDepartmentsUnit;
	}

	public void setNumberOfDoctorsFromAllDepartmentsUnit(String numberOfDoctorsFromAllDepartmentsUnit) {
		this.numberOfDoctorsFromAllDepartmentsUnit = numberOfDoctorsFromAllDepartmentsUnit;
	}

	public String getNumberOfDoctorsFromSystemMZUnit() {
		return numberOfDoctorsFromSystemMZUnit;
	}

	public void setNumberOfDoctorsFromSystemMZUnit(String numberOfDoctorsFromSystemMZUnit) {
		this.numberOfDoctorsFromSystemMZUnit = numberOfDoctorsFromSystemMZUnit;
	}

	public String getProvisionOfDoctorsFromAllDepartmentsUnit() {
		return provisionOfDoctorsFromAllDepartmentsUnit;
	}

	public void setProvisionOfDoctorsFromAllDepartmentsUnit(String provisionOfDoctorsFromAllDepartmentsUnit) {
		this.provisionOfDoctorsFromAllDepartmentsUnit = provisionOfDoctorsFromAllDepartmentsUnit;
	}

	public String getProvisionOfDoctorsFromSystemMZUnit() {
		return provisionOfDoctorsFromSystemMZUnit;
	}

	public void setProvisionOfDoctorsFromSystemMZUnit(String provisionOfDoctorsFromSystemMZUnit) {
		this.provisionOfDoctorsFromSystemMZUnit = provisionOfDoctorsFromSystemMZUnit;
	}

	public String getNumberOfNursesFromAllDepartmentsUnit() {
		return numberOfNursesFromAllDepartmentsUnit;
	}

	public void setNumberOfNursesFromAllDepartmentsUnit(String numberOfNursesFromAllDepartmentsUnit) {
		this.numberOfNursesFromAllDepartmentsUnit = numberOfNursesFromAllDepartmentsUnit;
	}

	public String getNumberOfNursesFromSystemMZUnit() {
		return numberOfNursesFromSystemMZUnit;
	}

	public void setNumberOfNursesFromSystemMZUnit(String numberOfNursesFromSystemMZUnit) {
		this.numberOfNursesFromSystemMZUnit = numberOfNursesFromSystemMZUnit;
	}

	public String getProvisionOfNursesFromAllDepartmentsUnit() {
		return provisionOfNursesFromAllDepartmentsUnit;
	}

	public void setProvisionOfNursesFromAllDepartmentsUnit(String provisionOfNursesFromAllDepartmentsUnit) {
		this.provisionOfNursesFromAllDepartmentsUnit = provisionOfNursesFromAllDepartmentsUnit;
	}

	public String getProvisionOfNursesFromSystemMZUnit() {
		return provisionOfNursesFromSystemMZUnit;
	}

	public void setProvisionOfNursesFromSystemMZUnit(String provisionOfNursesFromSystemMZUnit) {
		this.provisionOfNursesFromSystemMZUnit = provisionOfNursesFromSystemMZUnit;
	}

	public String getNumberOfProvidingInpatientCareUnit() {
		return numberOfProvidingInpatientCareUnit;
	}

	public void setNumberOfProvidingInpatientCareUnit(String numberOfProvidingInpatientCareUnit) {
		this.numberOfProvidingInpatientCareUnit = numberOfProvidingInpatientCareUnit;
	}

	public String getNumberOfProvidingInpatientCareFromSystemMZUnit() {
		return numberOfProvidingInpatientCareFromSystemMZUnit;
	}

	public void setNumberOfProvidingInpatientCareFromSystemMZUnit(String numberOfProvidingInpatientCareFromSystemMZUnit) {
		this.numberOfProvidingInpatientCareFromSystemMZUnit = numberOfProvidingInpatientCareFromSystemMZUnit;
	}

	public String getTotalNumberOfHospitalBedsUnit() {
		return totalNumberOfHospitalBedsUnit;
	}

	public void setTotalNumberOfHospitalBedsUnit(String totalNumberOfHospitalBedsUnit) {
		this.totalNumberOfHospitalBedsUnit = totalNumberOfHospitalBedsUnit;
	}

	public String getNumberOfHospitalBedsFromSystemMZUnit() {
		return numberOfHospitalBedsFromSystemMZUnit;
	}

	public void setNumberOfHospitalBedsFromSystemMZUnit(String numberOfHospitalBedsFromSystemMZUnit) {
		this.numberOfHospitalBedsFromSystemMZUnit = numberOfHospitalBedsFromSystemMZUnit;
	}

	public String getNumberOfSelfSupportingSystemMZUnit() {
		return numberOfSelfSupportingSystemMZUnit;
	}

	public void setNumberOfSelfSupportingSystemMZUnit(String numberOfSelfSupportingSystemMZUnit) {
		this.numberOfSelfSupportingSystemMZUnit = numberOfSelfSupportingSystemMZUnit;
	}

	public String getNumberOfPrivateOrganizationsUnit() {
		return numberOfPrivateOrganizationsUnit;
	}

	public void setNumberOfPrivateOrganizationsUnit(String numberOfPrivateOrganizationsUnit) {
		this.numberOfPrivateOrganizationsUnit = numberOfPrivateOrganizationsUnit;
	}

	public String getProvisionOfHospitalBedsUnit() {
		return provisionOfHospitalBedsUnit;
	}

	public void setProvisionOfHospitalBedsUnit(String provisionOfHospitalBedsUnit) {
		this.provisionOfHospitalBedsUnit = provisionOfHospitalBedsUnit;
	}

	public String getProvisionOfHospitalBedsSystemMZUnit() {
		return provisionOfHospitalBedsSystemMZUnit;
	}

	public void setProvisionOfHospitalBedsSystemMZUnit(String provisionOfHospitalBedsSystemMZUnit) {
		this.provisionOfHospitalBedsSystemMZUnit = provisionOfHospitalBedsSystemMZUnit;
	}

	public String getNumberOfResidentsSystemMZUnit() {
		return numberOfResidentsSystemMZUnit;
	}

	public void setNumberOfResidentsSystemMZUnit(String numberOfResidentsSystemMZUnit) {
		this.numberOfResidentsSystemMZUnit = numberOfResidentsSystemMZUnit;
	}

	public String getNumberOfResidentsStateUnit() {
		return numberOfResidentsStateUnit;
	}

	public void setNumberOfResidentsStateUnit(String numberOfResidentsStateUnit) {
		this.numberOfResidentsStateUnit = numberOfResidentsStateUnit;
	}

	public String getNumberOfResidentsPrivateUnit() {
		return numberOfResidentsPrivateUnit;
	}

	public void setNumberOfResidentsPrivateUnit(String numberOfResidentsPrivateUnit) {
		this.numberOfResidentsPrivateUnit = numberOfResidentsPrivateUnit;
	}

	public String getNumberOfOrganizationsWithDayHospitalBedsUnit() {
		return numberOfOrganizationsWithDayHospitalBedsUnit;
	}

	public void setNumberOfOrganizationsWithDayHospitalBedsUnit(String numberOfOrganizationsWithDayHospitalBedsUnit) {
		this.numberOfOrganizationsWithDayHospitalBedsUnit = numberOfOrganizationsWithDayHospitalBedsUnit;
	}

	public String getTotalNumberOfDayBedsInHospitalOrganizationsUnit() {
		return totalNumberOfDayBedsInHospitalOrganizationsUnit;
	}

	public void setTotalNumberOfDayBedsInHospitalOrganizationsUnit(String totalNumberOfDayBedsInHospitalOrganizationsUnit) {
		this.totalNumberOfDayBedsInHospitalOrganizationsUnit = totalNumberOfDayBedsInHospitalOrganizationsUnit;
	}

	public String getNumberOfOrganizationsWithPatientPolyclinicHelpUnit() {
		return numberOfOrganizationsWithPatientPolyclinicHelpUnit;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpUnit(
			String numberOfOrganizationsWithPatientPolyclinicHelpUnit) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpUnit = numberOfOrganizationsWithPatientPolyclinicHelpUnit;
	}

	public String getNumberOfOrganizationsWithPatientPolyclinicHelpSystemMZUnit() {
		return numberOfOrganizationsWithPatientPolyclinicHelpSystemMZUnit;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpSystemMZUnit(
			String numberOfOrganizationsWithPatientPolyclinicHelpSystemMZUnit) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpSystemMZUnit = numberOfOrganizationsWithPatientPolyclinicHelpSystemMZUnit;
	}

	public String getNumberOfOrganizationsWithPatientPolyclinicHelpOthersUnit() {
		return numberOfOrganizationsWithPatientPolyclinicHelpOthersUnit;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpOthersUnit(
			String numberOfOrganizationsWithPatientPolyclinicHelpOthersUnit) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpOthersUnit = numberOfOrganizationsWithPatientPolyclinicHelpOthersUnit;
	}

	public String getNumberOfOrganizationsWithPatientPolyclinicHelpPrivateUnit() {
		return numberOfOrganizationsWithPatientPolyclinicHelpPrivateUnit;
	}

	public void setNumberOfOrganizationsWithPatientPolyclinicHelpPrivateUnit(
			String numberOfOrganizationsWithPatientPolyclinicHelpPrivateUnit) {
		this.numberOfOrganizationsWithPatientPolyclinicHelpPrivateUnit = numberOfOrganizationsWithPatientPolyclinicHelpPrivateUnit;
	}

	public String getNumberOfVisitDoctorsFor1000Unit() {
		return numberOfVisitDoctorsFor1000Unit;
	}

	public void setNumberOfVisitDoctorsFor1000Unit(String numberOfVisitDoctorsFor1000Unit) {
		this.numberOfVisitDoctorsFor1000Unit = numberOfVisitDoctorsFor1000Unit;
	}

	public String getNumberOfVisitDoctorsFor1Unit() {
		return numberOfVisitDoctorsFor1Unit;
	}

	public void setNumberOfVisitDoctorsFor1Unit(String numberOfVisitDoctorsFor1Unit) {
		this.numberOfVisitDoctorsFor1Unit = numberOfVisitDoctorsFor1Unit;
	}

	public String getNumberOfPolyclinicsWithDayHospitalBedsUnit() {
		return numberOfPolyclinicsWithDayHospitalBedsUnit;
	}

	public void setNumberOfPolyclinicsWithDayHospitalBedsUnit(String numberOfPolyclinicsWithDayHospitalBedsUnit) {
		this.numberOfPolyclinicsWithDayHospitalBedsUnit = numberOfPolyclinicsWithDayHospitalBedsUnit;
	}

	public String getTotalNumberDayPoliclinicBedsUnit() {
		return totalNumberDayPoliclinicBedsUnit;
	}

	public void setTotalNumberDayPoliclinicBedsUnit(String totalNumberDayPoliclinicBedsUnit) {
		this.totalNumberDayPoliclinicBedsUnit = totalNumberDayPoliclinicBedsUnit;
	}

	public String getTotalMorbidityOfPopulationUnit() {
		return totalMorbidityOfPopulationUnit;
	}

	public void setTotalMorbidityOfPopulationUnit(String totalMorbidityOfPopulationUnit) {
		this.totalMorbidityOfPopulationUnit = totalMorbidityOfPopulationUnit;
	}

	public String getIncidenceOfCancerUnit() {
		return incidenceOfCancerUnit;
	}

	public void setIncidenceOfCancerUnit(String incidenceOfCancerUnit) {
		this.incidenceOfCancerUnit = incidenceOfCancerUnit;
	}

	public String getMorbidityFromMentalDisordersUnit() {
		return morbidityFromMentalDisordersUnit;
	}

	public void setMorbidityFromMentalDisordersUnit(String morbidityFromMentalDisordersUnit) {
		this.morbidityFromMentalDisordersUnit = morbidityFromMentalDisordersUnit;
	}

	public String getMorbidityFromMentalDisordersWithSubstanceUseUnit() {
		return morbidityFromMentalDisordersWithSubstanceUseUnit;
	}

	public void setMorbidityFromMentalDisordersWithSubstanceUseUnit(
			String morbidityFromMentalDisordersWithSubstanceUseUnit) {
		this.morbidityFromMentalDisordersWithSubstanceUseUnit = morbidityFromMentalDisordersWithSubstanceUseUnit;
	}

	public String getMorbidityFromInjuriesUnit() {
		return morbidityFromInjuriesUnit;
	}

	public void setMorbidityFromInjuriesUnit(String morbidityFromInjuriesUnit) {
		this.morbidityFromInjuriesUnit = morbidityFromInjuriesUnit;
	}

	public String getMorbidityFromBloodCirculationUnit() {
		return morbidityFromBloodCirculationUnit;
	}

	public void setMorbidityFromBloodCirculationUnit(String morbidityFromBloodCirculationUnit) {
		this.morbidityFromBloodCirculationUnit = morbidityFromBloodCirculationUnit;
	}

	public String getMorbidity_arterial_hypertension() {
		return morbidity_arterial_hypertension;
	}

	public void setMorbidity_arterial_hypertension(String morbidity_arterial_hypertension) {
		this.morbidity_arterial_hypertension = morbidity_arterial_hypertension;
	}

	public String getMorbidityFromCoronaryHeartDiseaseUnit() {
		return morbidityFromCoronaryHeartDiseaseUnit;
	}

	public void setMorbidityFromCoronaryHeartDiseaseUnit(String morbidityFromCoronaryHeartDiseaseUnit) {
		this.morbidityFromCoronaryHeartDiseaseUnit = morbidityFromCoronaryHeartDiseaseUnit;
	}

	public String getMorbidityFromAcuteMyocardialInfarctionUnit() {
		return morbidityFromAcuteMyocardialInfarctionUnit;
	}

	public void setMorbidityFromAcuteMyocardialInfarctionUnit(String morbidityFromAcuteMyocardialInfarctionUnit) {
		this.morbidityFromAcuteMyocardialInfarctionUnit = morbidityFromAcuteMyocardialInfarctionUnit;
	}

	public String getNumberOfIndependentStationsUnit() {
		return numberOfIndependentStationsUnit;
	}

	public void setNumberOfIndependentStationsUnit(String numberOfIndependentStationsUnit) {
		this.numberOfIndependentStationsUnit = numberOfIndependentStationsUnit;
	}

	public String getNumberOfEmergencyDepartmentsUnit() {
		return numberOfEmergencyDepartmentsUnit;
	}

	public void setNumberOfEmergencyDepartmentsUnit(String numberOfEmergencyDepartmentsUnit) {
		this.numberOfEmergencyDepartmentsUnit = numberOfEmergencyDepartmentsUnit;
	}

	public String getNumberOfEmergencyBrigadesUnit() {
		return numberOfEmergencyBrigadesUnit;
	}

	public void setNumberOfEmergencyBrigadesUnit(String numberOfEmergencyBrigadesUnit) {
		this.numberOfEmergencyBrigadesUnit = numberOfEmergencyBrigadesUnit;
	}

	public String getMedicalUnit() {
		return medicalUnit;
	}

	public void setMedicalUnit(String medicalUnit) {
		this.medicalUnit = medicalUnit;
	}

	public String getPediatricUnit() {
		return pediatricUnit;
	}

	public void setPediatricUnit(String pediatricUnit) {
		this.pediatricUnit = pediatricUnit;
	}

	public String getParamedicsUnit() {
		return paramedicsUnit;
	}

	public void setParamedicsUnit(String paramedicsUnit) {
		this.paramedicsUnit = paramedicsUnit;
	}

	public String getNumberOfcompletedEmergencyVisitsUnit() {
		return numberOfcompletedEmergencyVisitsUnit;
	}

	public void setNumberOfcompletedEmergencyVisitsUnit(String numberOfcompletedEmergencyVisitsUnit) {
		this.numberOfcompletedEmergencyVisitsUnit = numberOfcompletedEmergencyVisitsUnit;
	}

	public String getNumberOfServedPersonsByEmergencyDepartmentsUnit() {
		return numberOfServedPersonsByEmergencyDepartmentsUnit;
	}

	public void setNumberOfServedPersonsByEmergencyDepartmentsUnit(String numberOfServedPersonsByEmergencyDepartmentsUnit) {
		this.numberOfServedPersonsByEmergencyDepartmentsUnit = numberOfServedPersonsByEmergencyDepartmentsUnit;
	}

	public String getFertilityUnit() {
		return fertilityUnit;
	}

	public void setFertilityUnit(String fertilityUnit) {
		this.fertilityUnit = fertilityUnit;
	}

	public String getPrevalenceOfInfectionUnit() {
		return prevalenceOfInfectionUnit;
	}

	public void setPrevalenceOfInfectionUnit(String prevalenceOfInfectionUnit) {
		this.prevalenceOfInfectionUnit = prevalenceOfInfectionUnit;
	}

	public String getNumberOfDoctorsInPrivateOrganizationsUnit() {
		return numberOfDoctorsInPrivateOrganizationsUnit;
	}

	public void setNumberOfDoctorsInPrivateOrganizationsUnit(String numberOfDoctorsInPrivateOrganizationsUnit) {
		this.numberOfDoctorsInPrivateOrganizationsUnit = numberOfDoctorsInPrivateOrganizationsUnit;
	}

	public String getMedicalStaffingUnit() {
		return medicalStaffingUnit;
	}

	public void setMedicalStaffingUnit(String medicalStaffingUnit) {
		this.medicalStaffingUnit = medicalStaffingUnit;
	}

	public String getNumberOfMedicalStaffPositionsUnit() {
		return numberOfMedicalStaffPositionsUnit;
	}

	public void setNumberOfMedicalStaffPositionsUnit(String numberOfMedicalStaffPositionsUnit) {
		this.numberOfMedicalStaffPositionsUnit = numberOfMedicalStaffPositionsUnit;
	}

	public String getNumberMedicalPositionsHeldUnit() {
		return numberMedicalPositionsHeldUnit;
	}

	public void setNumberMedicalPositionsHeldUnit(String numberMedicalPositionsHeldUnit) {
		this.numberMedicalPositionsHeldUnit = numberMedicalPositionsHeldUnit;
	}

	public String getNumberOfNursesInPrivateOrganizationsUnit() {
		return numberOfNursesInPrivateOrganizationsUnit;
	}

	public void setNumberOfNursesInPrivateOrganizationsUnit(String numberOfNursesInPrivateOrganizationsUnit) {
		this.numberOfNursesInPrivateOrganizationsUnit = numberOfNursesInPrivateOrganizationsUnit;
	}

	public String getNumberOfProvidingInpatientCareOthersUnit() {
		return numberOfProvidingInpatientCareOthersUnit;
	}

	public void setNumberOfProvidingInpatientCareOthersUnit(String numberOfProvidingInpatientCareOthersUnit) {
		this.numberOfProvidingInpatientCareOthersUnit = numberOfProvidingInpatientCareOthersUnit;
	}

	public String getNumberOfPatientsInTheDUnit() {
		return numberOfPatientsInTheDUnit;
	}

	public void setNumberOfPatientsInTheDUnit(String numberOfPatientsInTheDUnit) {
		this.numberOfPatientsInTheDUnit = numberOfPatientsInTheDUnit;
	}

	public String getNumberOfPatientsFrom0TO14Unit() {
		return numberOfPatientsFrom0TO14Unit;
	}

	public void setNumberOfPatientsFrom0TO14Unit(String numberOfPatientsFrom0TO14Unit) {
		this.numberOfPatientsFrom0TO14Unit = numberOfPatientsFrom0TO14Unit;
	}

	public String getNumberOfPatientsFrom15To17Unit() {
		return numberOfPatientsFrom15To17Unit;
	}

	public void setNumberOfPatientsFrom15To17Unit(String numberOfPatientsFrom15To17Unit) {
		this.numberOfPatientsFrom15To17Unit = numberOfPatientsFrom15To17Unit;
	}

	public String getNumberOfPatientsAfter18Unit() {
		return numberOfPatientsAfter18Unit;
	}

	public void setNumberOfPatientsAfter18Unit(String numberOfPatientsAfter18Unit) {
		this.numberOfPatientsAfter18Unit = numberOfPatientsAfter18Unit;
	}

	public String getTotalNumberOfPharmaciesUnit() {
		return totalNumberOfPharmaciesUnit;
	}

	public void setTotalNumberOfPharmaciesUnit(String totalNumberOfPharmaciesUnit) {
		this.totalNumberOfPharmaciesUnit = totalNumberOfPharmaciesUnit;
	}

	public String getNumberOfStatePharmaciesUnit() {
		return numberOfStatePharmaciesUnit;
	}

	public void setNumberOfStatePharmaciesUnit(String numberOfStatePharmaciesUnit) {
		this.numberOfStatePharmaciesUnit = numberOfStatePharmaciesUnit;
	}

	public String getNumberOfPrivatePharmaciesUnit() {
		return numberOfPrivatePharmaciesUnit;
	}

	public void setNumberOfPrivatePharmaciesUnit(String numberOfPrivatePharmaciesUnit) {
		this.numberOfPrivatePharmaciesUnit = numberOfPrivatePharmaciesUnit;
	}
	
}
