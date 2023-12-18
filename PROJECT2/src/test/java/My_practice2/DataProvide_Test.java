package My_practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide_Test {
	@DataProvider(name="datas")
	public Object[][] obj(){
	Object[][] dp=new Object[][]{
		{"lini.ba@testyantra.com","LINIBasok8800@"},
		{"liniasok7@gmail.com","LINO9087@"}
	};
	return dp;
	}
	
	
	@Test(dataProvider  ="datas",groups="smoke")
	public void Login(String username,String pass) throws Throwable {
		WebDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		cd.get("https://www.saucedemo.com/v1/");
		Thread.sleep(1000);
		
		cd.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		cd.findElement(By.id("password")).sendKeys(pass);
		assertEquals(cd.findElement(By.id("login-button")).isDisplayed(), true);
		
	}
		
	
	
		
		

}
	


