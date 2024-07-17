package com.trycloud.step_definitions;

import com.trycloud.pages.TrycloudCalendarPage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.TrycloudCalendarPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class TryCloudCalendar_StepDef {

//Valeriy's version of US005
    DashboardPage dashboardPage = new DashboardPage();
    TrycloudCalendarPage trycloudCalendarPage = new TrycloudCalendarPage();


    @When("user clicks calendar button")
    public void user_clicks_calendar_button() {

        dashboardPage.calendarButton.click();
    }

    @When("user clicks three line button")
    public void user_clicks_tree_line_button() {
        BrowserUtils.waitForURLContains("now");
      trycloudCalendarPage.sandwichButton2.click();
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String options) {
     trycloudCalendarPage.selectButton(options);


    }

    @Then("user can see {string}ly calendar view")
    public void userCanSeeCalendarView(String options) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(options));
    }


    @And("user clicks new event button")
    public void userClicksNewEventButton() {
        BrowserUtils.waitForURLContains("now");

       trycloudCalendarPage.newEventButton.click();
    }

    @And("user writes event name in a event title window")
    public void userWritesEventNameInAEventTitleWindow() {
       trycloudCalendarPage.eventTitleBox.sendKeys("Study Java");
    }

    @And("user chooses a day month year and time of starting event in a dedicated window")
    public void userChoosesADayMonthYearAndTimeOfStartingEventInADedicatedWindow() {
        trycloudCalendarPage.allDayCheckBox.click();
        trycloudCalendarPage.startingEvent.sendKeys(Keys.ENTER);
        BrowserUtils.sleep(1);
        trycloudCalendarPage.startDate.click();

    }

    @And("user chooses a day month year and time of ending event in a dedicated window")
    public void userChoosesADayMonthYearAndTimeOfEndingEventInADedicatedWindow() {
        trycloudCalendarPage.endingEvent.sendKeys(Keys.ENTER);
        BrowserUtils.sleep(1);
        trycloudCalendarPage.endDate.click();
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
       trycloudCalendarPage.saveButton.click();
    }

    @Then("user can see new event he created in a monthly calendar view")
    public void userCanSeeNewEventHeCreatedInAMonthlyCalendarWiew() {

        trycloudCalendarPage.sandwichButton2.click();
        trycloudCalendarPage.selectButton("Month");
        String actualResult = trycloudCalendarPage.actualResult.getText();
        String expectedResult = "Study Java";
        Assert.assertEquals(expectedResult,actualResult);
    }
}
