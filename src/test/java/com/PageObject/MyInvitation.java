package com.PageObject;

import com.demo.TestBase;

public class MyInvitation extends TestBase {
    Login MyInvits = new Login();

    public void Invitation() throws Exception {
        MyInvits.byXpath("MyInviteClick").click();
        Thread.sleep(3000);
    }
}