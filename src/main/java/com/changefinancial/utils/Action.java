package com.changefinancial.utils;

import com.changefinancial.TestCases.BaseCase;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Action {

    public static void waitSecond(int second){
        try {
            Thread.sleep((long)second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitMilSecond(long milSecond){
        try{
            Thread.sleep(milSecond);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void waitUntilClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(BaseCase.DriverManager.getDriver(),15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void screenshot(){
        File screenShotFile = ((TakesScreenshot)BaseCase.DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
        try{
            FileUtils.moveFile(screenShotFile, new File("src/main/java/com/changefinancial/screenshot/"+df.format(new Date())+".jpg"));
        }catch(Exception e){
            Log.info("Cannot save screenshot");
        }
    }

    //move element to be visible in current page
    public static void moveElementToBeVisable(WebElement element){
        ((JavascriptExecutor) BaseCase.DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public static void scrollDownUntilElementVisible(WebElement scrollDownButton, WebElement elementToBeVisible){
        int i=0;
        Actions action = new Actions(BaseCase.DriverManager.getDriver());
        action.click(scrollDownButton).perform();
        while((!elementToBeVisible.isDisplayed())&&i<100){
            action.doubleClick(scrollDownButton).perform();
            waitMilSecond(200);
            i++;
        }
    }

    public static boolean isElementExist(WebDriver driver, By by){
        try {
            driver.findElement(by);
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }

    public static String getElementText(WebDriver driver,By by){
        return driver.findElement(by).getText();
    }

    @Attachment(value = "Failure", type = "image/png")
    public static byte[] saveScreenshotPNG(){
        return ((TakesScreenshot) BaseCase.DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
