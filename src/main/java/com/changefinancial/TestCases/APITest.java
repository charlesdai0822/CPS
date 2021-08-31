package com.changefinancial.TestCases;

import org.testng.annotations.Test;
import java.util.Map;


public class APITest extends APIBase {

    @Test
    public void sendRegressionRequest() throws Exception {
        Request rq = new Request();
        try {
            rq.sendRequest("regression", "post");
        } catch (Exception e) {
            //System.out.println("request timeout");
        }
        checkOutput("regression");
    }

    public void checkOutput(String request) throws Exception{
        Request rq = new Request();
        Map<String, String> requestParameters = rq.getRequestParameters(request);
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
    }
}
