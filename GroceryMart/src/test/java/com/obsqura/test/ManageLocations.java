package com.obsqura.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class ManageLocations extends BaseTest{
	@Test
	public void Location() throws IOException {
		
	lp.Login();
	hp.navigateToManageLocation();
	pl.AddLocation();
	
	

}}
