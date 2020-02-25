package com.tivixlabs.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum WebDriverType {
    FIREFOX {
        @Override
        public WebDriver create() {
            System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions opts = new FirefoxOptions().setLogLevel(FirefoxDriverLogLevel.TRACE);
            return new FirefoxDriver(opts);
        }
    },
    CHROME {
        @Override
        public WebDriver create() {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
    },
    IE {
        @Override
        public WebDriver create() {
            WebDriverManager.iedriver().arch32().setup();
            return new InternetExplorerDriver();
        }

    };
    public abstract WebDriver create();
}
