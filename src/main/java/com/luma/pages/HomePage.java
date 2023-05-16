package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }
    public void clickOnJackets() {
        clickOnElement(jackets);
    }
    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottom() {
        mouseHoverToElement(bottomMenu);
    }
    public void clickOnPant() {
        clickOnElement(pants);
    }
    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBags() {
        clickOnElement(bags);
    }
}
