package com.tutorialsninja.demo.Pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    @CacheLookup
    //@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'HTC Touch HD')]")
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement click;
    @CacheLookup
    //@FindBy(xpath = "//a[normalize-space()='HP LP3065']")
    @FindBy(css = "div[id='content'] h1")
    WebElement productName;

    @CacheLookup
    //@FindBy(className = "form-control")
    @FindBy(name = "quantity")

    WebElement quantityField;
    @CacheLookup
    // @FindBy(id = "button-cart")
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    // * 2.6 Select product <product>
    public void selectProduct(String product) {
        sendTextToElement(click, product);
        log.info("Select Products : " + click.toString());
    }

    public String getTextFromProductsName() {
        log.info("Get Text From Products Name : " + productName.toString());
        return getTextFromElement(productName);
    }

    // * 2.7 Enter Qty <qty> using Select class.
    public void enterQuantity(String qty) {
        clearTextFromField((By) quantityField);
        sendTextToElement(quantityField, qty);
        log.info("Entering Quantity : " + quantityField.toString());
    }

    // * 2.8 Click on “Add to Cart” button
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Click On Add To Cart : " + addToCart.toString());
    }

    // * 2.9 Verify the Message <successMessage>
    public String getProductText() {
        log.info("Getting Product Text : " + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    // * 2.10 Click on link “shopping cart” display into success message
    public void clickOnShoppingCartLinkIntoSuccessMessage() {
        clickOnElement(shoppingCartLink);
        log.info("Click On Shopping Cart Link In to Success Message : " + shoppingCartLink.toString());
    }
}