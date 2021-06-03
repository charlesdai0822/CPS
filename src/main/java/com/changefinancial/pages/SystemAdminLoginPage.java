package com.changefinancial.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemAdminLoginPage extends BasePage {

    @FindBy(id = "exampleInputPassword") public WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log In')]") public WebElement login;

    public SystemAdminLoginPage() {
        super();
    }

    public void loginAsSysAdmin(String password){
        this.password.sendKeys(password);
        login.click();
    }
}
