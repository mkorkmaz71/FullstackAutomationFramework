package com.automation.steps;

import com.automation.pages.ChangePasswordPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordSteps {
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    @Then("verify user is navigated to change password page")
    public void verifyUserIsNavigatedToChangePasswordPage() {
        changePasswordPage.verifyPasswordManagementPage();
    }

    @When("verify user can update {string} to the new credentials {string},{string}")
    public void verifyUserCanUpdateToTheNewCredentials(String currentPassword, String newPassword, String confirmPassword) {
        changePasswordPage.verifyUserUpdatePassword(ConfigReader.getProperty(currentPassword), ConfigReader.getProperty(newPassword), ConfigReader.getProperty(confirmPassword));
        changePasswordPage.profileUpdateSubmit();
    }

    @Then("verify user get success password update message")
    public void verifyUserGetSuccessPasswordUpdateMessage() {
        changePasswordPage.verifyPasswordUpdateSuccessMessage();
    }
}
