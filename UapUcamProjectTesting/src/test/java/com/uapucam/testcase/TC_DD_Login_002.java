package com.uapucam.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.uapucam.objects.LoginPageObject;
import com.uapucam.utilities.XLAvailFile;

public class TC_DD_Login_002 extends BasisClass {

	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(user);
		lpo.setPassword(pwd);
		lpo.clickSubmit();

		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Home")) {
			Assert.assertTrue(true);
			// PdfGenarate(driver,"loginPass");
		} else {
			// screenshot(driver, "loginFail");
			Assert.assertTrue(false);
		}

	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\com\\uapucam\\testdata\\LoginData.xlsx";
		int rownum = XLAvailFile.getRowCount(path, "Sheet1");
		int colcount = XLAvailFile.getCellCount(path, "Sheet1", 1);
		String logindata[][] = new String[rownum][colcount];
		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLAvailFile.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}

}
