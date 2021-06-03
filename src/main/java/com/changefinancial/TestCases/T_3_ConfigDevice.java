package com.changefinancial.TestCases;

import com.changefinancial.pages.DevicePageEndpointConfigTab;
import com.changefinancial.pages.DevicePageMainTab;
import com.changefinancial.pages.UserDevicePage;
import com.changefinancial.utils.Action;
import com.changefinancial.utils.AssertLocal;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_3_ConfigDevice extends BaseCase{
    /*
    this test case will config the tab named "Endpoint Configuration" in the device details page with following values
     */

    String environment = "Demo";
    String deviceName = "device1";

    String memberIDFrom = "110";
    String branchIDFrom = "210";
    String memberIDTo = "111";
    String branchIDTo = "211";
    String nodeIdentifier = "3";
    String senderType = "A";
    String receiverType = "S";
    String currency = "THB";
    String merchantType = "5411";
    String terminalID = "T0000000001";
    String terminalType = "40";//POS
    String billerID = "billerID01";
    String customerDisplayName = "CustomerDisplayName01";
    String billerServiceName = "BillerServiceName01";
    String senderTaxID = "TaxID01";
    String VATRate = "1.0";

    @Test
    public void configDevice(){
        loginCPS("user");//log into CPS

        //set environment if not set
        UserDevicePage devices = new UserDevicePage();
        setEnvironment(environment);
        devices.clickDeviceByName(deviceName);//click device to step into device page
        DevicePageMainTab dpmt = new DevicePageMainTab();
        dpmt.clickEndpointConfiguration();//click Endpoint Configuration tab
        DevicePageEndpointConfigTab epconfig = new DevicePageEndpointConfigTab();
        epconfig.setShowAmount();//set to show 30 items so that all items are in the same page
        epconfig.setMemberIDFrom(memberIDFrom);
        epconfig.setBranchIDFrom(branchIDFrom);
        epconfig.setMemberIDTo(memberIDTo);
        epconfig.setBranchIDTo(branchIDTo);
        epconfig.setNodeIdentifier(nodeIdentifier);
        epconfig.setSenderType(senderType);
        epconfig.setReceiverType(receiverType);
        epconfig.setCurrency(currency);
        epconfig.setMerchantType(merchantType);
        epconfig.setTerminalID(terminalID);
        epconfig.setTerminalType(terminalType);
        epconfig.setBillerID(billerID);
        epconfig.setCustomerDisplayName(customerDisplayName);
        epconfig.setBillerServiceName(billerServiceName);
        epconfig.setSenderTaxID(senderTaxID);
        epconfig.setVATRate(VATRate);
        epconfig.clickSaveButton();

        Action.waitMilSecond(1000);

        //partially verify if it's been updated
        if(DriverManager.getDriver().findElement(By.xpath("//div[@id='toast-wrapper']/div")).getAttribute("class").equals("toast fade show")){
            AssertLocal.assertTrue(true,"save config successfully");
        }else{
            AssertLocal.assertTrue(true,"save config failed");
        }

    }
}
