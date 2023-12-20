package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.Pages.LaptopsAndNotebookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {

    @And("User Select Sort By Price \\(High > Low)")
    public void userSelectSortByPriceHighLow() {
        new LaptopsAndNotebookPage().originalProductPrice();
        new LaptopsAndNotebookPage().sortByPriceHightoLow();
    }
    @Then("User should see Product price is arrange in High to Low order.")
    public void userShouldSeeProductPriceIsArrangeInHighToLowOrder() {
        new LaptopsAndNotebookPage().afterSortByPrice();
    }

    @And("User Select Product MacBook")
    public void userSelectProductMacBook() {
        new LaptopsAndNotebookPage().selectMacBookProduct();
    }
    @Then("User should able to verify the Product name {string}")
    public void userShouldAbleToVerifyTheProductName(String macBook) {
        Assert.assertEquals(new LaptopsAndNotebookPage().verifyTheTextMacBook(),
                macBook, "Incorrect message displayed!");
    }

    @And("User Click on Add To Cart button")
    public void userClickOnAddToCartButton() {
        new LaptopsAndNotebookPage().clickOnAddToCart();
    }
    @Then("User should see the message Success: You have added MacBook to your shopping cart!")
    public void userShouldSeeTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        String expected = "Success: You have added MacBook to your shopping cart!\n" + "×";
        String actual = new LaptopsAndNotebookPage().verifySuccessMessageForAddingProductToShoppingCart();
        Assert.assertEquals(expected, actual, "Not displayed");
    }


    @And("User click on link shopping cart display into success message")
    public void userClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new LaptopsAndNotebookPage().clickOnLinkToShoppingCartMessage();
    }

}
