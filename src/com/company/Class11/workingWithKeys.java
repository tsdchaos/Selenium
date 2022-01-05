package com.company.Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class workingWithKeys {
    public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //locate the user name and password fields
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));

        //send the username and password
        username.sendKeys("Tester", Keys.TAB);
        password.sendKeys("test", Keys.ENTER);

        //taking the screenshot
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        //This step takes the screen shot
        File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        //save the screenshot in our computer
        try{
            //Copy the screenshot to a new directory inside the project and give the path to that particular screenshot
            FileUtils.copyFile(sourceFile, new File("screenshot/login/adminlogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
