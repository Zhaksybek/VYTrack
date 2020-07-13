package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehicleCostPage;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VehicleCostTests extends TestBase {

    //2.As a truck driver I should be able to access  Vehicle Costs page
    @Test(description = "verify truck driver can access  Vehicle Costs page")
    public void accessVehicleCostPageTest()  {

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        VehicleCostPage vehicleCostPage = new VehicleCostPage();
        vehicleCostPage.accessVehicleCostPage();

        String actualtitle = Driver.getDriver().getTitle();
        String expectedTitle = "Vehicle Costs - Entities - System - Car - Entities - System";
        Assert.assertEquals(actualtitle, expectedTitle, "false");
        System.out.println(actualtitle);



    }
}
