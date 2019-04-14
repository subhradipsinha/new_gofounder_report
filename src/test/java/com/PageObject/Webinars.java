package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;

public class Webinars extends TestBase {
    Login Webi = new Login();
    public void webinar()throws Exception{
        Webi.byXpath("WebnarsClick").click();
        Thread.sleep(2000);
        Webi.byXpath("RecordedWebinarsClick").click();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        Thread.sleep(2000);
        Webi.byXpath("PlayVideoClick").click();
        Thread.sleep(10000);

        Webi.byXpath("StopVideoClick").click();
        Thread.sleep(4000);
    }

}


