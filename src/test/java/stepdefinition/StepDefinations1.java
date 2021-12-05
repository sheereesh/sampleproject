package stepdefinition;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.SeleniumPage;
import setHooks.SetupHooks;

public class StepDefinations1 {
	private static WebDriver wd;
	
	@Given("user is in {string} page")
	public void user_is_in_page(String exp_PageTitle) {
		SetupHooks obj_Hooks=new SetupHooks();
	 	wd=obj_Hooks.getDriver();
	 	
	 	Assert.assertEquals(wd.getTitle(), exp_PageTitle);
	 	
	    
	}
	@When("user clicks  on selenium example page")
	public void user_clicks_on_selenium_example_page() {
		SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
		obj_SeleniumPage.clickSeleniumPage();
		
	}
	@Then("system should open {string}")
	public void system_should_open(String exp_PageTitle) {
		Assert.assertEquals(wd.getTitle(), exp_PageTitle);	
	}

}
