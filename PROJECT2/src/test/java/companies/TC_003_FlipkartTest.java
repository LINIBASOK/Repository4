package companies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_003_FlipkartTest extends TC_001AmazoneTest  {
	@Test(groups="system")
	public void launchAmazone()
	{
		cd.get("https://www.flipkart.com");
		Reporter.log("Navigated to FlipKart",true);
	}


}
