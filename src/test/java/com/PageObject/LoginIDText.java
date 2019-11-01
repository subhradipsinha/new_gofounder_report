package com.PageObject;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginIDText {
    public void uname19() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\demogofoundernet\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
        driver.get("https://ewaybillgst.gov.in/login.aspx");

        System.out.println("User name process");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("MSPSPLRGHEB");
        Thread.sleep(3000);
        System.out.println("Password Process");
        driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("MSPspl@2o18");
        Thread.sleep(2000);

            System.out.println("captchaValue");
            String captchaValue = driver.findElement(By.xpath("//img[@id='imgcaptcha']")).getText(); //this will read the captcha
            System.out.println(captchaValue);
            driver.findElement(By.xpath("//input[@id='txtCaptcha']")).sendKeys(captchaValue);

    }

    }
