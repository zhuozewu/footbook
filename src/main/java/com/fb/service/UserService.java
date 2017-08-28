package com.fb.service;

import com.fb.model.User;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
public interface UserService {
    void addUser(User user);

    User findByLoginNameAndPassword(String name, String password);
}
