package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.By;

public class Community extends TestBase
{

    Login account = new Login();

    public void Communi() throws Exception {

        driver.findElement(By.xpath("//span[contains(text(),'Community')]")).click();
        TestBase.byXpath("ddfs").click();

    }

}