package com.webpt.reportAnalytics.web.stepdefs;

import com.webpt.reportAnalytics.web.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginStepDef {

    private static final Logger LOGGER = LogManager.getLogger(LoginStepDef.class.getSimpleName());

    private LoginPage loginPage;

    public LoginStepDef(LoginPage loginPage){
        this.loginPage = loginPage;
    }

    @Given("I navigate to EMR login page")
    public void iNavigateToEMRLoginPage() {
        this.loginPage.navigateToBaseUrl();
        LOGGER.info("Navigate to Portal page");
    }

    @When("I enter username {string} and password {string} in the text fields")
    public void iEnterUsernameAndPasswordInTheTextFields(String username, String password) {
        this.loginPage.login(username, password);
    }

    @And("I click on login to webpt button")
    public void iClickOnLoginToWebptButton() {
        this.loginPage.clickLoginBtn();
    }
}
