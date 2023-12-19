package companies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_004_Checkbox_Test {
	@Test
	public void CheckBoxes() throws Throwable {
		WebDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		cd.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement ele=cd.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
	
		
		 Thread.sleep(1000);
		 
		 ele.click();
		
		 
		 
	
		
	}

}
