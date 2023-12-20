package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ShoppingCartTestSteps {
    @Then("USer should able to verify the text Shopping Cart")
    public void userShouldAbleToVerifyTheText() {
        String expected = "Shopping Cart";
        String actual = new ShoppingCartPage().verifyShoppingCartText();
        Assert.assertEquals(actual, expected, "Not displayed");
    }
    @Then("USer should able to verify the text Shopping Cart{string}")
    public void userShouldAbleToVerifyTheTextShoppingCart(String shoppingCartWeight) {
        Assert.assertEquals(new ShoppingCartPage().verifyShoppingCartText(),
                shoppingCartWeight, "Not displayed");
    }

    @Then("User should able to verify the product name {string}")
    public void userShouldAbleToVerifyTheProductName(String productName) {
        Assert.assertEquals(new ShoppingCartPage().verifyProductName(),
                productName, "Incorrect message displayed!");
    }

    @Then("User should able to verify the Model {string}")
    public void userShouldAbleToVerifyTheModel(String model) {
        Assert.assertEquals(new ShoppingCartPage().verifyModel(),
                model, "Incorrect message displayed!");
    }

    @Then("User should able to verify the Total {string}")
    public void userShouldAbleToVerifyTheTotal(String totalPrice) {
        Assert.assertEquals(new ShoppingCartPage().verifyTotal(),
                totalPrice, "Incorrect message displayed!");
    }
    @Then("User should able to see {string}")
    public void userShouldAbleToSee(String shoppingCartText) {
        Assert.assertEquals(new ShoppingCartPage().verifyShoppingCartText(),
                shoppingCartText, "Incorrect message displayed!");

    }

    @And("user should able to see Product name is {string}")
    public void userShouldAbleToSeeProductNameIs(String macBookText) {
        Assert.assertEquals(new ShoppingCartPage().verifyProductNameIsMacBook(),
                macBookText, "Incorrect message displayed!");
    }

    @And("User Change Quantity to {int}")
    public void userChangeQuantityTo(int qty) {
        new ShoppingCartPage().clearTheQtyBox();
        new ShoppingCartPage().enterQuantityIntoTheBox("2");
    }

    @And("User click on Update tab")
    public void userClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateTheQuantityBox();
    }

    @Then("User should see message {string}")
    public void userShouldSeeMessage(String updatedMessage) {
        String expected = "Success: You have modified your shopping cart!\n" + "×";
        String actual = new ShoppingCartPage().verifyUpdatedSuccessMessage();
        Assert.assertEquals(expected, actual, "Not displayed");
    }

    @And("User should see the updated  total price {string}")
    public void userShouldSeeTheUpdatedTotalPrice(String totalPrice) {
        Assert.assertEquals(new ShoppingCartPage().verifyTotalPrice(), totalPrice, "Incorrect Total Price displayed!");
    }

    @And("user click on Checkout button")
    public void userClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

}
