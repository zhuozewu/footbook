package com.fb.service.impl;

import com.fb.dao.UserMapper;
import com.fb.model.User;
import com.fb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper ;

    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
