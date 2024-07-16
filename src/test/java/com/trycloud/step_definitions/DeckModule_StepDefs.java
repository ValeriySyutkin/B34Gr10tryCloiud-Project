package com.trycloud.step_definitions;

import com.trycloud.pages.DeckModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.mk_latn.No;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DeckModule_StepDefs {
    DeckModulePage deckModulePage = new DeckModulePage();

    //US004-TC001 User can create a new board
    @When("the user creates a new board")
    public void theUserCreatesANewBoard() {
        deckModulePage.deckBtn.click();

    }

    @Then("the new board is successfully created")
    public void theNewBoardIsSuccessfullyCreated() {
        BrowserUtils.sleep(2);
        deckModulePage.sandwichBtn.click();

        BrowserUtils.sleep(2);
        deckModulePage.addBoard.click();

        BrowserUtils.sleep(2);
        deckModulePage.inputBox.sendKeys("AAA");

        BrowserUtils.sleep(2);
        deckModulePage.submitBtn.click();

            }

    @And("the user is navigated to the new board view")
    public void theUserIsNavigatedToTheNewBoardView() {
        deckModulePage.newBoard.click();
        BrowserUtils.sleep(2);

        String actualTitle = String.valueOf(
                Driver.getDriver().findElement(By.xpath("//div[@class=\"board-title\"]")).getText());

        Assert.assertEquals("AAA", actualTitle);

    }

    }



