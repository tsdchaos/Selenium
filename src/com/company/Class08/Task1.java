package com.company.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        //declaring a implicit wait for finding elements
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //Find and click on the start button
        WebElement startBtn= driver.findElement(By.cssSelector("button#startButton"));
        startBtn.click();
        //Get the text from the button after pressing
        Thread.sleep(6000);
        WebElement btnText= driver.findElement(By.xpath("//div[@id='finish']/h4"));
        System.out.println(btnText.getText());


    }
}
