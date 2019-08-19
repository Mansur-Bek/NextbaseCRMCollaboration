package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class LoginStepDefinitions extends LoginPage {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String username, String password) {
        LoginPage page = new LoginPage();
        page.login();

    }


    @Then("user creates new task by clicking on {string} on activity stream page")
    public void user_creates_new_task_by_clicking_on_on_activity_stream_page(String string) {

    }

    @Then("verify the user is on the {string} page")
    public void verify_the_user_is_on_the_main_page(String expected) {
        Assert.assertEquals(expected, mainPageLocator.getText());
    }

    @Then("user can upload a file and image regarding to new task")
    public void user_can_upload_a_file_and_image_or_link_or_add_checklist_regarding_to_new_task() {
       uploadFileOrPicture();


    }

    @Then("verify the upload file is posted")
    public void verify_the_upload_file_is_posted() {

    Assert.assertTrue(popupWindowLocator.isDisplayed());
    }


    @Then("user should be able to set up a deadline for new task")
    public void user_should_be_able_to_set_up_a_deadline_for_new_task() {

    }

}
