package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "submit")
    WebElement signInButton;

    @FindBy(xpath = "//span[@class='badge badge-pill badge-success']")
    WebElement successLogoutMessage;

    @FindBy(xpath = "//span[@class='badge badge-pill badge-danger']")
    WebElement errorLoginMessage;

    public void openWebSite() {
        driver.get(ConfigReader.getProperty("ui.url"));
    }

    public void verifyUserOnLoginPage() {
        Assert.assertTrue(usernameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(signInButton.isDisplayed());
    }

    public void doLogin(String usernameValue, String passwordValue) {
        usernameInput.sendKeys(usernameValue);
        passwordInput.sendKeys(passwordValue);
        signInButton.click();
    }

    public void userWithInvalidCredentialsCanNotLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public void verifyErrorMessageIsDisplayed() {
        Assert.assertTrue(errorLoginMessage.isDisplayed());
        Assert.assertEquals(errorLoginMessage.getText(), "Error");
    }

    public void verifyLogoutMessageIsDisplayed() {
        Assert.assertTrue(successLogoutMessage.isDisplayed());
        Assert.assertEquals(successLogoutMessage.getText(), "Success");
    }
}
