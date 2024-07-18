package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"appmenu\"]")
    public List<WebElement> allModule;

    @FindBy (xpath = "//*[@id=\"header\"]/div[1]")
    public List<WebElement> nameModule;


    @FindBy(xpath = "(//a[@href='#'])[2]")
    public WebElement magnifyIcon;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[14]/td[2]/a/span[1]/span[1]")
    public WebElement expectedSearchResult;

    @FindBy(xpath = "//*[@id=\"app-sidebar-vue\"]")
    public WebElement sidePage;

    @FindBy(xpath = "//*[@id=\"nextcloud\"]/div")
    public WebElement dashboardIcon;


   @FindBy(xpath = "(//a[@href='/index.php/apps/dashboard/'])[1]")
    public WebElement moduleDashboard;

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement moduleFiles;

    @FindBy(xpath = "(//a[@href='/index.php/apps/photos/'])[1]")
    public WebElement modulePhotos;

    @FindBy(xpath = "(//a[@href='/index.php/apps/activity/'])[1]")
    public WebElement moduleActivity;

    @FindBy(xpath = "(//a[@href='http://qa2.trycloud.net/index.php/apps/spreed/'])[1]")
    public WebElement moduleTalk;

    @FindBy(xpath = "(//a[@href='/index.php/apps/contacts/'])[1]")
    public WebElement moduleContacts;

    @FindBy(xpath = "(//a[@href='/index.php/apps/circles/'])[1]")
    public WebElement moduleCircles;

    @FindBy(xpath = "(//a[@href='/index.php/apps/calendar/'])[1]")
    public WebElement moduleCalendar;

    @FindBy(xpath = "(//a[@href='/index.php/apps/deck/'])[1]")
    public WebElement moduleDeck;




}
