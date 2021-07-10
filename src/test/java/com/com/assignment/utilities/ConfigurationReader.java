package com.com.assignment.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static Properties properties = new Properties();

    static {
        String path = "configuration.properties";
        try (FileInputStream file = new FileInputStream(path)) {
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}
