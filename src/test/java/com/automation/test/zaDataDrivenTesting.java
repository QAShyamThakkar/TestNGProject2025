package com.automation.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class zaDataDrivenTesting {

    @Test (dataProvider = "InvalidAmount")
    public void validAmount1(Object amount) {
        System.out.println("Amount validated with " + amount);
    }

   @DataProvider (name = "ValidAmount")
    public  Object[] getData(){
        Object[] listOfAmount = {1,40,6000, 5999, 2};
        return listOfAmount;
    }

    @DataProvider (name = "InvalidAmount")
    public  Object[] getDataInvalidAmount(){
        Object[] listOfAmount = {-10,0,6001};
        return listOfAmount;
    }

//    @Test
//    public void validAmount2() {
//        System.out.println("Amount validated with " + 40);
//    }
//
//    @Test
//    public void validAmount3() {
//        System.out.println("Amount validated with " + 6000);
//    }
//
//    @Test
//    public void validAmount4() {
//        System.out.println("Amount validated with " + 5999);
//    }
//
//    @Test
//    public void validAmount5() {
//        System.out.println("Amount validated with " + 2);
//    }


}
