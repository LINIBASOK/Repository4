package com.generalutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1Test {
		
	public  POM1Test(WebDriver Cd) {
		PageFactory.initElements(Cd,this);
		
		
	}
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(name="Password")
	private WebElement pass;
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	
	
	

}
