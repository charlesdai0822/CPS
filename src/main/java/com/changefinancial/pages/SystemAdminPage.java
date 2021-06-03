package com.changefinancial.pages;

import com.changefinancial.utils.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemAdminPage extends BasePage {

    public SystemAdminPage() {
        super();
    }

    @FindBy(xpath = "//button[contains(text(),'New institution')]") public WebElement newInstitution;
    @FindBy(xpath = "//span[text()='Users']") public WebElement users;
    @FindBy(id = "institutionName") public WebElement inputInstitutionName;
    @FindBy(xpath = "//button[text()='Save']") public WebElement save;
    @FindBy(id = "user-dropdown") public WebElement userIcon;
    @FindBy(xpath = "//a[@data-target='#logoutModal']") public WebElement logout;
    @FindBy(xpath = "//a[@href='/logout/']") public WebElement confirmLogout;
    @FindBy(xpath = "//div[@id='toast-wrapper']/div/div/button") public WebElement closePopup;
    @FindBy(xpath = "//tbody") public WebElement table;



    public void createInstitution(String institutionName){
        newInstitution.click();
        Action.waitMilSecond(500);
        inputInstitutionName.clear();
        inputInstitutionName.sendKeys(institutionName);
        save.click();
    }

    public void clickUsers(){
        users.click();
    }

    public void logOut(){
        Action.waitMilSecond(2000);
        closePopup.click();
        userIcon.click();
        logout.click();
        confirmLogout.click();
    }
}
