package com.company.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
/*
Open the browser method
 */
    public static WebDriver driver;

    /**
     *
     This method will navigate to a website designated by the URL
     * @param url
     */
    public static void openWithSpecificURL(String url){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
    }

    /**
     * This method will quit the open browser
     */
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
