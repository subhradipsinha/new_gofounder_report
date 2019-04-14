package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;

public class Announcements extends TestBase {
    Login pro = new Login();

    public void annount() throws Exception {
        Thread.sleep(2000);
        pro.byXpath("AnnouncementsClick").click();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

    }

}


