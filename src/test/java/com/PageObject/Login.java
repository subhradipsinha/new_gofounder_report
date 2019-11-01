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
    }

    // correct Password
    public void pass() throws Exception {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass1"));
        Thread.sleep(4000);
    }

    // Corrent LoginButtom
    public void log() throws Exception {
        TestBase.byXpath("Log").click();
        Thread.sleep(4000);

        String accul_error = TestData.getProperty("UserNamewrong");
        String expec_error = TestData.getProperty("LoginnotSuccessful");
        SoftAssert softAssertion = new SoftAssert();

        System.out.println("softAssert Method Was Started");
        softAssertion.assertEquals(accul_error,expec_error);
        System.out.println("softAssert Method Was Executed");
        softAssertion.assertAll();

        driver.navigate().refresh();

        Thread.sleep(2000);

    }



    // Double UserName
    public void uname1() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("unameuname"));
        Thread.sleep(4000);
    }
    //correct Password
    public void pass1()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass1"));
        Thread.sleep(4000);
    }

    //Corrent LoginButtom
    public void log1()throws Exception
    {
        TestBase.byXpath("Log").click();
        Thread.sleep(4000);


        String accul_error1 = TestData.getProperty("UserNamewrong");
        String expec_error1 = TestData.getProperty("LoginnotSuccessful");
        SoftAssert softAssertion = new SoftAssert();

        System.out.println("softAssert Method Was Started");
        softAssertion.assertEquals(accul_error1,expec_error1);
        System.out.println("softAssert Method Was Executed");
        softAssertion.assertAll();

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(4000);
    }
// Correct UserName
    public void uname2() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("uname1"));
        Thread.sleep(4000);
    }
    //Blank Password
    public void pass2()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass"));
        Thread.sleep(4000);
    }
    //Corrent LoginButtom
    public void log2()throws Exception
    {
        TestBase.byXpath("Log").click();
        Thread.sleep(4000);


        String accul_error2 = TestData.getProperty("Passwordwrong");
        String expec_error2 = TestData.getProperty("LoginnotSuccessful");
        SoftAssert softAssertion = new SoftAssert();

        System.out.println("softAssert Method Was Started");
        softAssertion.assertEquals(accul_error2,expec_error2);
        System.out.println("softAssert Method Was Executed");
        softAssertion.assertAll();
        driver.navigate().refresh();

        Thread.sleep(2000);

    }

    // Correct UserName
    public void uname3() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("uname1"));
        Thread.sleep(4000);
    }
    //Double Password
    public void pass3()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("passpass"));
        Thread.sleep(4000);
    }

    //Corrent LoginButtom
    public void log3()throws Exception
    {
        TestBase.byXpath("Log").click();
        Thread.sleep(4000);

        String accul_error3 = TestData.getProperty("Passwordwrong");
        String expec_error3 = TestData.getProperty("LoginnotSuccessful");
        SoftAssert softAssertion = new SoftAssert();

        System.out.println("softAssert Method Was Started");
        softAssertion.assertEquals(accul_error3,expec_error3);
        System.out.println("softAssert Method Was Executed");
        softAssertion.assertAll();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(4000);



    }

    // Correct UserName
    public void uname4() throws Exception {
        TestBase.byXpath("USerName").sendKeys(TestData.getProperty("uname1"));
        Thread.sleep(4000);
    }
    //Correct Password
    public void pass4()throws Exception
    {

        TestBase.byXpath("Password").sendKeys(TestData.getProperty("pass1"));
        Thread.sleep(4000);
    }

    //Corrent LoginButtom
    public void log4()throws Exception
    {
        TestBase.byXpath("Log").click();
        Thread.sleep(4000);



    }
}
