package com.hs.springboot_ssm_1210.dao;


import com.hs.springboot_ssm_1210.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    @Select("select * from users")
    public List<User> findAll();

    @Select("select * from users where id=#{id}")
    public User findById(int id);

    @Select("select * from users where name=#{name} and password=#{password}")
    public User login(@Param("name") String name, @Param("password") String password);

    @Insert("insert into users(name,password) values(#{name},#{password})")
    public boolean save(User user);

    @Delete("delete from users where id=#{id}")
    public boolean deleteById(int id);

    @Update("update set name=#{name}, password=#{password} where id=#{id}")
    public boolean update(User user);

}
