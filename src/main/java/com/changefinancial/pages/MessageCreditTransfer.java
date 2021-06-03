package com.changefinancial.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessageCreditTransfer extends BasePage {
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[1]/div/div[1]/input") public WebElement inputMemberIDFrom;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[1]/div/div[2]/button") public WebElement buttonMemberIDFrom;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[2]/div/div[1]/input") public WebElement inputBranchIDFrom;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[2]/div/div[2]/button") public WebElement buttonBranchIDFrom;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[3]/div/div[1]/input") public WebElement inputMemberIDTo;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[3]/div/div[2]/button") public WebElement buttonMemberIDTo;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[4]/div/div[1]/input") public WebElement inputBranchIDTo;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[4]/div/div[2]/button") public WebElement buttonBranchIDTo;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[5]/div/div[1]/input") public WebElement inputBusinessMessageIdentifier;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[5]/div/div[2]/button") public WebElement buttonBusinessMessageIdentifier;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[6]/div/div[1]/input") public WebElement inputBusinessDefinitionIdentifier;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[6]/div/div[2]/button") public WebElement buttonBusinessDefinitionIdentifier;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[7]/div/div[1]/input") public WebElement inputCreationDate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[7]/div/div[2]/button") public WebElement buttonCreationDate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[8]/div/div[1]/input") public WebElement inputCopyDuplicateFlag;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[8]/div/div[2]/button") public WebElement buttonCopyDuplicateFlag;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[9]/div/div[1]/input") public WebElement inputSignatureStub;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[9]/div/div[2]/button") public WebElement buttonSignatureStub;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[10]/div/div[1]/input") public WebElement inputMessageID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[10]/div/div[2]/button") public WebElement buttonMessageID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[11]/div/div[1]/input") public WebElement inputCreationDateAndTime;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[11]/div/div[2]/button") public WebElement buttonCreationDateAndTime;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[12]/div/div[1]/input") public WebElement inputNumberOfTransactions;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[12]/div/div[2]/button") public WebElement buttonNumberOfTransactions;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[13]/div/div[1]/input") public WebElement inputTotalInterBankSettlementAmount;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[13]/div/div[2]/button") public WebElement buttonTotalInterBankSettlementAmount;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[14]/div/div[1]/input") public WebElement inputTotalInterbankSettlementCurrency;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[14]/div/div[2]/button") public WebElement buttonTotalInterbankSettlementCurrency;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[15]/div/div[1]/input") public WebElement inputInterbankSettlementDate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[15]/div/div[2]/button") public WebElement buttonInterbankSettlementDate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[16]/div/div[1]/input") public WebElement inputSettlementMethod;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[16]/div/div[2]/button") public WebElement buttonSettlementMethod;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[17]/div/div[1]/input") public WebElement inputSettlementCurrency;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[17]/div/div[2]/button") public WebElement buttonSettlementCurrency;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[18]/div/div[1]/input") public WebElement inputInstructionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[18]/div/div[2]/button") public WebElement buttonInstructionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[19]/div/div[1]/input") public WebElement inputEndToEndID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[19]/div/div[2]/button") public WebElement buttonEndToEndID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[20]/div/div[1]/input") public WebElement inputTransactionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[20]/div/div[2]/button") public WebElement buttonTransactionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[21]/div/div[1]/input") public WebElement inputClearingSystemReference;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[21]/div/div[2]/button") public WebElement buttonClearingSystemReference;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[22]/div/div[1]/input") public WebElement inputServiceLevel;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[22]/div/div[2]/button") public WebElement buttonServiceLevel;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[23]/div/div[1]/input") public WebElement inputInterbankSettlementAmount;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[23]/div/div[2]/button") public WebElement buttonInterbankSettlementAmount;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[24]/div/div[1]/input") public WebElement inputInterbankSettlementCurrency;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[24]/div/div[2]/button") public WebElement buttonInterbankSettlementCurrency;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[25]/div/div[1]/input") public WebElement inputChargeBearer;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[25]/div/div[2]/button") public WebElement buttonChargeBearer;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[26]/div/div[1]/input") public WebElement inputInstructingMemberID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[26]/div/div[2]/button") public WebElement buttonInstructingMemberID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[27]/div/div[1]/input") public WebElement inputInstructedMemberID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[27]/div/div[2]/button") public WebElement buttonInstructedMemberID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[28]/div/div[1]/input") public WebElement inputDebtorName;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[28]/div/div[2]/button") public WebElement buttonDebtorName;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[29]/div/div[1]/input") public WebElement inputDebtorAccountID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[29]/div/div[2]/button") public WebElement buttonDebtorAccountID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[30]/div/div[1]/input") public WebElement inputDebtorFinancialInstitutionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[30]/div/div[2]/button") public WebElement buttonDebtorFinancialInstitutionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[31]/div/div[1]/input") public WebElement inputCreditorFinancialInstitutionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[31]/div/div[2]/button") public WebElement buttonCreditorFinancialInstitutionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[32]/div/div[1]/input") public WebElement inputCreditorName;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[32]/div/div[2]/button") public WebElement buttonCreditorName;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[33]/div/div[1]/input") public WebElement inputCreditorAccountID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[33]/div/div[2]/button") public WebElement buttonCreditorAccountID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[34]/div/div[1]/input") public WebElement inputCreditorAccountName;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[34]/div/div[2]/button") public WebElement buttonCreditorAccountName;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[35]/div/div[1]/input") public WebElement inputPurposeCode;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[35]/div/div[2]/button") public WebElement buttonPurposeCode;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[36]/div/div[1]/input") public WebElement inputProcessingCode;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[36]/div/div[2]/button") public WebElement buttonProcessingCode;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[37]/div/div[1]/input") public WebElement inputMessageTypeIndicator;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[37]/div/div[2]/button") public WebElement buttonMessageTypeIndicator;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[38]/div/div[1]/input") public WebElement inputAgentIdentification;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[38]/div/div[2]/button") public WebElement buttonAgentIdentification;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[39]/div/div[1]/input") public WebElement inputMerchantType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[39]/div/div[2]/button") public WebElement buttonMerchantType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[40]/div/div[1]/input") public WebElement inputTerminalType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[40]/div/div[2]/button") public WebElement buttonTerminalType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[41]/div/div[1]/input") public WebElement inputOneTimeAuthorisation;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[41]/div/div[2]/button") public WebElement buttonOneTimeAuthorisation;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[42]/div/div[1]/input") public WebElement inputOriginalInstructionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[42]/div/div[2]/button") public WebElement buttonOriginalInstructionID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[43]/div/div[1]/input") public WebElement inputReceiverType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[43]/div/div[2]/button") public WebElement buttonReceiverType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[44]/div/div[1]/input") public WebElement inputSenderType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[44]/div/div[2]/button") public WebElement buttonSenderType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[45]/div/div[1]/input") public WebElement inputReceiverTaxID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[45]/div/div[2]/button") public WebElement buttonReceiverTaxID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[46]/div/div[1]/input") public WebElement inputSenderTaxID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[46]/div/div[2]/button") public WebElement buttonSenderTaxID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[47]/div/div[1]/input") public WebElement inputMerchantBillerID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[47]/div/div[2]/button") public WebElement buttonMerchantBillerID;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[48]/div/div[1]/input") public WebElement inputBillerDisplayNameThai;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[48]/div/div[2]/button") public WebElement buttonBillerDisplayNameThai;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[49]/div/div[1]/input") public WebElement inputCustomerDisplayName;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[49]/div/div[2]/button") public WebElement buttonCustomerDisplayName;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[50]/div/div[1]/input") public WebElement inputBillReference1;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[50]/div/div[2]/button") public WebElement buttonBillReference1;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[51]/div/div[1]/input") public WebElement inputBillReference2;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[51]/div/div[2]/button") public WebElement buttonBillReference2;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[52]/div/div[1]/input") public WebElement inputBillReference3;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[52]/div/div[2]/button") public WebElement buttonBillReference3;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[53]/div/div[1]/input") public WebElement inputAdditionalNote;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[53]/div/div[2]/button") public WebElement buttonAdditionalNote;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[54]/div/div[1]/input") public WebElement inputRequestedExecutionDate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[54]/div/div[2]/button") public WebElement buttonRequestedExecutionDate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[55]/div/div[1]/input") public WebElement inputProxyType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[55]/div/div[2]/button") public WebElement buttonProxyType;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[56]/div/div[1]/input") public WebElement inputProxyValue;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[56]/div/div[2]/button") public WebElement buttonProxyValue;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[57]/div/div[1]/input") public WebElement inputLocalAmount;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[57]/div/div[2]/button") public WebElement buttonLocalAmount;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[58]/div/div[1]/input") public WebElement inputLocalCurrency;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[58]/div/div[2]/button") public WebElement buttonLocalCurrency;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[59]/div/div[1]/input") public WebElement inputCountryCode;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[59]/div/div[2]/button") public WebElement buttonCountryCode;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[60]/div/div[1]/input") public WebElement inputVATRate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[60]/div/div[2]/button") public WebElement buttonVATRate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[61]/div/div[1]/input") public WebElement inputVATAmount;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[61]/div/div[2]/button") public WebElement buttonVATAmount;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[62]/div/div[1]/input") public WebElement inputTypeOfIncome;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[62]/div/div[2]/button") public WebElement buttonTypeOfIncome;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[63]/div/div[1]/input") public WebElement inputWithholdingTaxRate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[63]/div/div[2]/button") public WebElement buttonWithholdingTaxRate;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[64]/div/div[1]/input") public WebElement inputWithholdingTax;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[64]/div/div[2]/button") public WebElement buttonWithholdingTax;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[65]/div/div[1]/input") public WebElement inputWithholdingTaxCondition;
    @FindBy(xpath = "//div[@id='mCSB_3_container']/div[65]/div/div[2]/button") public WebElement buttonWithholdingTaxCondition;



    public MessageCreditTransfer() {
        super();
    }

    @Step("set MemberID(from)")
    public void setMemberIDFrom(String memberIDFrom){
        inputMemberIDFrom.clear();
        inputMemberIDFrom.sendKeys(memberIDFrom);
    }

    @Step("remove/restore MemberID(from)")
    public void clickButtonMemberIDFrom(){
        buttonMemberIDFrom.click();
    }

    @Step("set BranchID(From)")
    public void setBranchIDFrom(String branchIDFrom){
        inputBranchIDFrom.clear();
        inputBranchIDFrom.sendKeys(branchIDFrom);
    }

    @Step("remove/restore BranchID(From)")
    public void clickButtonBranchIDFrom(){
        buttonBranchIDFrom.click();
    }

    @Step("set MemberID(To)")
    public void setMemberIDTo(String memberIDTo){
        inputMemberIDTo.clear();
        inputMemberIDTo.sendKeys(memberIDTo);
    }

    @Step("remove/restore MemberID(To)")
    public void clickButtonMemberIDTo(){
        buttonMemberIDTo.click();
    }

    @Step("set BranchID(To)")
    public void setBranchIDTo(String branchIDTo){
        inputBranchIDTo.clear();
        inputBranchIDTo.sendKeys(branchIDTo);
    }

    @Step("remove/restore BranchID(To)")
    public void clickButtonBranchIDTo(){
        buttonBranchIDTo.click();
    }

    @Step("set Business Message Identifier")
    public void setBusinessMessageIdentifier(String businessMessageIdentifier){
        inputBusinessMessageIdentifier.clear();
        inputBusinessMessageIdentifier.sendKeys(businessMessageIdentifier);
    }

    @Step("remove/restore Business Message Identifier")
    public void clickButtonBusinessMessageIdentifier(){
        buttonBusinessMessageIdentifier.click();
    }

    @Step("set Business Definition Identifier")
    public void setBusinessDefinitionIdentifier(String businessDefinitionIdentifier){
        inputBusinessDefinitionIdentifier.clear();
        inputBusinessDefinitionIdentifier.sendKeys(businessDefinitionIdentifier);
    }

    @Step("remove/restore Business Definition Identifier")
    public void clickButtonBusinessDefinitionIdentifier(){
        buttonBusinessDefinitionIdentifier.click();
    }


    /*@Step("set Creation Date")
    public void setAA(String AA){
        BB.clear();
        BB.sendKeys(AA);
    }*/

    /*@Step("remove/restore Creation Date")
    public void clickButton(){
        AA.click();
    }*/

    @Step("set Copy Duplicate Flag")
    public void setCopyDuplicateFlag(String copyDuplicateFlag){
        inputCopyDuplicateFlag.clear();
        inputCopyDuplicateFlag.sendKeys(copyDuplicateFlag);
    }

    @Step("remove/restore Copy Duplicate Flag")
    public void clickButtonCopyDuplicateFlag(){
        buttonCopyDuplicateFlag.click();
    }

    @Step("set Total Interbank Settlement Amount")
    public void setTotalInterbankSettlementAmount(String totalInterbankSettlementAmount){
        inputTotalInterBankSettlementAmount.clear();
        inputTotalInterBankSettlementAmount.sendKeys(totalInterbankSettlementAmount);
    }

    @Step("remove/restore Total Interbank Settlement Amount")
    public void clickButtonTotalInterbankSettlementAmount(){
        buttonTotalInterBankSettlementAmount.click();
    }

    @Step("set Total Interbank Settlement Currency")
    public void setTotalInterbankSettlementCurrency(String totalInterbankSettlementCurrency){
        inputTotalInterbankSettlementCurrency.clear();
        inputTotalInterbankSettlementCurrency.sendKeys(totalInterbankSettlementCurrency);
    }

    @Step("remove/restore Total Interbank Settlement Currency")
    public void clickButtonTotalInterbankSettlementCurrency(){
        buttonTotalInterbankSettlementCurrency.click();
    }

    @Step("set Interbank Settlement Date")
    public void setInterbankSettlementDate(String interbankSettlementDate){
        inputInterbankSettlementDate.clear();
        inputInterbankSettlementDate.sendKeys(interbankSettlementDate);
    }

    @Step("remove/restore Interbank Settlement Date")
    public void clickButtonInterbankSettlementDate(){
        buttonInterbankSettlementDate.click();
    }

    @Step("set Settlement Method")
    public void setSettlementMethod(String settlementMethod){
        inputSettlementMethod.clear();
        buttonSettlementMethod.sendKeys(settlementMethod);
    }
    @Step("remove/restore Settlement Method")
    public void clickButtonSettlementMethod(){
        buttonSettlementMethod.click();
    }

    @Step("set Settlement Currency")
    public void setSettlementCurrency(String settlementCurrency){
        inputSettlementCurrency.clear();
        inputSettlementCurrency.sendKeys(settlementCurrency);
    }

    @Step("remove/restore Settlement Currency")
    public void clickButtonSettlementCurrency(){
        buttonSettlementCurrency.click();
    }

    @Step("set Instruction ID")
    public void setInstructionID(String instructionID){
        inputInstructionID.clear();
        inputInstructionID.sendKeys(instructionID);
    }

    @Step("remove/restore Instruction ID")
    public void clickButtonInstructionID(){
        buttonInstructionID.click();
    }

    @Step("set End To End ID")
    public void setEndToEndID(String endToEndID){
        inputEndToEndID.clear();
        inputEndToEndID.sendKeys(endToEndID);
    }

    @Step("remove/restore End To End ID")
    public void clickButtonEndToEndID(){
        buttonEndToEndID.click();
    }

    @Step("set Transaction ID")
    public void setTransactionID(String transactionID){
        inputTransactionID.clear();
        inputTransactionID.sendKeys(transactionID);
    }

    @Step("remove/restore Transaction ID")
    public void clickButtonTransactionID(){
        buttonTransactionID.click();
    }

    @Step("set Clearing System Reference")
    public void setClearingSystemReference(String clearingSystemReference){
        inputClearingSystemReference.clear();
        inputClearingSystemReference.sendKeys(clearingSystemReference);
    }

    @Step("remove/restore Clearing System Reference")
    public void clickButtonClearingSystemReference(){
        buttonClearingSystemReference.click();
    }

    @Step("Set ")
    public void setServiceLevel(String serviceLevel){
        inputServiceLevel.clear();
        inputServiceLevel.sendKeys(serviceLevel);
    }

    @Step("remove/restore Service Level")
    public void clickButtonServiceLevel(){
        buttonServiceLevel.click();
    }

    @Step("Set Interbank Settlement Amount")
    public void setInterbankSettlementAmount(String interbankSettlementAmount){
        inputInterbankSettlementAmount.clear();
        inputInterbankSettlementAmount.sendKeys(interbankSettlementAmount);
    }

    @Step("remove/restore Interbank Settlement Amount")
    public void clickButtonInterbankSettlementAmount(){
        buttonInterbankSettlementAmount.click();
    }

    @Step("Set Interbank Settlement Currency")
    public void setInterbankSettlementCurrency(String interbankSettlementCurrency){
        inputInterbankSettlementCurrency.clear();
        inputInterbankSettlementCurrency.sendKeys(interbankSettlementCurrency);
    }

    @Step("remove/restore Interbank Settlement Currency")
    public void clickButtonInterbankSettlementCurrency(){
        buttonInterbankSettlementCurrency.click();
    }

    @Step("Set Charge Bearer")
    public void setChargeBearer(String chargeBearer){
        inputChargeBearer.clear();
        inputChargeBearer.sendKeys(chargeBearer);
    }

    @Step("remove/restore Charge Bearer")
    public void clickButtonChargeBearer(){
        buttonChargeBearer.click();
    }

    @Step("Set Instructing Member ID")
    public void setInstructingMemberID(String instructingMemberID){
        inputInstructingMemberID.clear();
        inputInstructingMemberID.sendKeys(instructingMemberID);
    }

    @Step("remove/restore Instructing Member ID")
    public void clickButtonInstructingMemberID(){
        buttonInstructingMemberID.click();
    }

    @Step("Set Instructed Member ID")
    public void setInstructedMemberID(String instructedMemberID){
        inputInstructedMemberID.clear();
        inputInstructedMemberID.sendKeys(instructedMemberID);
    }

    @Step("remove/restore Instructed Member ID")
    public void clickButtonInstructedMemberID(){
        buttonInstructedMemberID.click();
    }

    @Step("Set Debtor Name")
    public void setDebtorName(String debtorName){
        inputDebtorName.clear();
        inputDebtorName.sendKeys(debtorName);
    }

    @Step("remove/restore Debtor Name")
    public void clickButtonDebtorName(){
        buttonDebtorName.click();
    }

    @Step("Set Debtor Account ID")
    public void setDebtorAccountID(String debtorAccountID){
        inputDebtorAccountID.clear();
        inputDebtorAccountID.sendKeys(debtorAccountID);
    }

    @Step("remove/restore Set Debtor Account ID")
    public void clickButtonDebtorAccountID(){
        buttonDebtorAccountID.click();
    }

    @Step("Set Debtor Financial Institution ID")
    public void setDebtorFinancialInstitutionID(String debtorFinancialInstitutionID){
        inputDebtorFinancialInstitutionID.clear();
        inputDebtorFinancialInstitutionID.sendKeys(debtorFinancialInstitutionID);
    }

    @Step("remove/restore Debtor Financial Institution ID")
    public void clickButtonDebtorFinancialInstitutionID(){
        buttonDebtorFinancialInstitutionID.click();
    }

    @Step("Set Creditor Financial Institution ID")
    public void setCreditorFinancialInstitutionID(String creditorFinancialInstitutionID){
        inputCreditorFinancialInstitutionID.clear();
        inputCreditorFinancialInstitutionID.sendKeys(creditorFinancialInstitutionID);
    }

    @Step("remove/restore Creditor Financial Institution ID")
    public void clickButtonCreditorFinancialInstitutionID(){
        buttonCreditorFinancialInstitutionID.click();
    }

    @Step("Set Creditor Name")
    public void setCreditorName(String creditorName){
        inputCreditorName.clear();
        inputCreditorName.sendKeys(creditorName);
    }

    @Step("remove/restore Creditor Name")
    public void clickButtonCreditorName(){
        buttonCreditorName.click();
    }

    @Step("Set Creditor Account ID")
    public void setCreditAccountID(String creditAccountID){
        inputCreditorAccountID.clear();
        inputCreditorAccountID.sendKeys(creditAccountID);
    }

    @Step("remove/restore Creditor Account ID")
    public void clickButtonCreditAccountID(){
        buttonCreditorAccountID.click();
    }

    @Step("Set Creditor Account Name")
    public void setCreditorAccountName(String creditorAccountName){
        inputCreditorAccountName.clear();
        inputCreditorAccountName.sendKeys();
    }

    @Step("remove/restore Creditor Account Name")
    public void clickButtonCreditAccountName(){
        buttonCreditorAccountName.click();
    }

    @Step("Set Purpose Code")
    public void setPurposeCode(String purposeCode){
        inputPurposeCode.clear();
        inputPurposeCode.sendKeys(purposeCode);
    }

    @Step("remove/restore Purpose Code")
    public void clickButtonPurposeCode(){
        buttonPurposeCode.click();
    }

    /*@Step("Set ")
    public void set(){
        .clear();
        .sendKeys();
    }

    @Step("remove/restore ")
    public void clickButton(){
        .click();
    }

    @Step("Set ")
    public void set(){
        .clear();
        .sendKeys();
    }

    @Step("remove/restore ")
    public void clickButton(){
        .click();
    }

    @Step("Set ")
    public void set(){
        .clear();
        .sendKeys();
    }

    @Step("remove/restore ")
    public void clickButton(){
        .click();
    }

    @Step("Set ")
    public void set(){
        .clear();
        .sendKeys();
    }

    @Step("remove/restore ")
    public void clickButton(){
        .click();
    }

    @Step("Set ")
    public void set(){
        .clear();
        .sendKeys();
    }

    @Step("remove/restore ")
    public void clickButton(){
        .click();
    }*/
}
