package com.natureland.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    public static byte[] capture(TakesScreenshot driver) {

        return driver.getScreenshotAs(OutputType.BYTES);

    }

}