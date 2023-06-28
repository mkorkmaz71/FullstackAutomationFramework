package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsAccountPage extends BasePage {
    @FindBy(id = "page-title")
    WebElement pageTitleSavings;
    @FindBy(id = "Savings")
    WebElement radioSavings;
    @FindBy(id = "Money Market")
    WebElement radioMoneyMarket;
    @FindBy(id = "Individual")
    WebElement radioSavingsIndividual;
    @FindBy(id = "Joint")
    WebElement radioSavingsJoint;
    @FindBy(id = "name")
    WebElement textBoxSavingsAccountName;
    @FindBy(id = "openingBalance")
    WebElement textBoxSavingsOpeningBalance;
    @FindBy(id = "newSavingsSubmit")
    WebElement buttonSavingsSubmit;
    @FindBy(id = "newSavingsReset")
    WebElement buttonSavingsReset;

    public void verifyNewSavingsAccountPage() {
        Assert.assertTrue(pageTitleSavings.isDisplayed());
        Assert.assertEquals(pageTitleSavings.getText(), "Create Savings");
    }

    public void typeSavings() {
        radioSavings.click();
    }

    public void typeMoneyMarket() {
        radioMoneyMarket.click();
    }

    public void ownershipSavingsIndividual() {
        radioSavingsIndividual.click();
    }

    public void ownershipSavingsJoint() {
        radioSavingsJoint.click();
    }

    public void newSavingsAccountName(String name) {
        textBoxSavingsAccountName.sendKeys(name);
    }

    public void newSavingsAccountOpeningBalance(String openingBalance) {
        textBoxSavingsOpeningBalance.sendKeys(openingBalance);
    }

    public void newSavingsAccountSubmit() {
        buttonSavingsSubmit.click();
    }

    public void newSavingsAccountReset() {
        buttonSavingsReset.click();
    }
}
