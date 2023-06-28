package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingsAccountsPage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitleSavings;
    @FindBy(id = "new-account-msg")
    WebElement confirmation;
    @FindBy(xpath = "//table[@id='transactionTable']//tbody/tr[1]")
    WebElement firstRowTransactionTable;

    public void verifySavingsAccountsPage() {
        Assert.assertTrue(pageTitleSavings.isDisplayed());
        Assert.assertEquals(pageTitleSavings.getText(), "View Savings Accounts");
    }

    public void verifyNewSavingsAccountCreatedMessage() {
        Assert.assertTrue(confirmation.isDisplayed());
        Assert.assertTrue(confirmation.getText().startsWith("Successfully created new"));
    }

    public void verifyDepositEntryIsDisplayedSavingsAccount(String depositAmount) {
        Assert.assertTrue(firstRowTransactionTable.getText().contains(depositAmount));
        Assert.assertTrue(firstRowTransactionTable.getText().contains("Deposit"));
    }

    public void verifyWithdrawEntryIsDisplayedSavingsAccount(String withdrawAmount) {
        Assert.assertTrue(firstRowTransactionTable.getText().contains(withdrawAmount));
        Assert.assertTrue(firstRowTransactionTable.getText().contains("Withdraw"));
    }

    public void verifyTransferEntryIsDisplayedSavingsAccount(String transferAmount) {
        Assert.assertTrue(firstRowTransactionTable.getText().contains(transferAmount));
        Assert.assertTrue(firstRowTransactionTable.getText().contains("Transfer"));
    }
}
