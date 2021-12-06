package com.company.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
        //set the path to the driver executable
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //creating a object of ChromeDriver
        WebDriver driver=new ChromeDriver();
        //calling a get method to get to a particular website
        driver.get("https://www.google.com");
        //returns the current url loaded in the browser
        String url= driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is: "+url);
        //retrieve the title of the webpage
        String title=driver.getTitle();
        System.out.println("The current of the page is: "+title);

        //close the browser
        driver.quit();
    }
}
