package com.fb.dao;

import com.fb.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
@Component
public class UserMapperTest {


    @Test
    public void addUser() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = new User();
        user.setUser_name("李四");
        user.setUser_nick("狗蛋");
        user.setUser_password("123");
        user.setUser_birthday(new Date());
        user.setUser_loginTime(new Date());
        user.setUser_sex("男");
        userMapper.addUser(user);
    }

    @Test
    public void findByLoginNameAndPassword() throws  Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        System.out.println(userMapper.findByLoginNameAndPassword("李四","123"));
    }

}