package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsModulePage {

    public ContactsModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='contacts']")
    public WebElement contactButton;

    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(id = "contact-fullname")
    public WebElement contactNameButton;

    @FindBy(xpath = "//li[@id='everyone']")
    public WebElement allContactButton;

    @FindBy(xpath = "//div//div[@class='app-content-list-item-line-one']")
    public List<WebElement> allContactList;


    @FindBy(xpath = "//div[@class='app-navigation-entry__counter'][1]")
    public WebElement numberOfContacts;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement pictureIconButton;

    @FindBy(xpath = "//span[.='Choose from Files']")
    public WebElement chooseFromFilesButton;
    //button[@class='action-button focusable']

    @FindBy(xpath = "//td[@class='filename']")
    public WebElement avatarButton;
    //td[@class='filename']

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-n']")
    public WebElement sortNameButton;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement chooseButton;

    @FindBy(xpath = "//div[contains(@class,'action-item header-menu')]")
    public WebElement hamburgerMenuButton;


    @FindBy(xpath = "(//li[contains(@class,'action')])[7]")
    public WebElement deleteButton;
}
