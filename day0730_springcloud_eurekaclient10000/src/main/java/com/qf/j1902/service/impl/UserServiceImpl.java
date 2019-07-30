package com.qf.j1902.service.impl;


import com.qf.j1902.mapper.UserMapper;
import com.qf.j1902.pojo.User;
import com.qf.j1902.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/7/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUsersByName(String name) {
        return  userMapper.getUsersByName(name);
    }

    @Override
    public ArrayList<User> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public boolean delUser(int id) {
        return userMapper.delUser(id);
    }
}
