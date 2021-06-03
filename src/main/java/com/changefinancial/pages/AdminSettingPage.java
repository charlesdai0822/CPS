package com.changefinancial.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminSettingPage extends BasePage {

    @FindBy(id = "current") public WebElement oldPassword;
    @FindBy(id = "password") public WebElement password;
    @FindBy(id = "confirm") public WebElement confirmPassword;
    @FindBy(xpath = "//button[contains(text(),'Save')]") public WebElement save;
    @FindBy(xpath = "//span[text()='Environments']") public WebElement environments;
    @FindBy(xpath = "//span[text()='Users']") public WebElement users;


    public AdminSettingPage() {
        super();
    }

    public void updatePassword(String oldPassword,String newPassword){
        this.oldPassword.sendKeys(oldPassword);
        this.password.sendKeys(newPassword);
        this.confirmPassword.sendKeys(newPassword);
        save.click();
    }
}
