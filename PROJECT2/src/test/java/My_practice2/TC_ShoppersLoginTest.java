package My_practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.generalutility.BaseUtility;

public class TC_ShoppersLoginTest {
	WebDriver cd = new ChromeDriver();

	@Test
	public void datasTransfer() {

		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		cd.get(System.getProperty("url"));
		cd.findElement(By.id("Email")).sendKeys(System.getProperty("EMAIL"));
		cd.findElement(By.id("Password")).sendKeys(System.getProperty("PASS"));
		cd.findElement(By.xpath("//input[@value='Log in']")).click();


	}
}
