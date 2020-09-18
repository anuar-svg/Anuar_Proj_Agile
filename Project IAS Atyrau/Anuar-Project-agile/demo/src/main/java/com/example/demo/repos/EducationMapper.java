package com.example.demo.repos;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.College;
import com.example.demo.domain.PreschoolOrganizationsInfo;
import com.example.demo.domain.PreschoolTeacher;
import com.example.demo.domain.School;
import com.example.demo.domain.SchoolTeacher;

public interface EducationMapper {

	String selectPreschoolRows = "SELECT o_area AS area, o_region AS region, o_year AS year, "
			+ "SUM(o_numer_children) AS numberOfChildren, SUM(o_number_frames) AS numberOfPersonnel, "
			+ "SUM(o_number_packages) AS numberOfPlaces, "
			+ "ARRAY(SELECT o_rural_district FROM edu_ddo) AS districts, SUM(o_number_waiting_lists) AS numberOfWaiters "
			+ "FROM edu_ddo";
	
	String schoolTableWithUniqueRows = "(SELECT DISTINCT sbid, o_area, o_region, o_year, o_rural_district, "
			+ "o_rural_settlement, o_name_school, o_count_teachers, o_number_students, o_integer, "
			+ "o_school_address, o_year_b, o_working_hours, o_working_hours_a, o_contact_number, o_lastname, "
			+ "o_firstname, o_otchestvo, o_count_graduates, o_count_participants_unt, o_count_category_a,"
			+ "o_count_category_b, o_count_category_c, o_count_category_d,"
			+ "o_count_gold_medal, o_count_certificate_distinction, o_count_the_lowest_rating, o_count_unsatisfactory_evaluation, "
			+ "o_count_age_a, o_count_age_b, o_count_age_c, o_count_age_d, o_count_age_e, o_count_age_f, "
			+ "o_count_education_higher, o_general_secondary_education, "
			+ "o_count_education_colleges "
			+ "FROM edu_school "
			+ "WHERE o_year = #{year}) AS schoolTableWithUniqueRows";
	
	String collegeRows = "o_region, o_area, o_year, sbid, "
			+ "o_name_tipo, o_count_category_a, "
			+ "o_count_category_b, o_count_category_c, "
			+ "o_count_magistrate, o_count_doctor_engineering, "
			+ "o_count_category_d, o_count_education_higher, "
			+ "o_count_general_secondary_education, "
			+ "o_count_education_colleges, "
			+ "o_count_released_students, "
			+ "o_count_accepted_students, " 
			+ "o_count_graduates, " 
			+ "o_count_design_capacity, "
			+ "o_count_teachers";
	
	String collegeRowsWithPseudonyms  = "o_region AS region, o_area AS area, o_year AS year, sbid, "
			+ "o_name_tipo AS name, o_count_category_a AS firstCategory, "
			+ "o_count_category_b AS secondCategory, o_count_category_c AS highestCategory, "
			+ "o_count_magistrate AS magistracy, o_count_doctor_engineering AS doctorOfTechnicalSciences, "
			+ "o_count_category_d AS withoutCategory, o_count_education_higher AS withHighEducation, "
			+ "o_count_general_secondary_education AS withGeneralSecondaryEducation, "
			+ "o_count_education_colleges AS withCollegeEducation, "
			+ "o_count_released_students AS numberOfReleasedStudents, "
			+ "o_count_accepted_students AS numberOfAcceptedStudents, " 
			+ "o_count_graduates AS numberOfGraduates, " 
			+ "o_count_design_capacity AS numberOfDesignCapacity, "
			+ "o_count_teachers AS numberOfPersonnel";
	
	String schoolRows = "o_region AS region, o_area AS area, o_year AS year, o_rural_district AS district, "
			+ "o_firstname AS firstName, o_otchestvo AS patronymic, "
			+ "o_name_school AS name, o_school_address AS address, o_year_b AS yearOfConstruction, " 
			+ "o_working_hours AS workingTimeFrom, o_working_hours_a AS workingTimeTo, "
			+ "o_contact_number AS contactNumber, o_integer AS numberOfPlacesInSchool, o_lastname AS surname, "
			+ "o_number_students AS numberOfStudents, o_count_teachers AS numberOfTeachers, "
			+ "o_count_graduates AS numberOfGraduates, o_count_participants_unt AS participantsENT, "
			+ "o_count_gold_medal AS withGoldenMedal, "
			+ "o_count_certificate_distinction AS withCertificateDistinction, o_count_the_lowest_rating AS withTheLowestRating, "
			+ "o_count_unsatisfactory_evaluation AS withUnsatisfactoryRating";
	
