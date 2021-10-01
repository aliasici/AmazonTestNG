package com.com.assignment.tests;

import com.com.assignment.pages.AutoBids;
import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.HashMap;

public class AutoBidsLogin {
    AutoBids autoBids = new AutoBids();

    @Test
    public void test() throws InterruptedException{

        Driver.getDriver().get("https://www.theautobids.com/");
        autoBids.login.click();

        BrowserUtils.wait(2);

//
//        String credentials_customer = getCredentials().get("user");
//        autoBids.email.sendKeys(credentials_customer.split(":")[0]);
//        autoBids.password.sendKeys(credentials_customer.split(":")[1]);
        autoBids.email.sendKeys(getUserName("user"));
        autoBids.password.sendKeys(getPassword("user"));

        autoBids.submit.click();

        BrowserUtils.wait(3);


        WebElement main = Driver.getDriver().findElement(By.xpath("//spam[@class='text-start me-2']"));

        main.click();

        Actions actions = new Actions(Driver.getDriver());// PARAMETRE OLARAK DRIVER ISTIYOR BIZDEN
        Thread.sleep(3000);

        WebElement logout = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Logout')]"));

        actions.moveToElement(logout).perform();

       // logout.click();


        Driver.closeDriver();

    }

    public static HashMap<String, String> getCredentials(){
        HashMap<String , String> userMap = new HashMap<>();

        userMap.put("user","aliasici@hotmail.com:Irvine");
        userMap.put("manager","ali.asici@theautobids.com:Irvine1130");


        //userMap.put("")

        return userMap;
    }
    public static String getUserName(String role){
        String credentials = getCredentials().get(role);
        return credentials.split(":")[0];

    }
    public static String getPassword(String role){
        String credentials = getCredentials().get(role);
        return credentials.split(":")[1];

    }
}
