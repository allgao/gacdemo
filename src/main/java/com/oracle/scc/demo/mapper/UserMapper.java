package com.oracle.scc.demo.mapper;

import com.oracle.scc.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM T_USER")
    @Results({
            @Result(property = "id", column = "ID"),
            @Result(property = "mobilePhone", column = "MOBILE_PHONE"),
            @Result(property = "userName", column = "USER_NAME"),
            @Result(property = "password", column = "PASSWORD")
    })
    List<User> getAll();

}
