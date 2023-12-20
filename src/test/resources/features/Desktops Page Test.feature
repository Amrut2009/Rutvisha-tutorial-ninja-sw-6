Background: User is on HomePage
When      user mouse hover on Currency Dropdown and click on it
And       User mouse hover on £Pound Sterling and click on it

#1.verifyProductArrangeInAlphabeticalOrder
#1.1 Mouse hover on Desktops Tab.and click
#1.2 Click on “Show All Desktops”
#1.3 Select Sort By position "Name: Z to A"
#1.4 Verify the Product will arrange in Descending order.
@Rutu @Sanity @Smoke @Regression
Scenario: Verify Product Arrange In Alphabetical Order
When    User mouse hover on Desktops tab and click on it
And     User click on Show All Desktops Option
And     User click on sort By Position Name: Z to A
Then    User should see products are arranged in Descending order
#2. verifyProductAddedToShoppingCartSuccessFully
#2.1 Mouse hover on Currency Dropdown and click
#2.2 Mouse hover on £Pound Sterling and click
#2.3 Mouse hover on Desktops Tab.
#2.4 Click on “Show All Desktops”
#2.5 Select Sort By position "Name: A to Z"
#2.6 Select product “<product>”
#2.7 Verify the Text "<product>"
#2.8.Enter Qty "1” using Select class.
#2.9 Click on “Add to Cart” button
#2.10 Verify the Message “Success: You have added “<product>” to your shopping cart!”
#2.11 Click on link “shopping cart” display into success message
#2.12 Verify the text "Shopping Cart"
#2.13 Verify the Product name "<product>"
#2.14 Verify the Model "<model>"
#2.15 Verify the Todal "<price>"
@Rutu @Smoke @Regression
Scenario Outline: Verify Product Added To Shopping Cart SuccessFully
When      User mouse hover on Desktops tab and click on it
And       User click on Show All Desktops Option
And       User click on sort By Position Name: A to Z
And       User select the product "<product>"
Then      User should navigate to the product page and see text for "<product>"
And       User enter the Qty require as "<qty>"
And       User click on Add to cart button
Then      User should able to verify the message Success: You have added "<product>" to your shopping cart!
And       user click on Link Shopping Cart display into success message
Then      USer should able to verify the text Shopping Cart"<shopping cart weight>"
Then      User should able to verify the product name "<product>"
Then      User should able to verify the Model "<model>"
Then      User should able to verify the Total "<price>"
Examples:
| product      | model      | price   | qty | shopping cart weight     |
| HTC Touch HD | Product 1  | £74.73  | 1   | Shopping Cart  (0.15kg)  |
| iPhone       | product 11 | £75.46  | 1   | Shopping Cart  (10.00kg) |
| iPod Classic | product 20 | £74.73  | 1   | Shopping Cart  (1.00kg)  |
| MacBook      | Product 16 | £368.73 | 1   | Shopping Cart  (0.00kg)  |
| MacBook Air  | Product 17 | £736.23 | 1   | Shopping Cart  (0.00kg)  |
| Sony VAIO    | Product 19 | £736.23 | 1   | Shopping Cart  (0.00kg)  |