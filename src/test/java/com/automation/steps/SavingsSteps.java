package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.NewSavingsAccountPage;
import com.automation.pages.SavingsAccountsPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SavingsSteps {
    NewSavingsAccountPage newSavingsAccountPage = new NewSavingsAccountPage();
    SavingsAccountsPage savingsAccountsPage = new SavingsAccountsPage();

    @Then("verify new savings account page is displayed")
    public void verifyNewSavingsAccountPageIsDisplayed() {
        newSavingsAccountPage.verifyNewSavingsAccountPage();
    }

    @When("user enters {string},{string},{string},{string} as new savings account details")
    public void userEntersNewSavingsAccountDetails(String typeS, String ownershipS, String nameS, String openingBalanceS) {
        if (ConfigReader.getProperty(typeS).equals("Savings")) {
            newSavingsAccountPage.typeSavings();
        } else {
            newSavingsAccountPage.typeMoneyMarket();
        }
        if (ConfigReader.getProperty(ownershipS).equals("Individual")) {
            newSavingsAccountPage.ownershipSavingsIndividual();
        } else {
            newSavingsAccountPage.ownershipSavingsJoint();
        }
        newSavingsAccountPage.newSavingsAccountName(ConfigReader.getProperty(nameS));
        newSavingsAccountPage.newSavingsAccountOpeningBalance(ConfigReader.getProperty(openingBalanceS));
    }

    @And("click on  new savings submit button")
    public void clickOnSavingsSubmitButton() {
        newSavingsAccountPage.newSavingsAccountSubmit();
    }

    @And("click on new savings reset button")
    public void clickOnNewSavingsResetButton() {
        newSavingsAccountPage.newSavingsAccountReset();
    }

    @Then("verify view savings account page is displayed")
    public void verifyViewSavingsAccountPageIsDisplayed() {
        savingsAccountsPage.verifySavingsAccountsPage();
    }

    @And("verify savings account creation success message is displayed")
    public void verifySavingsAccountCreationSuccessMessageIsDisplayed() {
        savingsAccountsPage.verifyNewSavingsAccountCreatedMessage();
    }
}
