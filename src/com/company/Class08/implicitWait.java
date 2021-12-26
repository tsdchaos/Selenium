package com.company.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");

        //declaring a implicit wait for finding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //find the button to get new user
        WebElement getNewUser=driver.findElement(By.cssSelector("button#save"));
        getNewUser.click();
        //Get new user First Name
        WebElement firstName= driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(firstName.getText());
    }
}
