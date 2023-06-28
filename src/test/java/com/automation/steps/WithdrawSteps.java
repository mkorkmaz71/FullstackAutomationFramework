package com.automation.steps;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawSteps {
    WithdrawPage withdrawPage = new WithdrawPage();
    CheckingAccountsPage checkingAccountsPage = new CheckingAccountsPage();
    SavingsAccountsPage savingsAccountsPage = new SavingsAccountsPage();

    @Then("verify withdraw page is displayed")
    public void verifyWithdrawPageIsDisplayed() {
        withdrawPage.verifyWithdrawPage();
    }

    @When("user select {string} withdraw account from the dropdown")
    public void userSelectAccountFromTheDropdown(String accountNameW) {
        withdrawPage.selectWithdrawAccount(ConfigReader.getProperty(accountNameW));
    }

    @And("enter the withdraw {string} as amount")
    public void enterTheWithdrawAmount(String withdrawAmount) {
        withdrawPage.enterWithdrawAmount(ConfigReader.getProperty(withdrawAmount));
    }

    @Then("after withdraw verify {string} on checking-savings account page is displayed")
    public void afterWithdrawVerifyOnCheckingSavingsAccountPageIsDisplayed(String accountNameW) {
        if (ConfigReader.getProperty(accountNameW).contains("Savings")) {
            savingsAccountsPage.verifySavingsAccountsPage();
        } else {
            checkingAccountsPage.verifyCheckingAccountsPage();
        }
    }

    @And("verify withdraw entry {string} at {string} is displayed in the transaction history")
    public void verifyWithdrawEntryIsDisplayedInTheTransactionHistory(String withdrawAmount, String accountNameW) {
        if (ConfigReader.getProperty(accountNameW).contains("Savings")) {
            savingsAccountsPage.verifySavingsAccountsPage();
            savingsAccountsPage.verifyWithdrawEntryIsDisplayedSavingsAccount(ConfigReader.getProperty(withdrawAmount));
        } else {
            checkingAccountsPage.verifyCheckingAccountsPage();
            checkingAccountsPage.verifyWithdrawEntryIsDisplayedCheckingAccount(ConfigReader.getProperty(withdrawAmount));
        }
    }

    @And("click on withdraw submit button")
    public void clickOnWithdrawSubmitButton() {
        withdrawPage.withdrawAccountSubmit();
    }
}
