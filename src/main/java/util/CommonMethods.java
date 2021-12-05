package util;

import org.openqa.selenium.WebElement;

public class CommonMethods {
	
	public void  clickOnTheLink(WebElement web) {
		web.click();
	}
		public void sendKeysOnTheLink(WebElement web, String text){
			web.sendKeys(text);
			  	
		 
	}

}
