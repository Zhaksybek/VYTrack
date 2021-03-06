package com.vytrack.tests;


import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test(description = "Just login and verify title")
    public void loginTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        //assertion

        String actual = Driver.getDriver().getTitle();
        System.out.println(actual);

        String expected = "Dashboard";
        Thread.sleep(3000);
        Assert.assertTrue(actual.contains(expected));


    }


}
