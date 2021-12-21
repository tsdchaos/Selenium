package com.company.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/Students/switchto");
        //enable the alert
        WebElement alertButton= driver.findElement(By.xpath("//button[@id='alert']"));
        alertButton.click();
        Thread.sleep(1000);
        //Switch the focus of Selenium
        Alert simpleAlert= driver.switchTo().alert();
        simpleAlert.accept(); //Clicks ok, and accepts the alert
        //Confirm alert!
        WebElement confirmAlertButton= driver.findElement(By.xpath("//button[@id='confirm']"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        //Switch the focus of Selenium
        Alert confirmAlert=driver.switchTo().alert();
        //get the text from this alert

       // System.out.println(confirmAlert.getText());
        //cancel the alert

        confirmAlert.accept();

        //Prompt alert
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
        //switch focus
        Alert promptAlert=driver.switchTo().alert();
        //send some keys to the alert

        promptAlert.sendKeys("Testing");
        Thread.sleep(2000);
        promptAlert.accept();

        driver.quit();
    }
}
