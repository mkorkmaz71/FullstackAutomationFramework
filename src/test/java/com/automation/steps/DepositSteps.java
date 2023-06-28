package com.automation.steps;

import com.automation.pages.CheckingAccountsPage;
import com.automation.pages.DepositPage;
import com.automation.pages.HomePage;
import com.automation.pages.SavingsAccountsPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DepositSteps {
    DepositPage depositPage = new DepositPage();
    CheckingAccountsPage checkingAccountsPage = new CheckingAccountsPage();
    SavingsAccountsPage savingsAccountsPage = new SavingsAccountsPage();

    @Then("verify deposit page is displayed")
    public void verifyDepositPageIsDisplayed() {
        depositPage.verifyDepositPage();
    }

    @When("user select {string} deposit account from the dropdown")
    public void userSelectDepositAccountFromTheDropdown(String accountNameD) {
        depositPage.selectAccount(ConfigReader.getProperty(accountNameD));
    }

    @And("enter the deposit {string} as amount")
    public void enterTheDepositAmount(String depositAmount) {
        depositPage.enterDepositAmount(ConfigReader.getProperty(depositAmount));
    }

    @Then("after deposit verify {string} on checking-savings account page is displayed")
    public void afterDepositVerifyOnCheckingSavingsAccountPageIsDisplayed(String accountNameD) {
        if (ConfigReader.getProperty(accountNameD).contains("Savings")) {
            savingsAccountsPage.verifySavingsAccountsPage();
        } else {
            checkingAccountsPage.verifyCheckingAccountsPage();
        }
    }

    @And("verify deposit entry {string} at {string} is displayed in the transaction history")
    public void verifyDepositEntryIsDisplayedInTheTransactionHistory(String depositAmount, String accountNameD) {
        if (ConfigReader.getProperty(accountNameD).contains("Savings")) {
            savingsAccountsPage.verifySavingsAccountsPage();
            savingsAccountsPage.verifyDepositEntryIsDisplayedSavingsAccount(ConfigReader.getProperty(depositAmount));
        } else {
            checkingAccountsPage.verifyCheckingAccountsPage();
            checkingAccountsPage.verifyDepositEntryIsDisplayedCheckingAccount(ConfigReader.getProperty(depositAmount));
        }
    }

    @And("click on deposit submit button")
    public void clickOnDepositSubmitButton() {
        depositPage.depositAccountSubmit();
    }
}
