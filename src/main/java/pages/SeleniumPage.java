package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonMethods;

public class SeleniumPage {
	
	
	CommonMethods obj_CommonMethods=new CommonMethods();
	
	
	public SeleniumPage(WebDriver wd) {
		
		PageFactory.initElements(wd,this);
		}
	@FindBy(xpath = "//a[contains(text(),'Selenium Example Page')]")
	WebElement link_SeleniumPage;
	public void clickSeleniumPage() {
		obj_CommonMethods.clickOnTheLink(link_SeleniumPage);
		
	}
	@FindBy(xpath = "//body/div[1]/form[1]/input[1]")
	WebElement enterDataOnPage;
	public void sendDataOnPage(String text) {
		obj_CommonMethods.sendKeysOnTheLink(enterDataOnPage, text);
	}

	
	
}
