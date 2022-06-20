package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/form/button")
    public WebElement loginButton;


/*
this method directly login
 */
    public void login(){
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }

    /*
    this method accept two arguments and login
     */
    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

/*
this wil login using creditentials from configuraton.properties
 */

    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }

}
