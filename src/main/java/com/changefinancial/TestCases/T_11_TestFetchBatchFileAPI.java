package com.changefinancial.TestCases;

import com.changefinancial.utils.*;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class T_11_TestFetchBatchFileAPI extends APIBase{

    @Test
    public void testFetchBatchFileAPI(){
        Excel ex = new Excel();
        Request rq = new Request();
        Output op = new Output();
        RequestOutputMapping map = new RequestOutputMapping();
        Map<String,String> mapping = map.getReqOutMapping("batch");
        Map<String,String> opParameters;
        Map<String,Map<String,String>> data = ex.getRequestScenariosAndParameters(excelPath,"batch");
        List<String> scenarios = ex.getRequestScenarios(excelPath,"batch");
        for(int i=0;i<scenarios.size();i++){
            System.out.println("request=batch, scenario="+scenarios.get(i));
            rq.sendRequestByScenario(scenarios.get(i),"batch","post");
            opParameters = op.getOutputParameters();
            for(Map.Entry<String,String> entry: data.get(scenarios.get(i)).entrySet()){
                AssertLocal.assertEquals(opParameters.get(mapping.get(entry.getKey())),entry.getValue());
            }
        }
    }
}
