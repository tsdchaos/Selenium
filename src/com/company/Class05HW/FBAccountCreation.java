package com.company.Class05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBAccountCreation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://facebook.com");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Homer");
        driver.findElement(By.name("lastname")).sendKeys("Simpson");
        driver.findElement(By.name("reg_email__")).sendKeys("homer@simpson.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("homer@simpson.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass1234");
        Thread.sleep(1000);
        //Finding Dropdowns
        WebElement month=driver.findElement(By.cssSelector("select#month"));
        month.click();
        Select selectM=new Select(month);
        Thread.sleep(1000);
        selectM.selectByVisibleText("Jan");
        WebElement day=driver.findElement(By.cssSelector("select#day"));
        Select selectD=new Select(day);
        selectD.selectByVisibleText("17");
        WebElement year=driver.findElement(By.cssSelector("select#year"));
        Select selectY=new Select(year);
        selectY.selectByVisibleText("1987");

        //Click male Radio button
        WebElement maleRadio=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        maleRadio.click();

       // driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
    }
}
