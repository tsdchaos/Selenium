package com.company.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //getting the radio btn webElement
        WebElement radioF=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));

        boolean isDisplayed= radioF.isDisplayed();
        System.out.println("The female radio button is displayed: "+isDisplayed);

        //Check if the female radio button is enabled
        boolean isEnabled=radioF.isEnabled();
        System.out.println("the radio button is enabled on the webpage: "+isEnabled);

        //check if the female radio button is selected
        boolean isSelected= radioF.isSelected();
        System.out.println("The female radio button is selected on the webpage: "+isSelected);

        //select the female radio button only if it's enabled
        if(radioF.isEnabled()) { //checks to see if the Female Radio Button is displayed(boolean)
            radioF.click();
        }
        driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
        isEnabled=radioF.isEnabled();
        System.out.println("The female radio button is selected on the webpage: "+isSelected);
    }
}
