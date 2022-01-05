package com.company.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadAFile {
    public static String url="https://the-internet.herokuapp.com/upload";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //locate the choose file button
        WebElement chooseFile= driver.findElement(By.cssSelector("input#file-upload"));
        //in order to upload the file
        chooseFile.sendKeys("C:\\Users\\12037\\IdeaProjects\\SeleniumBatch11\\screenshot\\login\\adminlogin.png");
        //Once uploaded locate the submit and click upload
        driver.findElement(By.cssSelector("input#file-submit")).click();
    }
}
