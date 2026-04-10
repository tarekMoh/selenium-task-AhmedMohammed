package com.qa.ta;

import com.qa.ta.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("qoyod_user", "Test@1234");
        Assert.assertTrue(loginPage.isSuccessScreenDisplayed(), "You're logged in successfully!");
        Assert.assertEquals(loginPage.getLoggedInUsername(), "qoyod_user");
    }

    @Test(groups = {"regression"})
    public void testInvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "wrong_password");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message should be displayed for invalid credentials");
        Assert.assertEquals(loginPage.getErrorMessageText(), "Invalid username or password. Please try again.");
    }

    @Test(groups = {"regression"})
    public void testEmptyCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "");
        Assert.assertTrue(loginPage.isUsernameErrorDisplayed(), "Username error should be displayed for empty username");
        Assert.assertTrue(loginPage.isPasswordErrorDisplayed(), "Password error should be displayed for empty password");
    }
}
