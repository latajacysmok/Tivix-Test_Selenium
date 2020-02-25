package com.tivixlabs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RentPage extends PageObject{
    @FindBy(tagName = "h2")
    private WebElement headerPage;
    @FindBy(id = "last_name")
    private WebElement lastNameInput;
    @FindBy(id = "card_number")
    private WebElement cardNumberInput;
    @FindBy(id = "email")
    private WebElement emailInput;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement rentButton;

    public RentPage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage, "Summary:"));
    }

    public void enterLastName(String lastName) {
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    public void enterCardNumber(String cardNumber) {
        cardNumberInput.clear();
        cardNumberInput.sendKeys(cardNumber);
    }

    public void enteremail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public FinalPage clickRentButton3() {
        rentButton.click();
        return new FinalPage(webDriver);
    }


}
