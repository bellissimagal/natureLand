package com.natureland.automation.tests.tests;

import com.natureland.automation.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchApplicationTest extends BaseTest {

    @Test

    public void verifyApplicationLaunch() {

        String title = driver.getTitle();

        Assert.assertFalse(title.isEmpty());

    }

}