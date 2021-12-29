package com.company.Class09HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
    goto https://chercher.tech/practice/explicit-wait
1.click on open an alert after 5 sec and then using explicit wait manage that alert
2.click on display button after 10 sec and once the button is displayed  print the status of isDisplayed() (edited)
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //Find the alert button
        WebElement alertBtn=driver.findElement(By.cssSelector("button#alert"));
        WebDriverWait wait= new WebDriverWait(driver, 20);
        alertBtn.click();
        //Wait 5 seconds for the alert to populate
        wait.until(ExpectedConditions.alertIsPresent());
        //Switch to the alert and accept it
        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.accept();
        //Find display button
        WebElement disBtn= driver.findElement(By.cssSelector("button#display-other-button"));
        disBtn.click();
        //wait 10 seconds for the button to be displayed
        WebElement hdnBtn=driver.findElement(By.cssSelector("button#hidden"));
        wait.until(ExpectedConditions.elementToBeClickable(hdnBtn));
        //Check to see if the button is displayed
        boolean hdnBtnDisplayed= hdnBtn.isDisplayed();
        System.out.println("Is the button displayed now? "+hdnBtnDisplayed);





    }
}
