package com.changefinancial.TestCases;

import com.changefinancial.pages.Devices;
import com.changefinancial.pages.MessageEchoRequest;
import com.changefinancial.utils.Action;
import com.changefinancial.utils.AssertLocal;
import com.changefinancial.utils.Log;
import com.changefinancial.utils.TableTools;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_4_SendEchoRequest extends BaseCase{
    String deviceName="ITMX PromptPay Switch";
    String environment="Demo";

    @Epic("Device Control")
    @Feature("Send Message")
    @Story("send EchoRequest")
    @Test(description = "send EchoRequest as a demo")
    public void sendEchoRequest(){

        loginCPS("user");//log into CPS

        //set environment if not set
        setEnvironment(environment);


        Log.info("Step into device page");
        Devices devices = new Devices();
        devices.clickDevice(deviceName);

        Log.info("config and send EchoRequest message");
        MessageEchoRequest echoReq = new MessageEchoRequest();
        echoReq.selectEchoRequest();
        echoReq.clickRowMessageSwitch();
        Action.waitMilSecond(2000);
        echoReq.clickButtonCopyDuplicateFlag();//remove Copy Duplicate Flag
        echoReq.setFunctionCode("731");
        echoReq.sendMessage();
        Action.waitMilSecond(3000);

        //verify message-send status
        //get elements in the target td, then retrieve the target text
        Log.info("verify message send result");
        String expectedText1=TableTools.returnElementInTd(echoReq.logs,1,3).findElement(By.tagName("a")).findElement(By.tagName("span")).getText();
        String expectedText2=TableTools.returnElementInTd(echoReq.logs,2,3).findElement(By.tagName("a")).findElement(By.tagName("span")).getText();
        if(expectedText1.equals("EchoRequest")||expectedText2.equals("EchoRequest")){
            AssertLocal.assertTrue(true,"message send success");
        }else{
            AssertLocal.assertTrue(false,"message send failed");
        }
    }
}
