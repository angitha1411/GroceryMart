package com.obsqura.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class ManagePaymentMethods extends BaseTest {
	@Test
	public void  ManagePaymentMethods() throws IOException {
		lp.Login();
		hp.navigateToManagePaymentMethods();
		
	}}

