package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {
    //explicit wait
    //will be used inside every page class
    //since this variable is protected
    //it will not be visible in test classes

    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    Actions action;

    public BasePage() {
        //In order to be able to use @FindBy,@FindBys..annotations
        PageFactory.initElements(Driver.getDriver(), this);
        action = new Actions(Driver.getDriver());

        List<WebElement> HomePageBar = new ArrayList<>(Driver.getDriver().findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li ")));

    }

}
