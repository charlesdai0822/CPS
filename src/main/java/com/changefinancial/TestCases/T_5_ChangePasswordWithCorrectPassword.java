package com.changefinancial.TestCases;

import com.changefinancial.pages.SettingsPage;
import com.changefinancial.pages.UserDevicePage;
import com.changefinancial.utils.Action;
import com.changefinancial.utils.AssertLocal;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_5_ChangePasswordWithCorrectPassword extends BaseCase{
    String oldPassword = "Cadencie01!";
    String newPassword = "Cadencie01!";
    String environment = "Demo";

    @Feature("Change password")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void changePassword(){

        loginCPS("user");//log into CPS
        Action.waitMilSecond(1500);

        //set environment if not set
        setEnvironment(environment);

        UserDevicePage udp = new UserDevicePage();
        udp.clickUser();
        udp.clickSettings();

        SettingsPage sp = new SettingsPage();
        sp.clickTabPassword();
        sp.inputCurrentPassword(oldPassword);
        sp.inputNewPassword(newPassword);
        sp.inputConfirmPassword(newPassword);
        sp.clickSaveButton();
        Action.waitMilSecond(1000);

        AssertLocal.assertEquals(sp.getUpdateMessage(),"1Your password has been updated successfully.");
    }
}
