package com.company.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tablesWithPagination {
    public static String urlTables="http://syntaxprojects.com/table-pagination-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(urlTables);
        //print the row that contains the student name "Archy J"
        //1. Locate the table rows using xpath
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        WebElement nextBtn= driver.findElement(By.cssSelector("a.next_link"));
        //iterate over the list and see if the desired row is there or now
        boolean notFound=true;
        int pageNum=1;
        while(notFound) {
            for (WebElement tablerow : rows) {
                String text = tablerow.getText();
                if (text.contains("Archy J")) {
                    System.out.println(text);
                    System.out.println("The page number is "+pageNum);
                    notFound=false;
                    break;
                }
            }
            if(notFound) {
                nextBtn.click();
                pageNum++;
            }
        }
    }
}
