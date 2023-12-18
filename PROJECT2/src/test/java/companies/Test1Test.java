package companies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1Test {
	@Test
	public void RecieveData() {
	String url=	System.getProperty("username");
	Reporter.log("executed",true);
	}

}
