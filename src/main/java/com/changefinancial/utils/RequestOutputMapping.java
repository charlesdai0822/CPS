package com.changefinancial.utils;

import io.restassured.path.json.JsonPath;

import java.util.Map;

public class RequestOutputMapping {

    public Map<String,String> getReqOutMapping(String request){
        String jsonStr = Action.getJsonFile(System.getProperty("user.dir")+"/src/main/java/com/changefinancial/config/req-out-mapping.json");
        JsonPath jsonPath = new JsonPath(jsonStr);
        Map<String,String> map = jsonPath.get(request);
        return map;
    }
}
