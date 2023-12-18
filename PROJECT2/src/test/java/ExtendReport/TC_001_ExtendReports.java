package ExtendReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_001_ExtendReports {
	@Test
	public void ER() {
		
		//step 1:create instance of ExtendSparkReporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./REPORTER/ExtendReport.html");
		
		//step2:Create instance  of Extend Reports
		ExtentReports report =new ExtentReports();
		
		//step:3 Attach spark reporter to extend report
		report.attachReporter(spark);
		
		//step4: create instanmce of Extent Test
		ExtentTest test=report.createTest("TC_001_ExtendReports");
		
		//step5:Add log message inside extend reports
		test.log(Status.PASS,"log message added into reportr");
		
		//step 6: call the flush () to write the report in destrintion 
		report.flush();
	
		
	}

}
