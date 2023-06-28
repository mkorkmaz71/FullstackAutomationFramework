package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingAccountsPage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitleChecking;
    @FindBy(id = "new-account-msg")
    WebElement confirmation;
    @FindBy(xpath = "//table[@id='transactionTable']//tbody/tr[1]")
    WebElement firstRowTransactionTable;

    public void verifyCheckingAccountsPage() {
        Assert.assertTrue(pageTitleChecking.isDisplayed());
        Assert.assertEquals(pageTitleChecking.getText(), "View Checking Accounts");
    }

    public void verifyNewCheckingAccountCreatedMessage() {
        Assert.assertTrue(confirmation.isDisplayed());
        Assert.assertTrue(confirmation.getText().startsWith("Successfully created new"));
    }

    public void verifyDepositEntryIsDisplayedCheckingAccount(String depositAmount) {
        Assert.assertTrue(firstRowTransactionTable.getText().contains(depositAmount));
        Assert.assertTrue(firstRowTransactionTable.getText().contains("Deposit"));
    }

    public void verifyWithdrawEntryIsDisplayedCheckingAccount(String withdrawAmount) {
        Assert.assertTrue(firstRowTransactionTable.getText().contains(withdrawAmount));
        Assert.assertTrue(firstRowTransactionTable.getText().contains("Withdraw"));
    }

    public void verifyTransferEntryIsDisplayedCheckingAccount(String transferAmount) {
        Assert.assertTrue(firstRowTransactionTable.getText().contains(transferAmount));
        Assert.assertTrue(firstRowTransactionTable.getText().contains("Transfer"));
    }
}
