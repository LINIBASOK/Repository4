package My_practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Test {
	public WebElement cd;
	@Parameters("browsers")
	@Test
	public void Cross_Browsing(@Optional String bname="chrome") {
	
	if(bname.equalsIgnoreCase("chrome")) {
		WebDriver cd=new ChromeDriver();
		
		
	}
	else if(bname.equalsIgnoreCase("edge")) {
		WebDriver cd=new ChromeDriver();
	}
		((WebDriver) cd).get("https://demowebshop.tricentis.com/login") ;
		
	}

}
