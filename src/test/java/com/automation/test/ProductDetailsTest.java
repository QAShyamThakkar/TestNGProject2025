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

    @Test
    public void verifyPriceonProductDetailPage(){
        System.out.println("Verify Price on Product Detail Page");
    }

    @Test
    public void verifyinfoonProductDetailPage(){
        System.out.println("Verify Info on Product Detail Page");
    }
}
