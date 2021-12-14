package com.company.Class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {

            //Using Advanced XPath
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
            driver.manage().window().maximize();
            //Find Username field and enter username
            WebElement username= driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
            username.sendKeys("admin");
            //Find Password field and enter password
            WebElement password= driver.findElement(By.xpath("//div[@id='divPassword']/input"));
            password.sendKeys("adfjsdk");
            //Find loginbutton and click on it
            WebElement loginButton= driver.findElement(By.xpath("//div[@id='divLoginButton']/child::input"));
            loginButton.click();
            WebElement invalid=driver.findElement(By.xpath("//span[text()='Invalid Credentials']"));
            System.out.println(invalid.getText());
            driver.quit();



    }
}
