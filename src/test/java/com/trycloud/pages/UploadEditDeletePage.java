package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UploadEditDeletePage {

    public UploadEditDeletePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='files']")
    public WebElement filesButton;

    @FindBy(xpath = "//div[@class='actions creatable']/a[@href='#']")
    public WebElement plusButton;

    @FindBy(xpath = "//label[@for='file_upload_start']/span[.='Upload file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//div[contains(@class, 'newFileMenu')]//ul")
    public WebElement dropDownMenu;

    @FindBy(xpath = "//div//span[@class='innernametext']")
    public List<WebElement> fileListElements;

    @FindBy(xpath = "(//div//span[@class='innernametext'])[1]")
    public WebElement lastAddedElement;

    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolder;

    @FindBy (id = "view13-input-folder")
    public WebElement textBox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement createButton;

    @FindBy (xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement threeDotsMenuFirstFile;

    @FindBy(xpath = "(//a[@class='menuitem action action-delete permanent'])")
    public WebElement deleteButtonOption;


    @FindBy (xpath = "//td[@class='filesummary']//span[@class='fileinfo']")
    public WebElement totalNumbersOfFiles;

    public WebElement getLastAddedFolder (String str){
       String locator = "//span[@class='innernametext'][text()='"+str+"']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

}
