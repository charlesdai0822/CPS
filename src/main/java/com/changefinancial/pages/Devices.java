package com.changefinancial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Devices extends BasePage {
    public Devices() {
        super();
    }

    @FindBy(xpath = "//*[@id='user-dropdown']/div[2]/span") public WebElement username;
    @FindBy(id = "user-dropdown") public WebElement userDropdown;
    @FindBy(xpath = "//div [@aria-labelledby='user-dropdown']/a[1]") public WebElement settings;
    @FindBy(xpath = "//div [@aria-labelledby='user-dropdown']/a[2]") public WebElement setEnvironment;
    @FindBy(xpath = "//div [@aria-labelledby='user-dropdown']/a[3]") public WebElement logout;
    @FindBy(id = "show-unused-devices") public WebElement showOnlyUnusedDevices;
    @FindBy(xpath = "//div[@id='dataTable_filter']/label/input") public WebElement search;
    @FindBy(xpath = "//a[text()='Click here to select an environment.']") public WebElement clickToSetEnvironment;
    @FindBy(xpath = "//span[text()='Logs']") public WebElement Logs;
    @FindBy(xpath = "//span[text()='Regression Scripts']") public WebElement regressionScripts;
    @FindBy(xpath = "//select[@name='environment']") public WebElement environmentList;
    @FindBy(xpath = "//button[text()='Set']") public WebElement set;
    @FindBy(xpath = "//table[@id='dataTable']/tbody") public WebElement deviceTable;


    public String getUsername(){
        return username.getText();
    }

    public void clickSetEnvironment(){
        clickToSetEnvironment.click();
    }

    public void selectEnvironment(String environment){
        environmentList.click();
        Select select =new Select(environmentList);
        select.selectByValue(environment);
        set.click();
    }

    public List<String> returnDeviceList(){
        List<String> list = new ArrayList<>();
        List<WebElement> rows;
        List<WebElement> columns;
        WebElement tr;
        WebElement td;
        String deviceName;
        rows=deviceTable.findElements(By.tagName("tr"));
        for(int i=0;i<rows.size();i++){
            columns = rows.get(i).findElements(By.tagName("td"));
            deviceName = columns.get(0).findElement(By.tagName("a")).getText();
            list.add(deviceName);
        }
        return list;
    }

    public void clickDevice(String device){
        deviceTable.findElement(By.xpath("//a[text()='"+device+"']")).click();
    }

}
