package com.generalutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass_1 {
	@BeforeClass
	public void createDriver()
	{
		WebDriver cd=new ChromeDriver();
		
		
	}

}
