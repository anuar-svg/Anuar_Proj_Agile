package com.example.iasback.repository;

import com.example.iasback.models.Source;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SourceMapper {


    @Select("select * from source")
    public List<Source> getSources();



}
