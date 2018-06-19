package com.oracle.scc.demo.dao;

import com.oracle.scc.demo.mapper.UserMapper;
import com.oracle.scc.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    private UserMapper _userMapper;

    @Autowired
    public UserDao(UserMapper userMapper) {
        this._userMapper = userMapper;
    }

    public List<User> getAll() {
        return _userMapper.getAll();
    }

    }
