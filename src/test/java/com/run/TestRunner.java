package com.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=true,features = "src\\test\\resources\\Compose.feature",glue="com.gmail.steps",stepNotifications = true)
public class TestRunner {

}
