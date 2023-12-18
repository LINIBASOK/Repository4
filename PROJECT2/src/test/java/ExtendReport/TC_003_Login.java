package ExtendReport;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.generalutility.BaseUtility;
import com.sun.org.apache.bcel.internal.classfile.Method;

public class TC_003_Login extends BaseUtility {
	
	@Test
	public void Login(Method method) throws Throwable {
		
	Thread.sleep(1000);
	cd.findElement(By.id("Email")).sendKeys("lini.ba@testyantra.com");
	cd.findElement(By.id("Password")).sendKeys("LINIBasok8800@");
	cd.findElement(By.xpath("//input[@value='Log in']")).click();
	String Actual=cd.getCurrentUrl();
	System.out.println(Actual+"actual url");
	String expected="https://demowebshop.tricentis.com/";
	System.out.println(expected+"expected url");
	Assert.assertEquals(Actual, expected," verification failed");
	ExtentTest test=report.createTest(method.getName());
	test.log(Status.PASS, "User naviagted to the homepage");
	

	}
}