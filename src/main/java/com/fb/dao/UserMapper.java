package com.fb.dao;

import com.fb.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
@Repository
public interface UserMapper {
    void addUser(User user);

    User findByLoginNameAndPassword(String name, String password);
}
