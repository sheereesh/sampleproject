package setHooks;

import org.openqa.selenium.WebDriver;

import driverFactory.InvokeBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetupHooks {
	private static WebDriver wd;
	
	@Before(order = 1)
	public void invokeBrowser() {
		InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
		 wd=obj_InvokeBrowser.invokeBrowser();
	}
	
	@Before(order = 2)
	public void enterUrl() {
		wd.get("https://crossbrowsertesting.github.io/");
	}
	public WebDriver getDriver() {
		return wd; 
	}
	
	@After
	public void closeBrowser() {
		
		wd.close();
		
	}

}
