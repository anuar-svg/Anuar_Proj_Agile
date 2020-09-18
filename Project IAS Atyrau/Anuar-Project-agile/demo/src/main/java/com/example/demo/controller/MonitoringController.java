package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
import com.example.demo.service.MonitoringService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/statistics/monitoring-sed")
public class MonitoringController {

	@Autowired
	MonitoringService monitoringService;
	
//	HEALTHCARE
	
	@GetMapping(value = "/healthcare", params = {"year", "byMonthes"})
	public HealthcareMonitoring getHealthcareMonitoring(
			@RequestParam("year") String year,
			@RequestParam("byMonthes") boolean byMonthes
	) {
		return monitoringService.getHealthcareMonitoringByYear(year);
	}
	
	@GetMapping("/healthcare/units")
	public HealthcareMonitoringUnits getHealthcareMonitoringUnits() {
		return monitoringService.getHealthcareMonitoringUnits();
	}
	
	@GetMapping(value = "/healthcare/years")
	public Map<String, String[]> getHealthcareYears() {
		return monitoringService.getHealthcareYears();
	}
	
	@GetMapping(value = "/healthcare", params = {"year", "byQuarters"})
	public HealthcareMonitoring2 getQuartersHealthcareMonitoring(
			@RequestParam("year") String year,
			@RequestParam("byQuarters") boolean byQuarters
	) {
		return monitoringService.getHealthcareMonitoringByQuartersOfYear(year);
	} 
	
	@GetMapping(value = "/healthcare", params = {"byYears"})
	public List<HealthcareMonitoring3> getHealthcareMonitoring3(
			@RequestParam("byYears") boolean byYears
	) {
		return monitoringService.getHealthcareMonitoring3();
	}
	
//	BUDGET
	
	@GetMapping("/budget")
	public List<BudgetMonitoring> getBudgetMonitoring() {
		return monitoringService.getBudgetMonitoring();
	}

//	Land Realtions

	@GetMapping("/land-relations")
	public List<LandRelations> getLandRelations() {
		return monitoringService.getLandRelations();
	}

//	Architecture
	
	@GetMapping(value = "/architecture", params = "year")
	public List<ArchitectureMonitoring> getArchitecture(@RequestParam("year") String year) {
		return monitoringService.getArchitectureByYear(year);
	}
	

	@GetMapping("/architecture/years")
	public List<String> getArchitectureYears() {
		return monitoringService.getArchitectureYears();
	}
	
//	Goverment purchases

	@GetMapping(value = "/goverment-purchases", params = "year")
	public List<GovermentPurchases> getGovermentPurchasesByYear(@RequestParam("year") String year) {
		return monitoringService.getGovermentPurchasesByYear(year);
	}
	
	@GetMapping(value = "/goverment-purchases/years")
	public List<String> getGovermentPurchasesYears() {
		return monitoringService.getGovermentPurchasesYears();
	}
	
//	Construction
	
	@GetMapping(value = "/constructions", params = "year")
	public List<ConstructionMonitoring> getConstructionsByYear(@RequestParam("year") String year) {
		return monitoringService.getConstructionsByYear(year);
	}
	
	@GetMapping("/constructions/years")
	public List<String> getConstructionYears() {
		return monitoringService.getConstructionYears();
	}
	
//	State Labor Inspectorate
	
	@GetMapping(value = "/state-labor-inspectorate", params = "year")
	public List<StateLaborInspectorate> getStateLaborInspectorateByYear(@RequestParam("year") String year) {
		return monitoringService.getStateLaborInspectorateByYear(year);
	}
	

	@GetMapping("/state-labor-inspectorate/years")
	public List<String> getStateLaborInspectorateYears() {
		return monitoringService.getStateLaborInspectorateYears();
	}
	
//	Education
	
	@GetMapping("/education")
	public List<EducationMonitoring> getEducationStatistics() {
		return monitoringService.getEducationStatistics();
	}
	
//	Religion
	
	@GetMapping(value = "/religion", params = "year")
	public List<ReligionMonitoring> getReligionByYear(@RequestParam String year) {
		return monitoringService.getReligionByYear(year);
	}
	
	@GetMapping("religion/years")
	public List<String> getReligionYears() {
		return monitoringService.getReligionYears();
	}
	
//	Control Over Land Use Monitoring
	
	@GetMapping(value = "/control-over-land", params = "year")
	public List<ControlOverLandUseMonitoring> getControlOverLandUseMonitoringByYear(@RequestParam String year) {
		return monitoringService.getControlOverLandUseMonitoringByYear(year);
	}
	
	@GetMapping("/control-over-land/years")
	public List<String> getControlOverLandUseMonitoringYears() {
		return monitoringService.getControlOverLandUseMonitoringYears();
	}
	
//	Economic
	
	@GetMapping(value = "/economy", params = {"year", "byMonthes"})
	public List<EconomicMonitoring> getEconomicMonthesByYear(
			@RequestParam("year") String year,
			@RequestParam("byMonthes") boolean byMonthes
	) {
		return monitoringService.getEconomicMonthesByYear(year);
	}
	
	@GetMapping("/economy/years")
	public Map<String, List<String>> geteconomicYears() {
		return monitoringService.geteconomicYears();
	}
	
	@GetMapping(value = "/economy", params = {"year", "byQuarters"})
	public List<EconomicMonitoring2> getEconomicQuartersByYear(
			@RequestParam("year") String year,
			@RequestParam("byQuarters") boolean byQuarters
	) {
		return monitoringService.getEconomicQuartersByYear(year);
	}
	
//	Transport
	
	@GetMapping(value = "transport", params = {"year", "byMonthes"})
	public List<TransportMonitoring> getTransportMonthesByYear(
			@RequestParam("year") String year,
			@RequestParam("byMonthes") boolean byMonthes
	) {
		return monitoringService.getTransportMonthesByYear(year);
	}
	
	@GetMapping("transport/years")
	public List<String> getTransportYears() {
		return monitoringService.getTransportYears();
	}
	
	@GetMapping(value = "transport", params = "byYears")
	public List<TransportMonitoring2> getTransportsByYears( @RequestParam("byYears") boolean byYears) {
		return monitoringService.getTransportsByYears();
	}
	
//	Agricultural Industry (Сель хоз)
	
	@GetMapping(value = "/agricultural-industry", params = "year")
	public List<AgriculturalIndustryMonitoring> getAgriculturalIndustryByYear(@RequestParam String year) {
		return monitoringService.getAgriculturalIndustryByYear(year);
	}
	
	@GetMapping("/agricultural-industry/years")
	public List<String> getAgriculturalIndustryYears() {
		return monitoringService.getAgriculturalIndustryYears();
	}
	
//	Veterenary
	
	@GetMapping(value = "/veterenary", params = "year")
	public List<VeterenaryMonitoring> getVeterenaryByYears(@RequestParam String year) {
		return monitoringService.getVeterenaryByYear(year);
	}
	
	@GetMapping("/veterenary/years")
	public List<String> getVeterenaryYears() {
		return monitoringService.getVeterenaryYears();
	}
	
}
