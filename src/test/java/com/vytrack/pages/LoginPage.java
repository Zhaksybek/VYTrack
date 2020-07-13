package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@type='text']")
    private WebElement userNameElement;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordElement;


    public void login() {
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(password, Keys.ENTER);


    }
}
