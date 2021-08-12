package com.com.assignment.pages;

import com.com.assignment.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoBids {

    public AutoBids(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//p[text()=' Login ']")
    public WebElement login;


    // @FindBy(xpath = "//input[@type='email']")
    @FindBy(xpath = "//input[@placeholder=\"Email\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//p[text()='Sorry, user does not exist in the system.']")
    public WebElement errorMessage;

    // LOGIN WITH PHONE NUMBER..........
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "(//button[@type='submit'])[5]")
    public WebElement accept;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signInPhone;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userName;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//button[@type='submit']")
    public WebElement loginButton;


    public void login(String string, String string2){
        email.sendKeys(string);
        password.sendKeys(string2);

    }
}
