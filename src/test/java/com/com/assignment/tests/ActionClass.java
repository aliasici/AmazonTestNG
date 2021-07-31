package com.com.assignment.tests;

import com.com.assignment.utilities.ConfigurationReader;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class ActionClass {

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Actions actions = new Actions(Driver.getDriver());// PARAMETRE OLARAK DRIVER ISTIYOR BIZDEN

        Thread.sleep(3000);

        WebElement helloSignIn = Driver.getDriver().findElement(By.xpath("//span[text()='Hello, Sign in']"));

        actions.moveToElement(helloSignIn).perform();



    }
    @Test
    public void test2()throws InterruptedException{
        Driver.getDriver().get(ConfigurationReader.getProperty("url")); // Amazon a git

        WebElement signin = Driver.getDriver().findElement(By.id("nav-link-accountList-nav-line-1")); //Hello, Sign in e git...

        Actions actions = new Actions(Driver.getDriver()); // Actions class tan object create ettim

        actions.moveToElement(signin).perform(); // Actions class tan object i kullandim with perform();

        WebElement starthere = Driver.getDriver().findElement(By.xpath("//*[text()='Start here.']"));

        starthere.click();
        WebElement account = Driver.getDriver().findElement(By.id("ap_customer_name"));

       // account.click();


        actions.click(account)
                .sendKeys("Kilkuyruk", Keys.TAB)
                .sendKeys("hello@gmail.com", Keys.TAB)
                .sendKeys("123456", Keys.TAB)
                .sendKeys("123456", Keys.TAB)
                .sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        Driver.closeDriver();
    }

}
