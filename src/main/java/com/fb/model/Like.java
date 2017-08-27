package com.fb.model;

import java.util.Date;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
public class Like {
    private int Like_id ; //点赞id
    private int user_id ; //外键关联用户id
    private int topic_id ; //外键关联广播id
    private Date like_postTime ; //点赞日期

    public int getLike_id() {
        return Like_id;
    }

    public void setLike_id(int like_id) {
        Like_id = like_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public Date getLike_postTime() {
        return like_postTime;
    }

    public void setLike_postTime(Date like_postTime) {
        this.like_postTime = like_postTime;
    }
}
