package com.tutorialsninja.demo.Pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//h2[normalize-space()='Desktops'])[1]")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> listOfProducts;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement descendingOrder;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement ascendingOrder;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']")
    WebElement products;


    // * 1.3 Verify the text ‘Desktops’
    public String verifyTheTextDesktopsOnPage() {
        log.info("Verify The Text Desktops On Page : " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void verifySortedElementsInReverseOrder() {
        Reporter.log("Get elements sorted in reverse order" + descendingOrder.toString());
        List<WebElement> elements = listOfProducts;
        ArrayList<String> originalElementList = new ArrayList<>();
        for (WebElement e : elements) {
            originalElementList.add(e.getText());
        }
        System.out.println(originalElementList);

        Collections.reverse(originalElementList);
        System.out.println(originalElementList);

        elements = listOfProducts;
        ArrayList<String> afterSortByReverseList = new ArrayList<>();
        for (WebElement e : elements) {
            afterSortByReverseList.add(e.getText());
        }
        System.out.println(afterSortByReverseList);

    }

    // * 2.5 Select Sort By position "Name: A to Z"
    public void selectSortByOption(String option) {
        Reporter.log("Select sortBy option" + descendingOrder.toString());
        selectByVisibleTextFromDropDown(descendingOrder, option);
    }

    public void sortByNameAToZPosition(String option) {
        selectByVisibleTextFromDropDown(ascendingOrder, option);
        log.info("sort By Name A To Z Position : " + ascendingOrder.toString());
    }

    public void selectProduct(String product) {
        mouseHoverToElementAndClick(products);
        log.info("Select Product : " + products.toString());
    }

    public void selectProductsOption(String products) {
        WebElement productList = driver.findElement(By.linkText(products));
        Actions actions = new Actions(driver);
        actions.moveToElement(productList).click().build().perform();
        log.info("Select Products option : " + products.toString());
    }

}
