package com.company.Class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {

        //Using XPATH
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        //Find Username field and enter username
        WebElement username= driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("admin");
        //Find Password field and enter password
        WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("");
        //Find loginbutton and click on it
        WebElement loginButton= driver.findElement(By.xpath("//input[starts-with(@value,'LOG')]"));
        loginButton.click();
        WebElement invalid=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        System.out.println(invalid.getText());
        if(invalid.getText().equals("Password cannot be empty")){
            System.out.println("Test Passed");
        }
        driver.quit();


    }
}
