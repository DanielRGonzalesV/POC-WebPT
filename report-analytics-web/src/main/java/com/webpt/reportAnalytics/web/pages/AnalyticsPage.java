package com.webpt.reportAnalytics.web.pages;

import com.webpt.reportAnalytics.core.utils.TimeUtils;
import com.webpt.reportAnalytics.web.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AnalyticsPage extends BasePage{


    @FindBy(id = "REPORTS")
    private WebElement reportTab;

    public AnalyticsPage(){

    }

    public void clickReportsTab() {
        CommonActions.waitUntilElementIsDisplayedWithCss("#Header_KPIDashboard");
        try {
            reportTab.click();
        } catch (Exception e) {
            Assert.fail("failed due to: " + e.getMessage());
        }
    }
}
