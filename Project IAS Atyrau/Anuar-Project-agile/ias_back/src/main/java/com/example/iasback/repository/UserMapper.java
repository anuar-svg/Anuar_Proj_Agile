package com.example.iasback.repository;

import com.example.iasback.models.Event;
import com.example.iasback.models.Role;
import com.example.iasback.models.User;
import org.apache.ibatis.annotations.*;


import java.time.LocalDate;
import java.util.List;

public interface UserMapper {
    @Select("select * from roles where id = #{role_id}")
    public Role findRoleById(@Param("role_id") Integer role_id);



    @Select("select * from users where username = #{username} and is_deleted=false")
    @Results(value = {
            @Result(property = "role_id", column = "role_id"),
            @Result(property = "role", javaType = Role.class, column = "role_id", one = @One(select = "findRoleById"))
    })
    public User findByUsername(@Param("username") String username);



    @Select("select * from users where id = #{id}")
    public User findById(@Param("id") Integer id);


    @Select("select * from users where iin = #{iin} and is_deleted=false")
    @Results(value = {
            @Result(property = "role_id", column = "role_id"),
            @Result(property = "role", javaType = Role.class, column = "role_id", one = @One(select = "findRoleById"))
    })
    public User findByIIN(@Param("iin") String iin);



    @Select("select * from users where is_deleted=#{bool}")
    @Results(value = {
            @Result(property = "role_id", column = "role_id"),
            @Result(property = "role", javaType = Role.class, column = "role_id", one = @One(select = "findRoleById"))
    })
    public List<User> allUsers( @Param("bool") boolean bool);



    @Select("insert into users ( username, name, surname, patronymic, email, password, role_id, iin ) values ( #{username}," +
            " #{name}, #{surname}, #{patronymic},  #{email}, #{password}, #{role_id}, #{iin} ) " +
            "returning id, username, name, surname, patronymic email, password, role_id, iin")
    @Results(value = {
            @Result(property = "role_id", column = "role_id"),
            @Result(property = "role", javaType = Role.class, column = "role_id", one = @One(select = "findRoleById"))
    })
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public User createUser(User user);



    @Select("update users set username=#{username}, name=#{name}, surname=#{surname}, patronymic = #{patronymic}, email=#{email}, password=#{password}," +
            "role_id=#{role_id} , iin =#{iin} where id = #{id} returning *")
    @Options(flushCache = Options.FlushCachePolicy.TRUE)
    @Results(value = {
            @Result(property = "role_id", column = "role_id"),
            @Result(property = "role", javaType = Role.class, column = "role_id", one = @One(select = "findRoleById"))
    })
    public User editUser(User user);




    @Update("update users set is_deleted=true where id = #{userId}")
    public Integer deleteUser(@Param("userId")Integer userId, @Param("bool")boolean bool);

    @Update("update users set is_deleted=false where id = #{userId}")
    public Integer recoveryUser(@Param("userId")Integer userId, @Param("bool")boolean bool);



    @Select("select exists(select username from users where username = #{username})")
    public Boolean existsByUsername(@Param("username") String username);

    @Select("select exists(select username from users where iin = #{iin})")
    public Boolean existsByIIN(@Param("iin") String iin);


    @Select("select exists( select role_id, count(*) count from users where role_id=1 and is_deleted = false group by role_id having count(*)<4 )")
    public Boolean checkAdminCounts();

    @Delete("delete from users where id = #{userId} returning id")
    public Integer removeUser(@Param("userId") Integer userId);





}