	String schoolTeacherRows = "sbid, o_region AS region, o_area AS area, o_year AS year, o_rural_district AS district, "
			+ "o_name_school AS nameOfSchool, "
			+ "o_count_category_a AS firstCategory, o_count_category_b AS secondCategory, o_count_category_c AS highestCategory, "
			+ "o_count_category_d AS withoutCategory, "
			+ "o_count_age_a AS before25, o_count_age_b AS from25to34, o_count_age_c AS from35to44, "
			+ "o_count_age_d AS from45to54, o_count_age_e AS from55to64, o_count_age_f AS after65, "
			+ "o_count_education_higher AS withHighEducation, o_general_secondary_education AS withSecondaryEducation, "
			+ "o_count_education_colleges AS withCollegeEducationInteger, "
			+ "o_count_teachers AS numberOfTeachers";
	
	String preschoolTeacherRows = "sbid, o_name_ddo AS name, o_area AS area, o_region AS region, o_year AS year, o_rural_district AS district, "
			+ "o_age AS before30, o_age_a AS from30to39, o_age_b AS from40to49, o_age_c AS from50to59, o_age_d AS after59, "
			+ "o_education AS withHighEducation, o_education_a AS withCollegeEducation, o_experience AS before5, "
			+ "o_experience_a AS from5to10, o_experience_b AS from10to15, o_experience_c AS after15, "
			+ "o_number_frames AS numberOfTeachers";
	
//	Methods for preschool organizations statistics
	
	@Select(selectPreschoolRows + " WHERE o_year = #{year} GROUP BY o_region, o_area, o_year ORDER BY o_region")
	public List<PreschoolOrganizationsInfo> getPreschoolsByYear(String year);
	
	@Select(selectPreschoolRows + " WHERE o_year = #{year} AND o_region = #{region} "
			+ "GROUP BY o_region, o_area, o_year ORDER BY o_region")
	public List<PreschoolOrganizationsInfo> getPreschoolsByYearAndRegion(String year, String region);
	
	@Select("SELECT o_area AS area, o_region AS region, o_year AS year, o_rural_district AS district, "
			+ "o_numer_children AS numberOfChildren, "
			+ "o_number_packages AS numberOfPlaces, o_number_waiting_lists AS numberOfWaiters, "
			+ "o_number_frames AS numberOfPersonnel "
			+ "FROM edu_ddo WHERE o_year = #{year} AND o_rural_district = #{district} "
			+ "ORDER BY o_region")
	public List<PreschoolOrganizationsInfo> getPreschoolsByYearAndDistrict(String year, String district);

	@Select("SELECT o_area AS area, o_region AS region, o_year AS year, o_rural_district AS district, "
			+ "o_numer_children AS numberOfChildren, "
			+ "o_number_packages AS numberOfPlaces, "
			+ "o_name_ddo AS kindergarten, o_number_waiting_lists AS numberOfWaiters, "
			+ "o_number_frames AS numberOfPersonnel "
			+ "FROM edu_ddo WHERE o_year = #{year} AND o_name_ddo = #{kindergarten} "
			+ "ORDER BY o_region")
	public List<PreschoolOrganizationsInfo> getPreschoolsByYearAndKindergarten(String year, String kindergarten);
	
	@Select("SELECT DISTINCT o_rural_district FROM edu_ddo WHERE o_region = #{region} AND o_year = #{year} "
			+ "ORDER BY o_rural_district")
	public List<String> getDistrictsByYearAndRegion(String year, String region);
	
	@Select("SELECT DISTINCT o_name_ddo FROM edu_ddo WHERE o_rural_district = #{district} AND o_year = #{year} "
			+ "ORDER BY o_name_ddo")
	public List<String> getKindergartensByYearAndDistrict(String year, String district);
	
	@Select("SELECT DISTINCT o_year FROM edu_ddo ORDER BY o_year")
	public List<String> getPreschoolYears();

//	Methods for preschool teacher statistics
	
