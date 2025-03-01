package com.automation.test;

import org.testng.annotations.*;

public class CartTest extends BaseTest{


    @Test(groups = {"Smoke", "Shyam"}, priority = 4)
    public void verifyProductisAdded() {
        System.out.println("Test4 - verify Product is added");
    }

    @Test(priority = 5)
    public void verifyUProductisRemoved() {
        System.out.println("Test5 - verify Product is removed");
    }

    @Test(groups = {"Smoke", "Vold"}, priority = 6)
    public void verifyUserCanSeeOnCartPage() {
        System.out.println("Test6 - verify User Can See On Cart Page");
    }

}
