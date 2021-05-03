package com.automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="Features\\OrangeHRM.feature",glue="com.automation",plugin="html:reports.html")  //tags ="@add employee" for particular scenario
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
