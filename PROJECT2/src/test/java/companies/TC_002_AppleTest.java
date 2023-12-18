package companies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_002_AppleTest extends TC_001AmazoneTest {
	@Test(groups="smoke")
	public void launchAmazone()
	{
		cd.get("https://www.apple.com/in/");
		Reporter.log("Navigated to Apple",true);
	}


}
