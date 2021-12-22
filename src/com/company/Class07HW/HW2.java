package com.company.Class07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
     goto https://demoqa.com/nestedframes
    print the text childframe on console (edited)
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
        //Switch to Parent frame
        driver.switchTo().frame("frame1");
        //Switch to the Child frame
        WebElement childFrame= driver.findElement(By.cssSelector("iframe[srcdoc*='Child Iframe']"));
        driver.switchTo().frame(childFrame);
        String childFrameText=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        System.out.println("The text in the child frame is: "+childFrameText);
    }
}
