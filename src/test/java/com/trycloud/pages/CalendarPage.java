package com.trycloud.pages;


import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CalendarPage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='calendar']")
    public WebElement calendarButton;

    @FindBy(xpath = "(//div[@class='trigger']/button[contains(@class, 'icon')])[1]")
    public WebElement dayWeekMonthButton;

    @FindBy(xpath = "//span[.='Day']")
    public WebElement calendarDay;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement calendarWeek;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement calendarMonth;

    @FindBy(xpath = "//button[contains(@class, 'new-event')]")
    public WebElement newEventButton;

    @FindBy(xpath = "//div[@class='property-title']//input")
    public WebElement calendarTitle;

    @FindBy(xpath = "(//div[@class='mx-datepicker']//input)[1]")
    public WebElement calendarStartDateAndTime;


    @FindBy(xpath = "(//div[@class='mx-datepicker']//input)[2]")
    public WebElement calendarEndDateAndTime;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;


    public WebElement verifyEvent(String meetingName) {
  ;
        String locator = "//div[.='" + meetingName + "']";
        return Driver.getDriver().findElement(By.xpath(locator));


    }

    @FindBy(xpath = "(//div[@class='event-popover__buttons']/button)[1]")
    public WebElement moreButton;

    @FindBy(xpath = "//div[@class='action-item app-sidebar-header__menu']//button")
    public WebElement threeDotMenuButton;

    @FindBy(xpath = "//div[@class='open']//span[.='Delete']")
    public WebElement deleteButton;


}
