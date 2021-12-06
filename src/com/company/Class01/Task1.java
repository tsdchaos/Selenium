package com.company.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*Launch the browser
    navigate to amazon website
    print out the title and the url in the console
    close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        String title=driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println("The current web page is: "+title);
        System.out.println("The current url is: "+url);
        driver.close();
    }
}
