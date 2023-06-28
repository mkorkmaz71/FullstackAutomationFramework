package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DepositPage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitleDeposit;
    @FindBy(id = "selectedAccount")
    WebElement dropDownDepositSelectAccount;
    @FindBy(id = "amount")
    WebElement textBoxDepositAmount;
    @FindBy(xpath = "//i[@class='fa fa-dot-circle-o']")
    WebElement buttonDepositSubmit;
    @FindBy(xpath = "//i[@class='fa fa-ban']")
    WebElement buttonDepositReset;

    public void verifyDepositPage() {
        Assert.assertTrue(pageTitleDeposit.isDisplayed());
        Assert.assertEquals(pageTitleDeposit.getText(), "Deposit");
    }

    public void enterDepositAmount(String depositAmount) {
        textBoxDepositAmount.sendKeys(depositAmount);
    }

    public void selectAccount(String accountNameD) {
        Select selectAccount = new Select(dropDownDepositSelectAccount);
        selectAccount.selectByVisibleText(accountNameD);
    }

    public void depositAccountSubmit() {
        buttonDepositSubmit.click();
    }

    public void depositAccountReset() {
        buttonDepositReset.click();
    }
}
