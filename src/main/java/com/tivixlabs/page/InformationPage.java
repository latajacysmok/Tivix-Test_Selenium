package com.tivixlabs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InformationPage extends PageObject{
    @FindBy(xpath = "//h6[1]")
    private WebElement pickupDate;
    @FindBy(xpath = "//h6[2]")
    private WebElement dropoffDate;
    @FindBy(xpath = "//p[2]")
    private WebElement countryCityDate;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement rentButton;

    public InformationPage(WebDriver webDriver, String dropoff, String pickup, String city, String country) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(pickupDate, pickup));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(dropoffDate, dropoff));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(countryCityDate, city));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(countryCityDate, country));
    }

    public RentPage clickRentButton2(){
        rentButton.click();
        return new RentPage(webDriver);
    }
}
