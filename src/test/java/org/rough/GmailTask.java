package org.rough;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTask extends BaseClass{
	@BeforeClass
	public static  void beforeclass() {
		chromebrowser();
		urllaunch("https://mail.google.com/");
		implicitywait(10);
		maximize();
		
	}
	@BeforeMethod
	public void beforemethod() {
		Date d=new Date();
		System.out.println("test start time"+d);
	}
	
	@AfterClass
	public static void afterclass() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.close();
	}
	@AfterMethod
	public void aftermethod() {
		Date d=new Date();
		System.out.println("test end time"+d);
	}
	
	@Test(enabled=false)
	private void test1() {
		
		WebElement txt = driver.findElement(By.name("q"));
		txt.sendKeys("gmail login",Keys.ENTER);
		
		WebElement cl = driver.findElement(By.xpath("(//a[@class='l'])[1]"));
		cl.click();
		
		WebElement cl2 = driver.findElement(By.xpath("(//a[@tabindex='0'])[4]"));
		cl2.click();
		
		WebElement sign = driver.findElement(By.xpath("//a[text()='Sign in']"));
		sign.click();
		
		WebElement mail = driver.findElement(By.name("identifier"));
		mail.sendKeys("manimaddy978@gmail.com");
		
		String s = getattribute(mail);
//		String attribute = mail.getAttribute("value");
//		System.out.println(attribute);
		System.out.println(s);
	
	}
	@Test
	private void test2() {
		WebElement txt = driver.findElement(By.xpath("//div[contains(text(),'N')]"));
		String text = txt.getText();
		System.out.println(text);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
			
}
