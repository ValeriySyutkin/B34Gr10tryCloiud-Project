package com.trycloud.step_definitions;

import com.trycloud.pages.CalendarPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Calendar_StepDefinitions {

    CalendarPage calendarPage = new CalendarPage();

    @When("user clicks calendar module icon")
    public void user_clicks_calendar_module_icon() {

        calendarPage.calendarButton.click();
    }

    @When("user clicks dayWeekMonth list on the left")
    public void user_clicks_drop_down_menu_on_the_left() {
        calendarPage.dayWeekMonthButton.click();

    }

    @When("user clicks Day view in the dropdown menu")
    public void user_clicks_day_view_in_the_dropdown_menu() {
        calendarPage.calendarDay.click();

    }

    @Then("user should see daily calendar view")
    public void user_should_see_daily_calendar_view() {
        BrowserUtils.waitForURLContains("Day");

    }

    @When("user clicks Week view in the dropdown menu")
    public void user_clicks_week_view_in_the_dropdown_menu() {

        calendarPage.calendarWeek.click();
    }

    @Then("user should see weekly calendar view")
    public void user_should_see_weekly_calendar_view() {
        BrowserUtils.waitForURLContains("Week");

    }

    @When("user clicks Month view in the dropdown menu")
    public void user_clicks_month_view_in_the_dropdown_menu() {
        calendarPage.calendarMonth.click();
    }

    @Then("user should see monthly calendar view")
    public void user_should_see_monthly_calendar_view() {
        BrowserUtils.waitForURLContains("Month");
    }

    @When("user clicks New event button on the left")
    public void user_clicks_new_event_button_on_the_left() {
        BrowserUtils.sleep(10);
        calendarPage.newEventButton.click();
        BrowserUtils.sleep(10);
    }

    @When("user enters {string} into event title box")
    public void user_enters_into_event_title_box(String titleName) {
        calendarPage.calendarTitle.sendKeys(titleName);
    }

    @When("user enters event start {string} and {string}")
    public void userEntersEventStartAnd(String date, String time) {
        calendarPage.calendarStartDateAndTime.clear();
        calendarPage.calendarStartDateAndTime.sendKeys(date, time);
    }

    @When("user enters event end {string} and {string}")
    public void userEntersEventEndAnd(String date, String time) {
        calendarPage.calendarEndDateAndTime.clear();
       calendarPage.calendarEndDateAndTime.sendKeys(date, time);
    }

    @When("user clicks Save button")
    public void user_clicks_save_button() {
        calendarPage.saveButton.click();
        BrowserUtils.sleep(20);
    }

    @Then("user should see new event displayed on monthly view calendar")
   public void user_should_see_new_event_displayed_on_monthly_view_calendar() {
    }

}
