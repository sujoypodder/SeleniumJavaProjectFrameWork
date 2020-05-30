package com.uapucam.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	WebDriver ldriver;

	public LoginPageObject(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "logMain_UserName")
	@CacheLookup
	WebElement logid;

	@FindBy(id = "logMain_Password")
	@CacheLookup
	WebElement pass;

	@FindBy(id = "logMain_Button1")
	@CacheLookup
	WebElement logbtn;

	@FindBy(id = "ctl00_lblLogout")
	@CacheLookup
	WebElement logout;
	// WebElement forget=driver.findElement(By.linkText("Forgot Your Password ?"));

	public void setUserName(String uname) {
		logid.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		pass.sendKeys(pwd);
	}

	public void clickSubmit() {
		logbtn.click();
	}

	public void clickLogout() {
		logout.click();
	}

}
