package ExtendReport;

import java.time.Duration;

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

public class Tc_002_AddScreenShot {
	
	@Test
	public void screenshot() {
		WebDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		cd.get("https://www.extentreports.com");
	
		TakesScreenshot ts=(TakesScreenshot)cd;
		String path=ts.getScreenshotAs(OutputType.BASE64);
		
		//step 1:create instance of ExtendSparkporter
				ExtentSparkReporter spark=new ExtentSparkReporter("./REPORTER/screenshot.html");
				//set title pf the report
				spark.config().setDocumentTitle("Demo Report");
				spark.config().setTheme(Theme.DARK);//standard,dark,
				//step2:Create instance  of Extend Reports
				ExtentReports report =new ExtentReports();
				
				
				//step:3 Attach spark reporter to extend report
				report.attachReporter(spark);
				
				
				//step4: create instanmce of Extent Test
				ExtentTest test=report.createTest("TC_001_ExtendReports");
				//create test() is a non static method present in extent report
				
				
				//step5:Add log message inside extend reports
				test.log(Status.INFO,"add screenshot added into reporter");
				test.addScreenCaptureFromBase64String(path,"error image");
				
				
				
				
				//step 6: call the flush () to write the report in destrintion 
				report.flush();
		
	}
	//open with system ediotor
	

}
