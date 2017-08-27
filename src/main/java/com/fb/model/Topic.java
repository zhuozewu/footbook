package com.fb.model;

import java.util.Date;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
public class Topic {

    private int topic_id ;  //广播id
    private int user_id ;  //外键 关联用户id
    private Date topic_postTime ;  //广播发表日期
    private String topic_content ;  //广播内容
    private int topic_replyCount ;  //广播评论数
    private String picUrl ;   //广播图片链接（暂未开放）
    private int like_count ;


    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getTopic_postTime() {
        return topic_postTime;
    }

    public void setTopic_postTime(Date topic_postTime) {
        this.topic_postTime = topic_postTime;
    }

    public String getTopic_content() {
        return topic_content;
    }

    public void setTopic_content(String topic_content) {
        this.topic_content = topic_content;
    }

    public int getTopic_replyCount() {
        return topic_replyCount;
    }

    public void setTopic_replyCount(int topic_replyCount) {
        this.topic_replyCount = topic_replyCount;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }
}
