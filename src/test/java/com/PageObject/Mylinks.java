package com.PageObject;

import com.demo.TestBase;

public class Mylinks extends TestBase {
    Login links = new Login();
    public void linkText()throws Exception{
        links.byXpath("MyLinksClick").click();
        Thread.sleep(2000);
        links.byXpath("ShareeHistoryButtonClick").click();
        Thread.sleep(2000);
        links.byXpath("BacktoMylinks").click();
        Thread.sleep(5000);
    }
}
