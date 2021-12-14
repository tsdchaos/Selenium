package com.company.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        WebElement startProject= driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
                                                                //a[contains(@id,'btn_b')] is another method
        startProject.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']"));
        simpleFormDemo.click();
        driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys("Hello");
        WebElement buttonClick=driver.findElement(By.xpath("//button[text()='Show Message']"));
        buttonClick.click();
        Thread.sleep(2000);
        driver.close();
    }
}
