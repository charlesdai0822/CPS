package com.changefinancial.pages;

import com.changefinancial.utils.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SystemAdminUsersPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'New administrator')]") public WebElement newAdministrator;
    @FindBy(id = "username") public WebElement username;
    @FindBy(id = "institution") public WebElement institutions;
    @FindBy(id = "password") public WebElement password;
    @FindBy(id = "confirm") public WebElement confirm;
    @FindBy(xpath = "//button[text()='Save']") public WebElement save;
    @FindBy(id = "user-dropdown") public WebElement userIcon;
    @FindBy(xpath = "//a[@data-target='#logoutModal']") public WebElement logout;
    @FindBy(xpath = "//a[@href='/logout/']") public WebElement confirmLogout;
    @FindBy(xpath = "//div[@id='toast-wrapper']/div/div/button") public WebElement closePopup;
    @FindBy(xpath = "//tbody") public WebElement table;


    public SystemAdminUsersPage() {
        super();
    }

    public void createAdmin(String username,String password,String institution){
        Action.waitMilSecond(1000);
        newAdministrator.click();
        //Actions.waitMilSecond(1000);
        this.username.sendKeys(username);
        institutions.click();
        Select selectInstitution = new Select(institutions);
        selectInstitution.selectByVisibleText(institution);
        this.password.sendKeys(password);
        this.confirm.sendKeys(password);
        save.click();
        Action.waitMilSecond(2000);
        closePopup.click();
    }

    public void logOut(){
        userIcon.click();
        logout.click();
        //Actions.waitMilSecond(1000);
        confirmLogout.click();
    }
}
