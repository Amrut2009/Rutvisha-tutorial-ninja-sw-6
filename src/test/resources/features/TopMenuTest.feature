Feature: TopMenu Test Feature
  As a User, I should be able to check TopMenu features

  Background: User is on HomePage
    When      user mouse hover on Currency Dropdown and click on it
    And       User mouse hover on £Pound Sterling and click on it

#1. verifyUserShouldNavigateToDesktopsPageSuccessfully
#1.1 Mouse hover on “Desktops” Tab and click
#1.2 call selectMenu method and pass the menu = “Show All Desktops”
#1.3 Verify the text ‘Desktops’
  @Rutu @Sanity @Smoke @Regression
  Scenario:   Verify User Should Navigate To Desktops Page Successfully
    When      User mouse hover on Desktops tab and click on it
    And       User click on Show All Desktops Option
    Then      User should See "Desktops" text on desktops page
#2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
#2.1 Mouse hover on “Laptops & Notebooks” Tab and click
#2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
#2.3 Verify the text ‘Laptops & Notebooks’
  @Rutu @Smoke @Regression
  Scenario:  Verify User Should Navigate To Laptops And Notebooks Page Successfully
    When     User mouse hover on Laptops & Notebooks tab and click on it
    And      User click on Show All Laptops & Notebooks Option
    Then     User should See "Laptops & Notebooks" text on laptops & notebooks page
#3. verifyUserShouldNavigateToComponentsPageSuccessfully
#3.1 Mouse hover on “Components” Tab and click
#3.2 call selectMenu method and pass the menu = “Show All Components”
#3.3 Verify the text ‘Components’
  @Rutu @Regression
  Scenario:  Verify User Should Navigate To Components Page Successfully
    When     User mouse hover on Components  tab and click on it
    And      User click on Show All Components Option
    Then     User should See "Components" text on components page