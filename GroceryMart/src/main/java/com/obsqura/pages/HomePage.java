package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Util.PageUtility;

public class HomePage extends PageUtility {
WebDriver driver;
	
	public  HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Expense')])[1]")
	private WebElement manangeExpenseBtn;
	
	 ;
	@FindBy(xpath = "//*[contains(text(),'Expense Category')]")
	private WebElement expenseCategoryBtn;
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Delivery Boy')])[1]")
	private WebElement ManageDeliveryBoyBtn;
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Category')])[1]")
	private WebElement manageCategoryBtn;
	
	@FindBy(xpath = "//*[text()='Category']")
	private WebElement manageOrderCategoryBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Push Notifications')]")
	private WebElement pushnotificationsBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Payment Methods')]")
	private WebElement managePaymentBtn;
	
	@FindBy(xpath ="//p[contains(text(),'Admin Users')]")
	private WebElement AdminUsers;
	

	@FindBy(xpath = "//*[contains(text(),'Manage Orders')]")
	private WebElement ManageOrdersBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Manage Location')]")
	private WebElement ManageLocationBtn;
	
	
	public void navigateToExpenseCategory() {
		//manangeExpenseBtn.click();
		//expenseCategoryBtn.click();
		clickElement(manangeExpenseBtn);
		clickElement(expenseCategoryBtn);
	}
	
	public void navigateToManageDeliveryBoy() {
		clickElement(ManageDeliveryBoyBtn);
		
	}
	public void navigateToCategory() {

		clickElement(manageCategoryBtn);
		clickElement(manageOrderCategoryBtn);

	}
	public void navigateToPushNotifications() {
		clickElement(pushnotificationsBtn);

	}
	
	public void navigateToManagePaymentMethods() {
		clickElement(managePaymentBtn);
	}
		
		public void navigateToAdminUsers() {
			clickElement(AdminUsers);

}
		public void navigateToManageOrders() {
			clickElement(ManageOrdersBtn);
			
		}
		

		public void navigateToManageLocation() {
			
			clickElement(ManageLocationBtn);
		}
}
	
	
	


