package My_practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalutility.BaseClass_1;

public class POM2_Test extends BaseClass_1 {
	@Test
	public  void POM2_Test(WebDriver cd) {
		PageFactory.initElements(cd,this);
		
	}
@FindBy(id="Email")
private WebElement email;
}
