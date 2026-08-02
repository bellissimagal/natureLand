//package com.natureland.automation.utils;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class WaitUtils {
//
//    private final WebDriverWait wait;
//
//    public WaitUtils(WebDriver driver) {
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//    }
//
//    public void waitForVisibility(WebElement element) {
//
//        wait.until(
//                ExpectedConditions.visibilityOf(element)
//        );
//
//    }
//
//    public void waitForClickable(WebElement element) {
//
//        wait.until(
//                ExpectedConditions.elementToBeClickable(element)
//        );
//
//    }
//
//}


package com.natureland.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitForVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}