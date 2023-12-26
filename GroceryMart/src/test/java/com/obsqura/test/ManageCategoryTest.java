package com.obsqura.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class ManageCategoryTest extends BaseTest{
	
@Test
	public void Category() throws IOException {
		lp.Login();
		hp.navigateToCategory();
		
		sc.SearchCategory();
		
		
		
		
}}
