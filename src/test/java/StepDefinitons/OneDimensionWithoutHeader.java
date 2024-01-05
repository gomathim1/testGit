package StepDefinitons;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OneDimensionWithoutHeader {
	@Given("User is in login page")
	public void user_is_in_login_page() {
	    
	}

	@When("User enters below user credentials")
	public void user_enters_below_user_credentials(io.cucumber.datatable.DataTable dataTable) {
		/*
		 * List<List<String>> asList = dataTable.asLists(String.class); for(List<String>
		 * list1:asList) {
		 * 
		 * System.out.println(list1); }
		 */
		
		/*
		 * List<String> asList = dataTable.asList(); System.out.println(asList.get(0));
		 * 
		 * for(String s:asList) { System.out.println(s); }
		 */
		
		Map<String, String> asMap = dataTable.asMap(String.class,String.class);
		/*
		 * for(Map.Entry<String, String> map:asMap.entrySet()) {
		 * System.out.println(map.getKey()); }
		 */
		System.out.println(asMap.get("UserName"));
		
		 
	}

	@Then("User has successfully logged in")
	public void user_has_successfully_logged_in() {
	   
	}
	
	

	
	@Given("User is in scenario two")
	public void user_is_in_scenario_two() {
	    
	}




}
