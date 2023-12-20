package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.Pages.ComponentsPage;
import com.tutorialsninja.demo.Pages.DesktopPage;
import com.tutorialsninja.demo.Pages.HomePage;
import com.tutorialsninja.demo.Pages.LaptopsAndNotebookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {
    @When("user mouse hover on Currency Dropdown and click on it")
    public void userMouseHoverOnCurrencyDropdownAndClickOnIt() {
        new HomePage().mouseHoverAndClickOnCurrencyDroDownMenu();
    }

    @And("User mouse hover on £Pound Sterling and click on it")
    public void userMouseHoverOn£PoundSterlingAndClickOnIt() {
        new HomePage().selectOnSterlingPoundCurrency();
    }

    @When("User mouse hover on Desktops tab and click on it")
    public void userMouseHoverOnDesktopsTabAndClickOnIt() {
        new HomePage().mouseHoverAndClickOnDesktopsTab();
    }

    @And("User click on Show All Desktops Option")
    public void userClickOnShowAllDesktopsOption() {
        new HomePage().selectMenu("Show AllDesktops");
    }

    @Then("User should See {string} text on desktops page")
    public void userShouldSeeTextOnDesktopsPage(String expectedText) {
        Assert.assertEquals(new DesktopPage().verifyTheTextDesktopsOnPage(),
                expectedText, "Incorrect Text Displayed!");
    }

//    @Then("User should See text Desktops on page")
//    public void userShouldSeeTextDesktopsOnPage(String desktops) {
////        String actualMessage = new DesktopPage().verifyTheTextDesktopsOnPage();
////        String expectedMessage = "Desktops";
////        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect Text Displayed!");
//       Assert.assertEquals(new DesktopPage().verifyTheTextDesktopsOnPage(),
//               desktops, "Incorrect Text Displayed!");
//    }

    @When("User mouse hover on Laptops & Notebooks tab and click on it")
    public void userMouseHoverOnLaptopsNotebooksTabAndClickOnIt() {
        new HomePage().mouseHoverAndClickOnLaptopsAndNotebooksTab();
    }

    @And("User click on Show All Laptops & Notebooks Option")
    public void userClickOnShowAllLaptopsNotebooksOption() {
        new HomePage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("User should See {string} text on laptops & notebooks page")
    public void userShouldSeeTextOnLaptopsNotebooksPage(String laptopsAndNotebooks) {
        Assert.assertEquals(new LaptopsAndNotebookPage().verifyTheTextLaptopsAndNotebooksOnPage(),
                laptopsAndNotebooks , "Incorrect Text Displayed!");
    }
//    @Then("User should See text Laptops & Notebooks on page")
//    public void userShouldSeeTextLaptopsNotebooksOnPage() {
//        Assert.assertEquals(new LaptopsAndNoteBooksPage().verifyTheTextLaptopsAndNotebooksOnPage(),
//                "Laptops & Notebooks" , "Incorrect Text Displayed!");
//    }

    @When("User mouse hover on Components  tab and click on it")
    public void userMouseHoverOnComponentsTabAndClickOnIt() {
        new HomePage().mouseHoverAndClickOnComponentsTab();
    }

    @And("User click on Show All Components Option")
    public void userClickOnShowAllComponentsOption() {
        new HomePage().selectMenu("Show AllComponents");
    }

    @Then("User should See {string} text on components page")
    public void userShouldSeeTextOnComponentsPage(String components) {
        Assert.assertEquals(new ComponentsPage().verifyTheTextComponentsOnPage(),
                components, "Incorrect Text Displayed!");
    }
//    @Then("User should See text Components on page")
//    public void userShouldSeeTextComponentsOnPage() {
//        Assert.assertEquals(new ComponentsPage().verifyTheTextComponentsOnPage(),
//                "Components" , "Incorrect Text Displayed!");
//    }

    @And("User Click on Register link")
    public void userClickOnRegisterLink() {
        new HomePage().selectOption("Register");
    }


}
