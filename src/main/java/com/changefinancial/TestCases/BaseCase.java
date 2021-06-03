package com.changefinancial.TestCases;

import com.changefinancial.pages.Login;
import com.changefinancial.pages.SystemAdminLoginPage;
import com.changefinancial.pages.UserDevicePage;
import com.changefinancial.utils.Action;
import com.changefinancial.utils.LogEventListener;
import io.qameta.allure.Step;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseCase {
    /*
    all test case script class will extend this class to get fundamental functions.
     */

    String url;
    String loginAdminUsername;
    String loginAdminPassword;
    String loginOrdinaryUsername;
    String loginOrdinaryUserPassword;
    String loginSysAdminPassword;


    public BaseCase(){
        getConfig();//read config
        DOMConfigurator.configure(System.getProperty("user.dir")+"/src/main/java/com/changefinancial/config/log4j.xml");//read log4j.xml
    }

    public void getConfig(){
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/changefinancial/config/config.properties"));
            url = pro.getProperty("loginURL");
            loginAdminUsername = pro.getProperty("loginAdminUsername");
            loginAdminPassword = pro.getProperty("loginAdminPassword");
            loginOrdinaryUsername = pro.getProperty("loginOrdinaryUsername");
            loginOrdinaryUserPassword = pro.getProperty("loginOrdinaryUserPassword");
            loginSysAdminPassword = pro.getProperty("loginSysAdminPassword");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Step("login to CPS")
    public void loginCPS(String role){
        DriverManager.getDriver().get(url);
        DriverManager.getDriver().manage().window().maximize();
        if(role.equals("user")){
            Login login = new Login();
            login.inputUsername(loginOrdinaryUsername);
            login.inputPassword(loginOrdinaryUserPassword);
            login.clickLogin();
        }else if(role.equals("sysAdmin")){
            Login login = new Login();
            login.clickSystemAdmin();
            Action.waitMilSecond(1000);
            SystemAdminLoginPage sysAdminLogin = new SystemAdminLoginPage();
            sysAdminLogin.loginAsSysAdmin(loginSysAdminPassword);

        }else if(role.equals("admin")){
            Login login = new Login();
            login.inputUsername(loginAdminUsername);
            login.inputPassword(loginAdminPassword);
            login.clickLogin();
        }

        Action.waitMilSecond(2000);
    }

    @Step("set environment")
    public void setEnvironment(String environment){
        if(Action.isElementExist(DriverManager.getDriver(), By.xpath("//*[@id='content']/div[2]/div[1]/a"))) {
            UserDevicePage udp = new UserDevicePage();
            udp.clickSetEnv();
            udp.clickEnvSelect();
            udp.selectEnv(environment);
            udp.setEnv();
            Action.waitMilSecond(1000);
        }
    }

    @Step("quit driver after test case")
    @AfterMethod(alwaysRun = true)
    protected void testMethodEnd(){
        DriverManager.quitDriver();
    }

    /*
    1.register LogEventListener to EventFiringWebDriver so that actions can be captured in class LogEventListener can be captured.
    2.use ThreadLocal to make sure one driver only bind one thread, so that multiple threads can be used in safe mode(operation in browser1 won't jump to browser2)
     */
    public static class DriverManager {
        public static ThreadLocal<WebDriver> ThreadDriver = new ThreadLocal<WebDriver>();
        public static WebDriver getDriver(){
            WebDriver driver = DriverManager.ThreadDriver.get();
            if(driver == null){
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/com/changefinancial/driver/chromedriver.exe");
                driver = new EventFiringWebDriver(new ChromeDriver()).register(new LogEventListener());
                ThreadDriver.set(driver);
                //wait 3 seconds before trying to find element
                DriverManager.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }
            return driver;
        }

        public static void quitDriver(){
            getDriver().quit();
            DriverManager.ThreadDriver.set(null);
        }
    }
}
