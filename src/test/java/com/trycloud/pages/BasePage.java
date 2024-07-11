package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;


    @FindBy(xpath = "//button[.='View all products']")
    public WebElement allProductsButton;

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement allOrdersButton;


    @FindBy (xpath = "//button[.='Logout']")
    public WebElement logoutButton;


}
