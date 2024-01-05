package StepDefinitons;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CustomizedReport {
	public static void jsonToHtml(String json) {
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\cucumber_automation\\src\\test\\resources\\Reports");
		Configuration config = new Configuration(file, "Customized Report");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Enviroment", "QA");
		config.addClassifications("Platform", "Windows");
		
		List<String> list = new ArrayList<>();
		list.add(json);
		
		ReportBuilder report = new ReportBuilder(list, config);
		report.generateReports();
		
	}

}
