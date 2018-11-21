package com.couse.testNg.multiThread;

import org.testng.annotations.Test;

/**
 * 多线程控制，使用注解的方式进行注解
 * 测试方法采用线程池的方式，提测测试代码执行的效率
 */


public class MultiThreadOnAnnotion {

    //@Test(invocationCount = 10)
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
