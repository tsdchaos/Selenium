package com.company.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        //Switch to the desired frame
        driver.switchTo().frame("frame1");

        //getting the WebElement
        WebElement text1=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is:         "+text1.getText());

        //Switch to frame 2
        //as frame 2 doens't lie inside frame 11, in order to get there, we need to switch our focus to the main page
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        //locate the webElement
        WebElement text2=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("The text is:     "+text2.getText());

        //Switch focus back to the default
        driver.switchTo().defaultContent();

    }
}
