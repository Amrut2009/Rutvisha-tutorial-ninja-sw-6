package com.tutorialsninja.demo.steps;
import com.tutorialsninja.demo.Pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckOutTestSteps {

    @Then("User should see checkout text {string}")
    public void userShouldSeeCheckoutText(String checkOut) {
        Assert.assertEquals(new CheckoutPage().verifyCheckOutText(), checkOut, "Incorrect text");
    }

    @And("user should see customer text {string}")
    public void userShouldSeeCustomerText(String newCustomer) {
        Assert.assertEquals(new CheckoutPage().verifyTextNewCustomer(), newCustomer, "Incorrect text");
    }

    @And("User click on Guest Checkout radio button")
    public void userClickOnGuestCheckoutRadioButton() {
        new CheckoutPage().clickOnGuestCheckOutButton();
    }

    @And("User click on Continue tab")
    public void userClickOnContinueTab() {
        new CheckoutPage().clickOnContinueButtonTab();
    }

    @Then("user fill all the mandatory fields")
    public void userFillAllTheMandatoryFields() {
        new CheckoutPage().enterFirstNameIntoTheFirstNameField("Robert");
        new CheckoutPage().enterLastNameIntoTheLastNameField("Jackson");
        new CheckoutPage().enterEmailIntoTheEmailField("rjackson@gmail.com");
        new CheckoutPage().enterTelephoneIntoTheTelephoneField("07865325614");
        new CheckoutPage().enterAddressIntoTheAddress1Field("Harry Porter Road");
        new CheckoutPage().enterCityIntoTheCityField("London");
        new CheckoutPage().enterPostcodeIntoThePostCodeField("HP4 2PH");
        new CheckoutPage().enterCountryIntoTheCountryField("United Kingdom");
        new CheckoutPage().enterZoneIntoTheZoneField("Derbyshire");

    }

    @And("User click on Continue")
    public void userClickOnContinue() {
        new CheckoutPage().clickOnContinueButtonForGuest();
    }

    @And("User enter Comments about order into text field")
    public void userEnterCommentsAboutOrderIntoTextField() {
        new CheckoutPage().addCommentsAboutYourOrderIntoTheTextArea("Leave it by door please");
    }

    @And("User Click on check the Terms & Conditions check box")
    public void userClickOnCheckTheTermsConditionsCheckBox() {
        new CheckoutPage().clickOnCheckBoxForTermsAndConditions();
    }

    @And("User Click on Continues")
    public void userClickOnContinues() {
        new CheckoutPage().clickOnContinueButtonForPaymentMethod();
    }

    @Then("User should see warning message {string}")
    public void userShouldSeeWarningMessage(String warningMessage) {
        String expected = "Warning: Payment method required!\n" + "×";
        String actual = new CheckoutPage().verifyWarningMessageForPaymentMethod();
        Assert.assertEquals(expected, actual, "Not displayed");
    }
}
