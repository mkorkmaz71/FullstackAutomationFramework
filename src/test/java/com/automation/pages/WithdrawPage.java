package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WithdrawPage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitleWithdraw;
    @FindBy(id = "selectedAccount")
    WebElement dropDownWithdrawSelectAccount;
    @FindBy(id = "amount")
    WebElement textBoxWithdrawAmount;
    @FindBy(xpath = "//i[@class='fa fa-dot-circle-o']")
    WebElement buttonWithdrawSubmit;
    @FindBy(xpath = "//i[@class='fa fa-ban']")
    WebElement buttonWithdrawReset;

    public void verifyWithdrawPage() {
        Assert.assertTrue(pageTitleWithdraw.isDisplayed());
        Assert.assertEquals(pageTitleWithdraw.getText(), "Withdraw");
    }

    public void enterWithdrawAmount(String withdrawAmount) {
        textBoxWithdrawAmount.sendKeys(withdrawAmount);
    }

    public void selectWithdrawAccount(String accountNameW) {
        Select selectAccount = new Select(dropDownWithdrawSelectAccount);
        selectAccount.selectByVisibleText(accountNameW);
    }

    public void withdrawAccountSubmit() {
        buttonWithdrawSubmit.click();
    }

    public void withdrawAccountReset() {
        buttonWithdrawReset.click();
    }
}
