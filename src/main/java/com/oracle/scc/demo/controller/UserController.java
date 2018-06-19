package com.oracle.scc.demo.controller;

import com.oracle.scc.demo.dao.UserDao;
import com.oracle.scc.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao _userDao;

    public UserController(UserDao userdao) {
        this._userDao = userdao;
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<User> getAll() {
        return _userDao.getAll();
    }
}
