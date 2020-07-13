package com.vytrack.pages;


import com.google.gson.internal.$Gson$Preconditions;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VehicleCostPage extends BasePage {

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li/a/span")
    private WebElement FleetButtonElement;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    private WebElement VehicleCostButtonElement;

    @FindBy(xpath ="//title")
    private WebElement VehicleCostPageTitle;

    public void accessVehicleCostPage() {

        wait.until(ExpectedConditions.visibilityOf(FleetButtonElement));
        action.moveToElement(FleetButtonElement).perform();
        wait.until(ExpectedConditions.visibilityOf(VehicleCostButtonElement));
        action.moveToElement(VehicleCostButtonElement).click().perform();
        wait.until(ExpectedConditions.titleIs("Vehicle Costs - Entities - System - Car - Entities - System"));

    }
}




