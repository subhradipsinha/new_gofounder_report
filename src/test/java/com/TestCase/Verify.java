package com.TestCase;

import com.PageObject.*;
import org.testng.annotations.Test;

public class Verify {

    public static Login text = new Login();
    public static Dashbord dash = new Dashbord();
    public static ProfileClick pf = new ProfileClick();
    public static Announcements accounce = new Announcements();
    public static Community com = new Community();
    public static Webinars web = new Webinars();
    public static MyInvitations myInvitations = new MyInvitations();
    public static MyInvitation myInvitation = new MyInvitation();
    public static MyTeam myTeam = new MyTeam();
    public static Mylinks mylinks = new Mylinks();
    public static Marketing mar = new Marketing();
    public static Downloads downloads = new Downloads();
    public static Tutorials tutorials = new Tutorials();
    public static Faqs faqs = new Faqs();
    public static LoginIDText loginIDText = new LoginIDText();


    @Test
    public void verifyValidLogin() throws Exception {

        text.init();
        text.uname();
        text.uname1();
        text.uname2();
        text.uname3();
        text.uname4();
        text.pass();
        text.pass1();
        text.pass2();
        text.pass3();
        text.pass4();
        text.log1();
        text.log2();
        text.log3();
        text.log4();




    }
}
