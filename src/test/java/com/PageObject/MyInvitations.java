package com.PageObject;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.demo.ConfigirationManager.TestData;

public class MyInvitations extends TestBase {
    Login web = new Login();
    public void MYINVITATIONS()throws Exception{

        web.byXpath("MyInvitationClick").click();
        Thread.sleep(2000);
        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(0,200)");
        Thread.sleep(2000);
        WebElement ele = TestBase.byXpath("SelectEmailTemplateClick");
        Actions act = new Actions(TestBase.driver);
        act.moveToElement(ele).perform();
        Thread.sleep(4000);

        WebElement b = TestBase.byXpath("SelectEmailTemplate");
        Thread.sleep(2000);
        b.click();
        Thread.sleep(2000);

        web.byXpath("previewClick").click();
        Thread.sleep(5000);

        web.byXpath("CloseClick").click();
        Thread.sleep(2000);
        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(0,400)");

        web.byXpath("EnterInviteesInformationFirstName").sendKeys(TestData.getProperty("EnterInviteesInformationFirstName"));
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationLastName").sendKeys(TestData.getProperty("EnterInviteesInformationLastName"));
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationEmailID").sendKeys(TestData.getProperty("EnterInviteesInformationEmailIDText"));
        Thread.sleep(2000);
        web.byXpath("SendInviteClickTap").click();
        Thread.sleep(3000);
        web.byXpath("InviteOKButton").click();
        Thread.sleep(3000);


        web.byXpath("EnterInviteesInformationFirstName").sendKeys(TestData.getProperty("EnterInviteesInformationFirstName"));
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationLastName").sendKeys(TestData.getProperty("EnterInviteesInformationLastName"));
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationEmailID").sendKeys(TestData.getProperty("EnterInviteesInformationEmailIDText"));
        Thread.sleep(2000);
        web.byXpath("AddMoreInviteClick").click();
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationFirstName1").sendKeys(TestData.getProperty("EnterInviteesInformationFirstName1"));
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationLastName1").sendKeys(TestData.getProperty("EnterInviteesInformationLastName1"));
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationEmailID1").sendKeys(TestData.getProperty("EnterInviteesInformationEmailIDText1"));
        Thread.sleep(2000);
        web.byXpath("AddMoreInviteClick").click();
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationFirstName2").sendKeys(TestData.getProperty("EnterInviteesInformationFirstName2"));
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationLastName2").sendKeys(TestData.getProperty("EnterInviteesInformationLastName2"));
        Thread.sleep(2000);
        web.byXpath("EnterInviteesInformationEmailID2").sendKeys(TestData.getProperty("EnterInviteesInformationEmailIDText2"));
        Thread.sleep(2000);

        Thread.sleep(2000);
        web.byXpath("SendInviteClickTap").click();
        Thread.sleep(3000);
        web.byXpath("InviteOKButton").click();
        Thread.sleep(3000);


        web.byXpath("CheckBoxClick").click();
        Thread.sleep(2000);
       /* MyInvit.byXpath("SendInvite").click();
        driver.navigate().back();*/
        Thread.sleep(2000);
        web.byXpath("MySentInvitationsTab").click();
        Thread.sleep(2000);
       /* MyInvit.byXpath("ExportCSVFileClick").click();
        Thread.sleep(2000);*/
        web.byXpath("BackSentInvitationsTab").click();
        Thread.sleep(2000);

        web.byXpath("CreateEmailTemplate").click();

    }
}
