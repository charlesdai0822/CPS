package com.changefinancial.utils;

import org.testng.Assert;

import java.util.Iterator;

/*
re write Assert class to include screenshot so that each time when assert fail, Allure will attach the screenshot.
 */

public class AssertLocal {

    public static void assertEquals(Object actual, Object expected){
        try{
            Assert.assertEquals(actual, expected);
        }catch(Error e){
            Action.saveScreenshotPNG();
            throw e;
        }
    }

    public static void assertTrue(boolean condition, java.lang.String message) {
        try{
            Assert.assertTrue(condition, message);
        }catch(Error e){
            Action.saveScreenshotPNG();
            throw e;
        }
    }

    public static void assertTrue(boolean condition) {
        try{
            Assert.assertTrue(condition);
        }catch(Error e){
            Action.saveScreenshotPNG();
            throw e;
        }
    }

    public static void assertFalse(boolean condition, java.lang.String message) {
        try{
            Assert.assertFalse(condition, message);
        }catch(Error e){
            Action.saveScreenshotPNG();
            throw e;
        }
    }

    public static void assertFalse(boolean condition) {
        try{
            Assert.assertFalse(condition);
        }catch(Error e){
            Action.saveScreenshotPNG();
            throw e;
        }
    }

    public static void assertEquals(Iterator<?> actual, Iterator<?> expected){
        try{
            Assert.assertEquals(actual, expected);
        }catch(Error e){
            Action.saveScreenshotPNG();
            throw e;
        }
    }
}
