package com.tivixlabs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinalPage extends PageObject{
    @FindBy(xpath = "//h5[@class='alert alert-danger']")
    private WebElement headerPage;
    public FinalPage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage, "Name is required"));
    }
}
