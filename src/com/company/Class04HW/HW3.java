package com.company.Class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {

        //Using Advanced XPath
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        //Find First Name field and enter first name
        WebElement firstName= driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Alan");
        //Find Last Name field and enter last name
        WebElement lastName= driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("Shwartz");
        //Find Email field and enter email address
        WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("johnsmith@syntax.com");
        //Find phone number field and enter phone number
        WebElement phone= driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("571-555-5555");
        //Find Address field and enter address
        WebElement address=driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("555 Springfield Terrace");
        //Find City field and enter city
        WebElement city=driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Fairfax");
        //Find statefield and enter state
        WebElement state=driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("Vi");
        state.click();
        //Find zip code field and enter zipcode
        WebElement zip=driver.findElement(By.cssSelector("input[name='zip']"));
        zip.sendKeys("22030");
        //Find website field and enter website
        WebElement website=driver.findElement(By.cssSelector("input[name='website']"));
        website.sendKeys("https://www.google.com");
        //Find Project Description field and enter description
        WebElement project=driver.findElement(By.cssSelector("textarea[placeholder='Project Description']"));
        project.sendKeys("Testing automation homework");



    }
}
