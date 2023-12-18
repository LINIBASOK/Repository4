package com.generalutility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentRport3 {
	WebDriver cd=new ChromeDriver();
	TakesScreenshot ts= (TakesScreenshot)cd;
	String path=ts.getScreenshotAs(OutputType.BASE64);
	
	@Test
	public void TestATest()
	{
		
		   ExtentSparkReporter spark= new ExtentSparkReporter("./REPORTER/screenshot3.htmml");
		   spark.config().setTheme(Theme.DARK);
		   spark.config().setDocumentTitle("MYREPORT");
		   ExtentReports report =new ExtentReports();
		   report.attachReporter(spark);
		   ExtentTest test=report.createTest("ExtentRport3");
		   test.log(Status.PASS,"test is passed");
		   test.log(Status.INFO, "screenshot is attached");
		   test.addScreenCaptureFromBase64String(path,"errormsg");
		   report.flush();
		   
		
		
		
		
		
		
	}
	

}
