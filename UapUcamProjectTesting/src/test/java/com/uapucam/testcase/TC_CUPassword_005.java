package com.uapucam.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.uapucam.objects.CUPasswordPage;
import com.uapucam.objects.LoginPageObject;

public class TC_CUPassword_005 extends BasisClass {

	@Test
	public void changeUpdate() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(username);
		lpo.setPassword(password);
		lpo.clickSubmit();
		Thread.sleep(3000);

		CUPasswordPage cu = new CUPasswordPage(driver);
		cu.ClickCpass();
		cu.ClickUpass();
		cu.setCurrentpass("15201128");
		Thread.sleep(1000);
		cu.setNewpass("15201129");
		Thread.sleep(1000);
		cu.setRetypepass("15201129");
		Thread.sleep(1000);
		cu.Updatebtn();
		Thread.sleep(2000);
		String expectedmsg1 = "password must be contain atlest one number, one usercase character and one lowercase character";
		WebElement msg1 = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContainer_lblMsg\"]"));
		String actualmsg1 = msg1.getText();
		if (actualmsg1.equals(expectedmsg1)) {
			System.out.println("testcase pass");
		} else {
			System.out.println("testcase fail");
		}
		Thread.sleep(3000);
	}
}
