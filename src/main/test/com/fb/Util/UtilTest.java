package com.fb.Util;

import org.junit.Test;

import java.util.Date;

/**
 * Created by 匆匆の过客 on 2017/8/28.
 * 邮箱：1426654078@qq.com
 */
public class UtilTest {

    @Test
    public void parse() throws Exception {
        Date date = DateUtil.getDate("2015","3","5");
        System.out.println(date);
    }
}