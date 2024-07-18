package com.trycloud.step_definitions;

import com.trycloud.pages.DeckModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeckModule_StepDefs {

    DeckModulePage deckModulePage = new DeckModulePage();

    //US004-TC001 User can create a new board
    @When("the user creates a new board")
    public void theUserCreatesANewBoard() {
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.deckBtn, 10).click();
    }

    @And("the new board is successfully created")
    public void theNewBoardIsSuccessfullyCreated() {
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.sandwichBtn, 10).click();
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.addBoard, 10).click();
        BrowserUtils.sleep(2);
        BrowserUtils.waitForVisibility(deckModulePage.inputBox, 10).sendKeys("AAA");
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.submitBtn, 10).click();
    }

    @Then("the user is navigated to the new board view")
    public void theUserIsNavigatedToTheNewBoardView() {
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.newBoard, 10).click();
        BrowserUtils.sleep(2);
        WebElement boardTitle = BrowserUtils.waitForVisibility(By.xpath("//div[@class=\"board-title\"]"), 10);
        BrowserUtils.sleep(2);
        String actualTitle = boardTitle.getText();
        BrowserUtils.sleep(2);
        Assert.assertEquals("AAA", actualTitle);
    }

    //US004-TC002 User can create a new list of card under any board
    @When("the user creates a new list of cards")
    public void theUserCreatesANewListOfCards() {
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.addList, 10).click();
        BrowserUtils.sleep(2);
        BrowserUtils.waitForVisibility(deckModulePage.newListInput, 10).sendKeys("BBB");
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.confirmList, 10).click();
    }

    @Then("the new list is added under the current board")
    public void theNewListIsAddedUnderTheCurrentBoard() {

    }

    //US004-TC003 User can add a new card on any list on the current board
    @When("the user adds a new card to a specific list")
    public void theUserAddsANewCardToASpecificList() {
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.addCard, 10).click();
        BrowserUtils.sleep(2);
        BrowserUtils.waitForVisibility(deckModulePage.newCardInput, 10).sendKeys("CCC");
        BrowserUtils.sleep(2);
        deckModulePage.confirmNewCard.click();
    }

    @Then("the user can see the new card in the list")
    public void theUserCanSeeTheNewCardInTheList() {

    }

    //US004-TC004 User can assign any card/task to himself/herself by using the three dots on the related card
    @When("the user selects the three dots menu on the card")
    public void theUserSelectsTheThreeDotsMenuOnTheCard() {
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.threeDotsMenuBtn, 15).click();
    }

    @And("chooses to assign the card to themselves")
    public void choosesToAssignTheCardToThemselves() {
        BrowserUtils.sleep(2);
        BrowserUtils.waitForClickablility(deckModulePage.assignBtn, 10).click();
    }

    @Then("the user's profile is linked with the assigned card")
    public void theUserSProfileIsLinkedWithTheAssignedCard() {

    }
}
