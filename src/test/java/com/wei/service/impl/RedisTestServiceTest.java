package com.wei.service.impl;

import com.wei.baseTest.SpringTestCase;
import com.wei.service.RedisTestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedisTestServiceTest extends SpringTestCase {

//    @Autowired
//    private RedisTestService redisTestService;
//
//    @Test
//    public void getTimestampTest() throws InterruptedException {
//        System.out.println("第一次调用：" + redisTestService.getTimestamp("param"));
//        Thread.sleep(2000);
//        System.out.println("2秒之后调用：" + redisTestService.getTimestamp("param"));
//        Thread.sleep(11000);
//        System.out.println("再过11秒之后调用：" + redisTestService.getTimestamp("param"));
//    }


    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:*.xml");
        RedisTestService redisTestService = (RedisTestService) ac.getBean("redisTestService");
        System.out.println("第一次调用：" + redisTestService.getTimestamp("param"));
        Thread.sleep(2000);
        System.out.println("2秒之后调用：" + redisTestService.getTimestamp("param"));
        Thread.sleep(11000);
        System.out.println("再过11秒之后调用：" + redisTestService.getTimestamp("param"));
    }
}