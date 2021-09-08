package com.changefinancial.utils;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Excel {

    public XSSFSheet returnSheetByName(String excelPath,String sheetName){

        try{
            File src = new File(excelPath);
            FileInputStream stream = new FileInputStream(src);
            XSSFWorkbook wb = new XSSFWorkbook(stream);
            XSSFSheet sheet = wb.getSheet(sheetName);
            wb.close();
            stream.close();
            return sheet;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public XSSFSheet returnSheetByIndex(String excelPath, int i){

        return null;
    }

    //this is to get scenario, key, value in a specific request
    public Map<String,Map<String,String>> getRequestScenariosAndParameters(String excelPath,String request){
        Map<String,Map<String,String>> data = new HashMap<>();
        Map<String,String> parameters;
        XSSFSheet sheet = returnSheetByName(excelPath,request);
        XSSFCell cell;
        int totalRows = sheet.getPhysicalNumberOfRows();
        //int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
        String scenario;
        String parameterName;
        String parameterValue;
        for(int i=1;i<totalRows;i++){//loop through sheet but skip the first title row
            cell = sheet.getRow(i).getCell(0);
            cell.setCellType(CellType.STRING);
            scenario = cell.getStringCellValue();
            cell = sheet.getRow(i).getCell(1);
            cell.setCellType(CellType.STRING);
            parameterName = cell.getStringCellValue();;
            cell = sheet.getRow(i).getCell(2);
            cell.setCellType(CellType.STRING);
            parameterValue = cell.getStringCellValue();;
            if(data.containsKey(scenario)){
                data.get(scenario).put(parameterName,parameterValue);
            }else{
                parameters = new HashMap<>();
                parameters.put(parameterName,parameterValue);
                data.put(scenario,parameters);
            }
        }
        return data;
    }

    public Map<String,String> getRequestParametersByScenario(String excelPath,String request, String scenario){
        Map<String,String> data = new HashMap<>();
        XSSFSheet sheet = returnSheetByName(excelPath,request);
        XSSFCell cell;
        String parameterName;
        String parameterValue;
        int totalRows = sheet.getPhysicalNumberOfRows();
        for(int i=1;i<totalRows;i++){
            cell = sheet.getRow(i).getCell(0);
            cell.setCellType(CellType.STRING);
            if(scenario.equals(cell.getStringCellValue())){
                cell = sheet.getRow(i).getCell(1);
                cell.setCellType(CellType.STRING);
                parameterName = cell.getStringCellValue();
                cell = sheet.getRow(i).getCell(2);
                cell.setCellType(CellType.STRING);
                parameterValue = cell.getStringCellValue();
                data.put(parameterName,parameterValue);
            }
        }
        return data;
    }

    public List<String> getRequestScenarios(String excelPath,String request){

        XSSFSheet sheet = returnSheetByName(excelPath,request);
        XSSFCell cell;
        List<String> scenarios = new ArrayList<>();
        int totalRow = sheet.getPhysicalNumberOfRows();
        for(int i=1;i<totalRow;i++){//loop through the first column but skip the first title row
            cell = sheet.getRow(i).getCell(0);
            cell.setCellType(CellType.STRING);
            if(scenarios.contains(cell.getStringCellValue())){

            }else{
                scenarios.add(cell.getStringCellValue());
            }
        }
        return scenarios;
    }

}
