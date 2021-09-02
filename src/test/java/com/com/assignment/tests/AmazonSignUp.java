package com.com.assignment.tests;

import com.com.assignment.pages.AmazonRegister;
import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.ConfigurationReader;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AmazonSignUp {

    AmazonRegister page = new AmazonRegister();

   //  WebDriver driver;

    @Test(priority = 1)
    public void test() throws MalformedURLException {
        String nodeURL = "http://192.168.0.201:4444/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN10);
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\aliasici\\OneDrive\\Desktop\\Grid\\grid_windows");


    }


    @Test(priority = 2)
    public void UserName()  {


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        page.signIn.click();
        BrowserUtils.wait(2);
        page.createAccount.click();
//        page.startHere.click();
//

        page.SignUp("Abuziddin","cebotal733@eyeremind.com","Kilkuyruk1","Kilkuyruk1");





    }








}
