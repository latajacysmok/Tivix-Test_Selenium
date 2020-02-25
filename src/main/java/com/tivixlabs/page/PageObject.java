package com.tivixlabs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        this.webDriverWait = new WebDriverWait(webDriver, 15, 1000);
    }
}
