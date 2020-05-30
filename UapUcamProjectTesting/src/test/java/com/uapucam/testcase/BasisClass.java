package com.uapucam.testcase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.uapucam.utilities.ReadConfigFile;

public class BasisClass {

	ReadConfigFile rcf = new ReadConfigFile();
	public String baseUrl = rcf.getUrl();
	public String username = rcf.getUsername();
	public String password = rcf.getPassword();
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", rcf.getChromepath());
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", rcf.getFirefoxpath());
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		// driver.close();
		driver.quit();
	}

	public void screenshot(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/SshotFolder/" + name + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}

	public void PdfGenarate(WebDriver driver, String pdfname)
			throws DocumentException, MalformedURLException, IOException {

		byte[] input = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Document doc = new Document();
		String output = System.getProperty("user.dir") + "/PdfFolder/" + pdfname + ".pdf";
		FileOutputStream fos = new FileOutputStream(output);
		PdfWriter writer = PdfWriter.getInstance(doc, fos);
		writer.open();
		doc.open();
		Image img = Image.getInstance(input);
		img.scaleToFit(PageSize.A4.getWidth() / 2, PageSize.A4.getHeight() / 2);
		doc.add(img);
		doc.add(new Paragraph(" "));
		doc.close();
		writer.close();
		System.out.println("pdf created");
	}

}
