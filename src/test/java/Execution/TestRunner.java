package Execution;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import StepDefinitons.CustomizedReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\hp\\eclipse-workspace\\cucumber_automation\\src\\test\\resources\\featureFile\\login.feature",
		glue="StepDefinitons",
		dryRun = false,
		plugin = {"json:C:\\Users\\hp\\eclipse-workspace\\cucumber_automation\\src\\test\\resources\\Reports\\jsonReports.json","rerun:C:\\Users\\hp\\eclipse-workspace\\cucumber_automation\\src\\test\\resources\\FailedScenarios\\scenarios_failed.txt"}
		)

public class TestRunner {
	
	
	  @AfterClass public static void generateReport() {
	  CustomizedReport.jsonToHtml(
	  "C:\\Users\\hp\\eclipse-workspace\\cucumber_automation\\src\\test\\resources\\Reports\\jsonReports.json"
	  ); }
	 
	
}
