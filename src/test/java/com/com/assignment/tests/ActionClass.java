package com.com.assignment.tests;

import com.com.assignment.utilities.ConfigurationReader;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignUp {

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Actions actions = new Actions(Driver.getDriver());// PARAMETRE OLARAK DRIVER ISTIYOR BIZDEN

        Thread.sleep(3000);

        WebElement helloSignIn = Driver.getDriver().findElement(By.xpath("//span[text()='Hello, Sign in']"));

        actions.moveToElement(helloSignIn).click();



    }

}
