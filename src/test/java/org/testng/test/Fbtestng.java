package org.testng.test;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Fbtestng extends BaseClass {
	
	
	@BeforeClass
	private void beforeclass() {
		chromebrowser();
		urllaunch("https://www.facebook.com/");
		implicitywait(10);
		maximize();
		System.out.println("beforeclass");
		
	}
	
	@AfterClass
	private void afterclass() {
		driver.close();
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
	
	@Test(priority=0,invocationCount=5)
	private void test3() {
		System.out.println("test3");
	}
	
	@Test(priority=-10)
	public void test4() {
		WebElement txtuser = driver.findElement(By.id("email"));
		sendkeys(txtuser, "mani");
		
		WebElement pass = driver.findElement(By.id("pass"));
		sendkeys(pass, "8989");
		
//		WebElement log = driver.findElement(By.name("login"));
//		click(log);
		System.out.println("test4");
		
		
	}
	@Test(priority=-7)
	public void test5() throws InterruptedException {
        driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement createbtn = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		jeclick(createbtn);
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("mani");
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("maddy");
		
		WebElement cre = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		jeclick(cre);
		
		System.out.println("test5");
		
		
	}
	
	
	
	
	
	

}
