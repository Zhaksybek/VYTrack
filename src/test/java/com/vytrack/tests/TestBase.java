package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected Actions action ;

    @BeforeMethod
    public void setUp() {
        String URL = "https://qa2.vytrack.com/user/login";
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        action = new Actions(Driver.getDriver());


    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
