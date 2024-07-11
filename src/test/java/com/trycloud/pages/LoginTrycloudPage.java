package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTrycloudPage {

    public LoginTrycloudPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@placeholder='Username or email']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordBox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;


    public void loginMethod(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }



}