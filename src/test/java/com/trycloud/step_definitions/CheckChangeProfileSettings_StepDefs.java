package com.trycloud.step_definitions;

import com.trycloud.pages.ProfileSettingPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class CheckChangeProfileSettings_StepDefs {

    ProfileSettingPage profileSettingPage = new ProfileSettingPage();


    @And("User enters invalid email {string} into the email input box")
    public void userEntersInvalidEmailIntoTheEmailInputBox(String invalidEmail) {

        profileSettingPage.emailInputBox.clear();

        profileSettingPage.emailInputBox.sendKeys(Keys.ENTER);
        Driver.getDriver().navigate().refresh();
        profileSettingPage.emailInputBox.sendKeys(invalidEmail+ Keys.ENTER);
    }



    @Then("User should see that email input box did not accepted it")
    public void user_should_see_that_email_input_box_did_not_accepted_it() {
       Driver.getDriver().navigate().refresh();
       BrowserUtils.waitForVisibility(profileSettingPage.localTime,20);
       Assert.assertTrue(profileSettingPage.emailInputBox.getAttribute("value").isEmpty());
    }



    @And("User enters valid email {string} into the email input box")
    public void userEntersValidEmailIntoTheEmailInputBox(String validEmail) {

        profileSettingPage.emailInputBox.sendKeys(validEmail+Keys.ENTER);


    }


    @Then("User should see {string} in email input box")
    public void user_should_see_that_email_input_box_accepted_and_saved_it(String expectedValue) {


        Assert.assertEquals(expectedValue,profileSettingPage.emailInputBox.getAttribute("value"));

//        Assert.assertTrue(profileSettingPage.emailInputBox.getAttribute("value").contains(expectedValue));

        profileSettingPage.emailInputBox.clear();
        profileSettingPage.emailInputBox.sendKeys(Keys.ENTER);
        Driver.getDriver().navigate().refresh();






    }


    Select select = new Select(profileSettingPage.languageDropdown);
    @And("User clicks a drop down Language menu")
    public void user_Clicks_A_drop_down_Language_menu() {
        profileSettingPage.languageDropdown.click();
    }

    @And("User can choose any  {string}  from drop down menu and click on it")
    public void User_clicks_a_drop_down_Language_menu_where_is_shown(String language) {
        select.selectByValue(language);
    }

    @Then("User see  {string}  he chose is selected")
    public void userSeeHeChoseIsSelected(String language) {

    BrowserUtils.waitForVisibility(profileSettingPage.localTime,20);
        Assert.assertEquals(select.getFirstSelectedOption().getAttribute("value"),language);
        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
    }
}
