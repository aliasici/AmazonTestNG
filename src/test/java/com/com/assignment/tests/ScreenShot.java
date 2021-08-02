package com.com.assignment.tests;

import com.com.assignment.utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    @Test
    public void test(){

        Driver.getDriver().get("https://www.amazon.com");
        screenShot();
    }

    public void screenShot(){
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File view = new File(System.getProperty("user.dir")+ "/view.png");

        try {
            FileUtils.copyFile(source,view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
