package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TransferPage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitleInternalTransfer;
    @FindBy(id = "fromAccount")
    WebElement dropDownSelectFromAccount;
    @FindBy(id = "toAccount")
    WebElement dropDownSelectToAccount;
    @FindBy(id = "amount")
    WebElement textBoxTransferAmount;
    @FindBy(xpath = "//i[@class='fa fa-dot-circle-o']")
    WebElement buttonTransferSubmit;
    @FindBy(xpath = "//i[@class='fa fa-ban']")
    WebElement buttonTransferReset;

    public void verifyTransferPage() {
        Assert.assertTrue(pageTitleInternalTransfer.isDisplayed());
        Assert.assertEquals(pageTitleInternalTransfer.getText(), "Internal Transfer");
    }

    public void enterTransferAmount(String transferAmount) {
        textBoxTransferAmount.sendKeys(transferAmount);
    }

    public void selectFromAccount(String accountNameW) {
        Select selectWithdrawAccount = new Select(dropDownSelectFromAccount);
        selectWithdrawAccount.selectByVisibleText(accountNameW);
    }

    public void selectToAccount(String accountNameD) {
        Select selectDepositAccount = new Select(dropDownSelectToAccount);
        selectDepositAccount.selectByVisibleText(accountNameD);
    }

    public void transferAccountSubmit() {
        buttonTransferSubmit.click();
    }

    public void transferAccountReset() {
        buttonTransferReset.click();
    }
}
