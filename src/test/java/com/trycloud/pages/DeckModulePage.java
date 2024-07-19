package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckModulePage {

    private WebDriver driver;
    private WebElement someElement; // Define your WebElement field


    public DeckModulePage(WebDriver driver) {
        this.driver = driver;

    }

    public String getListTitleText() {
        WebElement listTitleElement = driver.findElement(By.xpath("//*[@id=\"app-content-vue\"]/div/div[2]/div/div/div/div[1]/h3"));
        return listTitleElement.getText();
    }

    public DeckModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "/html/body/header/div[1]/ul/li[9]/a")
    public WebElement deckBtn;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/a")
    public WebElement sandwichBtn;

    @FindBy(xpath = "(//span[@title='Add board'])")
    public WebElement addBoard;

    @FindBy(xpath = "(//input[@placeholder=\"Board name\"])")
    public WebElement inputBox;

    @FindBy(xpath = "((//input[@type=\"submit\"])[2])")
    public WebElement submitBtn;

    @FindBy(xpath = "(//span[@title=\"AAA\"])")
    public WebElement newBoard;

        @FindBy(xpath = "//*[@id=\"stack-add\"]/button")
    public WebElement addList;

    @FindBy(xpath = "//*[@id=\"new-stack-input-main\"]")
    public WebElement newListInput;

    @FindBy(xpath = "//*[@id=\"stack-add\"]/form/input[2]")
    public WebElement confirmList;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div/div/div[1]/button")
    public WebElement addCard;

    @FindBy(xpath = "//*[@id=\"new-stack-input-main\"]")
    public WebElement newCardInput;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div/div/div[2]/form/input[2]")
    public WebElement confirmNewCard;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div/div/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button")
    public WebElement threeDotsMenuBtn;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div/div/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button")
    public WebElement assignBtn;



}











