package com.example.iasback.repository;

import com.example.iasback.models.MenuItem;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MenuItemMapper {

    @Select("select * from menu_item where parent_id is null order by id")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "children", javaType = List.class, column = "id", one = @One(select = "findItemById"))
    })
    public List<MenuItem> getMenuItems();


    @Select("select * from menu_item where parent_id = #{parent_id}")
    public MenuItem findItemById(@Param("parent_id") Integer parent_id);

    @Select("insert into menu_item ( icon, title, path, src, parent_id ) values ( #{icon}, #{title}, #{path}, #{src}, #{parent_id} ) " +
            "returning id, icon, title, path, src, parent_id")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public MenuItem createMenuItem(MenuItem menuItem);



    @Select("update menu_item set icon=#{icon}, title=#{title}, path=#{path}, src=#{src}, parent_id=#{parent_id} where id = #{id} returning *")
    @Options(flushCache = Options.FlushCachePolicy.TRUE)
    MenuItem editMenuItem(MenuItem menuItem);



}
