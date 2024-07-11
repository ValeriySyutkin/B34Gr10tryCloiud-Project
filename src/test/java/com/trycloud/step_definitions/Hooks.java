package com.trycloud.step_definitions;

/*
Int his class we will be able to create "pre" and "post" condition for All the SCENARIOS and even STEPS.
 */


import com.trycloud.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


//import the @Before coming from io.cucumber.java.Before;
public class Hooks {




   // @Before
    public void setupScenarios() {
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }


    /*
    After scenario will be executed automatically after EVERY scenario in the project.
     */
      @After
    public void teardownScenarios(Scenario scenario) {

        if(scenario.isFailed()) {

        byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        }

       // @After: RUNNING AFTER EACH SCENARIO;

        Driver.closeDriver();

    }






   // @BeforeStep
    public void setupStep(){
        System.out.println("---> @BeforeStep: Running before each step!");
    }

   // @AfterStep
    public void teardownStep(){
        System.out.println("---> @AfterStep : Running after each step!");
    }

}

