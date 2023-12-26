package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Util.PageUtility;

public class CategoryPage extends PageUtility{
	WebDriver driver;

	
	public  CategoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css =".btn-rounded.btn-primary")
		private WebElement newBtn;
	
	
	@FindBy(css = "[type='text']")
	private WebElement categoryInput;
	
	@FindBy(css =".btn-danger.btn-fix")
	private WebElement newBtn1;
	
	@FindBy(css =".btn-default.btn-fix")
	private WebElement Btn;
	

public void SearchCategory() {
	clickElement(newBtn);
	setTextBox(categoryInput,"Diary Milk");
	clickElement(newBtn1);
	clickElement(Btn);

	
}
	
}
	
	
	


	
	


