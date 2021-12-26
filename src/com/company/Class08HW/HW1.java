package com.company.Class08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;

public class HW1 {
    public static void main(String[] args) {
        /*
        goto http://syntaxprojects.com/window-popup-modal-demo.php
        click on follow on instagram
        get the title of new window and print it on the console
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        //Find Instagram button
        WebElement instaBtn= driver.findElement(By.cssSelector("a[title*='Instagram']"));
        //click on button
        instaBtn.click();
        //Get the window handles and iterate through to get to the Instagram page
        //Get all handles
        Set<String> handles=driver.getWindowHandles();
        //Find the desired handle by iterating through the set
        Iterator<String> iterator= handles.iterator();
        //Iterate through the set to see if it is the desired one
        String finalTitle="";
        while(iterator.hasNext()){
            String handle= iterator.next();
            //Switch to the new window
            driver.switchTo().window(handle);
            //Get the title
            String title= driver.getTitle();
            if(title.equalsIgnoreCase("Login • Instagram")){
                finalTitle=title;
                break;
            }
        }
        System.out.println("The title of the Instagram page is: "+finalTitle);
        driver.quit();

    }
}
