package com.changefinancial.TestCases;

import com.changefinancial.utils.Action;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static io.restassured.RestAssured.given;

public class Request {

    public Map<String,String> getOutputParameters(){
        String qaMessageServerPath;
        //load QA message server path
        Properties pro = new Properties();
        Path path;
        List<String> lines;
        Map<String,String> map = new HashMap<String, String>();
        StringTokenizer st;
        String key = "";
        String value = "";
        try {
            pro.load(new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/changefinancial/config/config.properties"));
            qaMessageServerPath = pro.getProperty("outputPath");
             path = Paths.get(qaMessageServerPath);
             lines = Files.readAllLines(path);

             for(int i=0;i<lines.size()-1;i++){
                 st = new StringTokenizer(lines.get(i),"=");
                 while(st.hasMoreTokens()){
                     key = st.nextToken();
                     value = st.nextToken();
                 }
                 map.put(key,value);
             }
        }catch (IOException e){
            e.printStackTrace();
        }
        return map;
    }

    public Map<String,String> getRequestParameters(String request){
        String jsonStr = Action.getJsonFile(System.getProperty("user.dir")+"/src/main/java/com/changefinancial/config/requests.json");
        JsonPath jsonPath = new JsonPath(jsonStr);
        Map<String,String> map = jsonPath.get("requests."+request+".parameters.parameter");
        return map;
    }

    public void sendRequest(String request, String requestType){
        String parameters = new Gson().toJson(getRequestParameters(request));
        if(requestType.equals("post")){
            given().request().body(parameters).when().post("http://127.0.0.1:8080/run-test");
        }else if(requestType.equals("get")){
            //put get request here
        }
    }

    public Map<String,String> getReqOutMapping(String request){
        String jsonStr = Action.getJsonFile(System.getProperty("user.dir")+"/src/main/java/com/changefinancial/config/req-out-mapping.json");
        JsonPath jsonPath = new JsonPath(jsonStr);
        Map<String,String> map = jsonPath.get(request);
        return map;
    }
}
