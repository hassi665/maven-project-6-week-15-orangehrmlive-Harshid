package com.demo.orangehrmlive.testsuite;

import com.demo.orangehrmlive.pages.ForgotPasswordPage;
import com.demo.orangehrmlive.pages.LoginPage;
import com.demo.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    LoginPage loginPage;
    ForgotPasswordPage forgotPasswordPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        forgotPasswordPage = new ForgotPasswordPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        loginPage.clickOnForgotPasswordLink();

        Assert.assertEquals(forgotPasswordPage.getMessageAfterClickOnForgotYourPasswordButton(), "Reset Password", "Forgot Password page not redirected");

    }
}
