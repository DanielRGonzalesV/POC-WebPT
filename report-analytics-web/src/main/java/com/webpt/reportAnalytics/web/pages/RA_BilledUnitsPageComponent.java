package com.webpt.reportAnalytics.web.pages;

import com.webpt.reportAnalytics.core.utils.TimeUtils;
import com.webpt.reportAnalytics.web.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class RA_BilledUnitsPageComponent extends BasePage {

    @FindBy(className = "analytics-icon")
    private WebElement analyticTab;

    public void clickAnalyticTab() {
        try {
            analyticTab.click();
            TimeUtils.waitFixedTime(30000);
            CommonActions.switchBrowserWindow("KPI Landing Page");
        } catch (Exception e) {
            Assert.fail("failed due to: " + e.getMessage());
        }
    }
}
