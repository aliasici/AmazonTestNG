package com.com.assignment.tests;

import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.com.assignment.utilities.Driver.getDriver;

public class ActionClassWarmUp {

    @Test
    public void singleClick() throws InterruptedException {

        Driver.getDriver().get("http://uitestpractice.com/Students/Actions");

        Actions actions = new Actions(Driver.getDriver());

        WebElement singleClick = getDriver().findElement(By.xpath("//*[text()='Click Me !']"));

        actions.click(singleClick).perform();
        Thread.sleep(3);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(3>9);


        Driver.closeDriver();
    }



    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("http://uitestpractice.com/Students/Actions");

        Actions actions = new Actions(Driver.getDriver());

        WebElement doubleClick = getDriver().findElement(By.xpath("//*[text()='Double Click Me !']"));

        actions.doubleClick(doubleClick).perform();
        Thread.sleep(3);

//        Alert alert = Driver.getDriver().switchTo().alert();
//
//        String text = alert.getText();
//
//        System.out.println(text);
//
//        BrowserUtils.wait(2);
//        alert.dismiss();
//        Driver.closeDriver();
    }
}
