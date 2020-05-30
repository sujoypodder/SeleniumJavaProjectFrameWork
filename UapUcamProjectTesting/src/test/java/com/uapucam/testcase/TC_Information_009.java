package com.uapucam.testcase;

import org.testng.annotations.Test;

import com.uapucam.objects.InformationPage;
import com.uapucam.objects.LoginPageObject;

public class TC_Information_009 extends BasisClass {

	@Test
	public void infoData() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(username);
		lpo.setPassword(password);
		lpo.clickSubmit();
		Thread.sleep(3000);

		InformationPage ip = new InformationPage(driver);
		ip.ClickInfo();
		Thread.sleep(2000);
		String expectedtitle4 = "Student Information Management";
		String actualtitle4 = driver.getTitle();
		System.out.println(actualtitle4);
		if (actualtitle4.equals(expectedtitle4)) {
			System.out.println("passed");
		} else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		System.out.println("testcase completed");
	}

}
