package com.company.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        //navigate to the syntax checkbox demo and check the first checkbox
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //locate the webEleemnt checkBox
        WebElement singleCheckBox=driver.findElement(By.cssSelector("input#isAgeSelected"));
        //check the checkbox
        singleCheckBox.click();
        Thread.sleep(2000);
        //uncheck the check box
        singleCheckBox.click();

        //task 2 check all the check boxes
        List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@class='cb1-element']"));
        System.out.println("The number of checkboxes present are: "+checkBoxes.size());

        for(WebElement checkBox:checkBoxes){
            //select the checkbox with the text, option 3
            //get the attribute "value"
            if(checkBox.getAttribute("value").equals("Option-3")){
                checkBox.click();
            }

        }
    }
}
