package com.company.Class12HW;

import com.company.pages.DashboardPage;
import com.company.testBase.BaseClass;
import com.company.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class DashboardPageTest {
    public static void main(String[] args) throws InterruptedException {
        //open the browser
        BaseClass.openWithSpecificURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //Create an object of the DashboardPage
        DashboardPage dashboardPage=new DashboardPage();
        WebElement username = dashboardPage.username;
        WebElement password=dashboardPage.password;
        //Login
        CommonMethods.sendText(username, "Admin");
        CommonMethods.sendText(password, "Hum@nhrm123");
        dashboardPage.loginBtn.click();
        //Locate the Welcome Admin Element, and print the text
        WebElement welcomeTag = dashboardPage.welcomeTag;
        System.out.println(welcomeTag.getText());
        //Take a screenshot
        Thread.sleep(2000);
        CommonMethods.takeTheScreenShot("dashboardPageScreenshot.jpg");

        //Close the browser
        CommonMethods.tearDown();

    }
}
