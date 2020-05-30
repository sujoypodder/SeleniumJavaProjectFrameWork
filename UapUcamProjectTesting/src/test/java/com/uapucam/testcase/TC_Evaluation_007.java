package com.uapucam.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.uapucam.objects.EvaluationPage;
import com.uapucam.objects.LoginPageObject;

public class TC_Evaluation_007 extends BasisClass {

	@Test
	public void evluationform() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.setUserName(username);
		lpo.setPassword(password);
		lpo.clickSubmit();
		Thread.sleep(2000);

		EvaluationPage ep = new EvaluationPage(driver);
		ep.Evalink();
		ep.Evatut();
		Thread.sleep(2000);
		String expectedmsg4 = "Student Evaluation Form";
		WebElement msg4 = driver
				.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/div/div[3]/div/div/div/div[1]/h3"));
		String actualmsg4 = msg4.getText();
		if (actualmsg4.equals(expectedmsg4)) {
			System.out.println("got same message");
		} else {
			System.out.println("didn't find this message");
		}
		Thread.sleep(2000);
		String expectedtitle1 = "Course Evaluation";
		String actualtitle1 = driver.getTitle();
		System.out.println(actualtitle1);
		if (actualtitle1.equals(expectedtitle1)) {
			System.out.println("passed");
		} else {
			System.out.println("fail");
		}
		Thread.sleep(2000);

	}
}
