package com.changefinancial.pages;

import com.changefinancial.utils.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Add User')]") public WebElement addUser;
    @FindBy(xpath = "//input[@placeholder='New user']") public WebElement  inputNewUser;
    @FindBy(id = "password") public WebElement  password;
    @FindBy(id = "confirm") public WebElement  confirmPassword;
    @FindBy(xpath = "//select[@class='form-control custom-select']") public WebElement  select;
    @FindBy(id = "userActive") public WebElement  userActive;
    @FindBy(xpath = "//input[@id='userActive']//parent::div/parent::form/button[2]") public WebElement  add;
    @FindBy(xpath = "//tbody") public WebElement table;

    public AdminUsersPage() {
        super();
    }

    public void addNewUser(String userName,String password){
        Action.waitMilSecond(1000);
        addUser.click();
        Action.waitMilSecond(500);
        inputNewUser.sendKeys(userName);
        this.password.sendKeys(password);
        confirmPassword.sendKeys(password);
        select.click();
        Action.waitMilSecond(500);
        Select s = new Select(select);
        s.selectByValue("USER");
        userActive.click();
        add.click();
        Action.waitMilSecond(2000);
    }

    public void addNewAdmin(String userName,String password){
        inputNewUser.sendKeys(userName);
        this.password.sendKeys(password);
        confirmPassword.sendKeys(password);
        select.click();
        Select s = new Select(select);
        s.selectByValue("ADMIN");
        userActive.click();
        add.click();
    }

}
