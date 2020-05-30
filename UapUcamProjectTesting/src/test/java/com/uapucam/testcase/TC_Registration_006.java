package com.uapucam.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.uapucam.objects.LoginPageObject;
import com.uapucam.objects.RegistrationPage;

public class TC_Registration_006 extends BasisClass {

	@Test
	public void courseregitratin() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(username);
		lpo.setPassword(password);
		lpo.clickSubmit();
		Thread.sleep(3000);

		RegistrationPage rp = new RegistrationPage(driver);
		rp.Reglink();
		rp.setReg("15201128");
		rp.Load();
		// rp.Regtut();
		rp.CompleteCourse();
		Thread.sleep(2000);
		String expectedmsg2 = "List of Completed Courses";
		WebElement msg2 = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContainer_pnlCompletedCourse\"]/div/h4"));
		String actualmsg2 = msg2.getText();
		if (actualmsg2.equals(expectedmsg2)) {
			System.out.println("got same message");
		} else {
			System.out.println("didn't find this message");
		}
		// -----------------
		rp.FeatureCourse();
		Thread.sleep(2000);
		String expectedmsg3 = "List of Future Courses";
		WebElement msg3 = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContainer_pnlRegularCourse\"]/div/h4"));
		String actualmsg3 = msg3.getText();
		if (actualmsg3.equals(expectedmsg3)) {
			System.out.println("got same message");
		} else {
			System.out.println("didn't find this message");
		}
		Thread.sleep(2000);
		String expectedtitle = "Pre Advising (New)";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("passed");
		} else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		System.out.println("testcase done");
	}

}
