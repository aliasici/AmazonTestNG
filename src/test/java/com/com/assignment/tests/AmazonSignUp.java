package com.com.assignment.tests;

import com.assignment.pages.AmazonRegister;
import com.assignment.utilities.BrowserUtils;
import com.assignment.utilities.Driver;
import org.testng.annotations.Test;

public class AmazonSignUp {

    AmazonRegister page = new AmazonRegister();

    @Test
    public void UserName(){

        Driver.getDriver().get("https://www.amazon.com/");

        BrowserUtils.wait(2);


        page.signIn.click();
        BrowserUtils.wait(2);
        page.createAccount.click();
//        page.startHere.click();
//

        page.SignUp("Abuziddin","cebotal733@eyeremind.com","Kilkuyruk1","Kilkuyruk1");





    }








}
