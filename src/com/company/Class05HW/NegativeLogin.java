package com.company.Class05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement noPass=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        if(noPass.isDisplayed()){
            System.out.println("Test passed");
        }


    }
}
