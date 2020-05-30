package com.uapucam.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CUPasswordPage {

	WebDriver ldriver;

	public CUPasswordPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain\"]/ul/li[3]/a")
	@CacheLookup
	WebElement changepass;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_menuMain:submenu:6\"]/li/a")
	@CacheLookup
	WebElement updatepass;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_txtCurrentPassword\"]")
	@CacheLookup
	WebElement currentpass;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_txtPassword\"]")
	@CacheLookup
	WebElement newpass;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_txtRetypePassword\"]")
	@CacheLookup
	WebElement retypass;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_MainContainer_btnUpdate\"]")
	@CacheLookup
	WebElement update;

	// --------------------

	public void ClickCpass() {
		changepass.click();
	}

	public void ClickUpass() {
		updatepass.click();
	}

	public void setCurrentpass(String cp) {
		currentpass.sendKeys(cp);
	}

	public void setNewpass(String np) {
		newpass.sendKeys(np);
	}

	public void setRetypepass(String rp) {
		retypass.sendKeys(rp);
	}

	public void Updatebtn() {
		update.click();
	}
}
