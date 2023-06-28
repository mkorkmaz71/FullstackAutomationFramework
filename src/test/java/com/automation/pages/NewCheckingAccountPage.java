package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCheckingAccountPage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitleChecking;
    @FindBy(id = "Standard Checking")
    WebElement radioStandardChecking;
    @FindBy(id = "Interest Checking")
    WebElement radioInterestChecking;
    @FindBy(id = "Individual")
    WebElement radioCheckingIndividual;
    @FindBy(id = "Joint")
    WebElement radioCheckingJoint;
    @FindBy(id = "name")
    WebElement textBoxCheckingAccountName;
    @FindBy(id = "openingBalance")
    WebElement textBoxCheckingOpeningBalance;
    @FindBy(id = "newCheckingSubmit")
    WebElement buttonCheckingSubmit;
    @FindBy(id = "newCheckingReset")
    WebElement buttonCheckingReset;

    public void verifyNewCheckingAccountsPage() {
        Assert.assertTrue(pageTitleChecking.isDisplayed());
        Assert.assertEquals(pageTitleChecking.getText(), "Create Checking");
    }

    public void typeStandardChecking() {
        radioStandardChecking.click();
    }

    public void typeInterestChecking() {
        radioInterestChecking.click();
    }

    public void ownershipCheckingIndividual() {
        radioCheckingIndividual.click();
    }

    public void ownershipCheckingJoint() {
        radioCheckingJoint.click();
    }

    public void newCheckingAccountName(String name) {
        textBoxCheckingAccountName.sendKeys(name);
    }

    public void newCheckingAccountOpeningBalance(String openingBalance) {
        textBoxCheckingOpeningBalance.sendKeys(openingBalance);
    }

    public void newCheckingAccountSubmit() {
        buttonCheckingSubmit.click();
    }

    public void newCheckingAccountReset() {
        buttonCheckingReset.click();
    }
}
