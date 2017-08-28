package com.fb.controller;

import com.fb.Util.DateUtil;
import com.fb.model.User;
import com.fb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Map;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    private User user ;

    /*
        登陆验证
     */
    @RequestMapping("/login")
    public String login(Map<String,Object> map ,@RequestParam("name") String name,
                        @RequestParam("password") String password, HttpSession session){
        user = userService.findByLoginNameAndPassword(name, password);
        if (user == null) {
            System.out.println("用户名或密码错误");
            map.put("error",1); //这里的1代表用户名或密码错误，并返回前台
            return "user/login";
        } else {
            session.setAttribute("loginUser", user);
        }
        return "user/success" ;
    }

    /*
        注册新用户调用service层方法
     */
    @RequestMapping(value = "/user" ,method = RequestMethod.POST)
    public String addUser(User user, HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        //给user赋上所在地的值
        String location = (request.getParameter("region3")==null)?request.getParameter("region1")
                +request.getParameter("region2"):request.getParameter("region1")
                +request.getParameter("region2")+request.getParameter("region3");
        user.setUser_location(location);
        //给user赋上生日的值
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("date");
        try {
            user.setUser_birthday(DateUtil.getDate(year,month,day));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        userService.addUser(user);
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




    @RequestMapping("/toLogin")
    public String toLogin(){
        return "user/login";
    }

}
