package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Util.PageUtility;

public class LocationPage extends PageUtility {
WebDriver driver;

	
	public  LocationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
}
	@FindBy(css = ".btn-rounded.btn-danger")
	private WebElement newBtn;

	@FindBy(id = "country_id")
	private WebElement countryidSelectDropdown;
	
	@FindBy(id = "st_id")
	private WebElement stidSelectDropdown;
	

	@FindBy(id="location")
	private WebElement locationInput;
	
	@FindBy(id="delivery")
	private WebElement deliveryInput;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement Btn;


	
	public void AddLocation() {
		clickElement(newBtn);
		selectDropdown(countryidSelectDropdown,"United Kingdom");
		selectDropdown(stidSelectDropdown,"Bedfordshire");
		setTextBox(locationInput,"uk");
		setTextBox(deliveryInput,"457892");
		clickElement(Btn);


	}



	}