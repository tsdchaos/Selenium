package com.company.utils;

import com.company.testBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;


public class CommonMethods extends BaseClass {
    /**
     * sends text to a given element
     * @param element -->webElement
     * @param text-->the text that you want to send
     */
    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    /**
     * this method is used to switch frames on the page
     * @param index
     */
    public static void switchToFrame(int index){

        driver.switchTo().frame(index);
    }
    public static void takeTheScreenShot(String filename ){
        //        take screen shot
        TakesScreenshot ts=(TakesScreenshot) driver;
//        take screen shot
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
//        we need to save the screenshot file in our computer


        try {
            FileUtils.copyFile(screenShot,new File("screenshot/ss/"+filename+".png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
