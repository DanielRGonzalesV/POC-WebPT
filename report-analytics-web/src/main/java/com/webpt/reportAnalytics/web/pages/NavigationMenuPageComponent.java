package com.webpt.reportAnalytics.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class NavigationMenuPageComponent extends BasePage {

    public void clickReportLink(String reportName) {
        WebElement reportLink;
        switch (reportName) {
            case "Distributed Payments":
                reportLink = driver.findElement(By.id("actDistributedPayments"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Medicare Costs by Date of Service":
                reportLink = driver.findElement(By.id("MedicareCostsbyDateofService"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Roll Forward Summary":
                reportLink = driver.findElement(By.id("actRollforwardSummary"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Paid Claims by Visit (Month End)":
                reportLink = driver.findElement(By.id("actPaidClaimsByVisit"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Accounts Receivable (Month End)":
                reportLink = driver.findElement(By.id("actAccountsReceivableME"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Associated Payments (Month End)":
                reportLink = driver.findElement(By.id("actAssociatedPaymentsME"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Management Report Card (Month End)":
                reportLink = driver.findElement(By.id("actManagementReportCard"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Clinic Aging Summary":
                reportLink = driver.findElement(By.id("actClinicAgingSummaryME"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Month End Trends":
                reportLink = driver.findElement(By.id("actMonthEndTrends"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Clinic Breakdown":
                reportLink = driver.findElement(By.id("actClinicBreakdown"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Payments Breakdown":
                reportLink = driver.findElement(By.id("actPaymentsBreakdown"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Adjustments Breakdown":
                reportLink = driver.findElement(By.id("actAdjustmentsBreakdown"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Ins Class Aging Summary":
                reportLink = driver.findElement(By.id("actInsuranceClassAgingMinus"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Insurance Class Breakdown":
                reportLink = driver.findElement(By.id("actInsuranceClassBreakdown"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Provider Breakdown":
                reportLink = driver.findElement(By.id("actProviderBreakdown"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Accounts Receivable":
                reportLink = driver.findElement(By.id("actAccountReceivable"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Patient Statement Listing":
                reportLink = driver.findElement(By.id("actPatientStatementListing"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Location Summary":
                reportLink = driver.findElement(By.id("actLocationSummary"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Aging A/R":
                reportLink = driver.findElement(By.id("actAgingAR"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Payment Detail":
                reportLink = driver.findElement(By.id("actPaymentDetail"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Charge Detail":
                reportLink = driver.findElement(By.id("actChargeDetail"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Paid Claims by Visit":
                reportLink = driver.findElement(By.id("actPaidClaims"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Paid CPT Code":
                reportLink = driver.findElement(By.id("actPaidCPTCode"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Monthly Transaction Summary":
                reportLink = driver.findElement(By.id("actMonthlyTranSum"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "CPT Code Charge":
                reportLink = driver.findElement(By.id("actCPTCodeCharge"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Charge Claim Delay Summary":
                reportLink = driver.findElement(By.id("actChargeClaimDelay"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Provider Summary":
                reportLink = driver.findElement(By.id("actProviderSummary"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Billed Units by Payer":
                reportLink = driver.findElement(By.id("actUnitsByPayer"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Billed Units by Clinic":
                reportLink = driver.findElement(By.id("actUnitsPerVisit"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Billed Units":
                reportLink = driver.findElement(By.id("actBillableUnits"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Claims Feed":
                reportLink = driver.findElement(By.id("actClaimsFeed"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Patient Visits by Payer":
                reportLink = driver.findElement(By.id("actPayerMix"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Patient Case Status":
                reportLink = driver.findElement(By.id("actPatientCaseStatus"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Scheduled Visits":
                reportLink = driver.findElement(By.id("actScheduledVisits"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Patient Payments":
                reportLink = driver.findElement(By.id("actPatientPayments"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Payment Log":
                reportLink = driver.findElement(By.id("actPaymentLog"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Medicare Threshold":
                reportLink = driver.findElement(By.id("actMedicareCap"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Authorizations":
                reportLink = driver.findElement(By.id("actAuthorizations"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Prescriptions":
                reportLink = driver.findElement(By.id("actPrescriptions"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Benefit Verification":
                reportLink = driver.findElement(By.id("actBenefitVerfication"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Notes By Clinic":
                reportLink = driver.findElement(By.id("actNotesByClinic"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Patient Notes":
                reportLink = driver.findElement(By.id("actBillableNotes"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Days to Finalization":
                reportLink = driver.findElement(By.id("actDaysToFinalization"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Open Notes":
                reportLink = driver.findElement(By.id("actOpenNotes"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Missed Notes":
                reportLink = driver.findElement(By.id("actMissedNotes"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Cancels":
                reportLink = driver.findElement(By.id("actCancels"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "No Shows":
                reportLink = driver.findElement(By.id("actNoShows"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Referrals":
                reportLink = driver.findElement(By.id("referrals-raw"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
            case "Referrals by Clinic":
                reportLink = driver.findElement(By.id("referrals-clinic"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reportLink);
                reportLink.click();
                break;
        }
    }
}
