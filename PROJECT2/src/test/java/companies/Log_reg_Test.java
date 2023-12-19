package companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log_reg_Test {
	
	public void Log_reg_Test( WebDriver cd)
	{
		PageFactory.initElements(cd,this);
	}
	@FindBy(linkText = "Register")
	private WebElement register;
	public WebElement getRegister() {
		return register;
	}
	public void setRegister(WebElement register) {
		this.register = register;
	}
	@Test
	public void m1()
	{
	Reporter.log("completed");
	}
	

}
