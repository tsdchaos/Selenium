package com.company.test;

import com.company.pages.LoginPageWithPageFactory;
import com.company.testBase.BaseClass;
import org.openqa.selenium.support.PageFactory;
import com.company.utils.CommonMethods;


public class loginPageTestWithPageFactory {
    public static void main(String[] args) throws InterruptedException {
        //open the browser
        BaseClass.openWithSpecificURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //Create an object of loginWithPageFactory
        LoginPageWithPageFactory loginWPG=new LoginPageWithPageFactory();
        loginWPG.username.sendKeys("Admin");
        loginWPG.password.sendKeys("Hum@nhrm123");
        loginWPG.loginBtn.click();
        //Take a screenshot
        Thread.sleep(2000);
        CommonMethods.takeTheScreenShot("loginPageLogin.png");
        //close browser

   //     BaseClass.tearDown();
    }
}
