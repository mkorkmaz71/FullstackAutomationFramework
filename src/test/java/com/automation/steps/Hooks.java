package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@ui")
    public void setup() {
        ConfigReader.initProperties();
        DriverUtils.createDriver();
    }

    @After("@ui")
    public void cleanUp() {
        DriverUtils.getDriver().quit();
    }
}
