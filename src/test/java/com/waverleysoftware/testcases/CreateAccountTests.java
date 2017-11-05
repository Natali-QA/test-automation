package com.waverleysoftware.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests  extends BaseTest {

    @BeforeMethod
    public void beforeEachMethod() {
        System.out.println("CreateAccountTests: before method");
    }

    @AfterMethod
    public void afterEachMethod() {
        System.out.println("CreateAccountTests: after method");
    }

    @Test
    public void accountShoulbBeCreatedWithValidCredentials() {
        System.out.println("Account is created");
    }

    @Test
    public void accountShoulbBeCreatedWithInvalidCredentials() {
        System.out.println("Account isn't created");
    }

    @Test
    public void userShoulbBeAuthorizedWithInvalidName() {
        System.out.println("Account isn't created. Name is invalid.");
    }

    @Test
    public void userShoulbBeAuthorizedWithInvalidPassword() {
        System.out.println("Account isn't created.  Password is invalid.");
    }
}
