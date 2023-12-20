package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.Pages.AccountRegisterPage;
import com.tutorialsninja.demo.Pages.HomePage;
import com.tutorialsninja.demo.Pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountLoginSteps {
    @When("User click on My Account Link")
    public void userClickOnMyAccountLink() {
        new HomePage().clickOnAccountLink();
    }

    @And("User Click on Login link")
    public void userClickOnLoginLink() {
        new HomePage().selectOption("Login");
    }

    @And("User Enter an EmailAddress")
    public void userEnterAnEmailAddress() {
        new AccountRegisterPage().enterEmail("robert_jackson@gmail.com");
    }

    @And("User enter password")
    public void userEnterPassword() {
        new AccountRegisterPage().enterPassword("12345678");
    }

    @And("User click on Login button")
    public void userClickOnLoginButton() {
        new MyAccountPage().clickOnLoginButton();
    }

    @Then("User should be able to login successfully and Verify the text {string}")
    public void userShouldBeAbleToLoginSuccessfullyAndVerifyTheTextMyAccount(String myAccount) {
        Assert.assertEquals(new MyAccountPage().verifyTheTextMyAccount(), myAccount, "Incorrect text");
    }

    @And("User click On LogOut link")
    public void userClickOnLogOutLink() {
        new HomePage().selectOption("Logout");
    }

    @Then("User should be able to logout successfully and Verify the text {string}")
    public void userShouldBeAbleToLogoutSuccessfullyAndVerifyTheText(String logOut) {
        Assert.assertEquals(new MyAccountPage().verifyTextForAccountLogOut(), logOut, "Incorrect text");
    }

    @And("User click on continue buttonThree")
    public void userClickOnContinueButtonThree() {
        new MyAccountPage().clickOnContinueLogOutButton();
    }


}
