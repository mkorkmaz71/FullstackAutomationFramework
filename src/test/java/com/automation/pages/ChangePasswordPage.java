package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitlePasswordManagement;
    @FindBy(id = "currentPassword")
    WebElement textBoxCurrentPassword;
    @FindBy(id = "newPassword")
    WebElement textBoxNewPassword;
    @FindBy(id = "confirmPassword")
    WebElement textBoxConfirmPassword;
    @FindBy(id = "payment-button-amount")
    WebElement buttonUpdatePassword;

    @FindBy(xpath = "//span[@class='badge badge-pill badge-success']")
    WebElement updateSuccessMessage;

    public void verifyUserUpdatePassword(String currentPassword, String newPassword, String confirmPassword) {
        textBoxCurrentPassword.sendKeys(currentPassword);
        textBoxNewPassword.sendKeys(newPassword);
        textBoxConfirmPassword.sendKeys(confirmPassword);
    }

    public void verifyPasswordManagementPage() {
        Assert.assertTrue(pageTitlePasswordManagement.isDisplayed());
        Assert.assertEquals(pageTitlePasswordManagement.getText(), "Password Management");
    }

    public void profileUpdateSubmit() {
        buttonUpdatePassword.click();
    }

    public void verifyPasswordUpdateSuccessMessage() {
        Assert.assertTrue(updateSuccessMessage.isDisplayed());
        Assert.assertEquals(updateSuccessMessage.getText(), "Success");
    }
}
