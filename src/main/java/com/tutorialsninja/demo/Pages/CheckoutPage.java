package com.tutorialsninja.demo.Pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement checkNewCustomerText;
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutButton;
    @CacheLookup
    @FindBy(css = "#button-account")
    WebElement continueTabButton;
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailAddress;
    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement cityName;
    @CacheLookup
    @FindBy(name = "postcode")
    WebElement zipCode;
    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement countryName;
    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement zoneName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement addCommentIn;
    @CacheLookup
    @FindBy(css = "input[value='1'][name='agree']")
    WebElement termsAndConditions;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonForPayment;
    @CacheLookup
    @FindBy(xpath = "//div[@class ='alert alert-danger alert-dismissible']")
    WebElement checkWarningForPayment;


    // * 2.16	Verify the text “Checkout”
    public String verifyCheckOutText() {
        log.info("verify CheckOut Text : " + checkOutText.toString());
        return getTextFromElement(checkOutText);
    }

    // * 2.17	Verify the Text “New Customer”

    public String verifyTextNewCustomer() {
        log.info("verify Text NewCustomer : " + checkNewCustomerText.toString());
        return getTextFromElement(checkNewCustomerText);
    }

    // * 2.18	Click on “Guest Checkout” radio button
    public void clickOnGuestCheckOutButton() {
        clickOnElement(guestCheckoutButton);
        log.info("click On Guest CheckOut Button : " + guestCheckoutButton.toString());
    }

    // * 2.19	Click on “Continue” tab
    public void clickOnContinueButtonTab() {
        clickOnElement(continueTabButton);
        log.info("click On Continue ButtonTab : " + continueTabButton.toString());
    }

    // * 2.20	Fill the mandatory fields
    public void enterFirstNameIntoTheFirstNameField(String name) {
        sendTextToElement(firstName, name);
        log.info("enter FirstName Into The FirstName Field : " + firstName.toString());
    }

    public void enterLastNameIntoTheLastNameField(String surname) {
        sendTextToElement(lastName, surname);
        log.info("enter LastName Into The LastName Field : " + lastName.toString());
    }

    public void enterEmailIntoTheEmailField(String email) {
        sendTextToElement(emailAddress, email);
        log.info("enter Email Into The Email Field : " + emailAddress.toString());
    }

    public void enterTelephoneIntoTheTelephoneField(String phone) {
        sendTextToElement(telephone, phone);
        log.info("enter Telephone Into The  Telephone Field : " + telephone.toString());
    }

    public void enterAddressIntoTheAddress1Field(String address) {
        sendTextToElement(addressField, address);
        log.info("enter Address Into The Address1 Field: " + addressField.toString());
    }

    public void enterCityIntoTheCityField(String city) {
        sendTextToElement(cityName, city);
        log.info("enter City Into The CityField : " + cityName.toString());
    }

    public void enterPostcodeIntoThePostCodeField(String postcode) {
        sendTextToElement(zipCode, postcode);
        log.info("enter Postcode Into The PostCode Field : " + zipCode.toString());
    }

    public void enterCountryIntoTheCountryField(String country) {
        selectByVisibleTextFromDropDown(countryName, country);
        log.info("enter Country Into The Country Field: " + countryName.toString());
    }

    public void enterZoneIntoTheZoneField(String zone) {
        selectByVisibleTextFromDropDown(zoneName, zone);
        log.info("enter Zone Into The ZoneField : " + zoneName.toString());
    }

    // * 2.21	Click on “Continue” Button
    public void clickOnContinueButtonForGuest() {
        clickOnElement(continueButton);
        log.info("click On Continue Button ForGuest : " + continueButton.toString());
    }

    // * 2.22	Add Comments About your order into text are
    public void addCommentsAboutYourOrderIntoTheTextArea(String comment) {
        sendTextToElement(addCommentIn, comment);
        log.info("add Comments About Your Order Into The Text Area: " + addCommentIn.toString());
    }

    // * 2.23	Check the Terms & Conditions check box
    public void clickOnCheckBoxForTermsAndConditions() {
        clickOnElement(termsAndConditions);
        log.info("click On Check Box For Terms And Conditions : " + termsAndConditions.toString());
    }

    // * 2.24	Click on “Continue” button
    public void clickOnContinueButtonForPaymentMethod() {
        clickOnElement(continueButtonForPayment);
        log.info("click On Continue Button For Payment Method : " + continueButtonForPayment.toString());
    }

    // * 2.25	Verify the message “Warning: Payment method required!”
    public String verifyWarningMessageForPaymentMethod() {
        log.info("verify Warning Message For Payment Method : " + checkWarningForPayment.toString());
        return getTextFromElement(checkWarningForPayment);
    }


}
