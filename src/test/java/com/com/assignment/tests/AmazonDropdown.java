package com.com.assignment.tests;

import com.com.assignment.utilities.ConfigurationReader;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonDropdown {

    @Test
    public void test1(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropdown);

        List<WebElement> list =  select.getOptions();

        for (WebElement each :list) {
            System.out.println(each.getText());

        }

       // System.out.println("list = " + list);


      //  select.selectByValue("search-alias=audible");


        boolean result = isAlphabetic(list);

        System.out.println(result);
    }

    @Test
    public void test2(){
        System.out.println("Second test is running");
    }

    public boolean isAlphabetic(List<WebElement> list){

        boolean alphabetic = false;

        for (int i = 1; i <list.size(); i++){

            WebElement first = list.get(i-1);
            WebElement second = list.get(i);
            if(first.getText().compareTo(second.getText()) < 0){

                alphabetic = true;
            }else {
                alphabetic = false;
                break;
            }

        }
        return alphabetic;

    }
}
