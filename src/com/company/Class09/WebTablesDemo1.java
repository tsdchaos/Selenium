package com.company.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesDemo1 {
    public static String url="https://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //print all the rows of the webtable in the console

        //1. Locate the rows in the table using xpath and save it in a variable
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        //print the number of rows
        System.out.println("The number of rows in the table are "+tableRows.size());
        //2. iterate through each webElement and get the text out of it

        for (WebElement row: tableRows) {
            String text=row.getText();
            System.out.println(text);
        }
        //3. Print all the headers
        List<WebElement> headers=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr"));
        for (WebElement heads:headers) {
            String textHead= heads.getText();
            System.out.println(textHead);
        }
        //4. Print just the second column
        List<WebElement> col2=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        for (WebElement col: col2) {
            String column=col.getText();
            System.out.println("the data for column 2 is: "+column);
        }
    }
}
/*
go to the tables
make sure that there are seven rows in it
make sure the text of the first row is " "
make sure the text of second row is " "
 */