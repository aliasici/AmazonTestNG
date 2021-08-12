package com.com.assignment.tests;

import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.Driver;
import org.apache.commons.math3.optim.univariate.BracketFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HTML_DropDown {

    @Test
    public void test1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(2);
        WebElement dropDown = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));

        BrowserUtils.wait(2);

        dropDown.click();

        WebElement facebookLink = Driver.getDriver().findElement(By.xpath("//a[.='Facebook']"));

        facebookLink.click();

        BrowserUtils.wait(2);

        String actualText = Driver.getDriver().getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        Assert.assertEquals(actualText,expectedTitle,"I did it");

        Driver.closeDriver();
    }
}
