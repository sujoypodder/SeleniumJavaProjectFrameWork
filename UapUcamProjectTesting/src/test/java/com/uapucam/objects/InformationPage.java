package com.uapucam.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {

	WebDriver ldriver;

	public InformationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain\"]/ul/li[7]/a")
	@CacheLookup
	WebElement info;

	public void ClickInfo() {
		info.click();
	}
}
