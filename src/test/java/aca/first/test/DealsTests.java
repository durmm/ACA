package aca.first.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import aca.first.pageobject.DealsSearchSlider;

public class DealsTests {
	
	WebDriver driver;
	DealsSearchSlider deals = new DealsSearchSlider(driver);
	
	@BeforeTest()
	public  void init(){
		driver = new FirefoxDriver();
		driver.get("http://winekloud.codebnb.me/deals");
	}
	
//	@AfterTest()
//	deals.close();
//	deals.quit();
	
	@Test()
	public void searchAWine() {
		deals.expandSearchForm();
		deals.enterSearchKeyword("pomegrant");
		deals.enterCountry("Armenia");
		deals.proceedSearch();
	}
	

}
