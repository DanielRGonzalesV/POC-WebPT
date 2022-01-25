package com.webpt.reportAnalytics.web.pages;

import com.webpt.reportAnalytics.web.webDriver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This method represents base page.
 */
public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    /**
     * Constructor method.
     */
    public BasePage() {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }

    /**
     * This method closes browser.
     */
    public void closeBrowser() {
        driver.close();
    }
}
