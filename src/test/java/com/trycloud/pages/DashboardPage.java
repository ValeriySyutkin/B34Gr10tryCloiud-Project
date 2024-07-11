package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy (xpath = "//ul[@id='appmenu']/li[@tabindex='-1']")
    public List<WebElement> allModules;


    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement profileButton;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement profileUsername;

    @FindBy (xpath = "//a[.='Customize']")
    public WebElement customizeButton;

    @FindBy (xpath = "//label[@class]")
    public List<WebElement> allWidgets;

    @FindBy(xpath = "//a[@data-v-30c75648]")
    public  WebElement statusButton;

    @FindBy (xpath = "//label[@data-v-d5c541dc]")
    public List<WebElement> allStatusOptions;
}
