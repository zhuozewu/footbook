package com.fb.model;

import java.util.Date;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
public class User {
    private int user_id;  //用户id
    private String user_name ; //用户账号
    private String user_nick ;  //用户昵称
    private Date user_birthday ; //用户生日
    private String  user_sex ;  //用户性别
    private String user_hometown ; //用户家乡
    private String user_location ;  //用户所在地
    private String user_password ;  //用户密码
    private String user_phone ;  //用户手机号
    private int topicNum ;    //用户广播数
    private int user_listenInNum ;  //用户收听数
    private int user_listenNum ;  //用户听众数
    private Date user_loginTime ;  //时间用户注册
    private String user_introduction ;  //用户个人介绍

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_nick() {
        return user_nick;
    }

    public void setUser_nick(String user_nick) {
        this.user_nick = user_nick;
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_hometown() {
        return user_hometown;
    }

    public void setUser_hometown(String user_hometown) {
        this.user_hometown = user_hometown;
    }

    public String getUser_location() {
        return user_location;
    }

    public void setUser_location(String user_location) {
        this.user_location = user_location;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public int getTopicNum() {
        return topicNum;
    }

    public void setTopicNum(int topicNum) {
        this.topicNum = topicNum;
    }

    public int getUser_listenInNum() {
        return user_listenInNum;
    }

    public void setUser_listenInNum(int user_listenInNum) {
        this.user_listenInNum = user_listenInNum;
    }

    public int getUser_listenNum() {
        return user_listenNum;
    }

    public void setUser_listenNum(int user_listenNum) {
        this.user_listenNum = user_listenNum;
    }

    public Date getUser_loginTime() {
        return user_loginTime;
    }

    public void setUser_loginTime(Date user_loginTime) {
        this.user_loginTime = user_loginTime;
    }

    public String getUser_introduction() {
        return user_introduction;
    }

    public void setUser_introduction(String user_introduction) {
        this.user_introduction = user_introduction;
    }
}
