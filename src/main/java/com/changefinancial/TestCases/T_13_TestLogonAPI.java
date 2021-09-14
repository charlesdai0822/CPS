package com.changefinancial.TestCases;

import com.changefinancial.utils.*;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class T_13_TestLogonAPI extends APIBase{

    @Test
    public void testLogonAPI(){
        Excel ex = new Excel();
        Request rq = new Request();
        Output op = new Output();
        RequestOutputMapping map = new RequestOutputMapping();
        Map<String,String> mapping = map.getReqOutMapping("logon");
        Map<String,String> opParameters;
        Map<String,Map<String,String>> data = ex.getRequestScenariosAndParameters(excelPath,"logon");
        List<String> scenarios = ex.getRequestScenarios(excelPath,"logon");
        for(int i=0;i<scenarios.size();i++){
            System.out.println("request=logon, scenario="+scenarios.get(i));
            rq.sendRequestByScenario(scenarios.get(i),"logon","post");
            opParameters = op.getOutputParameters();
            for(Map.Entry<String,String> entry: data.get(scenarios.get(i)).entrySet()){
                AssertLocal.assertEquals(opParameters.get(mapping.get(entry.getKey())),entry.getValue());
            }
        }
    }
}
