package com.fb.controller;

import com.fb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
@Controller
public class UserController {


    @RequestMapping(value = "/user" ,method = RequestMethod.POST)
    public String addUser(User user, HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");;
        System.out.println(request.getParameter("user_name"));
        System.out.println(user);
        return "user/success" ;
    }

    /*
	 * 注册
	 */
    @RequestMapping("/register")
    public String register(Map<String,Object> map){
        map.put("user", new User());
        return "user/register";
    }
}
