package com.company.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        WebElement createNewAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccount.click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alan");
    }
}
