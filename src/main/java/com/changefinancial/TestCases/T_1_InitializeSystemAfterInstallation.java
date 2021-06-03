package com.changefinancial.TestCases;

import com.changefinancial.pages.*;
import com.changefinancial.utils.Action;
import com.changefinancial.utils.AssertLocal;
import com.changefinancial.utils.TableTools;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T_1_InitializeSystemAfterInstallation extends BaseCase{
    /* this script will initialize system by:
    1. creating institution
    2. creating admin, activating it
    3. creating user and activating it
     */

    @Test
    public void initializeSystem(){
        String institutionName="Institution53";
        String adminUsername="admin53";
        String adminPassword="Cadencie01!";
        String environmentName="environment53";
        String regularUserName = "user53";
        String regularUserPassword = "Cadencie01!";
        List<String> list;

        loginCPS("sysAdmin");//log into CPS

        SystemAdminPage sysAdmin=new SystemAdminPage();
        sysAdmin.createInstitution(institutionName);
        Action.waitMilSecond(3000);
        list = TableTools.getSpecificColumnText(sysAdmin.table,2);
        if(!list.contains(institutionName)){
            for(int i=0;i<list.size();i++){
                System.out.println("institution"+i+"="+list.get(i));
            }
            AssertLocal.assertFalse(false,"create institution failed");
        }
        sysAdmin.clickUsers();//step to Users page
        Action.waitMilSecond(3000);



        SystemAdminUsersPage sysAdminUsers = new SystemAdminUsersPage();
        sysAdminUsers.createAdmin(adminUsername,adminPassword,institutionName);//create admin account
        Action.waitMilSecond(1000);
        sysAdminUsers.logOut();

        //login as admin
        Login login = new Login();
        Action.waitUntilClickable(login.username);
        login.inputUsername(adminUsername);
        login.inputPassword(adminPassword);
        login.clickLogin();
        Action.waitMilSecond(3000);

        //active admin account
        AdminSettingPage adminSetting = new AdminSettingPage();
        adminSetting.updatePassword(adminPassword,adminPassword);
        Action.waitMilSecond(4000);

        //create new environment
        AdminEnvironmentsPage adminEnv = new AdminEnvironmentsPage();
        adminEnv.addNewEnvironment(environmentName);
        Action.waitMilSecond(3000);
        list = TableTools.getSpecificColumnText(adminEnv.table,1);
        if(!list.contains(environmentName)){
            AssertLocal.assertTrue(false,"create environment failed");
        }
        adminEnv.goToUsersPage();

        //create new user
        AdminUsersPage adminUser = new AdminUsersPage();
        adminUser.addNewUser(regularUserName,regularUserPassword);
        list= TableTools.getSpecificColumnText(adminUser.table,1);
        if(!list.contains(regularUserName)){
            AssertLocal.assertTrue(false,"create regular user failed");
        }


    }
}
