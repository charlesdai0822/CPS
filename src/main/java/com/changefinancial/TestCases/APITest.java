package com.changefinancial.TestCases;

import com.changefinancial.utils.Excel;
import com.changefinancial.utils.Output;
import com.changefinancial.utils.Request;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


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

    @Test
    public void testSpaceValue(){
        String qaMessageServerPath;
        //load QA message server path
        Properties pro = new Properties();
        Path path;
        List<String> lines;
        Map<String, String> map = new HashMap<String, String>();
        StringTokenizer st1, st2;
        String key = "";
        String value = "";
        String stringAfterPosition4 = "";
        try {
            pro.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/changefinancial/config/config.properties"));
            qaMessageServerPath = pro.getProperty("outputPath");
            path = Paths.get(qaMessageServerPath);
            lines = Files.readAllLines(path, Charset.forName("Cp1252"));

            for (int i = 0; i < lines.size(); i++) {
                stringAfterPosition4 = lines.get(i).substring(4);
                st1 = new StringTokenizer(stringAfterPosition4, " ");
                while (st1.hasMoreTokens()) {
                    st2 = new StringTokenizer(st1.nextToken(), "=");
                    while (st2.hasMoreTokens()) {
                        key = st2.nextToken();
                        value = st2.nextToken();
                        map.put(key, value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("map="+map);
    }
}
