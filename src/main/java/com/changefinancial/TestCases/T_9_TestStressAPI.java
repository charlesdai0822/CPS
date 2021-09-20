package com.changefinancial.TestCases;

import com.changefinancial.utils.*;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class T_9_TestStressAPI extends APIBase{

    /*this is to test all stress testing scenarios defined in Excel file*/
    @Test
    public void testStressAPI(){
        Excel ex = new Excel();
        Request rq = new Request();
        Output op = new Output();
        RequestOutputMapping map = new RequestOutputMapping();
        Map<String,String> mapping = map.getReqOutMapping("stress");
        Map<String,String> opParameters;
        Map<String,Map<String,String>> data = ex.getRequestScenariosAndParameters(excelPath,"stress");
        List<String> scenarios = ex.getRequestScenarios(excelPath,"stress");
        for(int i=0;i<scenarios.size();i++){
            System.out.println("request=stress, scenario="+scenarios.get(i));
            rq.sendRequestByScenario(scenarios.get(i),"stress","post");
            opParameters = op.getOutputParameters();
            for(Map.Entry<String,String> entry: data.get(scenarios.get(i)).entrySet()){
                AssertLocal.assertEquals(opParameters.get(mapping.get(entry.getKey())),entry.getValue());
            }
        }
    }
}
