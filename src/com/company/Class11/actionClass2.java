package com.company.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClass2 {
    public static String url="https://www.amazon.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //find the element
        WebElement accountsAndLists = driver.findElement(By.cssSelector("a#nav-link-accountList"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountsAndLists).perform();

    }
}
