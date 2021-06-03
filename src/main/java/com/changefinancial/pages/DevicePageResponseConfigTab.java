package com.changefinancial.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevicePageResponseConfigTab extends BasePage {
    @FindBy(xpath = "//button[text()='New Rule']") public WebElement newRule;
    @FindBy(xpath = "//button[text()='Import']") public WebElement importConfig;
    @FindBy(id = "newResponseName") public WebElement newResponseName;
    @FindBy(id = "newResponseDescription") public WebElement newResponseDescription;
    @FindBy(id = "newResponseIsDisabled") public WebElement disableThisRule;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/form/div[1]/div[5]/button") public WebElement newCondition;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/form/div[1]/div[5]/table/tbody/tr[1]/td[2]/select") public WebElement target1;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/form/div[1]/div[5]/table/tbody/tr[1]/td[3]/select") public WebElement item1;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/form/div[1]/div[5]/table/tbody/tr[1]/td[4]/input") public WebElement value1;

    public DevicePageResponseConfigTab() {
        super();
    }
}
