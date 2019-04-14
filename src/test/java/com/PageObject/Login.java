package com.PageObject;



import com.demo.TestBase;
import org.testng.annotations.Test;

import static com.demo.ConfigirationManager.TestData;

public class Login extends TestBase {



    public void init() throws Exception {
        TestBase.initilize();
        Thread.sleep(5000);
    }

    public void uname() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("uname"));
        Thread.sleep(4000);
    }
    public void pass()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass"));
        Thread.sleep(4000);
    }
    public void log()throws Exception
    {
        TestBase.byXpath("Log").click();
        Thread.sleep(4000);
    }
}
