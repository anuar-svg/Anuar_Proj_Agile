package com.example.iasback.repository;

import com.example.iasback.models.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SocialObjectMapper {



    @Select("select * from full_social_objects")
     List<FullSocialObjects> fullSocObj();



    @Select("update full_social_objects set id=#{id}, sbid=#{sbid}, " +
            "o_name=#{o_name}," +
//            "o_industry=#{o_industry}," +
            "o_gategory=#{o_gategory}," +
            "o_year_start=#{o_year_start}," +
//            "o_status_project=#{o_status_project}," +
            "o_year_end=#{o_year_end}," +
//            "o_power=#{o_power}," +
            "o_unit=#{o_unit}," +
//            "o_numer_objects=#{o_numer_objects}," +
//            "o_budget_program=#{o_budget_program}," +
//            "o_customer=#{o_customer}," +
//            "o_contractor=#{o_contractor}," +
//            "o_region=#{o_region}," +
            "o_rural_district=#{o_rural_district}," +
            "o_rural_settlement=#{o_rural_settlement}," +
            "o_latitude=#{o_latitude}," +
            "o_longitude=#{o_longitude}," +
//            "o_number_population=#{o_number_population}," +
//            "o_number_women=#{o_number_women}," +
//            "o_number_man=#{o_number_man}," +
//            "o_numer_children=#{o_numer_children}," +
            "o_total_project_cost=#{o_total_project_cost}," +
//            "o_unit_project=#{o_unit_project}," +
//            "test_pole=#{test_pole}," +
            "snid2=#{snid2}," +
//            "source=#{source}," +
            "category_type=#{category_type}," +
            "source_type=#{source_type}," +
            "region_type=#{region_type}" +
            "  where id = #{id} returning *")
    @Options(flushCache = Options.FlushCachePolicy.TRUE)
    FullSocialObjects editEvent(FullSocialObjects fullSocialObjects);





}
