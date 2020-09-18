package com.example.iasback.repository;

import com.example.iasback.models.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper {


    @Select("select * from category")
    public List<Category> getCategories();

    @Select("select id from category where name =#{name}")
    public Integer getCategoryById(@Param("name") String name);



}
