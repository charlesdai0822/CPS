package com.changefinancial.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
    public Login() {
        super();
    }

    @FindBy(id = "username") public WebElement username;
    @FindBy(id = "password") public WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log In')]") public WebElement login;
    @FindBy(xpath = "//a[contains(text(),'System Administration')]") public WebElement systemAdministration;

    public void inputUsername(String username){
        this.username.clear();
        this.username.sendKeys(username);
    }

    public void inputPassword(String password){
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void clickLogin(){
        login.click();
    }

    public void clickSystemAdmin(){
        systemAdministration.click();
    }
}
