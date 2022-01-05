package com.company.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class actionClass {
    public static String url="https://jqueryui.com/droppable/";
    public static void main(String[] args) {System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        //switch to the iframe
        driver.switchTo().frame(0);
        //locate the draggable
        WebElement draggable= driver.findElement(By.cssSelector("div#draggable"));
        //locate the drop location
        WebElement dropOff=driver.findElement(By.cssSelector("div#droppable"));

        Actions actions=new Actions(driver);
        //Drags the first object to the second
//        actions.dragAndDrop(draggable, dropOff).perform();
        actions.clickAndHold(draggable).moveToElement(dropOff).release().build().perform();
        //When chaining methods together, you must build(), to hold together the chainable methods. It is best practice

    }
}
