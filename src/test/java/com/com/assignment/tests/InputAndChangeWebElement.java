package com.com.assignment.tests;

import com.com.assignment.utilities.ConfigurationReader;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InputAndChangeWebElement {


    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Iphone");

        Thread.sleep(3000);

        searchBox.clear(); //IT IS GONNA BE CLEAR IN SERACHBOX



    }
    @Test
    public void test2() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        WebElement banner = Driver.getDriver().findElement(By.cssSelector(".a-section.a-spacing-none.a-padding-base.a-text-center._top-banner-text-link_style_top-banner__35DYz.top-banner-text-link"));

        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("arguments[0].value='Avinash Mishra';", webl

        js.executeScript("arguments[0].innerText= 'Hello World';", banner);
    }
}
