package com.nextbasecrm.step_definitions;

import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import cucumber.api.java.en.*;

public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("user on the home page")
    public void user_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user creates new task by clicking on {string} on activity stream page")
    public void user_creates_new_task_by_clicking_on_on_activity_stream_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user can upload a file and image or link or add checklist regarding to new task")
    public void user_can_upload_a_file_and_image_or_link_or_add_checklist_regarding_to_new_task() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user should be able to set up a deadline for new task")
    public void user_should_be_able_to_set_up_a_deadline_for_new_task() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user logs out")
    public void user_logs_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
