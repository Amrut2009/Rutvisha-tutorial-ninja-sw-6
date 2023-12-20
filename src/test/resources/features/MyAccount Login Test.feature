Feature: MyAccount Login Page Test Feature

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it

#4. verifyThatUserShouldLoginAndLogoutSuccessfully
#4.1 Click on My Account Link.
#4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
#4.3 Enter Email address
#4.4 Enter Last Name
#4.5 Enter Password
#4.6 Click on Login button
#4.7 Verify text “My Account”
#4.8 Click on My Account Link.
#4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
#4.10 Verify the text “Account Logout”
#4.11 Click on Continue button
  @Rutu @Sanity @Smoke @Regression
  Scenario: Verify That User Should Login And Logout Successfully
    When      User click on My Account Link
    And       User Click on Login link
    And       User Enter an EmailAddress
    And       User enter password
    And       User click on Login button
    Then      User should be able to login successfully and Verify the text "My Account"
    And       User click On LogOut link
    Then      User should be able to logout successfully and Verify the text "Logout"
    And       User click on continue buttonThree