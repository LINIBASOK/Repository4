package My_practice2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
	@Test
	
	public void login() {
		WebDriver cd =new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		cd.get("https://demowebshop.tricentis.com/");
		String Actual=cd.getCurrentUrl();
		String expected="https://demowebshop.tricentis.com/";
      assertEquals(Actual, expected);

		WebElement ele=cd.findElement(By.id("vote-poll-1"));
		assertEquals(ele.isDisplayed(), true);
		Reporter.log("sucessfully executed",true);
		//soft assert
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(Actual, expected);
		sa.assertEquals(cd.findElement(By.id("newsletter-subscribe-button")).isDisplayed(), true);
		sa.assertAll();
		
		
		
	}

}
