package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.ProfileSettingPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class EditEnterProfile_StepDefinition {


    DashboardPage dashboardPage = new DashboardPage();
    ProfileSettingPage profileSettingPage = new ProfileSettingPage();


    @When("User clicks on a profile icon on the right conor")
    public void user_clicks_on_a_profile_icon_on_the_right_conor() {
    dashboardPage.profileButton.click();
    }


    @And("click on the Setting button in a drop down menu")
    public void click_on_the_setting_button_in_a_drop_down_menu() {
    dashboardPage.settingsButton.click();
    }



    @Then("User can see following titles inside “Personal Info” under Profile Settings page:")
    public void user_can_see_following_titles_inside_personal_info_under_profile_settings_page(List<String> expectedTitles) {

        List<WebElement> firstThreeElements = new ArrayList<>();

        for (int i = 0; i < 3 && i < profileSettingPage.AllTitlesAsElements.size(); i++) {
            firstThreeElements.add(profileSettingPage.AllTitlesAsElements.get(i));
        }

        List<String> firstThreeTitles = new ArrayList<>();

        for (WebElement eachTitle : firstThreeElements) {
            firstThreeTitles.add(eachTitle.getText());
        }
        Assert.assertEquals(expectedTitles,firstThreeTitles);

    }


    @Then("user sees Name of the user in the Settings field is the same as Full Name input box")
    public void userSeesNameOfTheUserInTheSettingsFieldIsTheSameAsFullNameInputBox() {

        String settingsUsername = dashboardPage.profileUsername.getAttribute("title");
        String inputBoxUserName = profileSettingPage.usernameInputBox.getAttribute("value");

        Assert.assertEquals(settingsUsername,inputBoxUserName);


    }

    @Then("user cannot pass any characters except numbers into the {string} input box.")
    public void userCannotPassAnyCharactersExceptNumbersIntoTheInputBox(String arg0) {
    }
}
