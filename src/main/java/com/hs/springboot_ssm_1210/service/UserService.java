package com.hs.springboot_ssm_1210.service;


import com.hs.springboot_ssm_1210.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User findById(int id);

    public User login(String name, String password);

    public boolean save(User user);

    public boolean deleteById(int id);

    public boolean update(User user);

}
