package com.changefinancial.pages;

import com.changefinancial.TestCases.BaseCase.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
}
