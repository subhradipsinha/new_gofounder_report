package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;

public class Dashbord extends TestBase {

    Login announcements = new Login();{
    }
    public void announcements() throws Exception
    {
        announcements.byXpath("announcementsClick").click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

       /* announcements.byXpath("WebinarsClick").click();
        Thread.sleep(10000);
        announcements.byXpath("RecordedWebinarsClick").click();
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);*/

        announcements.byXpath("MyInviteesClick").click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        Thread.sleep(2000);
        announcements.byXpath("MyTeamClick").click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);

        announcements.byXpath("CommunityClick").click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);
    }
}