	@Select("SELECT " + preschoolTeacherRows + " FROM edu_ddo WHERE o_year = #{year}")
	@Results(
			@Result(property = "candidates", javaType = String[].class,
		        column = "sbid", many=@Many(select = "getPreschoolCandidates"))
		    )
	public List<PreschoolTeacher> getPreschoolTeachersByYear(String year);
	
	@Select("SELECT " + preschoolTeacherRows + " FROM edu_ddo "
			+ "WHERE o_year = #{year} AND o_region = #{region}")
	@Results(
			@Result(property = "candidates", javaType = String[].class,
		        column = "sbid", many=@Many(select = "getPreschoolCandidates"))
		    )
	public List<PreschoolTeacher> getPreschoolTeachersByYearAndRegion(String year, String region);
	
	@Select("SELECT " + preschoolTeacherRows + " FROM edu_ddo "
			+ "WHERE o_year = #{year} AND o_rural_district = #{district}")
	@Results(
			@Result(property = "candidates", javaType = String[].class,
		        column = "sbid", many=@Many(select = "getPreschoolCandidates"))
		    )
	public List<PreschoolTeacher> getPreschoolTeachersByYearAndDistrict(String year, String district);
	
	@Select("SELECT " + preschoolTeacherRows + " FROM edu_ddo "
			+ "WHERE o_year = #{year} AND o_name_ddo = #{name}")
	@Results(
			@Result(property = "candidates", javaType = String[].class,
		        column = "sbid", many=@Many(select = "getPreschoolCandidates"))
		    )
	public List<PreschoolTeacher> getPreschoolTeachersByYearAndNameOfPreschool(String year, String name);
	
	@Select("SELECT candidat FROM edu_ddo_table WHERE sbid = #{sbid}")
	public String getPreschoolCandidates(String sbid);
	
//	Methods for school statistics
	
//	@Select("SELECT o_region AS region, o_area AS area, o_year AS year, SUM(o_count_teachers) AS numberOfTeachers, "
//			+ "COUNT(o_name_school) AS numberOfSchools, SUM(o_integer) AS numberOfPlacesInSchool, "
//			+ "SUM(o_number_students) AS numberOfStudents "
//			+ "FROM " + schoolTableWithUniqueRows + " GROUP BY o_region, o_year, o_area "
//			+ "ORDER BY o_region")
//	public List<SchoolsInfo> getSchoolsInfoByYear(String year);

	@Select("SELECT DISTINCT  " + schoolRows + " "
			+ "FROM " + schoolTableWithUniqueRows + " WHERE o_year = #{year} AND o_region = #{region}"
			+ "ORDER BY o_rural_district, o_name_school")
	public List<School> getSchoolsByYearAndRegion(String year, String region);
	
	@Select("SELECT DISTINCT  " + schoolRows + " "
			+ "FROM " + schoolTableWithUniqueRows + " "
			+ "WHERE o_year = #{year} AND o_name_school = #{name}")
	public List<School> getSchoolsByYearAndName(String year, String name);
	
	@Select("SELECT DISTINCT  " + schoolRows + " "
			+ "FROM " + schoolTableWithUniqueRows + " "
			+ "WHERE o_year = #{year} AND o_rural_district = #{district}")
	public List<School> getSchoolsByYearAndDistrict(String year, String district);
	
	@Select("SELECT DISTINCT  " + schoolRows + " "
			+ "FROM " + schoolTableWithUniqueRows + " WHERE o_year = #{year}"
			+ "ORDER BY o_region, o_rural_district, o_name_school")
	public List<School> getSchoolsByYear(String year);
	
	@Select("SELECT DISTINCT o_year FROM edu_school WHERE o_year != ''")
	public List<String> getSchoolYears();
	
//	Methods for school teachers statistics	
	
	@Select("SELECT DISTINCT  " + schoolTeacherRows + " "
			+ "FROM " + schoolTableWithUniqueRows + " WHERE o_year = #{year} AND o_region = #{region}"
			+ "ORDER BY o_rural_district, o_name_school")
	@Results(
			@Result(property = "candidates", javaType = String[].class,
		        column = "sbid", many=@Many(select = "getSchoolCandidates"))
		    )
	public List<SchoolTeacher> getSchoolTeachersByYearAndRegion(String year, String region);
	
