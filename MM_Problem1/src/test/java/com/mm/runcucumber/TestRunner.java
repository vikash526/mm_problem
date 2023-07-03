package com.mm.runcucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		// path of feature file
		features = "/src/test/resources/problem.feature",
		// path of step definition file
		glue = "/src/test/java/com/mm/stepdefinition/StepDefinition.java")
public class TestRunner extends AbstractTestNGCucumberTests {
}
