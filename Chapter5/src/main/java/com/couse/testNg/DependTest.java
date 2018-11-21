package com.couse.testNg;

import org.testng.annotations.Test;

/**
 * 实际的应用场景：test2测试是要依赖test1做前置条件时使用
 * 依赖测试
 */


public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
