package com.example.iasback.repository;
import com.example.iasback.models.Region;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RegionMapper {



    @Select("select * from region")
    public List<Region> getRegions();

}
