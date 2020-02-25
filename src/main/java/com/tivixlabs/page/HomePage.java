package com.tivixlabs.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageObject{
    @FindBy(tagName = "h3")
    private WebElement headerPage;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement searchButton;
    @FindBy(id = "country")
    private WebElement countrySelect;
    @FindBy(id = "city")
    private WebElement citySelect;
    @FindBy(id = "pickup")
    private WebElement pickupSelect;
    @FindBy(id = "dropoff")
    private WebElement dropoffSelect;
    @FindBy(id = "model")
    private WebElement carModelInput;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage,"Please fill pickup and drop off dates"));
    }

    public void selectCountry(String country) {
        new Select(countrySelect).selectByVisibleText(country);
    }
    public void selectCity(String city) {
        new Select(citySelect).selectByVisibleText(city);
    }
    public void selectModel(String model) {
        carModelInput.clear();
        carModelInput.sendKeys(model);
    }


    public void selectPickup(String pickup) {
        //Fill year
        pickupSelect.sendKeys(pickup.substring(0, 4));
        //Press tab to shift focus to time field
        pickupSelect.sendKeys(Keys.TAB);
        //Fill month
        pickupSelect.sendKeys(pickup.substring(5, 7));
        //Fill day
        pickupSelect.sendKeys(pickup.substring(8, 10));
    }
    public void selectDropoff(String dropoff) {
        //Fill year
        dropoffSelect.sendKeys(dropoff.substring(0, 4));
        //Press tab to shift focus to time field
        dropoffSelect.sendKeys(Keys.TAB);
        //Fill month
        dropoffSelect.sendKeys(dropoff.substring(5, 7));
        //Fill day
        dropoffSelect.sendKeys(dropoff.substring(8, 10));
    }

    public ModelSelectionPage clicksearchButton(){
        searchButton.click();
        return new ModelSelectionPage(webDriver);
    }
}
