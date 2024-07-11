package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='calendar']")
    public WebElement calendarButton;

    @FindBy (xpath = "(//div[@class='trigger']/button[contains(@class, 'icon')])[1]")
    public WebElement dayWeekMonthButton;

    @FindBy(xpath = "//ul[@tabindex='-1']")
    public List< WebElement> dayWeekMonthList;

    @FindBy (xpath = "//span[.='Day']")
    public WebElement calendarDay;

    @FindBy (xpath = "//span[.='Week']")
    public WebElement calendarWeek;

    @FindBy (xpath = "//span[.='Month']")
    public WebElement calendarMonth;

    @FindBy(xpath = "//button[contains(@class, 'new-event')]")
    public WebElement newEventButton;

    @FindBy (xpath = "//div[@class='property-title']//input")
    public WebElement calendarTitle;

    @FindBy (xpath = "(//div[@class='mx-datepicker']//input)[1]")
    public WebElement calendarStartDateAndTime;

    @FindBy (xpath = "(//div[@class='mx-datepicker']//input)[2]")
    public WebElement calendarEndDateAndTime;

    @FindBy (xpath = "//button[@class='primary']")
    public WebElement saveButton;

}
