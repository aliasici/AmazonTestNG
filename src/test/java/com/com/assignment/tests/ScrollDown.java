package com.com.assignment.tests;

import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.ConfigurationReader;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDown {

    //Action class ile PageDown tusu ile islem yapariz
    //JavaScript ile yapabiliriz

    @Test
    public void test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Actions actions  = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        BrowserUtils.wait(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }
    @Test
    public void test1(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        JavascriptExecutor jsExecuter = ((JavascriptExecutor) Driver.getDriver());

        jsExecuter.executeScript("window.scrollTo(0,300)");

        BrowserUtils.wait(3);

        jsExecuter.executeScript("window.scrollTo(0,600)");

        BrowserUtils.wait(3);

        jsExecuter.executeScript("window.scrollTo(0,900)");




    }
}
