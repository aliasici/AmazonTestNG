package com.com.assignment.tests;

import com.com.assignment.pages.AmazonRegister;
import com.com.assignment.utilities.BrowserUtils;
import com.com.assignment.utilities.ConfigurationReader;
import com.com.assignment.utilities.Driver;
import org.testng.annotations.Test;

public class AmazonSignUp {

    AmazonRegister page = new AmazonRegister();


    @Test
    public void UserName(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        BrowserUtils.wait(2);


        page.signIn.click();
        BrowserUtils.wait(2);
        page.createAccount.click();
//        page.startHere.click();
//

        page.SignUp("Abuziddin","cebotal733@eyeremind.com","Kilkuyruk1","Kilkuyruk1");





    }








}
