Background: User is on HomePage
When      user mouse hover on Currency Dropdown and click on it
And       User mouse hover on £Pound Sterling and click on it
#1. verifyProductsPriceDisplayHighToLowSuccessfully
#1.1 Mouse hover on Laptops & Notebooks Tab.and click
#1.2 Click on “Show All Laptops & Notebooks”
#1.3 Select Sort By "Price (High > Low)"
#1.4 Verify the Product price will arrange in High to Low order.

@Rutu @Sanity @Smoke @Regression
Scenario: User should see the Product price display in High to Low order from Sort by
When    User mouse hover on Laptops & Notebooks tab and click on it
And     User click on Show All Laptops & Notebooks Option
And     User Select Sort By Price (High > Low)
Then    User should see Product price is arrange in High to Low order.
#2. verifyThatUserPlaceOrderSuccessfully
#2.1 Mouse hover on Laptops & Notebooks Tab and click
#2.2 Click on “Show All Laptops & Notebooks”
#2.3 Select Sort By "Price (High > Low)"
#2.4 Select Product “MacBook”
#2.5 Verify the text “MacBook”
#2.6 Click on ‘Add To Cart’ button
#2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
#2.8 Click on link “shopping cart” display into success message
#2.9 Verify the text "Shopping Cart"
#2.10 Verify the Product name "MacBook"
#2.11 Change Quantity "2"
#2.12 Click on “Update” Tab
#2.13 Verify the message “Success: You have modified your shopping cart!”
#2.14 Verify the Total £737.45
#2.15 Click on “Checkout” button
#2.16 Verify the text “Checkout”
#2.17 Verify the Text “New Customer”
#2.18 Click on “Guest Checkout” radio button
#2.19 Click on “Continue” tab
#2.20 Fill the mandatory fields
#2.21 Click on “Continue” Button
#2.22 Add Comments About your order into text area
#2.23 Check the Terms & Conditions check box
#2.24 Click on “Continue” button
#2.25 Verify the message “Warning: Payment method required!”
@Rutu @Smoke @Regression
Scenario: Verify That User Place Order Successfully
When    User mouse hover on Laptops & Notebooks tab and click on it
And     User click on Show All Laptops & Notebooks Option
And     User Select Sort By Price (High > Low)
And     User Select Product MacBook
Then    User should able to verify the Product name "MacBook"
And     User Click on Add To Cart button
Then    User should see the message Success: You have added MacBook to your shopping cart!
And     User click on link shopping cart display into success message
Then    User should able to see "Shopping Cart  (0.00kg)"
And     user should able to see Product name is "MacBook"
And     User Change Quantity to 2
And     User click on Update tab
Then    User should see message "Success: You have modified your shopping cart!"
And     User should see the updated  total price "£737.45"
And     user click on Checkout button
Then    User should see checkout text "Checkout"
And     user should see customer text "New Customer"
And     User click on Guest Checkout radio button
And     User click on Continue tab
Then    user fill all the mandatory fields
And     User click on Continue
And     User enter Comments about order into text field
And     User Click on check the Terms & Conditions check box
And     User Click on Continues
Then    User should see warning message "Warning: Payment method required!"