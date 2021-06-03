package com.changefinancial.pages;

import com.changefinancial.utils.Action;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageEchoRequest extends DevicePageMainTab{

    @FindBy(xpath = "//div[@id='message']/div/div/div[1]/div/div[1]/input") public WebElement inputMemberIDFrom;
    @FindBy(xpath = "//div[@id='message']/div/div/div[1]/div/div[2]/button") public WebElement buttonMemberIDFrom;
    @FindBy(xpath = "//div[@id='message']/div/div/div[2]/div/div[1]/input") public WebElement inputBranchIDFrom;
    @FindBy(xpath = "//div[@id='message']/div/div/div[2]/div/div[2]/button") public WebElement buttonBranchIDFrom;
    @FindBy(xpath = "//div[@id='message']/div/div/div[3]/div/div[1]/input") public WebElement inputMemberIDTo;
    @FindBy(xpath = "//div[@id='message']/div/div/div[3]/div/div[2]/button") public WebElement buttonMemberIDTo;
    @FindBy(xpath = "//div[@id='message']/div/div/div[4]/div/div[1]/input") public WebElement inputBranchIDTo;
    @FindBy(xpath = "//div[@id='message']/div/div/div[4]/div/div[2]/button") public WebElement buttonBranchIDTo;
    @FindBy(xpath = "//div[@id='message']/div/div/div[5]/div/div[1]/input") public WebElement inputBusinessMessageIdentifier;
    @FindBy(xpath = "//div[@id='message']/div/div/div[5]/div/div[2]/button") public WebElement buttonBusinessMessageIdentifier;
    @FindBy(xpath = "//div[@id='message']/div/div/div[6]/div/div[1]/input") public WebElement inputMessageDefinitionIdentifier;
    @FindBy(xpath = "//div[@id='message']/div/div/div[6]/div/div[2]/button") public WebElement buttonMessageDefinitionIdentifier;
    @FindBy(xpath = "//div[@id='message']/div/div/div[7]/div/div[1]/input") public WebElement inputCreationDate;
    @FindBy(xpath = "//div[@id='message']/div/div/div[7]/div/div[2]/button") public WebElement buttonCreationDate;
    @FindBy(xpath = "//div[@id='message']/div/div/div[8]/div/div/input") public WebElement inputCopyDuplicateFlag;
    @FindBy(xpath = "//div[@id='message']/div/div/div[8]/div/div[2]/button") public WebElement buttonCopyDuplicateFlag;
    @FindBy(xpath = "//div[@id='message']/div/div/div[9]/div/div[1]/input") public WebElement inputSignatureStub;
    @FindBy(xpath = "//div[@id='message']/div/div/div[9]/div/div[2]/button") public WebElement buttonSignatureStub;
    @FindBy(xpath = "//div[@id='message']/div/div/div[10]/div/div[1]/input") public WebElement inputMessageID;
    @FindBy(xpath = "//div[@id='message']/div/div/div[10]/div/div[2]/button") public WebElement buttonMessageID;
    @FindBy(xpath = "//div[@id='message']/div/div/div[11]/div/div[1]/input") public WebElement inputCreationDateAndTime;
    @FindBy(xpath = "//div[@id='message']/div/div/div[11]/div/div[2]/button") public WebElement buttonCreationDateAndTime;
    @FindBy(xpath = "//div[@id='message']/div/div/div[12]/div/div[1]/input") public WebElement inputFunctionCode;
    @FindBy(xpath = "//div[@id='message']/div/div/div[12]/div/div[2]/button") public WebElement buttonFunctionCode;
    @FindBy(xpath = "//div[@id='message']/div/div/div[13]/div/div[1]/input") public WebElement inputInstructionID;
    @FindBy(xpath = "//div[@id='message']/div/div/div[13]/div/div[2]/button") public WebElement buttonInstructionID;
    @FindBy(xpath = "//div[@id='message']/div/div/div[14]/div/div[1]/input") public WebElement inputInstructingMemberID;
    @FindBy(xpath = "//div[@id='message']/div/div/div[14]/div/div[2]/button") public WebElement buttonInstructingMemberID;
    @FindBy(xpath = "//div[@id='message']/div/div/div[15]/div/div[1]/input") public WebElement inputInstructedMemberID;
    @FindBy(xpath = "//div[@id='message']/div/div/div[15]/div/div[2]/button") public WebElement buttonInstructedMemberID;
    @FindBy(xpath = "//div[@id='message']/div/div[2]/a[2]") public WebElement scrollDownArrow;

    public MessageEchoRequest() {
        super();
    }


    public void setMemberIDFrom(String memberIDFrom){
        inputMemberIDFrom.clear();
        inputMemberIDFrom.sendKeys(memberIDFrom);
    }
    public void clickButtonMemberIDFrom(){
        buttonMemberIDFrom.click();
    }
    public void setBranchIDFrom(String branchIDFrom){
        inputBranchIDFrom.clear();
        inputBranchIDFrom.sendKeys(branchIDFrom);
    }
    public void clickButtonBranchIDFrom(){
        buttonBranchIDFrom.click();
    }
    public void setMemberIDTo(String memberIDTo){
        inputMemberIDTo.clear();
        inputMemberIDTo.sendKeys(memberIDTo);
    }
    public void clickButtonMemberIDTo(){
        buttonMemberIDTo.click();
    }
    public void setBranchIDTo(String branchIDTo){
        inputBranchIDTo.clear();
        inputBranchIDTo.sendKeys(branchIDTo);
    }
    public void clickButtonBranchIDTo(){
        buttonBranchIDTo.click();
    }
    public void setBusinessMessageIdentifier(String businessMessageIdentifier){
        inputBusinessMessageIdentifier.clear();
        inputBusinessMessageIdentifier.sendKeys(businessMessageIdentifier);
    }
    public void clickButtonBusinessMessageIdentifier(){
        buttonBusinessMessageIdentifier.click();
    }
    public void setMessageDefinitionIdentifier(String messageDefinitionIdentifier){
        inputMessageDefinitionIdentifier.clear();
        inputMessageDefinitionIdentifier.sendKeys(messageDefinitionIdentifier);
    }
    public void clickButtonMessageDefinitionIdentifier(){
        buttonMessageDefinitionIdentifier.click();
    }

    @Step("set creation date")
    public void setCreationDate(String creationDate){
        inputCreationDate.clear();
        inputCreationDate.sendKeys(creationDate);
    }
    public void clickButtonCreationDate(){
        buttonCreationDate.click();
    }
    public void setCopyDuplicateFlag(String copyDuplicateFlag){

        inputCopyDuplicateFlag.clear();
        inputCopyDuplicateFlag.sendKeys(copyDuplicateFlag);
    }

    @Step("click CopyDuplicateFlag button")
    public void clickButtonCopyDuplicateFlag(){
        Action.scrollDownUntilElementVisible(scrollDownArrow,buttonCopyDuplicateFlag);
        buttonCopyDuplicateFlag.click();
    }
    public void setSignatureStub(String signatureStub){
        inputSignatureStub.clear();
        inputSignatureStub.sendKeys(signatureStub);
    }
    public void setMessageID(String messageID){
        inputMessageID.clear();
        inputMessageID.sendKeys(messageID);
    }
    public void clickButtonMessageID(){
        buttonMessageID.click();
    }
    public void setCreationDateAndTime(String creationDateAndTime){
        inputCreationDateAndTime.clear();
        inputCreationDateAndTime.sendKeys(creationDateAndTime);
    }
    public void clickButtonCreationDateAndTime(){
        buttonCreationDateAndTime.click();
    }

    @Step("set Function Code")
    public void setFunctionCode(String functionCode){
        Action.moveElementToBeVisable(inputFunctionCode);
        inputFunctionCode.clear();
        inputFunctionCode.sendKeys(functionCode);
    }
    public void clickButtonFunctionCode(){
        buttonFunctionCode.click();
    }
    public void clickButtonInstructionID(){
        buttonInstructionID.click();
    }
    public void setInstructionID(String instructionID){
        inputInstructionID.clear();
        inputInstructionID.sendKeys(instructionID);
    }
    public void setInstructingMemberID(String instructingMemberID){
        inputInstructingMemberID.clear();
        inputInstructingMemberID.sendKeys(instructingMemberID);
    }
    public void clickButtonInstructingMemberID(){
        buttonInstructingMemberID.click();
    }
    public void setInstructedMemberID(String instructedMemberID){
        inputInstructedMemberID.clear();
        inputInstructedMemberID.sendKeys(instructedMemberID);
    }
    public void clickButtonInstructedMemberID(){
        buttonInstructedMemberID.click();
    }
}
