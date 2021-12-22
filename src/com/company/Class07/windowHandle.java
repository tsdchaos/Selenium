package com.company.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

        //get the address/handle of the page/window


        //click on help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termsBtn= driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));

        //click on them to open new windows
        helpBtn.click();
        termsBtn.click();
        privacyBtn.click();
        //We haven't switched the focus, so it is still on the main/home/signup page
        Set<String> windowHandles=driver.getWindowHandles();
        //print the size of windowHandles
        System.out.println(windowHandles.size());
        //in order to print all window handles, we need to iterate through the Set
        Iterator<String> iterator=windowHandles.iterator();
        String signUpPage= iterator.next();
        String helpPageHandle=iterator.next();
        String termsPageHandle= iterator.next();
        String privacyPageHande=iterator.next();
        System.out.println("The window handle for the signup page is: "+signUpPage);
        System.out.println("The window handle for the help page is: "+helpPageHandle);
        System.out.println("The window handle for the terms page is: "+termsPageHandle);
        System.out.println("The window handle for the privacy page is: "+privacyPageHande);

        Thread.sleep(1000);
        //switch to help page
        driver.switchTo().window(termsPageHandle);
        System.out.println(driver.getTitle());

    }
}
