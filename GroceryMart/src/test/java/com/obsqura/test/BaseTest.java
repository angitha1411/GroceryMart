package com.obsqura.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.reporters.Files;

import com.obsqura.Util.TestProperties;
import com.obsqura.constants.Constants;
import com.obsqura.pages.AdminUsersPage;
import com.obsqura.pages.CategoryPage;
import com.obsqura.pages.DeliveryBoyPage;
import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LocationPage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.OrdersPage;
import com.obsqura.pages.PushPage;

public class BaseTest {
public WebDriver driver=null;

@BeforeMethod(alwaysRun=true)
@Parameters(("browser"))
public void initDriver(@Optional String browser) throws IOException {
	
	if(browser==null|| browser.isEmpty()) {
		 browser = TestProperties.getProperties().getProperty("browser");
		}
	String env= TestProperties.getProperties().getProperty("Environment");
	//System.out.println("env");
	//driver= new EdgeDriver();
	String URL=TestProperties.getProperties().getProperty(env);
	System.out.println("Executing in "+env);

	if(browser.equalsIgnoreCase("Edge")) {
		driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("Firefox")){
		driver = new FirefoxDriver();
	}
	
	
	else {
		System.out.println("Choose correct Browser");
	}

	 driver.manage().window().maximize();
	 initPages();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get(URL);

}

public LoginPage lp;
public HomePage hp;
public ExpenseCategoryPage ecp;
public DeliveryBoyPage dlp;
public CategoryPage sc;
public PushPage pn;
public AdminUsersPage au;
public OrdersPage so;
public LocationPage pl;




public void initPages() {
 lp = new LoginPage(driver);
 hp = new HomePage(driver);
 ecp=new ExpenseCategoryPage(driver);
 dlp=new DeliveryBoyPage(driver);
 sc=new CategoryPage(driver);
 pn=new PushPage(driver);
 au= new AdminUsersPage (driver);
 so= new OrdersPage (driver);
pl=new LocationPage(driver);

}

@AfterMethod(alwaysRun=true)
public void tearDown() {
	//System.out.println("I am in after method");
	driver.quit();
}
public  String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
	TakesScreenshot scrshot=(TakesScreenshot)driver;
	File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
	String path= Constants.WORKINGDIRECTORY+ "//Reports//"+testCaseName+".png";
	File destfile = new File(path);
	FileUtils.copyFile(srcfile, destfile);
	return path;
}
}

 

