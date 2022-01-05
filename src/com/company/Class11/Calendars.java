package com.company.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendars {
    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        WebElement userLogin=driver.findElement(By.cssSelector("input#txtUsername"));
        userLogin.sendKeys("Admin");

        WebElement password= driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.cssSelector("input#btnLogin"));
        loginBtn.click();

        //Find and click on Leave menu
        WebElement leave=driver.findElement(By.cssSelector("a#menu_leave_viewLeaveModule"));
        leave.click();

        //Click on calendar
        WebElement calendar= driver.findElement(By.cssSelector("input#calFromDate"));
        calendar.click();
        //Select month
        WebElement month=driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        //use select class
        Select select=new Select(month);
        select.selectByVisibleText("Sep");
        //select the year
        WebElement year= driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        //use select class
        Select select2=new Select(year);
        select2.selectByValue("2022");
        //Find the table for the days
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        //iterate through the dates
        for(WebElement date: dates){
            String dateText = date.getText();
            if(dateText.equalsIgnoreCase("15")){
                date.click();
            }
        }
    }
}
