package com.automation.test;

import org.testng.annotations.Test;

//TestNG - Next Generation
public class LoginTest {

 /*
 Test Case1: Verify Log in Successful

 1. User Open the Website
 2. User enter the UserName and Password
 3. User click on the Login Button
 4. Verify the user is on the Homepage
 */

    @Test
    //Positive Scenario
    public void verifyLogInIsSuccessful() {
        System.out.println("Test1- Verify Log in Successful");
    }

    @Test
    //Negative Scenario
    public void verifyLogInIsUnSuccessfulwithWrongCred() {
        System.out.println("Test2- Verify Log in Unsuccessful with Wrong Cred");
    }

    @Test
    public void verifyLogInIsUnSuccessfulwithBlankCred() {
        System.out.println("Test2- Verify Log in Unsuccessful with Blank Cred");
    }

}
