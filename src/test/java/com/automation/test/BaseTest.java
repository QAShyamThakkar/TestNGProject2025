package com.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    WebDriver driver;

//    String browser = "safari";

    @Parameters("browser")
    @BeforeClass
//    @BeforeMethod
    public void setUp(String browser) {
        driver = new ChromeDriver();

        System.out.println("Opening " + browser);
    }

    @Parameters("browser")
    @AfterClass
//    @AfterMethod
    public void cleanUp(String browser) {
//        driver.quit();
        System.out.println("Closing " + browser);
    }


}
