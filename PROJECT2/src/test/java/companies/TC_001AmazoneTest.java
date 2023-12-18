package companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001AmazoneTest {
	WebDriver cd= new ChromeDriver();
	@Test(groups="smoke")
	public void launchAmazone()
	{
		cd.get("ttps://www.amazon.com");
		Reporter.log("Navigated to Amazone",true);
	}

}
