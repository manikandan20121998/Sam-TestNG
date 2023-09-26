package org.rough;

import org.testng.annotations.Test;

public class ExceptionHandling {

		
	@Test(expectedExceptions=ArithmeticException.class)	
	public void Excep() {
	    
		System.out.println(4/0);
		
	}	
	
	@Test(expectedExceptions=NullPointerException.class)
	private void test3() {

		String s=null;
		System.out.println(s.length());
	}
	
}
