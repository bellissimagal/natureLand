//package com.natureland.automation.tests.tests;
//
//import com.natureland.automation.base.BaseTest;
//import com.natureland.automation.pages.LoginPage;
//import com.natureland.automation.utils.ConfigReader;
//import org.testng.annotations.Test;
//
//public class LoginTest extends BaseTest {
//
//    @Test
//    public void verifyLogin() {
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.enterUsername(
//                ConfigReader.getProperty("username"));
//
//        loginPage.enterPassword(
//                ConfigReader.getProperty("password"));
//
//        System.out.println("-----------------------------------");
//        System.out.println("Complete the reCAPTCHA manually.");
//        System.out.println("Then click Login.");
//        System.out.println("-----------------------------------");
//
//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}


//package com.natureland.automation.tests.tests;
//
//import com.natureland.automation.base.BaseTest;
//import com.natureland.automation.pages.BookingPage;
//import com.natureland.automation.pages.LoginPage;
//import com.natureland.automation.utils.ConfigReader;
//import org.testng.annotations.Test;
//
//public class LoginTest extends BaseTest {
//
//    @Test
//    public void verifyLogin() {
//
//        LoginPage loginPage = new LoginPage(driver);
//        BookingPage homePage = new BookingPage(driver);
//
//        // Login
//        loginPage.enterUsername(
//                ConfigReader.getProperty("username"));
//
//        loginPage.enterPassword(
//                ConfigReader.getProperty("password"));
//
//        System.out.println("========================================");
//        System.out.println("Complete the reCAPTCHA manually.");
//        System.out.println("Click Login.");
//        System.out.println("Automation will continue in 30 seconds.");
//        System.out.println("========================================");
//
//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Click an empty slot on the calendar
//        homePage.clickEmptySlot();
//
//        System.out.println("New Booking popup opened successfully.");
//
//    }
//}

package com.natureland.automation.tests.tests;

import com.natureland.automation.base.BaseTest;
import com.natureland.automation.pages.BookingPage;
import com.natureland.automation.pages.LoginPage;
import com.natureland.automation.utils.ConfigReader;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage loginPage = new LoginPage(driver);
        BookingPage bookingPage = new BookingPage(driver);

        // Enter Username
        loginPage.enterUsername(
                ConfigReader.getProperty("username"));

        // Enter Password
        loginPage.enterPassword(
                ConfigReader.getProperty("password"));

        // Click Login
        loginPage.clickLogin();

        System.out.println("Login button clicked.");

        System.out.println("========================================");
        System.out.println("If reCAPTCHA appears,");
        System.out.println("complete it manually.");
        System.out.println("Automation will continue after login.");
        System.out.println("========================================");

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bookingPage.clickEmptySlot();

        System.out.println("Booking popup opened successfully.");

    }
}