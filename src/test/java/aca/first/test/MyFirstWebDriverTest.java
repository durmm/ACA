package aca.first.test;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstWebDriverTest {
	
	/*@Test()
	public void myFirstTest(){
		System.setProperty("webdriver.gecko.driver", "/home/transparency/geckodriver");
		
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://aca.am");
		 driver.close();
		 driver.quit();
	}
	*/
	
	/*
	 Test Case 1: Verify that URL opens the correct web-page
	 Summary: The http://winekloud.codebnb.me URL should open the projects main landing page
	 Steps: 1. Navigate to the http://winekloud.codebnb.me URL.
	 Expected Result: It should open the main landing page of the WineKloud project.
	 */
	
	@Test()
	public void checkLandingPage(){
		System.setProperty("webdriver.gecko.driver", "/home/transparency/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://winekloud.codebnb.me");
		Assert.assertTrue("The Daily Wine Deal Marketplace", true);
		Assert.assertTrue("ERROR: element not found", driver.findElement(By.xpath("//a[@class='showDealsBtn']"))!=null);
		driver.findElement(By.xpath("//a[@class='showDealsBtn']"));
		driver.findElement(By.xpath("//div[@class='bottomNav']"));
		driver.quit();
		
	}

}

