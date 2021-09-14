package com.changefinancial.TestCases;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class APIBase {

    //public static RequestSpecification httpRequest;
    public static Response response;

    public static String serverHost;
    public static String port;
    public static String basePath;
    public static String excelPath;
    public static int requestTimeout;

    public Response res = null;

    static{
        //load properties file
        Properties pro = new Properties();
        try{
            pro.load(new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/changefinancial/config/config.properties"));
            serverHost = pro.getProperty("API_Host");
            port = pro.getProperty("Port");
            basePath=pro.getProperty("basePath");
            excelPath = pro.getProperty("excelPath");
            requestTimeout = Integer.parseInt(pro.getProperty("requestTimeout"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @BeforeClass
    public void setup(){
        setBaseURL();
        setBasePath(basePath);
        setContentType(ContentType.JSON);
        setRequestTimeout(requestTimeout);
    }


    @AfterClass
    public void afterTest(){
        resetBaseURL();
        resetBasePath();
    }

    public static void setBaseURL(){
        if("80".equals(port)){
            RestAssured.baseURI = serverHost;
        }else {
            RestAssured.baseURI = serverHost+":"+port+"/";
        }
    }

    public static void setBasePath(String basePath){
        RestAssured.basePath = basePath;
    }

    public static  void resetBaseURL(){
        RestAssured.baseURI = null;
    }

    public static void resetBasePath(){
        RestAssured.basePath = null;
    }

    public static void setContentType(ContentType Type){
        given().contentType(Type);
    }

    public static Response getResponseByPath(String path){
        return get(path);
    }

    public static Response getResponse(){
        return get();
    }

    public static void setRequestTimeout(int timeout){
        RestAssured.config= RestAssuredConfig.config().httpClient(HttpClientConfig.httpClientConfig().
                setParam("http.connection.timeout",timeout).
                setParam("http.socket.timeout",timeout).
                setParam("http.connection-manager.timeout",timeout));
    }

    public static JsonPath getJsonPath(Response res){
        String json = res.asString();
        return new JsonPath(json);
    }

    public static void sendRequest(String request, Map<String,String> map){

    }
}
