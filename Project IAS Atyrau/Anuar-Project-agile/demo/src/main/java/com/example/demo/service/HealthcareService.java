package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Demography;
import com.example.demo.domain.Morbidity;
import com.example.demo.domain.Mortality;
import com.example.demo.domain.OrganizationsInfo;
import com.example.demo.domain.Personnel;
import com.example.demo.repos.HealthcareMapper;

@Service
public class HealthcareService {
	
	@Autowired
	HealthcareMapper healthcareMapper;
	public List<Demography> getDemographicsByRegion(String region) {
		return healthcareMapper.getDemographicsByRegion(region);
	}
	
	public List<Demography> getDemographicsByYear(String year) {
		return healthcareMapper.getDemographicsByYear(year);
	}
	
	public List<Mortality> getMortalitiesByRegion(String region) {
		return healthcareMapper.getMortalitiesByRegion(region);
	}
	
	public List<Mortality> getMortalitiesByYear(String year) {
		return healthcareMapper.getMortalitiesByYear(year);
	}
	
	public List<Morbidity> getMorbiditiesByRegion(String region) {
		return healthcareMapper.getMorbiditiesByRegion(region);
	}
	
	public List<Morbidity> getMorbiditiesByYear(String year) {
		return healthcareMapper.getMorbiditiesByYear(year);
	}
	
	public List<OrganizationsInfo> getOrganizationsInfoByYear(String year) {
		return healthcareMapper.getOrganizationsInfoByYear(year);
	}
	
	public List<Personnel> getPersonnelByRegion(String region) {
		return healthcareMapper.getPersonnelByRegion(region);
	}
	
	public List<Personnel> getPersonnelByYear(String year) {
		return healthcareMapper.getPersonnelByYear(year);
	}

}
