package com.webpt.reportAnalytics.web.pages;

import com.webpt.reportAnalytics.core.utils.PropertiesInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(id = "login-username")
    private WebElement userName;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @FindBy(className = "ok")
    private WebElement evictOkBtn;

    public void login(String username, String password) {
        this.enterUserName(username);
        this.enterPassword(password);
    }

    public void navigateToBaseUrl() {
        driver.get(PropertiesInfo.getInstance().getUrl());
    }

    public void enterUserName(String username) {

        try {
            userName.clear();
            userName.click();
            userName.sendKeys(username);
            userName.sendKeys(Keys.TAB);
        }catch(Exception e) {
            Assert.fail("failed due to: " + e.getMessage());
        }
    }
    public void enterPassword(String userPassword) {
        try {
            password.clear();
            password.sendKeys(userPassword);
            password.sendKeys(Keys.TAB);
        }catch(Exception e) {
            Assert.fail("failed due to: " + e.getMessage());
        }
    }

    public void clickLoginBtn() {
        try {
            loginBtn.click();
            if(evictOkBtn.isDisplayed()) {
                evictOkBtn.click();
            }
            System.out.println("emr popup screen not exist");

        }catch (NoSuchElementException e) {
            System.out.println("element not exists");

        }catch(Exception e) {
            Assert.fail("failed due to: " + e.getMessage());}
    }
}
