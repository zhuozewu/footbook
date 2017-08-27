package com.fb.model;

import java.util.Date;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
public class Reply {
    private int reply_id ; //评论id
    private int user_id ;   //外键关联用户id 评论用户id
    private int topic_id;   //外键关联广播id 如果是评论广播，则这行不为空
    private int replyed_id ; //外键关联评论id 如果是评论回复，则这行不为空
    private Date reply_postTime ; //评论时间
    private int reply_content ; //评论内容

}
