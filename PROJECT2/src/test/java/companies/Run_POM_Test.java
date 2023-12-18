package companies;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Run_POM_Test {
	
	public void Start()
	{
		WebDriver cd=new ChromeDriver();
		cd.get("https://demowebshop.tricentis.com/");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Log_reg_Test l1=new Log_reg_Test();
		l1.getRegister().click();
		Reg_Page_Test r1=new Reg_Page_Test();
		r1.getEmail().sendKeys("lini.ba@testyantra.com");
		r1.getPass().sendKeys("LINIBasok8800@");
		
		
	}

}
