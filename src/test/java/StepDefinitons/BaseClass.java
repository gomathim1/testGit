package StepDefinitons;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;

	public static void setUpBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("appUrl");
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			if(driver==null) {
				driver = new ChromeDriver();
				driver.get(url);
			}
			
			
		} else {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("inprivate");
			if(driver==null) {
				driver = new EdgeDriver(option);
				driver.get(url);
			}
			
		}
	}
	
		
	public static void urlLaunch(String Url) {
		driver.get(Url);
	}
	
	public static void tearDown() {
		driver.quit();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public String getText(WebElement element) {		
		return element.getText();
	}
	
	
	

}
