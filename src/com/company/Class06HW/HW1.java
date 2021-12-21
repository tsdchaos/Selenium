package com.company.Class06HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //Simple Alert
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();
        //Confirm Alert
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
        Thread.sleep(2000);
        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.accept();
        Thread.sleep(1000);
        //Prompt Alert
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
        Thread.sleep(1000);
        Alert promptAlert=driver.switchTo().alert();
        Thread.sleep(1000);
        promptAlert.sendKeys("TESTING123");
        promptAlert.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
