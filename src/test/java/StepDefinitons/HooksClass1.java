package StepDefinitons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass1 extends BaseClass{



	@Before
	public void before_method() {
		setUpBrowser("Chrome");
	}
	
	@Before
	public void method_one() {
		System.out.println("Before hooks");
	}

	@After
	public void after_method(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] file = ts.getScreenshotAs(OutputType.BYTES);
			//FileUtils.copyFile(file, new File("C:\\Users\\hp\\eclipse-workspace\\cucumber_automation\\src\\test\\resources\\Reports\\FailedScreenshots\\screenshot.png"));
			scenario.attach(file, "image/png", scenario.getName());
			}
		tearDown();
	}

}



