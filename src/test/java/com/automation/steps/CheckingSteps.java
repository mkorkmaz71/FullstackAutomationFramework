package com.automation.steps;

import com.automation.pages.CheckingAccountsPage;
import com.automation.pages.NewCheckingAccountPage;
import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckingSteps {
    NewCheckingAccountPage newCheckingAccountPage = new NewCheckingAccountPage();
    CheckingAccountsPage checkingAccountsPage = new CheckingAccountsPage();

    @Then("verify new checking account page is displayed")
    public void verifyNewCheckingAccountPageIsDisplayed() {
        newCheckingAccountPage.verifyNewCheckingAccountsPage();
    }

    @When("user enters {string},{string},{string},{string} as new checking account details")
    public void userEntersNewCheckingAccountDetails(String typeC, String ownershipC, String nameC, String openingBalanceC) {
        if (ConfigReader.getProperty(typeC).equals("Standard")) {
            newCheckingAccountPage.typeStandardChecking();
        } else {
            newCheckingAccountPage.typeInterestChecking();
        }
        if (ConfigReader.getProperty(ownershipC).equals("Individual")) {
            newCheckingAccountPage.ownershipCheckingIndividual();
        } else {
            newCheckingAccountPage.ownershipCheckingJoint();
        }
        newCheckingAccountPage.newCheckingAccountName(ConfigReader.getProperty(nameC));
        newCheckingAccountPage.newCheckingAccountOpeningBalance(ConfigReader.getProperty(openingBalanceC));
    }

    @And("click on new checking submit button")
    public void clickOnNewCheckingSubmitButton() {
        newCheckingAccountPage.newCheckingAccountSubmit();
    }

    @And("click on new checking reset button")
    public void clickOnNewCheckingResetButton() {
        newCheckingAccountPage.newCheckingAccountReset();
    }

    @Then("verify view checking account page is displayed")
    public void verifyViewCheckingAccountPageIsDisplayed() {
        checkingAccountsPage.verifyCheckingAccountsPage();
    }

    @And("verify checking account creation success message is displayed")
    public void verifyCheckingAccountCreationSuccessMessageIsDisplayed() {
        checkingAccountsPage.verifyNewCheckingAccountCreatedMessage();
    }
}
