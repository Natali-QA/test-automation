package com.waverleysoftware.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthorizationTests extends BaseTest {

    @BeforeMethod
    public void beforeEachMethod() {
        System.out.println("AuthorizationTests: before method");
    }

    @AfterMethod
    public void afterEachMethod() {
        System.out.println("AuthorizationTests: after method");
    }

    @Test
    public void userShoulbBeAuthorizedWithValidCredentials() {
        System.out.println("User is authorized");
    }

    @Test
    public void userShoulbBeAuthorizedWithInvalidCredentials() {
        System.out.println("User isn't authorized");
    }

    @Test
    public void userShoulbBeAuthorizedWithInvalidName() {
        System.out.println("User isn't authorized. Name is invalid.");
    }

    @Test
    public void userShoulbBeAuthorizedWithInvalidPassword() {
        System.out.println("User isn't authorized. Password is invalid.");
    }
}
