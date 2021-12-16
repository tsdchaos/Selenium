package com.company.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //find the dropdown
        WebElement days= driver.findElement(By.cssSelector("select#select-demo"));

        //use the select class to select from drop down
        Select select=new Select(days);

        //Select By Index
        //Click on Sunday
        select.selectByIndex(1);
        //Monday
        Thread.sleep(1000);
        select.selectByIndex(2);
        //Tuesday
        Thread.sleep(1000);
        select.selectByIndex(3);

        //Select by Visible Text
        Thread.sleep(2000);
        select.selectByVisibleText("Thursday");

        //Select by Value
        select.selectByValue("Friday");


    }
}
