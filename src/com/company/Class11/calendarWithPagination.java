package com.company.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendarWithPagination {
    public static String url="https://www.sastaticket.pk/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //Find the departing date calendar
        driver.findElement(By.xpath("(//span[@class='dt_label'])[1]")).click();

        //Find the desired month
        WebElement month= driver.findElement(By.xpath("(//div[@class='react-datepicker__current-month'])[1]"));
        //print the current month
        System.out.println(month.getText());

        //Find the next month button
        WebElement nextBtn=driver.findElement(By.xpath("//button[text()='Next Month']"));

        //Go to the month september
        boolean notFound=true;
        while(notFound){
            if(month.getText().equalsIgnoreCase("September 2022")){
                System.out.println(month.getText());
                notFound=false;
                //select the date
                List<WebElement> dates=driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div"));
                //traverse through the dates and select the 15th of the month
                for (WebElement date:dates) {
                    if(date.getText().equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }
                }
            }else{
                nextBtn.click();
            }
        }
    }
}
