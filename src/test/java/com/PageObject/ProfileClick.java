package com.PageObject;

import com.demo.TestBase;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;

import static com.demo.ConfigirationManager.TestData;

public class ProfileClick extends TestBase {
    Login Profile = new Login();

    public void Profile() throws Exception {
        Profile.byXpath("MyProfile").click();
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        Thread.sleep(2000);

        Select sel = new Select(Profile.byXpath("CountryClick"));
        sel.selectByValue("India");

        Profile.byXpath("FirstNameClick").clear();
        Thread.sleep(2000);
        Profile.byXpath("FirstNameClick").sendKeys(TestData.getProperty("FirstName"));
        Thread.sleep(2000);
        Profile.byXpath("LastNameClick").clear();
        Thread.sleep(2000);
        Profile.byXpath("LastNameClick").sendKeys(TestData.getProperty("LastName"));
        Thread.sleep(2000);

        //Captcha
        File a= driver.findElement(By.xpath("")).getScreenshotAs(OutputType.FILE);
        ITesseract instance = new Tesseract();
        String actual =instance.doOCR(a);
        String expected = "21111";
        Assert.assertEquals(expected,actual);


        Profile.byXpath("UpdateClick").click();
        Thread.sleep(2000);


    }

}