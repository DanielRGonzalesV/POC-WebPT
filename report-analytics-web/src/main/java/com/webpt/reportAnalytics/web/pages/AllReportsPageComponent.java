package com.webpt.reportAnalytics.web.pages;

import com.webpt.reportAnalytics.web.utils.CommonActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AllReportsPageComponent extends BasePage {

    private static final Logger LOG = LogManager.getLogger(AllReportsPageComponent.class.getName());

    @FindBy(id = "ReportTitle")
    private WebElement uiReportName;
    @FindBy(id = "lblReportTitle")
    private WebElement uiReportNameLbl;

    public void validateReportTitle (String reportName) {
        CommonActions.switchBrowserWindow("KPI Landing Page");
        String uiReportTitle;
        if (driver.findElements(By.id("ReportTitle")).size() > 0) {
            uiReportTitle = uiReportName.getText();
            System.out.println("non lbl");
        } else {
            uiReportTitle = uiReportNameLbl.getText();
            System.out.println("lbl");
        }
        System.out.println("UI Report Title is: " + uiReportTitle);
        if (reportName.equals(uiReportTitle)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Report did not load correctly");
        }

    }
}
