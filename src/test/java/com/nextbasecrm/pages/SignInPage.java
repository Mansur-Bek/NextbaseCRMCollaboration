package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(name = "USER_LOGIN")
    @CacheLookup
    public WebElement usernameLocator;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordLocator;

    @FindBy(css = "input[type='submit']")
    public WebElement loginButton;



}
