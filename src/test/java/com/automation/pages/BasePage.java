package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public abstract class BasePage {
    WebDriver driver;

    public BasePage() {
        driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }
}
