package com.uapucam.testcase;

import org.testng.annotations.Test;

import com.uapucam.objects.LoginPageObject;
import com.uapucam.objects.ResultPage;

public class TC_Result_008 extends BasisClass {

	@Test
	public void courseresult() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(username);
		lpo.setPassword(password);
		lpo.clickSubmit();
		Thread.sleep(3000);

		ResultPage rcp = new ResultPage(driver);
		rcp.ClickReslt();
		rcp.ClickResltHistory();
		rcp.setRegno("15201128");
		rcp.setSemester();
		Thread.sleep(2000);
		String expectedtitle3 = "Student Course Result";
		String actualtitle3 = driver.getTitle();
		System.out.println(actualtitle3);
		if (actualtitle3.equals(expectedtitle3)) {
			System.out.println("passed");
		} else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		System.out.println("testcase completed");
	}

}
