package com.company.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class examplePagination {
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

        //click on PIM
        WebElement pim= driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        pim.click();

        //click on Employee List
        WebElement emplyList = driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList"));
        emplyList.click();

        //Dealing with the table
        //look for id 26335A
        //Find the table rows
        List<WebElement> tblRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        //Find the next button
        WebElement nxtBtn=driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
        //Find the checkboxes associated with the rows
        List<WebElement> chckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
        //iterate through the list, looking for id 26335A
        boolean notFound=true;
        while(notFound){
            tblRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            nxtBtn=driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
            chckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));

            for(int i=0; i<tblRows.size(); i++){
                String rowText=tblRows.get(i).getText();
                if(rowText.contains("26335A")){
                    System.out.println("Here is the text for the row with ID 26335A: "+rowText);
                    notFound=false;
                    //click on the associated checkbox
                    chckBox.get(i+1).click();
                    System.out.println("Is the checkbox checked? "+chckBox.get(i+1).isSelected());
                    break;
                }
            }
            if(notFound) {
                nxtBtn.click();
            }
        }

    }
}