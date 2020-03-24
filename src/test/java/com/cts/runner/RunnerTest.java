package com.cts.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features= {"src/main/resources/feature/Login.feature"},
glue= {"com/cts/stepdefinition"},monochrome=true,dryRun=false,plugin = {"html:reports/","pretty"})
@RunWith(Cucumber.class)
public class RunnerTest {
	
}
