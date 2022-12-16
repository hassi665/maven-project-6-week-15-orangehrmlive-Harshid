package com.demo.orangehrmlive.testsuite;


import com.demo.orangehrmlive.pages.AfterLoginDashboardPage;
import com.demo.orangehrmlive.pages.LoginPage;
import com.demo.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    AfterLoginDashboardPage afterLoginDashboardPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        loginPage = new LoginPage();

        afterLoginDashboardPage = new AfterLoginDashboardPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.enterUserName("Admin");

        loginPage.enterPassword("admin123");

        loginPage.clickOnLoginButton();

        Assert.assertEquals(afterLoginDashboardPage.getDashboardText(), "Dashboard", "Error with Dashboard Page");

    }

}
