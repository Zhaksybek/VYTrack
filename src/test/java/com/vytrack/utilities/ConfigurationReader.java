package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class ConfigurationReader {

    //1- we created properties object
    private static Properties properties;

    static {

        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to find configuration.properties file!");
        }
    }

    //Our own custom method to read and get values from configuration.properties file
    public static String getProperty(String key) {

        return properties.getProperty(key);
    }

}
