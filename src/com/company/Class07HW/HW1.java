package com.company.Class07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    /*
    goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
click on follow on instagram
click on facebook.com
get all windows handles
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        //Find the elements for Instagram and Facebook Buttons
        WebElement instaFbBtn= driver.findElement(By.xpath("//a[text()='Follow Instagram & Facebook']"));
        //Click on Instagram/Facebook button
        instaFbBtn.click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        //Get all of the handles
        Set<String> windowHandles=driver.getWindowHandles();
        //Iterate through all of the handles and assign them to variables
        Iterator<String> iterator=windowHandles.iterator();
        int handlesSize=windowHandles.size();
        System.out.println(handlesSize);
        String mainPgHandle= iterator.next();
        String instaHandle= iterator.next();
        String fbHandle= iterator.next();
        System.out.println("The handle for the main page is: "+mainPgHandle);
        System.out.println("The handle for Instagram is: "+instaHandle);
        System.out.println("The handle for Facebook is: "+fbHandle);


    }
}
