package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("user open the website")
    public void userOpenTheWebsite() {
        loginPage.openWebSite();
    }

    @When("user enter {string} as username and {string} as password")
    public void userEnterTheUsernameAndPassword(String usernameKey, String passwordKey) {
        loginPage.doLogin(ConfigReader.getProperty(usernameKey), ConfigReader.getProperty(passwordKey));
    }

    @Then("verify user is not navigated to home page and error message is displayed")
    public void verifyUserIsNotNavigatedToHomePageAndErrorMessageIsDisplayed() {
        loginPage.verifyErrorMessageIsDisplayed();
    }

    @Then("verify user is navigated to login page")
    public void verifyUserIsNavigatedToLoginPage() {
        loginPage.verifyUserOnLoginPage();
    }

    @And("verify user get success logout message")
    public void verifyUserGetSuccessLogoutMessage() {
        loginPage.verifyLogoutMessageIsDisplayed();
    }

    @When("user enter invalid {string} as username and invalid {string} as password")
    public void userEnterInvalidAsUsernameAndInvalidAsPassword(String username, String password) {
        loginPage.userWithInvalidCredentialsCanNotLogin(username, password);
    }
}
