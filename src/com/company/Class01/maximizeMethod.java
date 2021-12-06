package com.company.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
       // driver.manage().window().maximize(); //maximizes the window
        driver.manage().window().fullscreen(); //to show fullscreen of your browser
    }

}
