package My_practice2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass_Test {
	Web
	@BeforeSuite
	public void extentReport() {
		ExtentSparkReporter spark=new  ExtentSparkReporter("./REPORTER/report2.html");
		ExtentReports report=new ExtentReports();
		
	}
	@BeforeTest
	public void Driver() {
	
		cd.get("");
		
		
		
	}
	@AfterSuite
	public void CloseFun() {
		cd.quit();
		
	}
	
	

}
