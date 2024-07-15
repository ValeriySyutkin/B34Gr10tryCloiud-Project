package com.trycloud.step_definitions;

import com.trycloud.pages.UploadEditDeletePage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UploadEditDelete_StepDefs {

    UploadEditDeletePage uploadEditDeletePage = new UploadEditDeletePage();

    @When("user clicks files module icon")
    public void user_clicks_files_module_icon() {
        uploadEditDeletePage.filesButton.click();
    }

    @When("user clicks the plus button")
    public void user_clicks_the_plus_button() {
        uploadEditDeletePage.plusButton.click();
    }

    @When("user selects Upload file")
    public void user_selects_upload_file() {

        String systemPath = System.getProperty("user.dir");
        String filePath = "/src/test/resources/filesToUpload/Cydeo.txt";
        String absolPath = systemPath + filePath;
        uploadEditDeletePage.uploadFile.sendKeys(absolPath);
    }

    @Then("the file should be listed in the files list")
    public void the_file_should_be_listed_in_the_files_list() {

        String expectedFileName = "Cydeo.txt";
        String actualFileName = uploadEditDeletePage.uploadFile.getText();

        Assert.assertEquals(expectedFileName, actualFileName);

        boolean isDisplayed = false;
        for (WebElement eachTextElement : uploadEditDeletePage.fileListElements) {
            if (eachTextElement.getText().equals("Cydeo")) {
                isDisplayed = true;
                break;
            }
        }
        Assert.assertTrue(expectedFileName, isDisplayed);
    }


    @When("user selects New folder from the dropdown menu")
    public void user_selects_new_folder_from_the_dropdown_menu() {
//        Select select = new Select(uploadEditDeletePage.dropDownMenu);
//        select.selectByVisibleText("New folder");
        uploadEditDeletePage.newFolder.click();

    }


    @And("user enters a name for the new folder")
    public void userEntersANameForTheNewFolder() {

        uploadEditDeletePage.textBox.sendKeys("My_new_folder");
    }

    @And("user clicks the create button")
    public void userClicksTheCreateButton() {
        uploadEditDeletePage.createButton.click();
    }

    @Then("new folder should be listed in the files list")
    public void newFolderShouldBeListedInTheFilesList() {

        String expectedName = "My_new_folder.txt";
        String actualName = uploadEditDeletePage.lastAddedElement.getText();

   //     boolean isFolderFound = false;
        for (WebElement file : uploadEditDeletePage.fileListElements) {
            String fileName = file.getText();
            if (fileName.equals(expectedName)) {
              //  isFolderFound = true;
                break;
            }
            System.out.println(fileName);
        }

        Assert.assertTrue(expectedName, uploadEditDeletePage.fileListElements.contains(actualName));
    }


    @When("user clicks the three dots menu next to the item")
    public void userClicksTheThreeDotsMenuNextToTheItem() {
        uploadEditDeletePage.threeDotsMenuFirstFile.click();
    }

    @And("user selects the delete file option")
    public void userSelectsTheDeleteFileOption() {
        uploadEditDeletePage.deleteButtonOption.click();
    }

    @Then("item should no longer be listed in the files list")
    public void itemShouldNoLongerBeListedInTheFilesList() {
        Assert.assertTrue(uploadEditDeletePage.threeDotsMenuFirstFile.isDisplayed());
    }

    @Then("user should see the total number of files and folders displayed under the files list table")
    public void userShouldSeeTheTotalNumberOfFilesAndFoldersDisplayedUnderTheFilesListTable() {
        uploadEditDeletePage.totalNumbersOfFiles.isDisplayed();
    }
}
