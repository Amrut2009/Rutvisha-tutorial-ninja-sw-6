Feature: MyAccount Register Page Test Feature

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it
#1. verifyUserShouldNavigateToRegisterPageSuccessfully
#1.1 Click on My Account Link.
#1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
#1.3 Verify the text “Register Account”.
  @Rutu @Sanity @Smoke @Regression
  Scenario: Verify User Should Navigate To Register Page Successfully
    When      User click on My Account Link
    And       User Click on Register link
    Then      User should verify the text for Register Account "Register Account"

#2. verifyUserShouldNavigateToLoginPageSuccessfully
#2.1 Click on My Account Link.
#2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
#2.3 Verify the text “Returning Customer”.
  @Rutu @Smoke @Regression
  Scenario: Verify User Should Navigate To Login Page Successfully
    When    User click on My Account Link
    And     User Click on Login link
    Then    User should verify the text for customer "Returning Customer"

#3. verifyThatUserRegisterAccountSuccessfully
#3.1 Click on My Account Link.
#3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
#3.3 Enter First Name
#3.4 Enter Last Name
#3.5 Enter Email
#3.6 Enter Telephone
#3.7 Enter Password
#3.8 Enter Password Confirm
#3.9 Select Subscribe Yes radio button
#3.10 Click on Privacy Policy check box
#3.11 Click on Continue button
#3.12 Verify the message “Your Account Has Been Created!”
#3.13 Click on Continue button
#3.14 Click on My Account Link
#3.15 Call the method “selectMyAccountOptions” method and pass the paramete “Logout”
#3.16 Verify the text “Account Logout”
#3.17 Click on Continue button
  @Asha @Regression
  Scenario: Verify That User Register Account Successfully
    When      User click on My Account Link
    And       User Click on Register link
    And       User Enter First Name
    And       User enter Last Name
    And       User Enter an Email
    And       User enter Telephone Number
    And       User enter password
    And       User enter confirm password
    And       User Select subscribe radio button as Yes
    And       User click on privacy policy check box
    And       User click on continue button
    Then      User should able to verify the message Your Account Has Been Created!
    And       User click on continue buttonOne
    And       User click on My Account Link
    And       User click on "Logout" button
    Then      User should able to verify the text "Logout"
    And       User click on continue buttonTwo