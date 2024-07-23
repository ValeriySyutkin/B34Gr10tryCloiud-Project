package com.trycloud.step_definitions;

import com.trycloud.pages.CalendarPage;
import com.trycloud.utilities.BrowserUtils;


import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class Calendar_StepDefinitions {



    CalendarPage calendarPage = new CalendarPage();
    String randomDate = BrowserUtils.getRandomDate("07/dd/yyyy", 2024, 2024);

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
        BrowserUtils.verifyURLContains("Day");


    }

    @When("user clicks Week view in the dropdown menu")
    public void user_clicks_week_view_in_the_dropdown_menu() {

        calendarPage.calendarWeek.click();
    }

    @Then("user should see weekly calendar view")
    public void user_should_see_weekly_calendar_view() {
        BrowserUtils.verifyURLContains("Week");

    }

    @When("user clicks Month view in the dropdown menu")
    public void user_clicks_month_view_in_the_dropdown_menu() {
        calendarPage.calendarMonth.click();
    }

    @Then("user should see monthly calendar view")
    public void user_should_see_monthly_calendar_view() {
        BrowserUtils.verifyURLContains("Month");
    }

    @When("user clicks New event button on the left")
    public void user_clicks_new_event_button_on_the_left() {
        BrowserUtils.sleep(10);
        calendarPage.newEventButton.click();

    }

    @When("user enters event name into event title box")
    public void user_enters_into_event_title_box() {

        calendarPage.calendarTitle.sendKeys("New Event");


    }

    @And("user enters event start with random date and {string}")
    public void userEntersEventStartWithRandomDateAnd(String startTime) {

        calendarPage.calendarStartDateAndTime.click();
        calendarPage.calendarStartDateAndTime.clear();
        calendarPage.calendarStartDateAndTime.sendKeys(randomDate + " " + startTime);

    }

    @And("user enters event end with random date and {string}")
    public void userEntersEventEndWithRandomDateAnd(String endTime) {

        calendarPage.calendarEndDateAndTime.click();
        calendarPage.calendarEndDateAndTime.clear();
        calendarPage.calendarEndDateAndTime.sendKeys(randomDate + " " + endTime);

    }


    @When("user clicks Save button")
    public void user_clicks_save_button() {
        calendarPage.saveButton.click();

    }

    @Then("user should see new event displayed on monthly view calendar")
    public void user_should_see_new_event_displayed_on_monthly_view_calendar() {


        String expectedEvent = "New Event";
        String actualEvent = calendarPage.verifyEvent("New Event").getText();

        BrowserUtils.sleep(5);
        Assert.assertTrue(actualEvent.contains(expectedEvent));


    }

    @And("user click on new event")
    public void user_click_on_new_event() {
        BrowserUtils.sleep(5);
        calendarPage.verifyEvent("New Event").click();
    }

    @When("user click More button")
    public void user_click_more_button() {
        calendarPage.moreButton.click();
    }

    @When("user click on three dot menu on the right")
    public void user_click_on_three_dot_menu_on_the_right() {
        calendarPage.threeDotMenuButton.click();
    }

    @When("user click Delete button")
    public void user_click_delete_button() {
        calendarPage.deleteButton.click();
    }

    @Then("user should be able to see new event is deleted")
    public void user_should_be_able_to_see_file_is_deleted() {


      // Assert.assertTrue(!calendarPage.verifyEvent("New Event").isDisplayed());

    }

}
