package com.company.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("randomemail@gmail.com"); //finds the webelement that uses the locator ID, whose value is "email"
        Thread.sleep(1000);
        driver.findElement(By.name("pass")).sendKeys("Hello"); //the sendKeys method types in whatever is in the "" into the field
        Thread.sleep(1000);
        //driver.findElement(By.name("login")).click(); //click method is used to click on the link
        //driver.findElement(By.linkText("Forgot password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();

    }
}
