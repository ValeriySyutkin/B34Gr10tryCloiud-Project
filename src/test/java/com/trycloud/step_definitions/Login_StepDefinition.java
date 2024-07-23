package com.trycloud.step_definitions;

import com.trycloud.pages.LoginTrycloudPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login_StepDefinition {
    LoginTrycloudPage loginTrycloudPage = new LoginTrycloudPage();


    @Given("user is  on the login page of the library application")
    public void userIsOnTheLoginPageOfTheLibraryApplication() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        BrowserUtils.waitForVisibility(loginTrycloudPage.loginButton,10);
        BrowserUtils.waitForURLContains("login");

        loginTrycloudPage.loginMethod(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));



    }
}
