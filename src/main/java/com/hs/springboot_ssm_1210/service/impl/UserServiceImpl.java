package com.hs.springboot_ssm_1210.service.impl;


import com.hs.springboot_ssm_1210.dao.UserDao;
import com.hs.springboot_ssm_1210.pojo.User;
import com.hs.springboot_ssm_1210.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public User login(String name, String password) {
        return userDao.login(name,password);
    }

    @Override
    public boolean save(User user) {
        return userDao.save(user);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }
}
