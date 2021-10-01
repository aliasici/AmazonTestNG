package com.com.assignment.tests;

import com.com.assignment.pages.EtsyDropdown;
import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Etsy {
    EtsyDropdown etsyDropdown = new EtsyDropdown();


    @Test
    public void test1(){
            Driver.getDriver().get("https://www.etsy.com/?ref=lgo");

            etsyDropdown.searchBox.sendKeys("party decor", Keys.ENTER);

            BrowserUtils.wait(2);

            etsyDropdown.giftItem.click();

            BrowserUtils.wait(5);

            Set<String> list = Driver.getDriver().getWindowHandles();

            ArrayList<String> windowList = new ArrayList<>(list);
            System.out.println("list = " + list);
            BrowserUtils.wait(2);

            Driver.getDriver().switchTo().window(windowList.get(1));

            BrowserUtils.wait(2);
            Select select = new Select(Driver.getDriver().findElement(By.id("variation-select-0")));

            BrowserUtils.wait(2);

            select.selectByValue("2100265339");

            BrowserUtils.wait(3);

            etsyDropdown.button.click();

            BrowserUtils.wait(2);

            Driver.closeDriver();


    }

    @Test
    public void test2(){
      Driver.getDriver().get("https://www.google.com");

      String actualTitle = Driver.getDriver().getTitle();

      Assert.assertEquals(actualTitle,"Google");

    }
    @Test
    public void test3(){
        Driver.getDriver().get("https://www.wikipedia.org/");
        WebElement search = Driver.getDriver().findElement(By.id("searchInput"));

        search.sendKeys("John Travolta"+Keys.ENTER);

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains("John"));
        
        Driver.closeDriver();


    }





}
