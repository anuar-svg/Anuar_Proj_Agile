package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.College;
import com.example.demo.domain.PreschoolOrganizationsInfo;
import com.example.demo.domain.PreschoolTeacher;
import com.example.demo.domain.School;
import com.example.demo.domain.SchoolTeacher;
import com.example.demo.exception.CollegeNotFoundException;
import com.example.demo.exception.DistrictNotFoundException;
import com.example.demo.exception.KindergartenNotFoundException;
import com.example.demo.exception.RegionNotFoundException;
import com.example.demo.exception.SchoolNotFoundException;
import com.example.demo.exception.YearNotFoundException;
import com.example.demo.service.EducationService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/statistics/edu")
public class EducationController {

	@Autowired
	EducationService educationService;
	
	@GetMapping(value = "/preschool-organizations", params = "year")
	public List<PreschoolOrganizationsInfo> preschoolsByYear(
			@RequestParam("year") String year,
			@RequestParam(value = "kindergarten", required = false) String kindergarten,
			@RequestParam(value = "district", required = false) String district,
			@RequestParam(value = "region", required = false) String region
	) {
		List<PreschoolOrganizationsInfo> preschools = 
				educationService.getPreschoolsByYear(year);
		
		if (preschools.isEmpty()) {
			throw new YearNotFoundException();
		}
		
		if (kindergarten != null) {
			preschools = educationService.getPreschoolsByYearAndKindergarten(year, kindergarten);
			if (preschools.isEmpty()) {
				throw new KindergartenNotFoundException();
			}
		} else if (district != null) {
			preschools = educationService.getPreschoolsByYearAndDistrict(year, district);
			if (preschools.isEmpty()) {
				throw new DistrictNotFoundException();
			}
		} else if (region != null) {
			preschools = educationService.getPreschoolsByYearAndRegion(year, region);
			if (preschools.isEmpty()) {
				throw new RegionNotFoundException();
			}
		}
		
		return preschools;
	}
	
	@GetMapping(value = "/preschool-teachers", params = "year")
	public List<PreschoolTeacher> preschoolTeachersByYear(
			@RequestParam("year") String year, 
			@RequestParam(value = "region", required = false) String region,
			@RequestParam(value = "district", required = false) String district,
			@RequestParam(value = "name", required = false) String name
	) {
		List<PreschoolTeacher> preschoolTeachers;
		List<String> preschoolYears = educationService.getPreschoolYears();
		
		if (!preschoolYears.contains(year)) {
			throw new YearNotFoundException();
		}
		
		if (name != null) {
			preschoolTeachers = educationService.getPreschoolTeachersByYearAndNameOfPreschool(year, name);
		
			if(preschoolTeachers.isEmpty()) {
				throw new SchoolNotFoundException();
			}
		} else if (district != null) {
			preschoolTeachers = educationService.getPreschoolTeachersByYearAndDistrict(year, district);
			
			if(preschoolTeachers.isEmpty()) {
				throw new DistrictNotFoundException();
			}
		} else if (region != null) {
			preschoolTeachers = educationService.getPreschoolTeachersByYearAndRegion(year, region);
			
			if(preschoolTeachers.isEmpty()) {
				throw new RegionNotFoundException();
			}
		} else {
			preschoolTeachers = educationService.getPreschoolTeachersByYear(year);
		}
		
		return preschoolTeachers;
	}
	
//	@GetMapping(value = "/schools-stat", params = "year")
//	public List<SchoolsInfo> schoolsInfoByYear(@RequestParam String year) {
//		List<SchoolsInfo> schoolsStat = educationService.getSchoolsInfoByYear(year);
//		
//		if (schoolsStat.isEmpty()) {
//			throw new YearNotFoundException();
//		}
//		
//		return schoolsStat;
//	}
	
