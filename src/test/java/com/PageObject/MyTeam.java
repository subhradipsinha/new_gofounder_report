package com.PageObject;
import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;

import static com.demo.ConfigirationManager.TestData;

public class MyTeam extends TestBase {
    Login my = new Login();

    public void myTeamtext() throws Exception {
        my.byXpath("MyTeam").click();
        Thread.sleep(2000);
        my.byXpath("emailaddressClick").click();
        Thread.sleep(2000);
        my.byXpath("SubjectText").sendKeys(TestData.getProperty("Subject"));
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");
        my.byXpath("CloseText").click();
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        Thread.sleep(2000);

        my.byXpath("SearchTextbox").sendKeys(TestData.getProperty("SearchTextboxText"));
        Thread.sleep(3000);
    }
}


