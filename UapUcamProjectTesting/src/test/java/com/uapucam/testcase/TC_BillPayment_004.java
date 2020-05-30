package com.uapucam.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.uapucam.objects.BillPage;
import com.uapucam.objects.LoginPageObject;

public class TC_BillPayment_004 extends BasisClass {

	@Test
	public void Bpayment() throws InterruptedException {
		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(username);
		lpo.setPassword(password);
		lpo.clickSubmit();
		Thread.sleep(3000);

		BillPage bp = new BillPage(driver);
		bp.ClickMenu();
		bp.ClickSmenu();
		bp.setRegno("15201128");
		bp.setsemester();
		bp.FileLink();
		Thread.sleep(3000);
		String expectedtitle2 = "Student Bill & Payment History";
		String actualtitle2 = driver.getTitle();
		System.out.println(actualtitle2);
		if (actualtitle2.equals(expectedtitle2)) {
			System.out.println("passed");
		} else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		System.out.println("test case pass");
	}
}
