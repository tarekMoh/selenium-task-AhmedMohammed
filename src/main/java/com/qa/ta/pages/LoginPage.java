package com.qa.ta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    @FindBy(id = "username-input")
    private WebElement usernameField;

    @FindBy(id = "password-input")
    private WebElement passwordField;

    @FindBy(xpath = "//button[.//span[@id='sign-in-label']]")
    private WebElement loginButton;

    @FindBy(id = "success-screen")
    private WebElement successScreen;

    @FindBy(id = "logged-in-username")
    private WebElement loggedInUsername;

    @FindBy(id = "error-message")
    private WebElement errorMessage;

    @FindBy(id = "username-error")
    private WebElement usernameError;

    @FindBy(id = "password-error")
    private WebElement passwordError;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    public boolean isSuccessScreenDisplayed() {
        return wait.until(ExpectedConditions.visibilityOf(successScreen)).isDisplayed();
    }

    public String getLoggedInUsername() {
        return wait.until(ExpectedConditions.visibilityOf(loggedInUsername)).getText();
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(errorMessage)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getErrorMessageText() {
        try {
            return errorMessage.getText();
        } catch (Exception e) {
            return "";
        }
    }

    public boolean isUsernameErrorDisplayed() {
        try {
            return usernameError.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPasswordErrorDisplayed() {
        try {
            return passwordError.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
