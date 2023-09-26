package org.testng.test;

import org.testng.annotations.*;

public class Order {
		
	@BeforeClass
	private void beforeclass() {
		System.out.println("beforeclass");
		
	}
	
	@AfterClass
	private void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	private void beforemethod() {
		System.out.println("boforemethod");
		
	}
	
	@AfterMethod
	private void aftermethod() {
      System.out.println("aftermethod");
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
	
}