	@Select("SELECT DISTINCT  " + schoolTeacherRows + " "
			+ "FROM " + schoolTableWithUniqueRows + " "
			+ "WHERE o_year = #{year} AND o_name_school = #{name}")
	@Results(
			@Result(property = "candidates", javaType = String[].class,
		        column = "sbid", many=@Many(select = "getSchoolCandidates"))
		    )
	public List<SchoolTeacher> getSchoolTeachersByYearAndNameOfSchool(String year, String name);
	
	@Select("SELECT DISTINCT  " + schoolTeacherRows + " "
			+ "FROM " + schoolTableWithUniqueRows + " "
			+ "WHERE o_year = #{year} AND o_rural_district = #{district}")
	@Results(
			@Result(property = "candidates", javaType = String[].class,
		        column = "sbid", many=@Many(select = "getSchoolCandidates"))
		    )
	public List<SchoolTeacher> getSchoolTeachersByYearAndDistrict(String year, String district);
	
	@Select("SELECT DISTINCT  " + schoolTeacherRows + " "
			+ "FROM " + schoolTableWithUniqueRows + " WHERE o_year = #{year}"
			+ "ORDER BY o_region, o_rural_district, o_name_school")
	@Results(
			@Result(property = "candidates", javaType = String[].class,
		        column = "sbid", many=@Many(select = "getSchoolCandidates"))
		    )
	public List<SchoolTeacher> getSchoolTeachersByYear(String year);
	
	@Select("SELECT candidat FROM edu_school_table WHERE sbid = #{sbid}")
	public String getSchoolCandidates(String sbid);
	
//	Methods for technical and professional education statistics
	
//	@Select("SELECT o_region AS region, o_area AS area, o_year AS year, "
//			+ "SUM(o_count_teachers) AS numberOfPersonnel, "
//			+ "SUM(o_count_accepted_students) AS numberOfAcceptedStudents, "
//			+ "SUM(o_count_graduates) AS numberOfGraduates, "
//			+ "SUM(o_count_design_capacity) AS numberOfDesignCapacity, "
//			+ ""
//			+ "(SELECT COUNT(e2.candidat) FROM edu_college e, edu_college_table e2 "
//			+ "WHERE e.o_region = e3.o_region AND e.sbid = e2.sbid "
//			+ "ANd e.o_year = #{year}) AS needForPersonnel "
//			+ ""
//			+ "FROM edu_college e3 WHERE o_year=#{year} "
//			+ "GROUP BY o_region, o_area, o_year ORDER BY o_region")
//	public List<TechAndProEducation> getCollegesInfoByYear(String year);

	@Select("SELECT DISTINCT o_year FROM edu_college")
	public List<String> getCollegesYears();
	
	@Select("SELECT " + collegeRowsWithPseudonyms + ", "
			+ "(SELECT COUNT(e2.candidat) FROM edu_college e, edu_college_table e2 "
			+ "WHERE e.sbid = e3.sbid AND e.sbid = e2.sbid "
			+ "AND e.o_year = #{year}) AS needForPersonnel "
			+ "FROM edu_college e3 "
			+ "WHERE o_region = #{region} AND o_year = #{year} "
			+ "GROUP BY " + collegeRows + " "
			+ "ORDER BY o_name_tipo")
	public List<College> getCollegesByYearAndRegion(String year, String region);

	@Select("SELECT " + collegeRowsWithPseudonyms + ", "
			+ "(SELECT COUNT(e2.candidat) FROM edu_college e, edu_college_table e2 "
			+ "WHERE e.sbid = e3.sbid AND e.sbid = e2.sbid "
			+ "AND e.o_year = #{year}) AS needForPersonnel "
			+ "FROM edu_college e3 "
			+ "WHERE o_year = #{year} "
			+ "GROUP BY " + collegeRows + " "
			+ "ORDER BY o_region, o_name_tipo")
	public List<College> getCollegesByYear(String year);
	
	@Select("SELECT " + collegeRowsWithPseudonyms + ", "
			+ "(SELECT COUNT(e2.candidat) FROM edu_college e, edu_college_table e2 "
			+ "WHERE e.sbid = e3.sbid AND e.sbid = e2.sbid "
			+ "AND e.o_year = #{year}) AS needForPersonnel "
			+ "FROM edu_college e3 "
			+ "WHERE o_name_tipo = #{name} AND o_year = #{year} "
			+ "GROUP BY " + collegeRows)
	public List<College> getCollegesByYearAndName(String year, String name);
	
}
