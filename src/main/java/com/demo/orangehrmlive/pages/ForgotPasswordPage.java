package com.demo.orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import com.demo.orangehrmlive.customlisteners.CustomListeners;
import com.demo.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h6[@class = 'oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement getResetPasswordTextOnScreen;

    public String getMessageAfterClickOnForgotYourPasswordButton(){
        Reporter.log("Reset Password text as shown : " + getResetPasswordTextOnScreen.toString());
        CustomListeners.test.log(Status.PASS, "The password reset text is " + getResetPasswordTextOnScreen.getText());
        return getTextFromElement(getResetPasswordTextOnScreen);
    }


}
