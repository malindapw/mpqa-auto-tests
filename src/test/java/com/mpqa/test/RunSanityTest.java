package com.mpqa.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@sanity", "~@wip", "~@manual", "~@regression" }, format = {
		"pretty", "html:target/cucumber-reports/html/", "json:target/cucumber-reports/json/cucumber.json" }, strict = true, dryRun = false)
public class RunSanityTest {
}
