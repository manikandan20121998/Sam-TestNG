package org.abc;

import org.testng.annotations.Test;

public class A {
	
	@Test
	private void testA1() {
		System.out.println("TestA1");
		System.out.println(Thread.currentThread());
	}
	@Test
	private void TestA2() {
		System.out.println("TestA2");
		System.out.println(Thread.currentThread());
	}
	@Test
	private void TestA3() {
		System.out.println("TestA3");
		System.out.println(Thread.currentThread());
	
	}
	

}
