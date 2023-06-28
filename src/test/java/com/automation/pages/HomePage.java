package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitle;

    @FindBy(id = "checking-menu")
    WebElement checkingTab;

    @FindBy(id = "savings-menu")
    WebElement savingsTab;

    @FindBy(id = "new-checking-menu-item")
    WebElement newCheckingTab;

    @FindBy(id = "new-savings-menu-item")
    WebElement newSavingsTab;

    @FindBy(id = "view-checking-menu-item")
    WebElement viewCheckingTab;

    @FindBy(id = "view-savings-menu-item")
    WebElement viewSavingsTab;

    @FindBy(id = "deposit-menu-item")
    WebElement depositTab;

    @FindBy(id = "withdraw-menu-item")
    WebElement withdrawTab;

    @FindBy(id = "transfer-menu-item")
    WebElement transferBATab;

    @FindBy(xpath = "//div[@class='user-area dropdown']")
    WebElement userDropDownMenu;

    @FindBy(xpath = "//div[@class='user-menu dropdown-menu show']/a[contains(@href,'logout')]")
    WebElement logoutLink;

    @FindBy(xpath = "//div[@class='user-menu dropdown-menu show']/a[contains(@href,'profile')]")
    WebElement myProfileLink;

    @FindBy(xpath = "//div[@class='user-menu dropdown-menu show']/a[contains(@href,'password')]")
    WebElement changePasswordLink;

    public void verifyHomePage() {
        Assert.assertTrue(pageTitle.isDisplayed());
        Assert.assertEquals(pageTitle.getText(), "Dashboard");
    }

    public void clickCheckingTab() {
        checkingTab.click();
    }

    public void clickSavingsTab() {
        savingsTab.click();
    }

    public void clickDepositTab() {
        depositTab.click();
    }

    public void clickWithdrawTab() {
        withdrawTab.click();
    }

    public void clickTransferBATab() {
        transferBATab.click();
    }

    public void clickNewCheckingTab() {
        newCheckingTab.click();
    }

    public void clickNewSavingsTab() {
        newSavingsTab.click();
    }

    public void userCanOpenUserDropDownMenu() {
        userDropDownMenu.click();
    }

    public void userCanClickOnLogoutLink() {
        logoutLink.click();
    }

    public void userCanClickOnMyProfileLink() {
        myProfileLink.click();
    }

    public void userCanClickOnChangePasswordLink() {
        changePasswordLink.click();
    }
}
