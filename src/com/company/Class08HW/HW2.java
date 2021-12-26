package com.company.Class08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto https://chercher.tech/practice/implicit-wait-example
        the checkbox take 10 seconds  to populate
        use implicit wait to check only the first checkbox that populates
        close the browser
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/implicit-wait-example");
        //Find the checkboxes
        WebElement checkBox= driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkBox.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
