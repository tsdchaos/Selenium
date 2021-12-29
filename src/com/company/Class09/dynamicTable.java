package com.company.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dynamicTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        //Find username field
        WebElement userField=driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        userField.sendKeys("Tester");
        //Find password field
        WebElement passField=driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));
        passField.sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

        //get all the rows
        List<WebElement> tableRows= driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        //print all the rows
        for(int i=1; i<tableRows.size(); i++){
            String rowText=tableRows.get(i).getText();
            System.out.println(rowText);
            //check the checkbox if the row has the product screensaver
            if(rowText.contains("ScreenSaver")){
               List<WebElement> checkBox= driver.findElements(By.xpath("//input[@type='checkbox']"));
               checkBox.get(i-1).click();
            }
        }
    }
}
