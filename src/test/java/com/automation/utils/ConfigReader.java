package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    public static void initProperties() {
        try {
            properties = new Properties();
            properties.load(new FileReader("src\\test\\resources\\config\\config.properties"));
        } catch (Exception exception) {

        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }
}
