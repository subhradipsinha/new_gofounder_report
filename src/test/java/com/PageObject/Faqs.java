package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;

public class Faqs extends TestBase {
    Login Faqstest = new Login();
    public void Faqstext() throws Exception {
        Faqstest.byXpath("FaqsXpath").click();
        Thread.sleep(2000);
        Faqstest.byXpath("SupportClick").click();
        Thread.sleep(5000);
        Faqstest.byXpath("ChoseFile").click();
        Thread.sleep(4000);
        Faqstest.byXpath("Desktop").click();
        Thread.sleep(2000);
        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(0,300)");

    }
}
