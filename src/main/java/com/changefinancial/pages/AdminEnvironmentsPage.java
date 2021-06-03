package com.changefinancial.pages;

import com.changefinancial.utils.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminEnvironmentsPage extends BasePage {

    @FindBy(xpath = "//button[text()='Add Environment']") public WebElement addEnvironment;
    @FindBy(xpath = "//input[@placeholder='New environment']") public WebElement inputEnvironment;
    @FindBy(xpath = "//button[contains(text(),'Save')]") public WebElement save;
    @FindBy(xpath = "//span[text()='Users']") public WebElement users;
    @FindBy(xpath = "//tbody") public WebElement table;
    @FindBy(xpath = "//div[@id='toast-wrapper']/div/div/button") public WebElement closePopup;

    public AdminEnvironmentsPage() {
        super();
    }

    public void addNewEnvironment(String envName){
        Action.waitMilSecond(700);
        addEnvironment.click();
        Action.waitMilSecond(700);
        inputEnvironment.sendKeys(envName);
        Action.waitMilSecond(700);
        save.click();
        Action.waitMilSecond(2000);
        closePopup.click();
    }

    public void goToUsersPage(){
        Action.waitMilSecond(700);
        users.click();
    }
}
