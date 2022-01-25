package com.webpt.reportAnalytics.web.utils;

import com.webpt.reportAnalytics.web.webDriver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * This class handles selenium common actions.
 */
public final class CommonActions {
    private static final Logger LOGGER = LogManager.getLogger(CommonActions.class.getSimpleName());
    private static final WebDriver WEB_DRIVER = DriverManager.getInstance().getDriver();
    private static Actions actionsInstance = null;

    /**
     * Constructor method.
     */
    private CommonActions() {
        getActions();
    }

    /**
     * This method retrieves actions.
     *
     * @return Actions
     */
    private static Actions getActions() {
        if (actionsInstance == null) {
            actionsInstance = new Actions(WEB_DRIVER);
        }
        return actionsInstance;
    }

    /**
     * This method validates whether a WebElement is present or not on the WebApplication.
     *
     * @param webElement to find
     * @return true if WebElement is present or false if not.
     */
    public static boolean isElementPresent(final WebElement webElement) {
        try {
            webElement.getTagName();
            return true;
        } catch (WebDriverException e) {
            LOGGER.warn("Web element not found " + e.getMessage());
            return false;
        }
    }

    /**
     * This method is going to click a WebElement in the WebApplication.
     *
     * @param webElement to be clicked.
     */
    public static void clickWebElement(final WebElement webElement) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method is going to set a text box field in the WebApplication.
     *
     * @param webElement Field WebElement
     * @param text       to insert on field.
     */
    public static void setWebElement(final WebElement webElement, final String text) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    /**
     * This method returns the text present in the web element.
     *
     * @param webElement to be used.
     * @return text.
     */
    public static String getText(final WebElement webElement) {
        return webElement.getText();
    }

    /**
     * This method will return a string list of the received list of webelements.
     *
     * @param webElements with all elements.
     * @return list of strings for all elements in the list.
     */
    public static List<String> getListStringForAllElements(final List<WebElement> webElements) {
        List<String> myList = new ArrayList<>();
        for (WebElement element : webElements) {
            myList.add(element.getText().trim());
        }

        return myList;
    }

    /**
     * This method hovers the mouse pointer over the web element.
     *
     * @param graphicElement to hover over.
     */
    public static void hoverOverWebElement(final WebElement graphicElement) {
        getActions().moveToElement(graphicElement).perform();
    }

    /**
     * This method retrieves a web element using css.
     *
     * @param cssLocator to find.
     * @return WebElement.
     */
    public static WebElement getWebElementWithCss(final String cssLocator) {
        return DriverManager.getInstance().getDriver().findElement(By.cssSelector(cssLocator));
    }

    /**
     * This method gets attribute from webelement.
     *
     * @param webElement webelement.
     * @param attribute  attribute to retrieve.
     * @return webelement's attribute retrieved.
     */
    public static String getAttribute(final WebElement webElement, final String attribute) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getAttribute(attribute);
    }

    /**
     * This method switch to tab that has a specific title.
     *
     * @param title of the window.
     */
    public static void switchBrowserWindow(final String title) {
        WebDriver currentWebDriver = DriverManager.getInstance().getDriver();
        Set<String> browserWindows = currentWebDriver.getWindowHandles();
        LOGGER.info("tabs are " + browserWindows.size());
        browserWindows.forEach(LOGGER::info);
        for (String browserWindowTitle : browserWindows) {
            currentWebDriver.switchTo().window(browserWindowTitle);
            LOGGER.info(currentWebDriver.getTitle() + " current window ");
            if (currentWebDriver.getTitle().equalsIgnoreCase(title)) {
                LOGGER.info(currentWebDriver.getTitle() + " == " + title);
                LOGGER.info("Switch window to " + currentWebDriver.getTitle());
                return;
            }
        }
    }

    /**
     * This method waits until specific web element is displayed.
     *
     * @param element to wait.
     */
    public static void waitUntilElementIsDisplayedWithCss(final String element) {
        DriverManager
                .getInstance()
                .getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
    }
}
