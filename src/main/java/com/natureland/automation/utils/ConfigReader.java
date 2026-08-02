package com.natureland.automation.utils;

import com.natureland.automation.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {

        try {

            FileInputStream fis =
                    new FileInputStream(
                            FrameworkConstants.CONFIG_FILE_PATH);

            properties.load(fis);

        }

        catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

    public static String getProperty(String key) {

        return properties.getProperty(key);

    }

}