package com.demo.orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import com.demo.orangehrmlive.customlisteners.CustomListeners;
import com.demo.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AfterLoginDashboardPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class = 'oxd-topbar-header-breadcrumb']/h6[1]")
    WebElement dashboardPageText;

    public String getDashboardText() {
        Reporter.log("Dashboard Text : " + dashboardPageText.toString());
        CustomListeners.test.log(Status.PASS, "Dashboard Text : "+dashboardPageText.getText());
        return getTextFromElement(dashboardPageText);
    }
}
