package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenTestSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }
    @When("^I Mouse Hover on Men Menu$")
    public void iMouseHoverOnMenMenu() {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("^I Mouse Hover on Bottoms$")
    public void iMouseHoverOnBottoms() {
        new HomePage().mouseHoverOnBottom();
    }

    @And("^I click on Pants$")
    public void iClickOnPants() {
        new HomePage().clickOnPant();
    }

    @And("^I mouse hover on product name Cronus Yoga Pant and click on size$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize() {
        new MenPage().clickOnSize();
    }

    @And("^I mouse Hover on product name Cronus Yoga Pant and click on colour Black$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MenPage().clickOnColor();
    }

    @And("^I Mouse Hover on product name Cronus Yoga Pant and click on Add to cart button$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MenPage().clickOnAddToCart();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String expectedText) {
        Assert.assertEquals(expectedText, new MenPage().getTextAfterAddToCart(), "The added to cart message is not displayed");
    }

    @And("^I click on Shopping cart link into message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCart();
    }

    @And("^I verify the product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getCronusYogaPantText(), "Cronus Yoga Pant text element is not displayed");
    }

    @And("^I Verify the product size \"([^\"]*)\"$")
    public void iVerifyTheProductSize(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getSizeText(), "'32' text element is not displayed");
    }


    @Then("^I verify the product colour \"([^\"]*)\"$")
    public void iVerifyTheProductColour(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getColorText(), "'Black' text element is not displayed" );
    }
}
