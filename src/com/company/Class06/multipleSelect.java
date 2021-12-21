package com.company.Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //find the dropdown
        WebElement state=driver.findElement(By.cssSelector("select#multi-select"));
        //use the select class to select from drop down
        Select select=new Select(state);
        //Find out if the dropdown is multiple select or not
        boolean isMultiple= select.isMultiple();
        System.out.println(isMultiple);

        //Select by Index
        select.selectByIndex(0);
        //Select by visible text
        select.selectByVisibleText("Texas");
        //Select by value
        select.selectByValue("New York");
        //Deselect by index
        select.deselectByIndex(0);
        //Delesect by visible text
        select.deselectByVisibleText("Texas");

        //De-Select all
        Thread.sleep(2000);
        select.deselectAll();
        Thread.sleep(1000);
        driver.close();

    }
}
