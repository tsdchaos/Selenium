package com.company.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class rightDoubleClick {
    public static String url="http://demo.guru99.com/test/simple_context_menu.html";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        //Find the right click button
        WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightClick).perform();
        //find the double clikc button
        WebElement dubClick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(dubClick).perform();
        driver.switchTo().alert().accept();
    }
}
