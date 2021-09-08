package com.changefinancial.TestCases;

import com.changefinancial.utils.*;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class T_8_TestRegressionAPI extends APIBase{

    @Test
    public void testAllRegressionAPI(){
        Excel ex = new Excel();
        Request rq = new Request();
        Output op = new Output();
        RequestOutputMapping map = new RequestOutputMapping();
        Map<String,String> mapping = map.getReqOutMapping("regression");
        Map<String,String> opParameters;
        Map<String,Map<String,String>> data = ex.getRequestScenariosAndParameters(excelPath,"regression");
        List<String> scenarios = ex.getRequestScenarios(excelPath,"regression");
        for(int i=0;i<scenarios.size();i++){
            rq.sendRequestByScenario(scenarios.get(i),"regression","post");
            opParameters = op.getOutputParameters();
            for(Map.Entry<String,String> entry: data.get(scenarios.get(i)).entrySet()){
                AssertLocal.assertEquals(opParameters.get(mapping.get(entry.getKey())),entry.getValue());
            }
        }
    }
}
