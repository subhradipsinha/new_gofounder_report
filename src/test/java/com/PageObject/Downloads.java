package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;

public class Downloads extends TestBase {
    Login down = new Login();
    public void Downloadstest() throws Exception {
        down.byXpath("DownloadButtonClick").click();
        Thread.sleep(4000);
    }

    public static class Announcements extends ProfileClick {

        Login pro = new Login();

        public void annount() throws Exception {
            Thread.sleep(2000);
            pro.byXpath("AnnouncementsClick").click();
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("scroll(0,400)");

        }

    }
}


