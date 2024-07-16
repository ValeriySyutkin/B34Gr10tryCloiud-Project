package com.trycloud.step_definitions;

import com.trycloud.pages.ContactsModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ContactsModule_StepDefinition {

    ContactsModulePage contactsModulePage = new ContactsModulePage();


    @When("user clicks contacts module icon")
    public void user_clicks_contacts_module_icon() {
        contactsModulePage.contactButton.click();

    }

    @And("user click newContact button in the left")
    public void userClickNewContactButtonInTheLeft() {
        contactsModulePage.newContactButton.click();
        BrowserUtils.sleep(3);
    }

    @And("user enter {string} into the new contact inbox")
    public void userEnterIntoTheNewContactInbox(String contactName) {
        contactsModulePage.contactNameButton.clear();
        contactsModulePage.contactNameButton.sendKeys(contactName);
        BrowserUtils.sleep(3);
    }

    @And("user clicks All Contact button on the left")
    public void userClicksAllContactButtonOnTheLeft() {
        contactsModulePage.allContactButton.click();
        BrowserUtils.sleep(3);
    }


    @Then("user see the total number of the contacts")
    public void userSeeTheTotalNumberOfTheContacts() {
        String numberOfContactsText =  contactsModulePage.numberOfContacts.getText();
        System.out.println("Total number of contacts " + numberOfContactsText);
        //getting the number
    }

    @Then("verify {string} under all contacts list")
    public void verifyUnderAllContactsList(String expectedContact) {

            ContactsModulePage contactsModulePage = new ContactsModulePage();
            List<String> actualContactsList = new ArrayList<>();

            for (WebElement eachContact : contactsModulePage.allContactList) {
                actualContactsList.add(eachContact.getText());

            }

            Assert.assertTrue(actualContactsList.contains(expectedContact));
            System.out.println(expectedContact);

        }



    @When("user click on the picture icon")
    public void userClickOnThePictureIcon() {
    contactsModulePage.pictureIconButton.click();
    BrowserUtils.sleep(5);

    }

    @And("user click on choose from Files button")
    public void userClickOnChooseFromFilesButton() {
    contactsModulePage.chooseFromFilesButton.click();
    BrowserUtils.sleep(3);
    }

    @And("user pick the avatar picture")
    public void userPickTheAvatarPicture() {
        contactsModulePage.sortNameButton.click();
        BrowserUtils.sleep(3);
        contactsModulePage.avatarButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user press choose button")
    public void userPressChooseButton() {
    contactsModulePage.chooseButton.click();

    BrowserUtils.sleep(3);
    }

    @And("user click hamburger menu")
    public void userClickHamburgerMenu() {

        contactsModulePage.hamburgerMenuButton.click();
        BrowserUtils.sleep(3);
    }

    @And("delete {string} from the all contacts list")
    public void deleteFromTheAllContactsList(String expectedResult) {
        contactsModulePage.deleteButton.click();
        BrowserUtils.sleep(3);

        List<String> emptyList = new ArrayList<>();

        for (WebElement eachContact : contactsModulePage.allContactList) {
            emptyList.add(eachContact.getText());
        }

        Assert.assertTrue("The contacts list is not empty after deletion.", emptyList.isEmpty());

        }

    }







