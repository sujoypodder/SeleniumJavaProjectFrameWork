package com.uapucam.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillPage {

	WebDriver ldriver;

	public BillPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain\"]/ul/li[2]/a")
	@CacheLookup
	WebElement menulink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain:submenu:3\"]/li/a")
	@CacheLookup
	WebElement submenulink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_txtStudentId\"]")
	@CacheLookup
	WebElement regno;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_ucSession_ddlSession\"]")
	@CacheLookup
	WebElement semester;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_gvStudentBillView_ctl01_lnkTypeName\"]")
	@CacheLookup
	WebElement filetype;

	// ---------------------------

	public void ClickMenu() {
		menulink.click();
	}

	public void ClickSmenu() {
		submenulink.click();
	}

	public void setRegno(String rn) {
		regno.click();
	}

	public void setsemester() {
		Select sem = new Select(semester);
		sem.selectByValue("104");
	}

	public void FileLink() {
		filetype.click();
	}

}
