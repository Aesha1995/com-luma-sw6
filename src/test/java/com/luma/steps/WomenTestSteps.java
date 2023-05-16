package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.Womens_Jackets_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenTestSteps {
    @When("^I mouse Hover on Women Menu$")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("^I mouse Hover on Tops$")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTops();
    }

    @And("^I click on Jackets$")
    public void iClickOnJackets() {
        new HomePage().clickOnJackets();
    }
    @And("^select product name filter \"([^\"]*)\"$")
    public void selectProductNameFilter(String productName) {
       new Womens_Jackets_Page().selectProductNameFilter(productName);
    }
    @Then("^I verify the products name display in alphabetical order$")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder() {
        Assert.assertEquals(new Womens_Jackets_Page().getProductList1(), new Womens_Jackets_Page().getProductList2());
    }
    @Then("^I verify the products price display in low to high$")
    public void iVerifyTheProductsPriceDisplayInLowToHigh() {
        Assert.assertEquals(new Womens_Jackets_Page().getProductPriceList1(),new Womens_Jackets_Page().getProductPriceList2());
    }
    @And("^select product price filter \"([^\"]*)\"$")
    public void selectProductPriceFilter(String price){
        new Womens_Jackets_Page().selectProductNameFilter(price);
    }
}
