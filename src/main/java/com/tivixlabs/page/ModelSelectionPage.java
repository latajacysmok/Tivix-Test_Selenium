package com.tivixlabs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ModelSelectionPage extends PageObject {
    @FindBy(id = "search-results")
    private WebElement headerPage;
    @FindBy(xpath = "//tr[1]/td[2]")
    private WebElement carModel;
    @FindBy(xpath = "//tbody/tr[1]/th[1]")
    private WebElement example;

    private String company;
    private String licensePlate;
    private String pricePerDay;

    public ModelSelectionPage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.visibilityOf(headerPage));
    }

    public InformationPage clickRentButton(String dropoff, String pickup, String city, String country, String model) {


        List<WebElement> allCarModels = webDriver.findElements(By.xpath("//td[2]"));

        System.out.println(allCarModels.size());
        System.out.println(allCarModels);

        int i = 1;
        for(WebElement webElement : allCarModels){
            String name = webElement.getText();
            System.out.println(name);
            if (name.contains(model)) {
                company = webDriver.findElement(By.xpath(String.format("//tr[%s]/td[1]", Integer.toString(i)))).getText();
                licensePlate = webDriver.findElement(By.xpath(String.format("//tr[%s]/td[3]", Integer.toString(i)))).getText();
                pricePerDay = webDriver.findElement(By.xpath(String.format("//tr[%s]/td[5]", Integer.toString(i)))).getText();
                webDriver.findElement(By.xpath(String.format("//tr[%s]/td[6]/a[@class='btn btn-success' and 1]", Integer.toString(i)))).click();
                break;
            }
            i++;
        }

        return new InformationPage(webDriver, dropoff, pickup, city, country, model, company, licensePlate, pricePerDay);
    }
}




