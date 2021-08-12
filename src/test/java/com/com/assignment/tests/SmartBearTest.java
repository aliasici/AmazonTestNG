package com.com.assignment.tests;

import com.com.assignment.utilities.Driver;
import com.com.assignment.utilities.SmartBearUtilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SmartBearTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = Driver.getDriver();
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.loginToSmartBear(driver);
    }

}
