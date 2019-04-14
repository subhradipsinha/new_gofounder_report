package com.PageObject;

import com.demo.TestBase;

public class Tutorials extends TestBase {
    Login Tutorialstest = new Login();
    public void tutorialsButton() throws Exception {
        Tutorialstest.byXpath("tutorialsButtonClick").click();
        Thread.sleep(5000);
//        Tutorialstest.byXpath("tutorialvideoplay").click();
//        Thread.sleep(10000);
//        Tutorialstest.byXpath("tutorialvideostop").click();
//        Thread.sleep(4000);
    }
}
