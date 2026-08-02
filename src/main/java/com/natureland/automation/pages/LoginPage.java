//package com.natureland.automation.pages;
//
//import com.natureland.automation.utils.WaitUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class LoginPage {
//
//    private WebDriver driver;
//    private WaitUtils wait;
//
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WaitUtils(driver);
//    }
//
//    // Locators
//    private By txtUsername = By.xpath("//input[@placeholder='Enter Email']");
//
//    private By txtPassword = By.xpath("//input[@placeholder='Enter Password']");
//
//    private By btnLogin = By.xpath("//button[@type='submit' and text()='Login']");
//
//    // Actions
//
//    public void enterUsername(String username) {
//        driver.findElement(txtUsername).clear();
//        driver.findElement(txtUsername).sendKeys(username);
//    }
//
//    public void enterPassword(String password) {
//        driver.findElement(txtPassword).clear();
//        driver.findElement(txtPassword).sendKeys(password);
//    }
//
//    public void clickLogin() {
//        driver.findElement(btnLogin).click();
//    }
//
//    public void login(String username, String password) {
//
//        enterUsername(username);
//
//        enterPassword(password);
//
//        System.out.println("Please complete the reCAPTCHA manually.");
//
//        clickLogin();
//    }
//}

package com.natureland.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Locators
    private By txtUsername = By.xpath("//input[@placeholder='Enter Email']");

    private By txtPassword = By.xpath("//input[@placeholder='Enter Password']");

    private By btnLogin = By.cssSelector("button[type='submit']");

    // Enter Username
    public void enterUsername(String username) {

        WebElement usernameField =
                wait.until(ExpectedConditions.visibilityOfElementLocated(txtUsername));

        usernameField.clear();
        usernameField.sendKeys(username);
    }

    // Enter Password
    public void enterPassword(String password) {

        WebElement passwordField =
                wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword));

        passwordField.clear();
        passwordField.sendKeys(password);
    }

    // Click Login
    public void clickLogin() {

        WebElement loginButton =
                wait.until(ExpectedConditions.elementToBeClickable(btnLogin));

        loginButton.click();
    }

    // Complete Login
    public void login(String username, String password) {

        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}