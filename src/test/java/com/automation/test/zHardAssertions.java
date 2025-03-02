package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class zHardAssertions {

    @Test
    public void HardAssertionsEg(){
        int expected = 50;
        int actual = 50;

        Assert.assertEquals(actual,expected, "Values are not same");
//        Assert.assertTrue(actual==expected, "Values are not same");

        System.out.println(expected==actual);
        System.out.println("Have a good day!!");

    }
}
