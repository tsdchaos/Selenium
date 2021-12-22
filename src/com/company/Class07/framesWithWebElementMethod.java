package com.company.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesWithWebElementMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        //switch to the desired frame
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement text1=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is:         "+text1.getText());
    }
}
