package org.abc.dataprovider;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Fbtestng extends BaseClass {
	
	
	@BeforeClass
	private void beforeclass() {
		chromebrowser();
		implicitywait(10);
		maximize();
		System.out.println("beforeclass");
		
	}
	
	@AfterClass
	private void afterclass() {
		driver.quit();
		System.out.println("after class");
	}
	
	@BeforeMethod
	private void beforemethod() {
		Date d=new Date();
		System.out.println("test start time "+d);
		
	}
	
	@AfterMethod
	private void aftermethod() {
		Date d=new Date();
		System.out.println("test end time "+d);
      
	}
	
	@Test(priority=5,invocationCount=5,enabled=false)
	private void test1() {
		System.out.println("test1");
	}
	@Ignore
	@Test(priority=-5)
	private void test2() {
		System.out.println("test2");
	}
	@Ignore
	@Test(priority=0,invocationCount=5)
	private void test3() {
		System.out.println("test3");
	}
	
	@Test(priority=-10,dataProvider="login",dataProviderClass=A.class)
	public void test4(String user,String pass) throws InterruptedException {
		urllaunch("https://www.facebook.com/");
		implicitywait(10);
		maximize();
		WebElement txtuser = driver.findElement(By.id("email"));
		sendkeys(txtuser, user);
		
		WebElement password = driver.findElement(By.id("pass"));
		sendkeys(password, pass);
		
		WebElement log = driver.findElement(By.name("login"));
		click(log);
		Thread.sleep(3000);
		System.out.println("test4");
		
		
	}
	@Test(priority=-7,dataProvider="register",dataProviderClass=A.class)
	public void test5(String firstname,String lastname) throws InterruptedException {
        driver.get("https://www.facebook.com/");
        maximize();
		
		Thread.sleep(3000);
		WebElement createbtn = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		jeclick(createbtn);
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys(firstname);
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys(lastname);
		
		WebElement cre = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		jeclick(cre);
		
		System.out.println("test5");
		
		
	}
	
	
	
	
	
	

}
