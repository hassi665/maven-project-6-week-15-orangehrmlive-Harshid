package com.demo.orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import com.demo.orangehrmlive.customlisteners.CustomListeners;
import com.demo.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement userNameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@class ='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotYourPasswordButtonClick;


    public void enterUserName(String username) {
        Reporter.log("Enter username " + username + " in username field " + userNameField.toString());
        sendTextToElement(userNameField, username);
        CustomListeners.test.log(Status.PASS, "Enter username " + username);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + " in password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter password " + password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on Login Button");
    }

    public void clickOnForgotPasswordLink(){
        Reporter.log("Click on forgot password link" + forgotYourPasswordButtonClick.toString());
        clickOnElement(forgotYourPasswordButtonClick);
        CustomListeners.test.log(Status.PASS, "Click on password link");
    }


}
