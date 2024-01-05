package StepDefinitons;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_StepDefinition extends BaseClass{

	
	@Given("Launch the given url {string}")
	public void launch_the_given_url(String url) {
		urlLaunch(url);
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("User selects submit button")
	public void user_selects_submit_button() {
	    driver.findElement(By.id("login-button")).click();
	}
	
	@Then("User logged in and checks the validates the message {string}")
	public void user_logged_in_and_checks_the_validates_the_message(String message) {
		
			WebElement element = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));		
			
		   
		    Assert.assertTrue(element.isDisplayed());
		    System.out.println("Login is successfull");
			
		
	    
	    
	}
	
	@Given("Launch the given url {string} in scenario two")
	public void launch_the_given_url_in_scenario_two(String string) {
		urlLaunch(string);
	}

	@When("User enters {string} and {string} in scenario two")
	public void user_enters_and_in_scenario_two(String string, String string2) {
		driver.findElement(By.id("user-name")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2);
	    
	    
	    
	}

	@When("User selects submit button in scenario two")
	public void user_selects_submit_button_in_scenario_two() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("User logged in and checks the validates the message {string} in scenario two")
	public void user_logged_in_and_checks_the_validates_the_message_in_scenario_two(String string) {
		WebElement element = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));		
		
		   
	    Assert.assertTrue(element.isDisplayed());
	    System.out.println("Login is successfull");
	}

}
