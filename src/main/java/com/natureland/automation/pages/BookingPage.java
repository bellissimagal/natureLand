//package com.natureland.automation.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class BookingPage {
//
//    private WebDriver driver;
//
//    public BookingPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    // Empty calendar slot
//    private By emptySlot =
//            By.xpath("//td[contains(@class,'emptySlot')]");
//
//    public void clickEmptySlot() {
//        driver.findElement(emptySlot).click();
//    }
//}

package com.natureland.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookingPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    private By emptySlot =
            By.xpath("//td[contains(@class,'emptySlot')]");

    public void clickEmptySlot() {

        wait.until(ExpectedConditions.elementToBeClickable(emptySlot));

        driver.findElement(emptySlot).click();

    }
}