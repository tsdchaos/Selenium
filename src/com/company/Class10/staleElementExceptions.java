package com.company.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class staleElementExceptions {
    public static String url="https://chercher.tech/practice/stale-element";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        //find the refresh button
        WebElement refresh= driver.findElement(By.cssSelector("button#refresh-button"));
        //Wait for 11 seconds then click on the button
        Thread.sleep(11000);
        refresh.click();
    }
}
