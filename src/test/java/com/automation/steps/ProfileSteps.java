package com.automation.steps;

import com.automation.pages.ProfilePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
    ProfilePage profilePage = new ProfilePage();

    @Then("verify user is navigated to profile page")
    public void verifyUserIsNavigatedToProfilePage() {
        profilePage.verifyProfilePage();
    }

    @When("verify user can update followings first {string},{string},{string}")
    public void verifyUserCanUpdateFollowings(String title, String firstName, String lastName) {
        profilePage.selectTitle(ConfigReader.getProperty(title));
        profilePage.verifyUserUpdateFirstName(ConfigReader.getProperty(firstName));
        profilePage.verifyUserUpdateLastName(ConfigReader.getProperty(lastName));
    }

    @And("verify user can update followings second {string},{string},{string}")
    public void verifyUserCanUpdateFollowingsSecond(String homePhone, String mobilePhone, String workPhone) {
        profilePage.verifyUserUpdateHomePhone(ConfigReader.getProperty(homePhone));
        profilePage.verifyUserUpdateMobilePhone(ConfigReader.getProperty(mobilePhone));
        profilePage.verifyUserUpdateWorkPhone(ConfigReader.getProperty(workPhone));
    }

    @And("verify user can update followings third {string},{string},{string},{string},{string}")
    public void verifyUserCanUpdateFollowings(String address, String locality, String region, String postalCode, String country) {
        profilePage.verifyUserUpdateAddress(ConfigReader.getProperty(address));
        profilePage.verifyUserUpdateLocality(ConfigReader.getProperty(locality));
        profilePage.verifyUserUpdateRegion(ConfigReader.getProperty(region));
        profilePage.verifyUserUpdatePostalCode(ConfigReader.getProperty(postalCode));
        profilePage.verifyUserUpdateCountry(ConfigReader.getProperty(country));
    }

    @Then("verify user get success profile update message")
    public void verifyUserGetSuccessProfileUpdateMessage() {
        profilePage.profileUpdateSubmit();
    }
}
