package com.company.pages;

import com.company.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {
        @FindBy(id="txtUsername")
        public WebElement username;
        @FindBy(id="txtPassword")
        public WebElement password;
        @FindBy(id="btnLogin")
        public WebElement loginBtn;
        /*
        We can use FindBy to find the elements instead of driver.FindElement
         */
        public LoginPageWithPageFactory(){
            PageFactory.initElements(driver, this);
        }
}
