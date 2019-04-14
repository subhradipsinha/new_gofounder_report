package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

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

        Profile.byXpath("UpdateClick").click();
        Thread.sleep(2000);


    }

}