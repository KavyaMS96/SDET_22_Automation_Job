package com.crm.orgtest;

import org.testng.annotations.Test;

public class OrgTest {
	
	
	@Test
	public void createOrgTest(){
		System.out.println("Execute createOrgTest");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		System.out.println(URL);
		System.out.println(BROWSER);
		
	}
	@Test
	public void editeOrgTest(){
		System.out.println("Execute editOrgTest");
		System.out.println("hi");
		
	}
	
	
	
	
	
	

}

