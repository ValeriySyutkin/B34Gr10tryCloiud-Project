package com.trycloud.step_definitions;

import com.trycloud.pages.SearchPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

public class Search_StepDefinitions {

    SearchPage searchPage = new SearchPage();

    @When("user is in module {string}")
    public void user_is_in_module(String string) {
        WebElement module = getModuleElement(nameModule(string));
        if (module != null) {
            module.click();
        } else {
            throw new IllegalArgumentException("Invalid module name: " + nameModule(string));
        }
    }

    private WebElement getModuleElement(WebElement webElement) {
        return webElement;
    }

    @When("user clicks on Magnify icon")
    public void user_clicks_on_magnify_icon() {

      BrowserUtils.sleep(1);

      searchPage.magnifyIcon.click();
    }


    @When("user types {string} and clicks it")
    public void user_types_and_clicks_it(String string){

        searchPage.searchBox.sendKeys("read");

        BrowserUtils.sleep(1);

        searchPage.searchBox.submit();

        BrowserUtils.sleep(3);
    }


    @Then("user should see file from the list in Files module")
    public void user_should_see_file_from_the_list_in_files_module() {

        Assert.assertTrue("Expected Search Result does not match Actual Search Result", searchPage.expectedSearchResult.isDisplayed());

        BrowserUtils.sleep(1);
    }


    @Then("user should be able to see the details side page of the file when clicked on it")
    public void user_should_be_able_to_see_the_details_side_page_of_the_file_when_clicked_on_it() {
        Assert.assertTrue("Details on the Side Page not shown", searchPage.sidePage.isDisplayed());

        BrowserUtils.sleep(2);
    }

    @Then("user should be able to navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page")
    public void user_should_be_able_to_navigate_to_the_dashboard_page_whenever_clicking_the_app_icon_at_the_top_left_corner_on_the_page() {

        searchPage.dashboardIcon.click();

        BrowserUtils.sleep(2);

     BrowserUtils.verifyTitle("Dashboard - Trycloud");
        System.out.println("Titles are matching");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.getSourceTagNames().contains("@B34G10-163"))
            user_should_be_able_to_navigate_to_the_dashboard_page_whenever_clicking_the_app_icon_at_the_top_left_corner_on_the_page();
    }

    public WebElement nameModule(String nameModule) {
        switch (nameModule.toString().toLowerCase()) {
            case "dashboard":
                return searchPage.moduleDashboard;
            case "files":
                return searchPage.moduleFiles;
            case "photos":
                return searchPage.modulePhotos;
            case "activity":
                return searchPage.moduleActivity;
            case "talk":
                return searchPage.moduleTalk;
            case "contacts":
                return searchPage.moduleContacts;
            case "circles":
                return searchPage.moduleCircles;
            case "calendar":
                return searchPage.moduleCalendar;
            case "deck":
                return searchPage.moduleDeck;
            default:
                return null;
        }

    }
}
