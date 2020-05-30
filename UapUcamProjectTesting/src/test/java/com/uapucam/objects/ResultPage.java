package com.uapucam.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ResultPage {

	WebDriver ldriver;

	public ResultPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain\"]/ul/li[6]/a")
	@CacheLookup
	WebElement result;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain:submenu:11\"]/li/a")
	@CacheLookup
	WebElement resulthistory;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_txtStudentId\"]")
	@CacheLookup
	WebElement regno;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_ucSession_ddlSession\"]")
	@CacheLookup
	WebElement semester;

	// ------------------

	public void ClickReslt() {
		result.click();
	}

	public void ClickResltHistory() {
		resulthistory.click();
	}

	public void setRegno(String ri) {
		regno.click();
	}

	public void setSemester() {
		Select sem = new Select(semester);
		sem.selectByValue("104");
	}
}
