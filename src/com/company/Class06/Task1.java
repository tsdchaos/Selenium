package com.company.Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement state = driver.findElement(By.cssSelector("select#multi-select"));
        //use the select class to select from drop down
        Select select = new Select(state);
        //Make a list of all of the options
        List<WebElement> options=select.getOptions();
        //Set up an iterator to get go through the options one by one
        Iterator<WebElement> iterator = options.iterator();
        while (iterator.hasNext()) {
            //Use iterator to sort through the options and the getText method to get the text from the options
            System.out.println(iterator.next().getText());
        }
    }
}
