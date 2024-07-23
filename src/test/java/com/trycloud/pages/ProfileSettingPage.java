package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ProfileSettingPage {


    public ProfileSettingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3/label[@for]")
    public List<WebElement> AllTitlesAsElements;

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement usernameInputBox;

    @FindBy(id = "email")
    public WebElement emailInputBox;

@FindBy (id = "languageinput")
    public WebElement languageDropdown;

@FindBy (id = "localeexample-time")
    public WebElement localTime;


}




