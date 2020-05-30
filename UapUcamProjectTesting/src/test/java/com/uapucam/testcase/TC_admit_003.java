package com.uapucam.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.uapucam.objects.AdmitPage;
import com.uapucam.objects.LoginPageObject;

public class TC_admit_003 extends BasisClass {

	@Test
	public void admitCard() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(username);
		lpo.setPassword(password);
		lpo.clickSubmit();
		Thread.sleep(3000);

		AdmitPage ap = new AdmitPage(driver);
		ap.ClickAdmit();
		ap.setProgram();
		ap.setSession();
		ap.setSemester();
		ap.setXm("Final");
		ap.setLoadBtn();
		Thread.sleep(2000);
		String expectedmsg = "NO Data Found. Enter Valid Program And Batch";
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContainer_lblMessage\"]"));
		String actualmsg = msg.getText();
		if (actualmsg.equals(expectedmsg)) {
			System.out.println("testcase done");
		} else {
			System.out.println("testcase fail");
		}
		Thread.sleep(3000);
	}
}
