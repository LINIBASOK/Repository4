package companies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_004_DropDown {
@Test
public void DropDown() throws Throwable {
	

	WebDriver Cd= new ChromeDriver();
	Cd.manage().window().maximize();
	Cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Cd.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement ele=Cd.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	ele.click();
	Thread.sleep(1000);
	Select DD=new Select(ele);
	DD.selectByVisibleText("JAVA");
	
	
	DD.selectByValue("python");
	DD.selectByIndex(3);
	Assert.assertEquals(DD.isMultiple(), false);
	Reporter.log("script eneded",true);
	
	
	
	
}
}