package com.changefinancial.TestCases;

import com.changefinancial.utils.Excel;
import com.changefinancial.utils.Output;
import com.changefinancial.utils.Request;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;


public class APITest extends APIBase {

    @Test
    public void testRequest(){
        Request rq = new Request();
        rq.sendRequestByScenario("scenario3","regression","post");
        Output op = new Output();
        op.getOutputParameters();
    }

    @Test
    public void sendRegressionRequest() throws Exception {
        Request rq = new Request();
        try {
            rq.sendRequestByScenario("scenario3","regression", "post");
        } catch (Exception e) {
            System.out.println("request timeout");
            e.printStackTrace();
        }
        //checkOutput("regression");
    }

    @Test
    public void sendStatusRequest(){
        Request rq = new Request();
        try{
            rq.sendRequestByScenario("scenario2","status","get");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /*public void checkOutput(String request) throws Exception{
        Request rq = new Request();
        Excel ex = new Excel();
        Map<String, String> requestParameters = ex.getRequestParameters(excelPath,request);
        Map<String, String> output = rq.getOutputParameters();
        Map<String, String> mapping = rq.getReqOutMapping(request);

        System.out.println("------------------------------------------------------------------");

        for (Map.Entry<String, String> entry : requestParameters.entrySet()) {

            if (output.get(mapping.get(entry.getKey())).equals(entry.getValue())) {
                System.out.println("parameter:" + entry.getValue() + ", output:" + output.get(mapping.get(entry.getKey())));
                System.out.println(" ");
                System.out.println("compared successfully");
                System.out.println(" ");
            } else {
                System.out.println("compare failed !!!");
                System.out.println(" ");
                System.out.println("parameter:" + entry.getValue() + ", output:" + output.get(mapping.get(entry.getKey())));
                System.out.println(" ");
                throw new Exception("request parameter is NOT equal to output");
            }


        }
    }*/
}
