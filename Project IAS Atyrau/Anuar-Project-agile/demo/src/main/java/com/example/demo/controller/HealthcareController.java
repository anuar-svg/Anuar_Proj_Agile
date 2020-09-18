package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Demography;
import com.example.demo.domain.Morbidity;
import com.example.demo.domain.Mortality;
import com.example.demo.domain.OrganizationsInfo;
import com.example.demo.domain.Personnel;
import com.example.demo.payload.response.MessageResponse;
import com.example.demo.service.HealthcareService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/statistics/zdrav-kpi")
public class HealthcareController {

//	TODO add preauthorize annotation to methods
	
	@Autowired
	private HealthcareService healthcareService;
	
	private final String regionDoesNotExists = "Такого региона не существует";
	private final String yearDoesNotExists = "Нет статистики за данный год";

	private ResponseEntity<?> convertToResponseEntity(List<?> list, String message) {
		if (list.isEmpty()) {
			return new ResponseEntity<>(new MessageResponse(message), 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping(value = "/demographics", params = "region")
	public ResponseEntity<?> demographyByRegion(@RequestParam String region) {
		List<Demography> demographicsOfAllYearsByRegion = healthcareService.getDemographicsByRegion(region);
		
		return convertToResponseEntity(demographicsOfAllYearsByRegion, regionDoesNotExists);
	}

	@GetMapping(value = "/demographics", params = "year")
	public ResponseEntity<?> demographyByYear(@RequestParam String year) {
		List<Demography> demographicsOfAllRegionsByYear = healthcareService.getDemographicsByYear(year);
		
		return convertToResponseEntity(demographicsOfAllRegionsByYear, yearDoesNotExists);
	}
	
	@GetMapping(value = "/mortalities", params = "region")
	public ResponseEntity<?> mortalityByRegion(@RequestParam String region) {
		List<Mortality> mortalityOfAllYearsByRegion = healthcareService.getMortalitiesByRegion(region);
		
		return convertToResponseEntity(mortalityOfAllYearsByRegion, regionDoesNotExists);
	}
	
	@GetMapping(value = "/mortalities", params = "year")
	public ResponseEntity<?> mortalitiesByYear(@RequestParam String year) {
		List<Mortality> mortalityOfAllRegionsByYear = healthcareService.getMortalitiesByYear(year);
		
		return convertToResponseEntity(mortalityOfAllRegionsByYear, yearDoesNotExists);
	}
	
	@GetMapping(value = "/morbidities", params = "region")
	public ResponseEntity<?> morbiditiesByRegion(@RequestParam String region) {
		List<Morbidity> morbidityOfAllYearsByRegion = healthcareService.getMorbiditiesByRegion(region);
		
		return convertToResponseEntity(morbidityOfAllYearsByRegion, regionDoesNotExists);
	}
	
	@GetMapping(value = "/morbidities", params = "year")
	public ResponseEntity<?> morbiditiesByYear(@RequestParam String year) {
		List<Morbidity> morbidityOfAllRegionsByYear = healthcareService.getMorbiditiesByYear(year);
		
		return convertToResponseEntity(morbidityOfAllRegionsByYear, regionDoesNotExists);
	}
	
	@GetMapping(value = "/organizations", params = "year")
	public ResponseEntity<?> organizationsInfoByYear(@RequestParam String year) {
		List<OrganizationsInfo> organizationsInfoByYear = healthcareService.getOrganizationsInfoByYear(year);
		
		return convertToResponseEntity(organizationsInfoByYear, regionDoesNotExists);
	}

	@GetMapping(value = "/personnel", params = "region")
	public ResponseEntity<?> personnelByRegion(@RequestParam String region) {
		List<Personnel> personnelOfAllYearsByRegion = healthcareService.getPersonnelByRegion(region);
		
		return convertToResponseEntity(personnelOfAllYearsByRegion, regionDoesNotExists);
	}
	
	@GetMapping(value = "/personnel", params = "year")
	public ResponseEntity<?> personnelByYear(@RequestParam String year) {
		List<Personnel> personnelOfAllRegionsByYear = healthcareService.getPersonnelByYear(year);
		
		return convertToResponseEntity(personnelOfAllRegionsByYear, yearDoesNotExists);
	}
	
}
