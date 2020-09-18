package com.example.iasback.repository;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface DictionaryMapper {

    @Select("select data from dictionary where 1=1")
    String getDictionary();

    @Select("update dictionary set data = #{data}::jsonb where 1=1 returning data")
    @Options(flushCache = Options.FlushCachePolicy.TRUE)
    String updateDictionaryMapper( @Param("data") String data);

}
