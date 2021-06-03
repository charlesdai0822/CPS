package com.changefinancial.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DevicePageEndpointConfigTab extends BasePage {

    @FindBy(xpath = "//*[@id='endpoint-config-table_length']/label/select") public WebElement selectShowAmount;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[1]/td[2]/input") public WebElement inputMemberIDFrom;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[2]/td[2]/input") public WebElement inputBranchIDFrom;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[3]/td[2]/input") public WebElement inputMemberIDTo;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[4]/td[2]/input") public WebElement inputBranchIDTo;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[5]/td[2]/input") public WebElement inputNodeIdentifier;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[6]/td[2]/input") public WebElement inputSendType;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[7]/td[2]/input") public WebElement inputReceiverType;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[8]/td[2]/select") public WebElement selectCurrency;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[9]/td[2]/select") public WebElement selectMerchantType;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[10]/td[2]/input") public WebElement inputTerminalID;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[11]/td[2]/input") public WebElement inputTerminalType;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[12]/td[2]/input") public WebElement inputBillerID;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[13]/td[2]/input") public WebElement inputCustomerDislayName;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[14]/td[2]/input") public WebElement inputBillerServiceName;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[15]/td[2]/input") public WebElement inputSenderTaxID;
    @FindBy(xpath = "//*[@id='endpoint-config-table']/tbody/tr[16]/td[2]/input") public WebElement inputVATRate;
    @FindBy(xpath = "//*[@id='endpoint']/form/button") public WebElement save;

    public DevicePageEndpointConfigTab() {
        super();
    }

    Select select;

    public void setShowAmount(){
        select = new Select(selectShowAmount);
        select.selectByValue("30");//display 30 items
    }
    //set member ID(From)
    public void setMemberIDFrom(String memberIDFrom){
        inputMemberIDFrom.clear();
        inputMemberIDFrom.sendKeys(memberIDFrom);
    }


    //set Branch ID(From)
    public void setBranchIDFrom(String branchIDFrom){
        inputBranchIDFrom.clear();
        inputBranchIDFrom.sendKeys(branchIDFrom);
    }


    public void setMemberIDTo(String memberIDTo){
        inputMemberIDTo.clear();
        inputMemberIDTo.sendKeys(memberIDTo);
    }

    public void setBranchIDTo(String branchIDTo){
        inputBranchIDTo.clear();
        inputBranchIDTo.sendKeys(branchIDTo);
    }

    public void setNodeIdentifier(String nodeIdentifier){
        inputNodeIdentifier.clear();
        inputNodeIdentifier.sendKeys(nodeIdentifier);
    }

    public void setSenderType(String senderType){
        inputSendType.clear();
        inputSendType.sendKeys(senderType);
    }

    public void setReceiverType(String receiverType){
        inputReceiverType.clear();
        inputReceiverType.sendKeys(receiverType);
    }

    public void setCurrency(String currency){
        select = new Select(selectCurrency);
        select.selectByValue(currency);
    }

    public void setMerchantType(String merchantType){
        select = new Select(selectMerchantType);
        select.selectByValue(merchantType);
    }

    public void setTerminalID(String terminalID){
        inputTerminalID.clear();
        inputTerminalID.sendKeys(terminalID);
    }

    public void setTerminalType(String terminalType){
        inputTerminalType.clear();
        inputTerminalType.sendKeys(terminalType);
    }

    public void setBillerID(String billerID){
        inputBillerID.clear();
        inputBillerID.sendKeys(billerID);
    }

    public void setCustomerDisplayName(String customerDisplayName){
        inputCustomerDislayName.clear();
        inputCustomerDislayName.sendKeys(customerDisplayName);
    }

    public void setBillerServiceName(String billerServiceName){
        inputBillerServiceName.clear();
        inputBillerServiceName.sendKeys(billerServiceName);
    }

    public void setSenderTaxID(String senderTaxID){
        inputSenderTaxID.clear();
        inputSenderTaxID.sendKeys(senderTaxID);
    }

    public void setVATRate(String VATRate){
        inputVATRate.clear();
        inputVATRate.sendKeys(VATRate);
    }

    public void clickSaveButton(){
        save.click();
    }
}
