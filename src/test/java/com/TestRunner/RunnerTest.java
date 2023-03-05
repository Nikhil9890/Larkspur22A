package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/First.feature", glue="src/main/java/com/TestingShastra/StepDefination",tags= "@Regression or @Smoke")
public class RunnerTest extends AbstractTestNGCucumberTests {

}
