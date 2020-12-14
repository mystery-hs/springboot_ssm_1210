package com.hs.springboot_ssm_1210.test;

import com.hs.springboot_ssm_1210.pojo.User;
import com.hs.springboot_ssm_1210.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestUser {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        List<User> list = userService.findAll();
        for (User user:list){
            System.out.println(user);
        }
    }
}
