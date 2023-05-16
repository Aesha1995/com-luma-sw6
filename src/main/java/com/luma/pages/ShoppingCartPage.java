package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage(){
        PageFactory.initElements(driver,this);
    }
    By shoppingCart = By.xpath("//span[@class='base']");
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffleText;
    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement qtyText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;
    @CacheLookup
    @FindBy(css = ".input-text.qty" )
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedProductPrice;


    public String getShoppingCart() {
        log.info("Shopping Cart text is displayed on page");
        return getTextFromElement(shoppingCart);
    }
    public String getCronusYogaPantText() {
        log.info("Cronus Yoga Pant text is displayed on page");
        return getTextFromElement(cronusYogaPant);
    }
    public String getSizeText() {
        log.info("Size displayed on page " + size.toString());
        return getTextFromElement(size);
    }
    public String getColorText() {
        log.info("Color displayed on page " + color.toString());
        return getTextFromElement(color);
    }

    public String getOverNightDuffleText() {
        log.info("Text displayed on page " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }
    public String getQty() {
        log.info("Quantity displayed on page " + qtyText.toString());
        String q = qtyText.getAttribute("value");
        return q;
    }
    public String getProductPrice() {
        log.info("Price displayed on page " + productPrice.toString());
        return getTextFromElement(productPrice);
    }
    public void changeQtyOfOverNightDuffle(String newQty) {
        qty.clear();
        log.info("Quantity displayed on page " + newQty.toString());
        sendTextToElement(qty,newQty);
    }
    public void clickOnUpdateShoppingCart() {
        log.info("Click on Shopping Cart");
        clickOnElement(updateShoppingCart);
    }
    public String getUpdatedProductPrice() {
        log.info("Updated Price displayed on Page " + updatedProductPrice.toString());
        return getTextFromElement(updatedProductPrice);
    }
}
