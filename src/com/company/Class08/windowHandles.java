package com.company.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

//Task is to open up a new tab and a new window
//Switch to the new tab, and get the text
public class windowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        //Find the new tab button, and the new window button
        WebElement tabBtn= driver.findElement(By.xpath("//button[@id='tabButton']"));
        WebElement windowBtn= driver.findElement(By.xpath("//button[@id='windowButton']"));
        //click on both buttons
        tabBtn.click();
        windowBtn.click();
        //Get the handle for the main page/home page/parent page
        String parentHandle=driver.getWindowHandle();
        System.out.println("Parent window handle: "+parentHandle);
        //Get all handles
        Set<String> handles=driver.getWindowHandles();
        //Find the desired handle by iterating through the set
        Iterator<String> iterator= handles.iterator();
        //Iterate through the set to see if it is the desired one
        while(iterator.hasNext()){
            String handle= iterator.next();
            driver.switchTo().window(handle);
            if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
        WebElement text=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());
        //click on New Window Message Button
        driver.switchTo().defaultContent();
        WebElement newWindowMessage=driver.findElement(By.cssSelector("button#messageWindowButton"));
        newWindowMessage.click();
        driver.quit();
    }
}
