package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Util.PageUtility;

public class PushPage extends PageUtility{
WebDriver driver;

	
	public  PushPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="title")
	private WebElement titleInput;
	
	@FindBy(id="description")
	private WebElement descriptionInput;
	
	@FindBy(css =".btn-block-sm.btn-info")
	private WebElement newBtn;
	
	@FindBy(css = ".alert.alert-success")
	private WebElement alertTextMessageSendSucessfully;
	
	

	public void SavePushNotifications(String title, String description) {
	clickElement(newBtn);
	setTextBox(titleInput,"Java");
	setTextBox(descriptionInput,"java is a object oriented programming language");
	clickElement(newBtn);
}
public String validateNotificationIsCreated() {
		
		String text = getElementText(alertTextMessageSendSucessfully);	
		return text.split("Alert!")[1].trim();

				
					
	}}