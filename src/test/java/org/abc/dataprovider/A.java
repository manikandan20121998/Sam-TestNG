package org.abc.dataprovider;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	
	@Test
	private void testa1() {
		System.out.println("testa1");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(dataProvider="login")
	private void testa2(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println("testa2");
		System.out.println(Thread.currentThread().getId());
		
		
	}
	
	@Test(dataProvider="register",dataProviderClass=A.class)
	private void testa3(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println("testa3");
		System.out.println(Thread.currentThread().getId());
	}
	
	@DataProvider(name="login",indices= {0,3},parallel=true)
	private Object datas() {
		//datatype varname[][]=new datatype[rowsize][colsize];
		Object[][] o=new Object[][] {
			
			{"mani@123","79889"},//0
			{"mano@123","5655"},//1
			{"maran@123","8878"},//2
			{"maari@123","908"},//3
		};
		return o;	
	}
	@DataProvider(name="register")
	private Object register() {
		Object[][] ob=new Object[][] {
			{"kani","mozhi"},//0
			{"then","mozhi"},//1
			{"pooon","kodi"},//2
			
		
	};
	return ob;
	
	
	
	}
}
