package com.PageObject;



import com.demo.ConfigirationManager;
import com.demo.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.URL;

import static com.demo.ConfigirationManager.TestData;

public class Login extends TestBase {


    public void init() throws Exception {
        TestBase.initilize();
        Thread.sleep(5000);
    }

    // User Name Blank
    public void uname() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("uname"));
        Thread.sleep(4000);
        System.out.println("uname()");
    }

    // correct Password
    public void pass() throws Exception {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass1"));
        Thread.sleep(4000);
        System.out.println("pass()");
    }

    // Corrent LoginButtom
    public void log() throws Exception {
        TestBase.byXpath("Log").click();
        System.out.println("log()");
        Thread.sleep(4000);

        driver.navigate().refresh();

        Thread.sleep(2000);

    }



    // Double UserName
    public void uname1() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("unameuname"));
        System.out.println("uname1()");
        Thread.sleep(4000);
    }
    //correct Password
    public void pass1()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass1"));
        System.out.println("pass1()");
        Thread.sleep(4000);
    }

    //Corrent LoginButtom
    public void log1()throws Exception
    {
        TestBase.byXpath("Log").click();
        System.out.println("log1()");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
    }
// Correct UserName
    public void uname2() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("uname1"));
        System.out.println("uname2()");
        Thread.sleep(4000);
    }
    //Blank Password
    public void pass2()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass"));
        System.out.println("pass2()");
        Thread.sleep(4000);
    }
    //Corrent LoginButtom
    public void log2()throws Exception
    {
        TestBase.byXpath("Log").click();
        System.out.println("log2()");
        Thread.sleep(4000);
        driver.navigate().refresh();

        Thread.sleep(2000);

    }

    // Correct UserName
    public void uname3() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("uname1"));
        System.out.println("uname3()");
        Thread.sleep(4000);
    }
    //Double Password
    public void pass3()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("passpass"));
        System.out.println("pass3()");
        Thread.sleep(4000);
    }

    //Corrent LoginButtom
    public void log3()throws Exception
    {
        TestBase.byXpath("Log").click();
        System.out.println("log3()");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);



    }

    // Correct UserName
    public void uname4() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("uname1"));
        System.out.println("uname4()");
        Thread.sleep(4000);
    }
    //Correct Password
    public void pass4()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass1"));
        System.out.println("pass4()");
        Thread.sleep(4000);
    }

    //Corrent LoginButtom
    public void log4()throws Exception
    {
        TestBase.byXpath("Log").click();
        System.out.println("log4()");
        Thread.sleep(4000);



    }
}
