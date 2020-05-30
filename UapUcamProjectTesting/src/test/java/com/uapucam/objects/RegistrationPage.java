package com.uapucam.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver ldriver;

	public RegistrationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain\"]/ul/li[4]/a")
	@CacheLookup
	WebElement reglink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_txtStudent\"]")
	@CacheLookup
	WebElement reg;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_btnLoad\"]")
	@CacheLookup
	WebElement load;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_HyperLink1\"]/blink")
	@CacheLookup
	WebElement regtut;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_btnShowCompletedCourse\"]")
	@CacheLookup
	WebElement scc;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_btnShowRegularCourse\"]")
	@CacheLookup
	WebElement sfc;

	// -----------------

	public void Reglink() {
		reglink.click();
	}

	public void setReg(String rg) {
		reg.sendKeys(rg);
	}

	public void Load() {
		load.click();
	}

	public void Regtut() {
		regtut.click();
	}

	public void CompleteCourse() {
		scc.click();
	}

	public void FeatureCourse() {
		sfc.click();
	}

}
