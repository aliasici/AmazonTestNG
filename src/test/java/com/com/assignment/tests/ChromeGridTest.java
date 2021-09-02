package com.com.assignment.tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeGridTest {

    public static WebDriver driver;


    public static void main(String[]  args) throws MalformedURLException, InterruptedException{

        try {
            String URL = "https://www.google.com";
            String Node = "https://192.168.0.201:4444/wd/hub";
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.WIN10);


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\aliasici\\OneDrive\\Desktop\\Grid\\chromedriver_win32");
            System.out.println(System.getProperty("webdriver.chrome.driver"));

            WebDriver driver = new RemoteWebDriver(new URL(Node), cap);

            driver.navigate().to(URL);
            Thread.sleep(5000);
            driver.quit();

        }catch (MalformedURLException e){
            e.printStackTrace();
        }


//        String nodeURL = "http://192.168.0.201:4444/wd/hub";
//
//        // definition Des. cap
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setBrowserName("chrome");
//        cap.setPlatform(Platform.ANY);
//
//        //Chrome options definitions
//        ChromeOptions options = new ChromeOptions();
//        options.merge(cap);
//        WebDriver driver = new RemoteWebDriver(new URL(nodeURL), options);
//
//        driver.get("http://www.freecrm.com");
//        System.out.println(driver.getTitle());



    }
}
