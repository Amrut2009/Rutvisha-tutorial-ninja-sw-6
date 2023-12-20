package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.Pages.AccountRegisterPage;
import com.tutorialsninja.demo.Pages.HomePage;
import com.tutorialsninja.demo.Pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountRegisterSteps {
    @Then("User should verify the text for Register Account {string}")
    public void userShouldVerifyTheTextForRegisterAccount(String register) {
        Assert.assertEquals(new AccountRegisterPage().verifyRegisterAccountText(),
                register, "Incorrect register text");

    }

    @Then("User should verify the text for customer {string}")
    public void userShouldVerifyTheTextForCustomer(String customer) {
        Assert.assertEquals(new AccountRegisterPage().verifyTextReturningCustomerOnLoginPage(),
                customer, "Incorrect  customer text");
    }

    @And("User Enter First Name")
    public void userEnterFirstName() {
        new AccountRegisterPage().enterFirstName("Robert");
    }

    @And("User enter Last Name")
    public void userEnterLastName() {
        new AccountRegisterPage().enterLastName("Jackson");
    }
    @And("User Enter an Email")
    public void userEnterAnEmail() {
        final String randomEmail;
        randomEmail = AccountRegisterPage.randomEmail();
        new AccountRegisterPage().enterEmail(randomEmail);
    }

    @And("User enter Telephone Number")
    public void userEnterTelephoneNumber() {
        new AccountRegisterPage().enterTelephoneNumber("07896542365");
    }

    @And("User enter confirm password")
    public void userEnterConfirmPassword() {
        new AccountRegisterPage().enterConfirmPassword("12345678");
    }

    @And("User Select subscribe radio button as Yes")
    public void userSelectSubscribeRadioButtonAsYes() {
        new AccountRegisterPage().clickOnSubscribeRadioButton();
    }

    @And("User click on privacy policy check box")
    public void userClickOnPrivacyPolicyCheckBox() {
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("User click on continue button")
    public void userClickOnContinueButton() {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @Then("User should able to verify the message Your Account Has Been Created!")
    public void userShouldAbleToVerifyTheMessageYourAccountHasBeenCreated() {
        String expected = "Your Account Has Been Created!";
        String actual = new MyAccountPage().verifyTheMessageYourAccountHasBeenCreated();
        Assert.assertEquals(expected, actual, "Not displayed");
    }

    @And("User click on continue buttonOne")
    public void userClickOnContinueButtonOne() {
        new MyAccountPage().clickOnContinueAccountButton();
    }

    @And("User click on {string} button")
    public void userClickOnButton(String logOut) {
        new HomePage().selectOption("Logout");
    }

    @Then("User should able to verify the text {string}")
    public void userShouldAbleToVerifyTheTextAccountLogout(String logout) {
        Assert.assertEquals(new MyAccountPage().verifyTextForAccountLogOut(),
                logout, "Incorrect  your account text");

    }

    @And("User click on continue buttonTwo")
    public void userClickOnContinueButtonTwo() {
        new MyAccountPage().clickOnContinueLogOutButton();
    }
}
