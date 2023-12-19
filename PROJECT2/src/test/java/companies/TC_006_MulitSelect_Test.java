package companies;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_006_MulitSelect_Test {
	@Test
	public void MultiSelect() throws Throwable
	{
		WebDriver Cd= new ChromeDriver();
		Cd.manage().window().maximize();
		Cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Cd.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
	WebElement ele=	Cd.findElement(By.xpath("//select[@class='select']"));
	Select MS=new Select(ele);
	Thread.sleep(1000);
	MS.selectByIndex(0);
	MS.selectByIndex(1);
	MS.selectByIndex(2);
	MS.selectByValue("5");
	MS.selectByValue("6");
	MS.deselectByVisibleText("Eight");
	
 	MS.getOptions();
WebElement[] list1;
for(WebElement list:list1)
{
System.out.println(list);
}
	
	}

}
