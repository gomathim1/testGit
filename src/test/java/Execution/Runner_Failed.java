package Execution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@C:\\Users\\hp\\eclipse-workspace\\cucumber_automation\\src\\test\\resources\\FailedScenarios\\scenarios_failed.txt",
		glue="StepDefinitons"
		)

public class Runner_Failed {
	

}
