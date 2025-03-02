package com.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;

//    String browser = "safari";

//    @Parameters("browser")
    @BeforeTest     // - before @Test Tag
//    @BeforeClass  // - before each class
//    @BeforeMethod // - before each method
    public void setUp() {
        driver = new ChromeDriver();

        System.out.println("Opening " );
    }

//    @Parameters("browser")
    @AfterTest
//    @AfterMethod
    public void cleanUp() {
//        driver.quit();
        System.out.println("Closing " );
    }


}
