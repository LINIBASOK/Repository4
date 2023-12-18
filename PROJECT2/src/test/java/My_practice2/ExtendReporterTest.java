package My_practice2;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterTest{
	

WebDriver cd=new ChromeDriver();


	@Test
	public void Login(Method method) {
		cd.get("https://demowebshop.tricentis.com/");
	cd.manage().window().maximize();
	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	TakesScreenshot ts=(TakesScreenshot)cd;
	String path=ts.getScreenshotAs(OutputType.BASE64);
	

	
		cd.findElement(By.linkText("Register")).click();
		assertEquals(cd.getCurrentUrl(),false,"nvigationfailed");
		ExtentSparkReporter rep=new ExtentSparkReporter("./REPORTER/screenshot.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(rep);
		ExtentTest test =report.createTest(" ExtendReporterTest");
		test.log(Status.PASS,"navigation is successfuull");
		test.addScreenCaptureFromBase64String(path,"error msg");
		report.flush();
		
		
		
	
		
		
		
		
		
	 

}}
