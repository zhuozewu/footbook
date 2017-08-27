package com.fb.model;

import java.util.Date;

/**
 * Created by 匆匆の过客 on 2017/8/27.
 * 邮箱：1426654078@qq.com
 */
public class Collection {
    private int collection_id ; //收藏id
    private int user_id ;  //外键关联用户id
    private int topic_id ; //外键关联广播id
    private Date collection_postTime ; //广播收藏时间
}
