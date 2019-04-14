package com.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverManager {
    //public static ConfigarationManager configarationManager = new ConfigarationManager();
    public static WebDriver driver;


    public static void browser() throws Exception {

        ConfigirationManager.conficfile();
        String Url = ConfigirationManager.config.getProperty("URL");
        String browsername = ConfigirationManager.config.getProperty("browser");
        if (browsername.equalsIgnoreCase("Firefox")) {

//            WebElement frm = driver.findElement(By.xpath("//iframe[@tabindex='0']"));
//    driver.switchTo().frame(frm); using Frame
            System.setProperty("webdriver.gecko.driver", "E:\\sw\\Homework1\\demogofoundernet\\Driver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        driver.get(Url);
        Thread.sleep(5000);

    }
}