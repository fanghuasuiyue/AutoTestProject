package com.couse.testNg.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuitConfig {

    @BeforeSuite
    public void befortSuit(){
        System.out.println("befort suit Y运行了");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suit 运行了");
    }

    @BeforeTest
    public void befortTest(){
        System.out.println("befort Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after Test");
    }
}
