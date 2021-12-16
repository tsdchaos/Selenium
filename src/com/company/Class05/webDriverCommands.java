package com.company.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        //navigate to the website
        //fill the username "AON"
        //delete the user name
        //fill the new username "Tester"

        //find the WebElement
        WebElement userField=driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        //send in the text AON
        userField.sendKeys("AON");
        //Delete the username entered
        Thread.sleep(2000);
        userField.clear();
        Thread.sleep(2000);
        //Enter in the new username "Tester"
        userField.sendKeys("Tester");

    }
}
