package com.company.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class reviewExplicit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/explicit-wait");
        //locate the enable button after 10 second utton and click on it
        WebElement enableButton= driver.findElement(By.cssSelector("button#enable-button"));
        enableButton.click();
        //print the state of the button ater it is enabled
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));
        //Print whether the button is enabled or not
        WebElement disButton= driver.findElement(By.cssSelector("button#disable"));
        boolean status=disButton.isEnabled();
        System.out.println("Is the button enabled? "+status);
    }
}
