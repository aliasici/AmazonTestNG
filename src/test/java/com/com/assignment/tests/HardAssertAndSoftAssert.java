package com.com.assignment.tests;

import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.ConfigurationReader;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertAndSoftAssert {

    @Test
    public void test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        //Driver will be wait limited time for finding any web elemts
        //HERE WE CREATED DRIVER IN DRVER CLASS AND USED IMPLICITWAIT method`
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String title = Driver.getDriver().getTitle();

        BrowserUtils.wait(2);

        //HardAssert
        // Assert : Test basarisiz olursa testin kalan kismini calistirmaz
        // Assert.assertEquals(title,"Amazon");

        //Verify : Bu adimdaki dogrulama basarisiz olsa ble test diger adimlarla devam eder
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title,"Amazon");
    }
}
