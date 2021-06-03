package com.changefinancial.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TableTools {

    public static int returnAmountOfTr(WebElement table){
        return table.findElements(By.tagName("tr")).size();
    }

    public static int returnAmountOfTd(WebElement table){
        return table.findElements(By.xpath("//tr[1]/td")).size();
    }

    public static String getTdText(WebElement table, int rowNumber, int columnNumber){
        List<WebElement> row = table.findElements(By.tagName("tr"));
        List<WebElement> column = row.get(rowNumber-1).findElements(By.tagName("td"));
        String tdText = column.get(columnNumber-1).getText();
        return  tdText;
    }

    public static List<String> getSpecificColumnText(WebElement table, int columnNumber){
        List<String> text= new ArrayList<>();
        List<WebElement> trs = table.findElements(By.tagName("tr"));
        List<WebElement> tds;
        for(WebElement tr : trs){
            tds = tr.findElements(By.tagName("td"));
            text.add(tds.get(columnNumber-1).getText());
        }
        return text;
    }

    public static void clickRow(WebElement table, int rowNumber){
        List<WebElement> trs = table.findElements(By.tagName("tr"));
        trs.get(rowNumber).click();
    }

    public static WebElement returnElementInTd(WebElement table, int rowNumber, int columnNumber){
        List<WebElement> trs = table.findElements(By.tagName("tr"));
        List<WebElement> tds = trs.get(rowNumber-1).findElements(By.tagName("td"));
        return tds.get(columnNumber-1);
    }

}
