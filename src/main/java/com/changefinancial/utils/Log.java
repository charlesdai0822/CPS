package com.changefinancial.utils;
import org.apache.log4j.Logger;

public class Log {

    // initialize Log4j log
    private static Logger Log = Logger.getLogger(Log.class.getName());

    // print log header
    public static void startTestCase(String sTestCaseName) {
        Log.info("------------------ " + sTestCaseName + "  " +"test start ------------------");
    }

    //print log tail
    public static void endTestCase(String sTestCaseName) {
        Log.info("------------------ " + sTestCaseName + "  " +"test end ---------------");

    }

    public static void info(String message) {
        Log.info(message);
    }

    public static void warn(String message) {
        Log.warn(message);
    }

    public static void error(String message) {
        Log.error(message);
    }

    public static void fatal(String message) {
        Log.fatal(message);
    }

    public static void debug(String message) {
        Log.debug(message);
    }

}
