package com.changefinancial.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage{
    @FindBy(xpath = "//a[text()='Environments']") public WebElement tabEnvironment;
    @FindBy(xpath = "//a[text()='Password']") public WebElement tabPassword;
    @FindBy(xpath = "//input[@id='current']") public WebElement inputCurrentPassword;
    @FindBy(xpath = "//input[@id='password']") public WebElement inputNewPassword;
    @FindBy(xpath = "//input[@id='confirm']") public WebElement inputConfirmPassword;
    @FindBy(xpath = "//button[contains(text(),'Save')]") public WebElement buttonSave;
    @FindBy(xpath = "//*[@id='dataTable_filter']/label/input") public WebElement search;
    @FindBy(xpath = "//div[@class='toast fade show']/div[2]") public WebElement updateMessage;

    @Step("click password tab")
    public void clickTabPassword(){
        tabPassword.click();
    }

    @Step("click environment tab")
    public void clickTabEnvironment(){
        tabEnvironment.click();
    }

    @Step("input current password")
    public void inputCurrentPassword(String currentPassword){
        inputCurrentPassword.clear();
        inputCurrentPassword.sendKeys(currentPassword);
    }

    @Step("input new password")
    public void inputNewPassword(String newPassword){
        inputNewPassword.clear();
        inputNewPassword.sendKeys(newPassword);
    }

    @Step("input confirm password")
    public void inputConfirmPassword(String newPassword){
        inputConfirmPassword.clear();
        inputConfirmPassword.sendKeys(newPassword);
    }

    @Step("click save button")
    public void clickSaveButton(){
        buttonSave.click();
    }

    @Step("get update message")
    public String getUpdateMessage(){
        return updateMessage.getText();
    }
}
