package com.example.iasback.repository;

import com.example.iasback.models.Event;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EventMapper {


    @Select("select * from event where deleted = false")
    public List<Event> getEvents();



    @Select("insert into event ( name, start, \"end\", completed, description) values ( #{name}, #{end}, #{end}, #{completed}, #{description} ) " +
            "returning id, name, start, \"end\", completed, description")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public Event createEvent(Event event);



    @Select("update event set name=#{name}, start=#{end}, \"end\"=#{end}, completed=#{completed}, description=#{description}, deleted = #{deleted}  where id = #{id} returning *")
    @Options(flushCache = Options.FlushCachePolicy.TRUE)
    Event editEvent(Event event);
}
