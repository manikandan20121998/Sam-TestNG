package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement log;

	

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return password;
	}

	public WebElement getLog() {
		return log;
	}

}
