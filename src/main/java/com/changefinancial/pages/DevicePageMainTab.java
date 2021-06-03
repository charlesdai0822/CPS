package com.changefinancial.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DevicePageMainTab extends BasePage {
    @FindBy(xpath = "//*[@id='main']/form/div[1]/div/select") public WebElement selectMessage;
    @FindBy(xpath = "//*[@id='main']/form/div[2]/div[1]/label/i") public WebElement rowMessageSwitch;
    @FindBy(xpath = "//*[@id='transaction-signature']") public WebElement skipSignatureGeneration;
    @FindBy(xpath = "//*[@id='transaction-ignore-signature-validation']") public WebElement ignoreSignatureValidation;
    @FindBy(xpath = "//button[text()='Send']") public WebElement send;
    @FindBy(xpath = "//table[@id='dataTable']/tbody") public WebElement logs;
    @FindBy(xpath = "//a[text()='Endpoint Configuration']") public WebElement endpointConfiguration;

    public DevicePageMainTab() {
        super();
    }

    @Step("select EchoRequest message")
    public void selectEchoRequest(){
        Select select = new Select(selectMessage);
        select.selectByValue("EchoRequest");
    }

    public void clickRowMessageSwitch(){
        rowMessageSwitch.click();
    }

    public void clickSkipSignatureGeneration(){
        skipSignatureGeneration.click();
    }

    public void clickIgnoreSignatureValidation(){
        ignoreSignatureValidation.click();
    }

    @Step("send message")
    public void sendMessage(){
        send.click();
    }

    @Step("click Endpoint Configuration tab")
    public void clickEndpointConfiguration(){
        endpointConfiguration.click();
    }


}
