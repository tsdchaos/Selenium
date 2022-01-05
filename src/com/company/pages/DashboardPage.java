package com.company.pages;

import com.company.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement username;
    @FindBy(id="txtPassword")
    public WebElement password;
    @FindBy(id="btnLogin")
    public WebElement loginBtn;
    @FindBy(css="a#welcome")
    public WebElement welcomeTag;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }



}
