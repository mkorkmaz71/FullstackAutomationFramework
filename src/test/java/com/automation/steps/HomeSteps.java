package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Then("verify user is navigated to home page")
    public void verifyUserIsNavigatedToHomePage() {
        homePage.verifyHomePage();
    }

    @When("user click on profile picture")
    public void userClickOnProfilePicture() {
        homePage.userCanOpenUserDropDownMenu();
    }

    @And("user click on logout link")
    public void userClickOnLogoutLink() {
        homePage.userCanClickOnLogoutLink();
    }

    @When("user click on checking tab")
    public void userClickOnCheckingTab() {
        homePage.clickCheckingTab();
    }

    @And("click on new checking button")
    public void clickOnNewCheckingButton() {
        homePage.clickNewCheckingTab();
    }

    @When("user click on deposit tab")
    public void userClickOnDepositTab() {
        homePage.clickDepositTab();
    }

    @When("user click on savings tab")
    public void userClickOnSavingsTab() {
        homePage.clickSavingsTab();
    }

    @And("click on new savings button")
    public void clickOnNewSavingsButton() {
        homePage.clickNewSavingsTab();
    }

    @When("user click on transfer between accounts tab")
    public void userClickOnTransferBetweenAccountsTab() {
        homePage.clickTransferBATab();
    }

    @When("user click on withdraw tab")
    public void userClickOnWithdrawTab() {
        homePage.clickWithdrawTab();
    }

    @And("user click on my profile link")
    public void userClickOnMyProfileLink() {
        homePage.userCanClickOnMyProfileLink();
    }

    @And("user click on change password link")
    public void userClickOnChangePasswordLink() {
        homePage.userCanClickOnChangePasswordLink();
    }
}
