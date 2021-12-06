package com.company.Class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Homer");
        driver.findElement(By.name("lastname")).sendKeys("Simpson");
        driver.findElement(By.name("reg_email__")).sendKeys("homer@simpson.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("homer@simpson.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass1234");
        driver.findElement(By.id("month")).sendKeys("Jan");
        driver.findElement(By.id("day")).sendKeys("10");
        driver.findElement(By.id("year")).sendKeys("1987");
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.close();




    }
}
