package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.Pages.DesktopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DesktopsPageTestSteps {
    @And("User click on sort By Position Name: Z to A")
    public void userClickOnSortByPositionNameZToA() {
        new DesktopPage().selectSortByOption("Name (Z - A)");
    }

    @Then("User should see products are arranged in Descending order")
    public void userShouldSeeProductsAreArrangedInDescendingOrder() {
        new DesktopPage().verifySortedElementsInReverseOrder();
    }

    @And("User click on sort By Position Name: A to Z")
    public void userClickOnSortByPositionNameAToZ() {
        new DesktopPage().selectSortByOption("Name (A - Z)");
    }

    @And("User select the product {string}")
    public void userSelectTheProduct(String product) {
        new DesktopPage().selectProductsOption(product);
    }


}
