package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginTrycloudPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class DashboardPageModifications_StepDefs {

        DashboardPage dashboardPage = new DashboardPage();
        LoginTrycloudPage loginTrycloudPage = new LoginTrycloudPage();


        //Background(Precondition)
        @Given("user is already logged in to trycloud.net and is on dashboard page")
        public void user_is_already_logged_in_to_trycloud_net_and_is_on_dashboard_page() {

            Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
            //   BrowserUtils.waitForURLContains("login");
            loginTrycloudPage.loginMethod(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        }

        //AC#1  After Login user can see all modules and Username.

        @Then("User sees all modules on a dashboard page")
        public void userSeesAllModulesOnADashboardPage() {
            BrowserUtils.waitForURLContains("dashboard");
            for (WebElement eachModule : dashboardPage.allModules) {
                Assert.assertTrue(eachModule.isDisplayed());
            }
        }


        @When("User clicks on a profile icon and Dropdown comes up")
        public void user_clicks_on_a_profile_icon_and_dropdown_comes_up() {
            dashboardPage.profileButton.click();
        }


        @Then("User sees {string} at the top of a drop down")
        public void userSeesAtTheTopOfADropDown(String expectedUsername) {
            expectedUsername = ConfigurationReader.getProperty("username");
            String actualUsername = dashboardPage.profileUsername.getAttribute("title");
            Assert.assertEquals(expectedUsername,actualUsername);
        }





        //AC#2 User can click on Customize button and select any of the Widgets
        @When("User clicks customize button")
        public void user_clicks_customize_button() {
            dashboardPage.customizeButton.click();
        }

        @Then("User can select any of the Widgets")
        public void user_can_select_any_of_the_widgets() {
            for (WebElement eachWidget : dashboardPage.allWidgets) {
                BrowserUtils.sleep(1);
                eachWidget.click();
                Assert.assertTrue(eachWidget.isEnabled());
            }

        }



        //AC#3 User can click on Set Status button and select any of the Status options
        @When("User clicks on Status button")
        public void user_clicks_on_status_button() {
            dashboardPage.statusButton.click();

        }
        @Then("User can select any of the status options")
        public void user_can_select_any_of_the_status_options() {
            for (WebElement eachOption : dashboardPage.allStatusOptions) {
                BrowserUtils.sleep(1);
                eachOption.click();
                Assert.assertTrue(eachOption.isEnabled());
            }
        }



    }