	@GetMapping(value = "/schools", params = "year")
	public List<School> schoolsByYear(
			@RequestParam("year") String year, 
			@RequestParam(value = "region", required = false) String region,
			@RequestParam(value = "district", required = false) String district,
			@RequestParam(value = "name", required = false) String name
	) {
		List<School> schools;
		List<String> schoolYears = educationService.getSchoolYears();
		
		if (!schoolYears.contains(year)) {
			throw new YearNotFoundException();
		}
		
		if (name != null) {
			schools = educationService.getSchoolsByYearAndNAme(year, name);
		
			if(schools.isEmpty()) {
				throw new SchoolNotFoundException();
			}
		} else if (district != null) {
			schools = educationService.getSchoolsByYearAndDistrict(year, district);
			
			if(schools.isEmpty()) {
				throw new DistrictNotFoundException();
			}
		} else if (region != null) {
			schools = educationService.getSchoolsByYearAndRegion(year, region);
			
			if(schools.isEmpty()) {
				throw new RegionNotFoundException();
			}
		} else {
			schools = educationService.getSchoolsByYear(year);
		}
		
		return schools;
	}
	
	@GetMapping(value = "/school-teachers", params = "year")
	public List<SchoolTeacher> schoolTeachersByYear(
			@RequestParam("year") String year, 
			@RequestParam(value = "region", required = false) String region,
			@RequestParam(value = "district", required = false) String district,
			@RequestParam(value = "name", required = false) String name
	) {
		List<SchoolTeacher> schoolTeachers;
		List<String> schoolYears = educationService.getSchoolYears();
		
		if (!schoolYears.contains(year)) {
			throw new YearNotFoundException();
		}
		
		if (name != null) {
			schoolTeachers = educationService.getSchoolTeachersByYearAndNameOfSchool(year, name);
		
			if(schoolTeachers.isEmpty()) {
				throw new SchoolNotFoundException();
			}
		} else if (district != null) {
			schoolTeachers = educationService.getSchoolTeachersByYearAndDistrict(year, district);
			
			if(schoolTeachers.isEmpty()) {
				throw new DistrictNotFoundException();
			}
		} else if (region != null) {
			schoolTeachers = educationService.getSchoolTeachersByYearAndRegion(year, region);
			
			if(schoolTeachers.isEmpty()) {
				throw new RegionNotFoundException();
			}
		} else {
			schoolTeachers = educationService.getSchoolTeachersByYear(year);
		}
		
		return schoolTeachers;
	}
	
	@GetMapping("/schools/years")
	public List<String> schoolYears() {
		return educationService.getSchoolYears();
	}
	
	@GetMapping("/preschool-organizations/years")
	public List<String> preschoolYears() {
		return educationService.getPreschoolYears();
	}
	
	@GetMapping("/colleges/years")
	public List<String> collegesYears() {
		return educationService.getCollegesYears();
	}
	
//	@GetMapping(value = "/colleges-stat", params = "year")
//	public List<TechAndProEducation> collegesStatByYear(@RequestParam String year) {
//		List<TechAndProEducation> colleges = educationService.getCollegesInfoByYear(year);
//		
//		if (colleges.isEmpty()) {
//			throw new YearNotFoundException();
//		}
//		
//		return colleges;
//	}
	
	@GetMapping(value = "colleges", params = "year")
	public List<College> colleges(
			@RequestParam(value = "year") String year,
			@RequestParam(value = "region", required = false) String region,
			@RequestParam(value = "name", required = false) String name
	) {
		List<College> colleges;
		List<String> collegeYears = educationService.getCollegesYears();
		
		if (!collegeYears.contains(year)) {
			throw new YearNotFoundException();
		}
		
		if (name != null) {
			colleges = educationService.getCollegesByYearAndName(year, name);
			
			if(colleges.isEmpty()) {
				throw new CollegeNotFoundException();
			}
		} else if (region != null) {
			colleges = educationService.getCollegesByYearAndRegion(year, region);
			
			if(colleges.isEmpty()) {
				throw new RegionNotFoundException();
			}
		} else {
			colleges = educationService.getCollegesByYear(year);
		}
		
		return colleges;
	}
	
}
