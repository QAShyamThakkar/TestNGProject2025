package com.automation.test;

import org.testng.annotations.*;

public class ProductDetailsTest {

//    @BeforeClass
    @BeforeMethod
    public void setUp(){
        System.out.println( "Opening Chrome");
    }

//    @AfterClass
    @AfterMethod
    public void cleanUp(){
        System.out.println("Closing chrome");
    }

    @Test (groups = "Smoke", priority = 7)
    public void verifyPriceonProductDetailPage(){
        System.out.println("Test7 - Verify Price on Product Detail Page");
    }

    @Test (priority = 8)
    public void verifyinfoonProductDetailPage(){
        System.out.println("Test8 - Verify Info on Product Detail Page");
    }
}
