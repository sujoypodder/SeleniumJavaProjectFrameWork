package com.uapucam.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.itextpdf.text.DocumentException;
import com.uapucam.objects.LoginPageObject;

public class TC_Login_001 extends BasisClass {

	@Test
	public void loginTest() throws InterruptedException {
//		driver.get(baseUrl);
		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(username);
		lpo.setPassword(password);
		lpo.clickSubmit();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Home")) {
			Assert.assertTrue(true);
//			PdfGenarate(driver, "loginPass");
		} else {
//			screenshot(driver, "loginFail");
			Assert.assertTrue(false);
		}
	}

}
