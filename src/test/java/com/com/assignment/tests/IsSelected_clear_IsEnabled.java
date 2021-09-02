package com.com.assignment.tests;

import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class IsSelected_clear_IsEnabled {
   /*
   -How do you handle checkboxes and radio buttons

#1 - We locate them as any other web element
#2 - If we want to check the default value, we use .isSelected() method
#3 - If we want to select or unselect, we just use .click() method

.isSelected() ->
- You use it when you need to check the current state of the checkbox.
- Return type is boolean
- It will return true if the check box is currently selected. If not it will return false.



.isEnabled() ->
- You use it when you need to check if the given web element is enabled or not.

What is enabled?
- If it is clickable or not. If it is clickable, it means it is enabled.

- Return type is boolean
- It will return true if the check box is currently ENABLED. If not it will return false.
    */
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
        System.out.println( female.isSelected());//false

        BrowserUtils.wait(2);

        female.click();

        System.out.println(male.isSelected());//false
        System.out.println( female.isSelected());//true

        Driver.closeDriver();


    }
}
