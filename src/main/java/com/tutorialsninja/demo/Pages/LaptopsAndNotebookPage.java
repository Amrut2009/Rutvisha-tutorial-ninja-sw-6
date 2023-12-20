package com.tutorialsninja.demo.Pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebookPage extends Utility {

    private static final Logger log = LogManager.getLogger(LaptopsAndNotebookPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//h2[normalize-space()='Laptops & Notebooks'])[1]")
    WebElement laptopsAndNotebooksText;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='input-sort'])[1]")
    WebElement sortByPriceHighToLow;
    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    WebElement arrayListOfProducts;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement dropDownPath;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement price;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement product;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement checkTextMacBook;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessageForAddingProduct;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement linkToShoppingCartInsideMessage;
    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> priceList;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPrice;


    // Get all the products price and stored into array list
    public void originalProductPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        log.info("Original product list" + priceList.toString());
    }

    //1.3 Select Sort By "Price (High > Low)"

    public void sortByPriceHightoLow() {
        log.info("Product Sort by High low price" + sortByPrice.toString());
        selectByVisibleTextFromDropDown(sortByPrice, "Price (High > Low)");
    }

    // After filter Price (High > Low) Get all the products price and stored into array list
    public void afterSortByPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        log.info("After sort by price" + priceList.toString());
    }

    public String verifyTheTextLaptopsAndNotebooksOnPage() {
        return getTextFromElement(laptopsAndNotebooksText);
    }

    // * 1.3 Select Sort By "Price (High > Low)"
    public void selectSortByPriceHighToLow(String options) {
        selectByVisibleTextFromDropDown(sortByPriceHighToLow, options);
        getArrayListOfProductsInChoice(arrayListOfProducts);
        log.info("select Sort By Price High To Low : " + sortByPriceHighToLow.toString());
        log.info("select Sort By Price High To Low : " + arrayListOfProducts.toString());
    }

    // * 1.4 Verify the Product price will arrange in High to Low order.
    public String verifyProductPriceArrangeInHighToLow() {
        log.info("verify Product Price Arrange In High To Low: " + arrayListOfProducts.toString());
        return verifyTheProductArrangementInArrayList(arrayListOfProducts);
    }

    // * 2.3 Select Sort By "Price (High > Low)"
    public void selectPriceHighToLow(String inputSelectPriceOrder) {
        selectByVisibleTextFromDropDown(dropDownPath, inputSelectPriceOrder);
        log.info("select Price High To Low : " + dropDownPath.toString());
    }

    public void sortByPrice(String option) {
        selectByVisibleTextFromDropDown(price, option);
        log.info("sort By Price : " + price.toString());
    }

    // * 2.4 Select Product “MacBook”
    public void selectMacBookProduct() {
        clickOnElement(product);
        log.info("select MacBook Product : " + product.toString());

    }

    // * 2.5 Verify the text “MacBook”
    public String verifyTheTextMacBook() {
        log.info("verify The Text MacBook : " + checkTextMacBook.toString());
        return getTextFromElement(checkTextMacBook);
    }

    // * 2.6 Click on ‘Add To Cart’ button
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("click On Add To Cart : " + addToCart.toString());
    }

    // * 2.7	Verify the message “Success: You have added MacBook to your shopping cart!”
    public String verifySuccessMessageForAddingProductToShoppingCart() {
        log.info("verify Success Message For Adding Product To Shopping Cart : " + successMessageForAddingProduct.toString());
        return getTextFromElement(successMessageForAddingProduct);
    }

    // * 2.8	Click on link “shopping cart” display into success message
    public void clickOnLinkToShoppingCartMessage() {
        clickOnElement(linkToShoppingCartInsideMessage);
        log.info("click On Link To Shopping Cart Message : " + linkToShoppingCartInsideMessage.toString());
    }
}

