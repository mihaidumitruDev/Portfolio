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
//        // Example: driver.findElement(By.id(\
//elementId\)).click();
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
// UITest.java

package com.example.opencart.tests;

import com.example.opencart.utils.Config;
import com.example.opencart.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class UITest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver();
        driver.get(Config.BASE_URL);
    }

    @Test
    public void testHomePageTitle() {
        String expectedTitle = "OpenCart - Open Source Shopping Cart Solution";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle, "Home page title doesn't match.");
    }

    @Test
    public void testLogin() {
        // Navigate to the login page
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        // Enter login credentials
        WebElement usernameInput = driver.findElement(By.id("input-email"));
        WebElement passwordInput = driver.findElement(By.id("input-password"));
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Login']"));

        usernameInput.sendKeys("your_username");
        passwordInput.sendKeys("your_password");
        loginButton.click();

        // Verify login success
        WebElement accountDropdown = driver.findElement(By.cssSelector(".dropdown-toggle [class='hidden-xs hidden-sm']"));
        assertTrue(accountDropdown.isDisplayed(), "Login failed.");

        // Log out (optional)
        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
        logoutLink.click();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverFactory.quitDriver();
    }
}