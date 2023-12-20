package com.tutorialsninja.demo.Pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//h2[normalize-space()='Components'])[1]")
    WebElement componentText;

    public String verifyTheTextComponentsOnPage(){
        log.info("Verify The Text Components On Page : " + componentText.toString());
        return getTextFromElement(componentText);
    }

}
