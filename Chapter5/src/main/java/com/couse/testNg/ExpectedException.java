package com.couse.testNg;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 什么时候会用到异常测试？
     * 在我们期望的结果是 一个异常的时候
     * 比如：我们传入某些不合法的参数，程序抛出了异常
     * 也就是说我的预期结果就是一个异常
     */


    //这是一个测试结果会失败的异常测试方法
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常的测试");
    }

    //这是一个测试结果会成功的异常测试方法
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){

        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();

    }
}
