package com.changefinancial.TestCases;
import com.changefinancial.pages.*;
import com.changefinancial.utils.Action;
import com.changefinancial.utils.TableTools;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class JustTest extends BaseCase{

    @Test
    public void test(){
        String institutionName="Institution44";
        String username="admin44";
        String password="Cadencie01!";
        List<String> list;
        SystemAdminPage sysAdmin=new SystemAdminPage();
        sysAdmin.createInstitution(institutionName);
        Action.waitMilSecond(3000);
        list = TableTools.getSpecificColumnText(sysAdmin.table,2);
        if(!list.contains(institutionName)){
            for(int i=0;i<list.size();i++){
                System.out.println("institution"+i+"="+list.get(i));
            }
            Assert.assertTrue(false,"create institution failed");
        }
        sysAdmin.clickUsers();//step to Users page
        Action.waitMilSecond(3000);

        SystemAdminUsersPage sysAdminUsers = new SystemAdminUsersPage();
        sysAdminUsers.createAdmin(username,password,institutionName);//create admin account
        Action.waitMilSecond(1000);
    }
}
