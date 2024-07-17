package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrycloudCalendarPage {
    public TrycloudCalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Month']")
    public WebElement monthButton;

    @FindBy(xpath = "//span[.='Day']")
    public WebElement dayButton;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement weekButton;


    public void selectButton(String button) {
        switch (button) {
            case "Month" -> monthButton.click();
            case "Day" -> dayButton.click();
            case "Week" -> weekButton.click();
            default -> throw new IllegalArgumentException("Invalid button: " + button);
        }
    }


    @FindBy(xpath = "(//div/div/div/div//button)[1]")
    public WebElement sandwichButton2;

    @FindBy(xpath = "//div[@id='content-vue']//button[@class='button primary new-event']")
    public WebElement newEventButton;


    @FindBy(xpath = "//div[@class='property-title__input']/input")
    public WebElement eventTitleBox;

    @FindBy(xpath = "(//input[@class='mx-input'])[2]")
    public WebElement startingEvent;

    @FindBy(xpath = "(//input[@class='mx-input'])[3]")
    public WebElement endingEvent;

    @FindBy(xpath = "(//button[@class='primary'])")
    public WebElement saveButton;

    @FindBy(xpath = "//label[@for='allDay']")
    public WebElement allDayCheckBox;



    @FindBy(xpath = "//td[@title='2024-07-23']")
    public WebElement startDate;

    @FindBy(xpath = "//td[@title='2024-07-24']")
    public WebElement endDate;

    @FindBy (xpath = "//div[@class='fc-event-title fc-sticky']")
    public WebElement actualResult;

}
