//package com.example.opencart.tests;
//
//import com.example.opencart.utils.Config;
//import com.example.opencart.utils.WebDriverFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class UITest {
//
//    private WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        driver = WebDriverFactory.getDriver();
//        driver.get(Config.BASE_URL);
//    }
//
//    @Test
//    public void testHomePage() {
//        // Add UI tests for the home page
//        // Example: driver.findElement(By.id(\"elementId\")).click();
//    }
//
//    @Test
//    public void testProductPage() {
//        // Add UI tests for product pages
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        WebDriverFactory.quitDriver();
//    }
//}