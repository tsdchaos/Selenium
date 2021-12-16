package com.company.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.ebay.com");
        driver.manage().window().maximize();

        //go to the ebay website
        driver.get("http://www.ebay.com");
        driver.manage().window().maximize();
        //get all the links that are there on ebay.com
        List<WebElement> links = driver.findElements(By.tagName("a")); //findElements method pulls all elements that fulfill the criteria
        //as there are multiple elements, we need to store it in a list of WebElements

        //print the size of the list
        System.out.println("The size of the list containing links is: "+links.size());

        //print all the text in the links
        for(WebElement link:links){
            String linkText=link.getText();
            //only print the links that have some text and ignore the rest
            if(!linkText.isEmpty()) {
                System.out.println(linkText);
                //print all the links along with the text
                //use the method .getAttribute to heave the value of a particular attribute in the tag
                String linkAddress= link.getAttribute("href");
                System.out.println(linkAddress);
                System.out.println("----------------------------");
            }
        }


    }
}
