package com.trycloud.step_definitions;

import com.trycloud.pages.ActivityModulePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActivityModule_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    ActivityModulePage activityModulePage = new ActivityModulePage();

    @When("user clicks on a activity button of the module on top")
    public void user_clicks_on_a_activity_button_of_the_module_on_top() {
        dashboardPage.activityButton.click();
    }




    @Then("user can see all listed items under the Activity module.")
    public void user_can_see_all_listed_items_under_the_activity_module() {
        for (WebElement each : activityModulePage.allListedItems) {
           Assert.assertTrue(each.isDisplayed());
        }

    }


    @Then("User can see all items list ordered by newest to oldest.")
    public void user_can_see_all_items_list_ordered_by_newest_to_oldest() {
        for (WebElement each : activityModulePage.newestToOldest) {
            Assert.assertTrue(each.isDisplayed());
        }
    }


    @Then("User can see {string} message at the end of the All Activities tab.")
    public void userCanSeeMessageAtTheEndOfTheAllActivitiesTab(String expectedMessage) {




        String actualMessage = activityModulePage.noMoreActivities.getAttribute("innerText").trim();

        Assert.assertEquals(expectedMessage,actualMessage);

    }
}
