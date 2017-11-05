package com.waverleysoftware.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void beforeMethod() {
        System.out.println("BaseTest: before class");
    }

    @AfterClass
    public void afterMethod() {
        System.out.println("BaseTest: after class");
    }
}
