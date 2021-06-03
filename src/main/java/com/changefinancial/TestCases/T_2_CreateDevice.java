package com.changefinancial.TestCases;

import com.changefinancial.pages.UserDevicePage;
import com.changefinancial.utils.Action;
import com.changefinancial.utils.AssertLocal;
import com.changefinancial.utils.Log;
import com.changefinancial.utils.TableTools;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T_2_CreateDevice extends BaseCase{
    /*
    this test case wil login as user and create a device
     */
    String environment = "Demo";
    String deviceName = "device1";

    @Test
    public void createDevice() {

        loginCPS("user");//log into CPS
        Action.waitMilSecond(1500);

        //set environment if not set
        setEnvironment(environment);

        //create new device
        UserDevicePage udp = new UserDevicePage();
        Log.info("create new device");
        udp.clickNewDeviceButton();
        udp.inputDeviceName(deviceName);
        udp.selectProtocal();
        udp.clickSaveButton();
        Action.waitMilSecond(2000);
        if(udp.closePopup!=null){
            udp.clickClosePopup();
        }

        //verify new device has been created or not
        Log.info("verify device-creating result");
        List<String> list = TableTools.getSpecificColumnText(udp.table, 1);
        int i=0;
        for(i=0;i<list.size();i++){
            if(list.get(i).equals(deviceName)){
                Log.info("create device successfully");
                AssertLocal.assertTrue(true);
                break;
            }else{
                System.out.println("device name:"+list.get(i));
            }
        }
        if(i==list.size()){
            Action.screenshot();
            AssertLocal.assertTrue(false,"create device failed");
            Log.info("create device failed");
        }
    }
}
