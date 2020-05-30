package com.uapucam.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EvaluationPage {

	WebDriver ldriver;

	public EvaluationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain\"]/ul/li[5]/a")
	@CacheLookup
	WebElement evalink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_HyperLink1\"]")
	@CacheLookup
	WebElement evatut;

	public void Evalink() {
		evalink.click();
	}

	public void Evatut() {
		evatut.click();
	}

}
