package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.College;
import com.example.demo.domain.PreschoolOrganizationsInfo;
import com.example.demo.domain.PreschoolTeacher;
import com.example.demo.domain.School;
import com.example.demo.domain.SchoolTeacher;
import com.example.demo.repos.EducationMapper;

@Service
public class EducationService {

	@Autowired
	EducationMapper educationMapper;
	
	public List<PreschoolOrganizationsInfo> getPreschoolsByYear(String year) {
		List<PreschoolOrganizationsInfo> preschools = educationMapper.getPreschoolsByYear(year);
		
		setDistricts(preschools);
		setKindergartens(preschools);
		
		return preschools;
	}

	public List<PreschoolOrganizationsInfo> getPreschoolsByYearAndDistrict(String year, String district) {
		List<PreschoolOrganizationsInfo> preschools = 
				educationMapper.getPreschoolsByYearAndDistrict(year, district);
		
		setKindergartens(preschools);
		
		return preschools;
	}
	
	public List<PreschoolOrganizationsInfo> getPreschoolsByYearAndKindergarten(String year, String kindergarten) {
		return educationMapper.getPreschoolsByYearAndKindergarten(year, kindergarten);
	}
	
	public List<PreschoolOrganizationsInfo> getPreschoolsByYearAndRegion(String year, String region) {
		List<PreschoolOrganizationsInfo> preschools = educationMapper.getPreschoolsByYearAndRegion(year, region);
	
		setDistricts(preschools);
		setKindergartens(preschools);
		
		return preschools;
	}
	
//	public List<SchoolsInfo> getSchoolsInfoByYear(String year) {
//		return educationMapper.getSchoolsInfoByYear(year);
//	}
	
	private void setDistricts(List<PreschoolOrganizationsInfo> preschools) {
		for (PreschoolOrganizationsInfo p : preschools) {
			List<String> districts = educationMapper.getDistrictsByYearAndRegion(p.getYear(), p.getRegion());
			
			p.setDistricts(districts);
		}
	}
	
	private void setKindergartens(List<PreschoolOrganizationsInfo> preschools) {
		for (PreschoolOrganizationsInfo p : preschools) {
			List<String> kindergartens = new ArrayList<>();
			
			for (String district : p.getDistricts()) {
				List<String> kindergartensOfDistrict 
					= educationMapper.getKindergartensByYearAndDistrict(p.getYear(), district);
				
				kindergartens.addAll(kindergartensOfDistrict);
			}
			
			p.setKindergartens(kindergartens);
		}
	}

	public List<String> getSchoolYears() {
		return educationMapper.getSchoolYears();
	}
	
	public List<String> getPreschoolYears() {
		return educationMapper.getPreschoolYears();
	}
	
//	public List<TechAndProEducation> getCollegesInfoByYear(String year) {
//		return educationMapper.getCollegesInfoByYear(year);
//	}

	public List<String> getCollegesYears() {
		return educationMapper.getCollegesYears();
	}
	
	public List<School> getSchoolsByYearAndRegion(String year, String region) {
		return educationMapper.getSchoolsByYearAndRegion(year, region);
	}
	
	public List<School> getSchoolsByYear(String year) {
		return educationMapper.getSchoolsByYear(year);
	}
	
	public List<College> getCollegesByYearAndRegion(String year, String region) {
		return educationMapper.getCollegesByYearAndRegion(year, region);
	}
	
	public List<College> getCollegesByYear(String year) {
		return educationMapper.getCollegesByYear(year);
	}
	
	public List<College> getCollegesByYearAndName(String year, String name) {
		return educationMapper.getCollegesByYearAndName(year, name);
	}

	public List<School> getSchoolsByYearAndNAme(String year, String name) {
		return educationMapper.getSchoolsByYearAndName(year, name);
	}

	public List<School> getSchoolsByYearAndDistrict(String year, String district) {
		return educationMapper.getSchoolsByYearAndDistrict(year, district);
	}

	public List<SchoolTeacher> getSchoolTeachersByYearAndNameOfSchool(String year, String name) {
		return educationMapper.getSchoolTeachersByYearAndNameOfSchool(year, name);
	}

	public List<SchoolTeacher> getSchoolTeachersByYearAndDistrict(String year, String district) {
		return educationMapper.getSchoolTeachersByYearAndDistrict(year, district);
	}

	public List<SchoolTeacher> getSchoolTeachersByYearAndRegion(String year, String region) {
		return educationMapper.getSchoolTeachersByYearAndRegion(year, region);
	}

	public List<SchoolTeacher> getSchoolTeachersByYear(String year) {
		return educationMapper.getSchoolTeachersByYear(year);
	}

	public List<PreschoolTeacher> getPreschoolTeachersByYear(String year) {
		return educationMapper.getPreschoolTeachersByYear(year);
	}

	public List<PreschoolTeacher> getPreschoolTeachersByYearAndNameOfPreschool(String year, String name) {
		return educationMapper.getPreschoolTeachersByYearAndNameOfPreschool(year, name);
	}

	public List<PreschoolTeacher> getPreschoolTeachersByYearAndDistrict(String year, String district) {
		return educationMapper.getPreschoolTeachersByYearAndDistrict(year, district);
	}

	public List<PreschoolTeacher> getPreschoolTeachersByYearAndRegion(String year, String region) {
		return educationMapper.getPreschoolTeachersByYearAndRegion(year, region);
	}
	
}
