package com.com.assignment.pages;

import com.com.assignment.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EtsyDropdown {

    public EtsyDropdown(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@data-id='search-query']")
    public WebElement searchBox;

//    @FindBy(xpath= "//img[@class='wt-width-full wt-height-full wt-display-block wt-position-absolute  ']") // SUPER ELEMENT SAYSISINDAN BULDUK
//    public WebElement gifts;

    @FindBy(xpath= "(//a[@data-shop-id='20874736'])[1]") //select[@id='inventory-variation-select-0']
    public WebElement giftItem;



    @FindBy(xpath = "//button[@class='wt-btn wt-btn--filled wt-width-full']") ////button[@class='wt-btn wt-btn--filled wt-width-full']
    public WebElement button;

    @FindBy(xpath = "//h1[@class='wt-text-heading-01']")
    public WebElement itemText;
    

    //BU ISI BASARACAGIM
    //OLACAK INS
    // OLACAK CANIM merhabalar





//    public void setDropdown(){
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("Gold");
//
//    }
}
