package com.automation.steps;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransferSteps {
    TransferPage transferPage = new TransferPage();
    CheckingAccountsPage checkingAccountsPage = new CheckingAccountsPage();
    SavingsAccountsPage savingsAccountsPage = new SavingsAccountsPage();

    @Then("verify internal transfer page is displayed")
    public void verifyInternalTransferPageIsDisplayed() {
        transferPage.verifyTransferPage();
    }

    @When("user select {string} from account dropdown and {string} to account dropdown")
    public void userSelectTransferAccountsFromTheDropdown(String accountNameW, String accountNameD) {
        transferPage.selectFromAccount(ConfigReader.getProperty(accountNameW));
        transferPage.selectToAccount(ConfigReader.getProperty(accountNameD));
    }

    @And("enter the transfer {string} as amount")
    public void enterTheTransferAmount(String transferAmount) {
        transferPage.enterTransferAmount(ConfigReader.getProperty(transferAmount));
    }

    @Then("after transfer verify {string} on checking-savings account page is displayed")
    public void afterTransferVerifyOnCheckingSavingsAccountPageIsDisplayed(String accountNameD) {
        if (ConfigReader.getProperty(accountNameD).contains("Savings")) {
            savingsAccountsPage.verifySavingsAccountsPage();
        } else {
            checkingAccountsPage.verifyCheckingAccountsPage();
        }
    }

    @And("verify transfer entry {string} at {string} is displayed in the transaction history")
    public void verifyTransferEntryIsDisplayedInTheTransactionHistory(String transferAmount, String accountNameD) {
        if (ConfigReader.getProperty(accountNameD).contains("Savings")) {
            savingsAccountsPage.verifySavingsAccountsPage();
            savingsAccountsPage.verifyTransferEntryIsDisplayedSavingsAccount(ConfigReader.getProperty(transferAmount));
        } else {
            checkingAccountsPage.verifyCheckingAccountsPage();
            checkingAccountsPage.verifyTransferEntryIsDisplayedCheckingAccount(ConfigReader.getProperty(transferAmount));
        }
    }

    @And("click on transfer submit button")
    public void clickOnTransferSubmitButton() {
        transferPage.transferAccountSubmit();
    }
}
