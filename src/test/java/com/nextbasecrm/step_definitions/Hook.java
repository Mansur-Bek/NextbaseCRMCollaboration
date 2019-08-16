package com.nextbasecrm.step_definitions;

import com.nextbasecrm.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setUp(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }


    @After()
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()){
            final byte[] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
        System.out.println("Closing driver with After method");
        Driver.closeDriver();
    }



}



