package com.company.Class09HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) {
        /*
        HW!
        goto http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
a       and delete all the eneteries which have product mymoney and lives in us state (edited)
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //Find username field
        WebElement userField=driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        userField.sendKeys("Tester");
        //Find password field and login
        WebElement passField=driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));
        passField.sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
        //Find all the rows
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        //iterate through the rows, Check the boxes for rows that have "MyMoney" in them
        for(int i=1; i<rows.size(); i++){
            String rowText=rows.get(i).getText();
            if(rowText.contains("MyMoney")){
                List<WebElement> chckBx=driver.findElements(By.xpath("//input[@type='checkbox']"));
                chckBx.get(i-1).click();
            }
        }
        // Click the "Delete Selected" button
        WebElement dltBtn= driver.findElement(By.xpath("//input[@type='submit']"));
        dltBtn.click();
        driver.quit();
    }
}
