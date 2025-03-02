package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class zSoftAssertions {

    @Test
    public void SoftAssertionsEg(){
        int expected = 50;
        int actual = 20;

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual,expected, "Values are not same");

        System.out.println(expected==actual);
        System.out.println("Have a good day!!");

        softAssert.assertAll();



    }
}
