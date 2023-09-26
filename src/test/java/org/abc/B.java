package org.abc;

import org.testng.annotations.Test;

public class B {

	
	@Test
	private void testB1() {
		System.out.println("TestB1");
		System.out.println(Thread.currentThread());
	}
	@Test
	private void TestB2() {
		System.out.println("TestB2");
		System.out.println(Thread.currentThread());
	}
	@Test
	private void TestB3() {
		System.out.println("TestB3");
		System.out.println(Thread.currentThread());
	
	}
	
}
