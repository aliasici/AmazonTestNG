package com.com.assignment.tests;

import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class IsSelected_clear_IsEnabled {
    //BASARACAGIM INSALLAH
    // no CONFLICT


    @Test
    public void test1(){

        Driver.getDriver().get("https://demo.nopcommerce.com/");
        WebElement searchStore = Driver.getDriver().findElement(By.xpath("//input[@id='small-searchterms']"));
        BrowserUtils.wait(2);

        System.out.println("searchStore.isDisplayed() = " + searchStore.isDisplayed());
        System.out.println("searchStore.isEnabled() = " + searchStore.isEnabled());

        WebElement register = Driver.getDriver().findElement(By.xpath("//a[@class='ico-register']"));

        register.click();
        BrowserUtils.wait(2);
       WebElement male = Driver.getDriver().findElement(By.xpath("//input[@id='gender-male']"));

       WebElement female = Driver.getDriver().findElement(By.xpath("//input[@id='gender-female']"));

        BrowserUtils.wait(2);


        System.out.println( male.isSelected());//false
        System.out.println( female.isSelected());//false

        male.click();


        BrowserUtils.wait(2);


        System.out.println(male.isSelected()); //true
        System.out.println( female.isSelected());//true

        BrowserUtils.wait(2);

        female.click();

        System.out.println(male.isSelected());//false
        System.out.println( female.isSelected());//true

        Driver.closeDriver();


    }
}
