package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage extends BasePage {

    @FindBy(id = "page-title")
    WebElement pageTitleProfile;

    @FindBy(id = "title")
    WebElement dropDownTitle;
    @FindBy(id = "firstName")
    WebElement textBoxFirstName;
    @FindBy(id = "lastName")
    WebElement textBoxLastName;
    @FindBy(id = "homePhone")
    WebElement textBoxHomePhone;
    @FindBy(id = "mobilePhone")
    WebElement textBoxMobilePhone;
    @FindBy(id = "workPhone")
    WebElement textBoxWorkPhone;
    @FindBy(id = "address")
    WebElement textBoxAddress;
    @FindBy(id = "locality")
    WebElement textBoxLocality;
    @FindBy(id = "region")
    WebElement textBoxRegion;
    @FindBy(id = "postalCode")
    WebElement textBoxPostalCode;
    @FindBy(id = "country")
    WebElement textBoxCountry;
    @FindBy(xpath = "//i[@class='fa fa-dot-circle-o']")
    WebElement buttonProfileSubmit;
    @FindBy(xpath = "//i[@class='fa fa-ban']")
    WebElement buttonProfileReset;

    public void verifyUserUpdateFirstName(String firstName) {
        textBoxFirstName.clear();
        textBoxFirstName.sendKeys(firstName);
    }

    public void verifyUserUpdateLastName(String lastName) {
        textBoxLastName.clear();
        textBoxLastName.sendKeys(lastName);
    }

    public void verifyUserUpdateHomePhone(String homePhone) {
        textBoxHomePhone.clear();
        textBoxHomePhone.sendKeys(homePhone);
    }

    public void verifyUserUpdateMobilePhone(String mobilePhone) {
        textBoxMobilePhone.clear();
        textBoxMobilePhone.sendKeys(mobilePhone);
    }

    public void verifyUserUpdateWorkPhone(String workPhone) {
        textBoxWorkPhone.clear();
        textBoxWorkPhone.sendKeys(workPhone);
    }

    public void verifyUserUpdateAddress(String address) {
        textBoxAddress.clear();
        textBoxAddress.sendKeys(address);
    }

    public void verifyUserUpdateLocality(String locality) {
        textBoxLocality.clear();
        textBoxLocality.sendKeys(locality);
    }

    public void verifyUserUpdateRegion(String region) {
        textBoxRegion.clear();
        textBoxRegion.sendKeys(region);
    }

    public void verifyUserUpdatePostalCode(String postalCode) {
        textBoxPostalCode.clear();
        textBoxPostalCode.sendKeys(postalCode);
    }

    public void verifyUserUpdateCountry(String country) {
        textBoxCountry.clear();
        textBoxCountry.sendKeys(country);
    }

    public void verifyProfilePage() {
        Assert.assertTrue(pageTitleProfile.isDisplayed());
        Assert.assertEquals(pageTitleProfile.getText(), "Profile");
    }

    public void selectTitle(String title) {
        Select selectAccount = new Select(dropDownTitle);
        selectAccount.selectByVisibleText(title);
    }

    public void profileUpdateSubmit() {
        buttonProfileSubmit.click();
    }

    public void profileUpdateReset() {
        buttonProfileReset.click();
    }
}
