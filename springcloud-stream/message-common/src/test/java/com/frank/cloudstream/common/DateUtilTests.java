package com.frank.cloudstream.common;


import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.frank.cloudstream.common.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by Frank on 2018-1-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DateUtil.class)
public class DateUtilTests {

    public static final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void test1() {
        String dataStr = "2018-01-02T09:00:59.4841364+08:00";
        System.out.println(DateUtil.preProcess(dataStr));
    }

    @Test
    public void test2() {
        String dataStr = "2018-01-02T19:31:52.404";
        System.out.println(DateUtil.preProcess(dataStr));
    }

    @Test
    public void test3() {
        String dataStr = "2018-01-02T19:31:52.4";
        System.out.println(DateUtil.preProcess(dataStr));
    }

    @Test
    public void test4() {
        Long t1 = 1L;
        Long t2 = 1L;
        if (t1 == t2) {
            System.out.println("==");
        }
        if (t1.equals(t1)) {
            System.out.println("equals");
        }
    }


    @Test
    public void test6() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "A");
        System.out.println(map.toString());

    }

    @Test
    public void test7() {
        String tmp = "aaa\\dddd";
        JSONObject jsonObject = JSONObject.parseObject(tmp);
        System.out.println(jsonObject);
    }
}
