package com.changefinancial.TestCases;

import com.changefinancial.utils.*;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class T_14_TestLogCompareAPI extends APIBase{

    @Test
    public void testLogCompareAPI(){
        Excel ex = new Excel();
        Request rq = new Request();
        Output op = new Output();
        RequestOutputMapping map = new RequestOutputMapping();
        Map<String,String> mapping = map.getReqOutMapping("logs-compare");
        Map<String,String> opParameters;
        Map<String,Map<String,String>> data = ex.getRequestScenariosAndParameters(excelPath,"logs-compare");
        List<String> scenarios = ex.getRequestScenarios(excelPath,"logs-compare");
        for(int i=0;i<scenarios.size();i++){
            System.out.println("request=logs-compare, scenario="+scenarios.get(i));
            rq.sendRequestByScenario(scenarios.get(i),"logs-compare","post");
            opParameters = op.getOutputParameters();
            for(Map.Entry<String,String> entry: data.get(scenarios.get(i)).entrySet()){
                AssertLocal.assertEquals(opParameters.get(mapping.get(entry.getKey())),entry.getValue());
            }
        }
    }
}
