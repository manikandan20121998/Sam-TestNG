package org.rough;

import java.util.Date;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrintSearchSug extends BaseClass {
	
	@BeforeClass
	public static void beforeclass() {
		chromebrowser();
		urllaunch("https://www.amazon.in/");
		implicitywait(10);
		maximize();
		
	}
	@BeforeMethod
	public void beforemethod() {
		Date d=new Date();
		System.out.println("test start time"+d);
	}
	
	@AfterClass
	public static void afterclass() {
		//driver.close();
	}
	@AfterMethod
	public void aftermethod() {
		Date d=new Date();
		System.out.println("test end time"+d);
	}
	
	@Test
	private void Test1() throws InterruptedException {
		WebElement ser = driver.findElement(By.id("twotabsearchtextbox"));
		ser.sendKeys("vivo");
		Thread.sleep(3000);
		List<WebElement> sug = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		
	
	for (WebElement x:sug) {
		System.out.println(x.getText());
	}
	
	}
	
	
	
	
	
	
	
	

}
