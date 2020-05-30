package com.uapucam.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdmitPage {

	WebDriver ldriver;

	public AdmitPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain\"]/ul/li[1]/a")
	@CacheLookup
	WebElement lnkadmit;

	@FindBy(how = How.ID, using = "ctl00_MainContainer_ucProgram_ddlProgram")
	@CacheLookup
	WebElement program;

	@FindBy(how = How.ID, using = "ctl00_MainContainer_ucSession_ddlSession")
	@CacheLookup
	WebElement session;

	@FindBy(how = How.ID, using = "ctl00_MainContainer_ucBatch_ddlBatch")
	@CacheLookup
	WebElement semester;

	@FindBy(how = How.ID, using = "ctl00_MainContainer_radiolist1_1")
	@CacheLookup
	WebElement xm;

	/*
	 * @FindBy(id = "ctl00_MainContainer_ddlStudent")
	 * 
	 * @CacheLookup WebElement roll;
	 */

	@FindBy(id = "ctl00_MainContainer_Button1")
	@CacheLookup
	WebElement load;

	// ------------------------------

	public void ClickAdmit() {
		lnkadmit.click();
	}

	public void setProgram() {
		Select pro = new Select(program);
		pro.selectByValue("4");
	}

	public void setSession() {
		Select ses = new Select(session);
		ses.selectByValue("112");
	}

	public void setSemester() {
		Select sem = new Select(semester);
		sem.selectByValue("126");
	}

	public void setXm(String exam) {
		xm.sendKeys(exam);
	}

	public void setLoadBtn() {
		load.click();
	}

}
