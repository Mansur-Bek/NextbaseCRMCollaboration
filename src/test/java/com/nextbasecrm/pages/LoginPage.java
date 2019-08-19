package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(name = "USER_LOGIN")
    @CacheLookup
    public WebElement usernameLocator;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordLocator;

    @FindBy(css = "input[type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "(//span[contains(text(),'Activity Stream')])[1]")
    public WebElement mainPageLocator;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']")
    public WebElement activityTaskLocator;

    @FindBy (xpath = "(//span[@title='Upload files'])[3]")
    public WebElement uploadPictureOrFileLocator;

    @FindBy (xpath = "//input[@name='bxu_files[]']")
    public WebElement insertPictureOrFileInput;

    @FindBy (xpath = "//span[@class='insert-btn-text']")
    public WebElement insertBtnLocator;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement clickSendBtnLocator;

    @FindBy (xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement inputThingsDoToLocator;

    @FindBy (xpath = "//a[@class='feed-post-user-name']")
    public WebElement assertPostedElement;

    @FindBy (xpath = "//span[@class='popup-window-button']")
    public WebElement popupWindowLocator;

    public void login (){
    String username = ConfigurationReader.getProperty("username");
    String password = ConfigurationReader.getProperty("password");
    usernameLocator.sendKeys(username);
    passwordLocator.sendKeys(password);
    loginButton.click();

}

    public void uploadFileOrPicture(){
        activityTaskLocator.click();
        inputThingsDoToLocator.sendKeys("Manager Murat");
        uploadPictureOrFileLocator.click();
        insertPictureOrFileInput.sendKeys("/Users/muratbekzhigitekov/Desktop/For Testing/Testing Uploads.docx");
        insertBtnLocator.click();
        clickSendBtnLocator.click();
        BrowserUtils.waitFor(3);
    }
}
