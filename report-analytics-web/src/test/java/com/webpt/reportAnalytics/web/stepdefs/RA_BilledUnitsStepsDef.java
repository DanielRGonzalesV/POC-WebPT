package com.webpt.reportAnalytics.web.stepdefs;

import com.webpt.reportAnalytics.web.pages.AllReportsPageComponent;
import com.webpt.reportAnalytics.web.pages.AnalyticsPage;
import com.webpt.reportAnalytics.web.pages.NavigationMenuPageComponent;
import com.webpt.reportAnalytics.web.pages.RA_BilledUnitsPageComponent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RA_BilledUnitsStepsDef {

    private static final Logger LOGGER = LogManager.getLogger(RA_BilledUnitsStepsDef.class.getSimpleName());
    private RA_BilledUnitsPageComponent billedUnits;
    private AllReportsPageComponent allReports;
    private NavigationMenuPageComponent navigationMenu;
    private AnalyticsPage analyticsPage;

    public RA_BilledUnitsStepsDef(RA_BilledUnitsPageComponent billedUnits, AnalyticsPage analyticsPage,
                                  AllReportsPageComponent allReports, NavigationMenuPageComponent navigationMenu){
        this.billedUnits = billedUnits;
        this.allReports = allReports;
        this.navigationMenu = navigationMenu;
        this.analyticsPage = analyticsPage;
    }

    @Then("I view the EMR page and click on analytics tab")
    public void iViewTheEMRPageAndClickOnAnalyticsTab() {
        this.billedUnits.clickAnalyticTab();
    }

    @When("I see the analytics home page and click on reports tab")
    public void iSeeTheAnalyticsHomePageAndClickOnReportsTab() {
        analyticsPage.clickReportsTab();
    }

    @Then("I validate the {string} report loads successfully")
    public void iValidateTheReportLoadsSuccessfully(String reportName) {
        allReports.validateReportTitle(reportName);
    }

    @And("I navigate to the {string} report")
    public void iNavigateToTheReport(String reportName) {
        navigationMenu.clickReportLink(reportName);
    }
}
