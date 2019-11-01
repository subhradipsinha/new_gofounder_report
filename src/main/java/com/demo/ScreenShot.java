package com.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShot {
    public static void nexflow(WebDriver dv, String screenshotName)
    {
        try {
            TakesScreenshot scrShot =((TakesScreenshot)dv);
            File source = scrShot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./Screenshot/"+screenshotName+".png"));
            System.out.println("Screenshot Done");
        } catch (Exception e)
        {
            System.out.println("Exception while taking screenshot"+ e.getMessage());
        }
    }
}

