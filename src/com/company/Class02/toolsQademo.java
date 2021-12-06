package com.company.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsQademo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement TextBox=driver.findElement(By.id("userName"));
        TextBox.sendKeys("this is a test");
        //*[@id="app"]/div/div/div[2]/div[2]/div[1]/div[3]/label
    }
}
