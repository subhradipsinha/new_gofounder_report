package com.demo;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Subhradip
 */

public class ConfigirationManager {

    /**
     * @param config : It read the configuratio
     *
     */
    public static Properties config;
    public static Properties OR;
    public static Properties TestData;


    public static void conficfile() throws IOException {

        //Read confic file
        File con = new File("C:\\Users\\admin\\Desktop\\demogofoundernet\\src\\main\\resources\\Config.properties");
        FileInputStream file = new FileInputStream(con);
        config = new Properties();
        config.load(file);
        System.out.println(config.getProperty("browser"));

        //Read OR file
        File con1 = new File("C:\\Users\\admin\\Desktop\\demogofoundernet\\src\\main\\resources\\OR.properties");
        FileInputStream file1 = new FileInputStream(con1);
        OR = new Properties();
        OR.load(file1);
        System.out.println(OR.getProperty("username"));

        //Read TestData file
        File con2 = new File("C:\\Users\\admin\\Desktop\\demogofoundernet\\src\\main\\resources\\TestData.properties");
        FileInputStream file2 = new FileInputStream(con2);
        TestData = new Properties();
        TestData.load(file2);
        System.out.println(TestData.getProperty("uname"));
    }

    public static String getxpath(String key){
        return OR.getProperty(key);
    }
}
