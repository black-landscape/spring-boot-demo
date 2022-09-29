package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.List;

public interface UserMapper {
    User findByName(@Param("name") String name);

    int insert(@Param("name") String name, @Param("age") Integer age);


    void update(User user);

    void delete(Long id);

    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    List<User> findAll();
}
