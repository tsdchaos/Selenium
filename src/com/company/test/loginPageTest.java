package com.company.test;

import com.company.pages.LoginPage;
import com.company.testBase.BaseClass;
import com.company.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class loginPageTest{
    public static void main(String[] args) {

        //open the browser and navigate to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard
        BaseClass.openWithSpecificURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //Locate the element and send keys
        LoginPage loginPage=new LoginPage();
        WebElement username = loginPage.usernameField;
        WebElement passwordField = loginPage.passwordField;
        CommonMethods.sendText(username, "Admin");
        CommonMethods.sendText(passwordField, "Hum@nhrm123");
        loginPage.loginButton.click();
        CommonMethods.takeTheScreenShot("loginPageLogin.png");
    }
}
