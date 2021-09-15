package com.changefinancial.utils;

import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import java.util.*;

import static io.restassured.RestAssured.given;

public class Request {

    @Step("send request by scenario")
    public void sendRequestByScenario(String scenario,String request, String requestType){
        Map<String,Map<String,String>> map = new Excel().getRequestScenariosAndParameters("src/main/resources/RequestParameters.xlsx",request);
        String parameters = "";
        if(requestType.equals("post")){
            Log.info("scenario:"+scenario);
            parameters = new Gson().toJson(map.get(scenario));
            try{
                given().body(parameters).when().post(request);
            }catch(Exception e){
                //e.printStackTrace();
            }

            //given().log().all().body(parameters).when().post(request);
        }else if(requestType.equals("get")){
            for(Map.Entry<String,String> entry:map.get(scenario).entrySet()){
                parameters = parameters+"&"+entry.getKey()+"="+entry.getValue();
            }
            try{
                given().request().body(parameters).when().get(request+"?"+parameters.substring(1));
            }catch (Exception e){
                //e.printStackTrace();
            }

        }else{
            System.out.println("requestType cannot be found");
        }
    }


}
