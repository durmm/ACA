package aca.first.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	 Test Case 1: Verify that URL opens the correct web-page
	 Summary: The http://winekloud.codebnb.me URL should open the projects main landing page
	 Steps: 1. Navigate to the http://winekloud.codebnb.me URL.
	 Expected Result: It should open the main landing page of the WineKloud project.
	 */
	
	/*@Test()
	public void checkLandingPage(){
		System.setProperty("webdriver.gecko.driver", "/home/transparency/geckodriver");
		
		driver.get("http://winekloud.codebnb.me");
		Assert.assertTrue("The Daily Wine Deal Marketplace", true);
		Assert.assertTrue("ERROR: element not found", driver.findElement(By.xpath("//a[@class='showDealsBtn']"))!=null);
		driver.findElement(By.xpath("//a[@class='showDealsBtn']"));
		driver.findElement(By.xpath("//div[@class='bottomNav']"));
		driver.quit();
		
	}
	*/
	
	/*
	 Test Case 2: Verify that Deal Kloud is available from the landing page.
	 Summary: Deal Kloud page should be available from the landing page via the button
	 Steps: 1. Navigate to the http://winekloud.codebnb.me URL.
	 		2. Click on the "Show me the Deals!" button.
	 Expected Result: Deal Kloud page should be opened.
	 */
	WebDriver driver ;
	@BeforeSuite()
	private void driverInit(){
		System.setProperty("webdriver.gecko.driver", "/home/transparency/geckodriver");
		 driver = new FirefoxDriver();
	}
	@Test
	public void dealKloudViaHome() {
		
		driver.get("http://winekloud.codebnb.me");
		driver.findElement(By.xpath("//a[@class='showDealsBtn']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		//String elementClass = driver.findElement(By.text("Deal Kloud")).getAttribute(class);
		//WebElement elem = driver.findElement(By.linkText("Deal Kloud"));
		Assert.assertEquals("active", driver.findElement(By.linkText("Deal Kloud")).getAttribute("class"));
		//String l = driver.findElement(By.xpath("//p[@class='hero_txt']")).getText();
		//System.out.println(l);
		String pText = driver.findElement(By.xpath("//p[@class ='hero_txt']")).getText();
		boolean textFound = pText.contains("With over 300 brand new Deals every day from more than 1,000 Wine Retailers,");
		Assert.assertTrue(textFound);
//		Assert.assertEquals.getText()'
		driver.close();
		driver.quit();
	}

}

