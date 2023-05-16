package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDuffle;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on gear menu$")
    public void iMouseHoverOnGearMenu() {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("^I click on bags$")
    public void iClickOnBags() {
        new HomePage().clickOnBags();
    }

    @And("^I click on over night duffle$")
    public void iClickOnOverNightDuffle() {
        new GearPage().clickOnOvernightDuffle();
    }

    @Then("^Verify over night duffle text \"([^\"]*)\"$")
    public void verifyOverNightDuffleText(String overNightDuffelTet) {
        Assert.assertEquals(new OverNightDuffle().getOverNightDuffelText(),overNightDuffelTet,"OverNightDuffel Text not verify");
    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty) {
        new OverNightDuffle().changeQuantityTo3(qty);
    }

    @And("^click on add to cart$")
    public void clickOnAddToCart() {
        new OverNightDuffle().clickOnAddToCart();
    }

    @Then("^verify add to cart text \"([^\"]*)\"$")
    public void verifyAddToCartText(String shoppingCartText) {
        Assert.assertEquals(new OverNightDuffle().getAddToCartText(),shoppingCartText,"Product not added successfully to shopping cart");
    }

    @And("^click on shopping cart$")
    public void clickOnShoppingCart() {
        new OverNightDuffle().clickOnShoppingCart();
    }

    @Then("^verify duffle text \"([^\"]*)\"$")
    public void verifyDuffleText(String duffleText) {
        Assert.assertEquals(new ShoppingCartPage().getOverNightDuffleText(),duffleText,"Duffel text not verify ");
    }

    @Then("^verify quantity \"([^\"]*)\"$")
    public void verifyQuantity(String quantity) {
        Assert.assertEquals(new ShoppingCartPage().getQty(),quantity,"Quantity not verify ");
    }

    @Then("^verify product price \"([^\"]*)\"$")
    public void verifyProductPrice(String price) {
        Assert.assertEquals(new ShoppingCartPage().getProductPrice(),price,"Price not verify ");
    }
    @And("^I change old quantity\"([^\"]*)\"$")
    public void iChangeOldQuantity(String productPrice) {
        new ShoppingCartPage().changeQtyOfOverNightDuffle(productPrice);
    }
    @And("^click on update shopping cart$")
    public void clickOnUpdateShoppingCart() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @Then("^verify updated product price \"([^\"]*)\"$")
    public void verifyUpdatedProductPrice(String updatePrice) {
        Assert.assertEquals( new ShoppingCartPage().getUpdatedProductPrice(),updatePrice,"price not updated");
    }
}
