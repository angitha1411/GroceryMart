package com.obsqura.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.Util.RandomNumberUtility;
import com.obsqura.Util.UniqueGenerator;

public class PushNotifications extends BaseTest {
	@Test
	public void PushNotifications() throws IOException {
	lp.Login();
	hp. navigateToPushNotifications();
	String title =UniqueGenerator.getUniqueString();
	String description = RandomNumberUtility.getRandomString();
	
	pn.SavePushNotifications(title,description);
	String actualNotificationMsg = pn.validateNotificationIsCreated();
	
	Assert.assertEquals(actualNotificationMsg, "Message send successfully", "Failed to match  alert Text");

	
	}}

	
	
	