package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class Marketing extends TestBase {

    Login Mar = new Login();

    public void mark() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("MarketingClick")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("MarketingPlayVideoClick")).click();
    }
}
