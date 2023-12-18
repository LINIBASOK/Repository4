package com.generalutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseUtility {
	public static ExtentReports report;
	public static WebDriver cd;
	
	
	@BeforeSuite
	public void configReport() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/extendReport.html");
		 report=new ExtentReports();
		report.attachReporter(spark);
	
		
	}
	@BeforeClass
	public void LaunchBrowser() {
		cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		cd.get("https://demowebshop.tricentis.com/login");
		
	}
	@BeforeMethod
	
	
	/*@AfterClass
	public void Close() {
		cd.close();*/
		
		
	
	@AfterSuite
	public void reportBackup() {
		report.flush();

		
	}

}
