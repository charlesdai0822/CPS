package com.changefinancial.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserDevicePage extends BasePage {


    public UserDevicePage() {
        super();
    }

    @FindBy(xpath = "//*[@id='content']/div[2]/div[1]/a") public WebElement clickToSetEnv;
    @FindBy(xpath = "//input[@id='show-unused-devices']") public WebElement showUnusedDevices;
    @FindBy(xpath = "//div[@id='dataTable_filter']/label/input") public WebElement search;
    @FindBy(xpath = "//*[@id='environmentModal']/div/div/form/div[1]/select") public WebElement envSelect;
    @FindBy(xpath = "//button[text()='Set']") public WebElement setEnvButton;
    @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div/div[1]/div[2]/button") public WebElement newDevice;
    @FindBy(xpath = "//input[@id='device-name']") public WebElement newDeviceName;
    @FindBy(xpath = "//select[@id='device-protocol']") public WebElement selectProtocal;
    @FindBy(xpath = "//button[text()='Save']") public WebElement save;
    @FindBy(xpath = "//button[text()='Cancel']") public WebElement cancel;
    @FindBy(xpath = "//tbody") public WebElement table;
    @FindBy(xpath = "//button[@data-dismiss='toast']/span") public WebElement closePopup;
    @FindBy(xpath = "//a[@id='user-dropdown']") public WebElement userDropdown;
    @FindBy(xpath = "//a[@id='user-dropdown']/parent::li/div/a[1]") public WebElement settings;


    public void clickSetEnv(){
        clickToSetEnv.click();
    }
    public void clickSettings(){
        settings.click();
    }
    public void showUnusedDevice(){
        showUnusedDevices.click();
    }

    public void clickUser(){
        userDropdown.click();
    }
    public void searchDevice(String key){
        search.clear();
        search.sendKeys(key);
    }
    public void clickEnvSelect(){
        envSelect.click();
    }
    public void selectEnv(String env){
        Select select = new Select(envSelect);
        select.selectByVisibleText(env);
    }
    public void setEnv(){
        setEnvButton.click();
    }
    public void clickNewDeviceButton(){
        newDevice.click();
    }
    public void inputDeviceName(String deviceName){
        newDeviceName.sendKeys(deviceName);
    }
    public void selectProtocal(){
        Select select = new Select(selectProtocal);
        select.selectByValue("ITMX_PROMPTPAY");
    }
    public void clickSaveButton(){
        save.click();
    }
    public void clickCancelButton(){
        cancel.click();
    }
    public void clickClosePopup(){
        closePopup.click();
    }
    public void clickDeviceByName(String deviceName){
        List<WebElement> trs = table.findElements(By.tagName("tr"));
        List<WebElement> tds;
        for(WebElement tr : trs){
            tds = tr.findElements(By.tagName("td"));
            if(tds.get(0).findElement(By.tagName("a")).getText().equals(deviceName)){
                tr.click();
                break;
            }

        }
    }
}
