package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityModulePage {

    public ActivityModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//div[@id='content']//a[@data-navigation]")
    public List<WebElement> allListedItems;

    @FindBy (xpath = "//div/span[@data-original-title]")
    public List<WebElement> newestToOldest;

    @FindBy (id = "no_more_activities")
    public WebElement noMoreActivities;





}
