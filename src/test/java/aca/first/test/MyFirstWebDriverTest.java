package aca.first.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MyFirstWebDriverTest {
	
	WebDriver driver;
	
	@BeforeTest()
	private void driverInit(){
		System.setProperty("webdriver.gecko.driver", "/home/transparency/geckodriver");
		driver = new FirefoxDriver();
	}	
		
	/*
	@Test()
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
	public void checkLandingPage() {
		driver.get("http://winekloud.codebnb.me");
		Assert.assertTrue("The Daily Wine Deal Marketplace", true);
		Assert.assertTrue("ERROR: element not found", driver.findElement(By.xpath("//a[@class='showDealsBtn']"))!=null);
		driver.findElement(By.xpath("//a[@class='showDealsBtn']"));
		driver.findElement(By.xpath("//div[@class='bottomNav']"));
		driver.close();
//		driver.quit();				
	}
		
	/*
	 Test Case 2: Verify that Deal Kloud is available from the landing page.
	 Summary: Deal Kloud page should be available from the landing page via the button
	 Steps: 1. Navigate to the http://winekloud.codebnb.me URL.
	 		2. Click on the "Show me the Deals!" button.
	 Expected Result: Deal Kloud page should be opened.
	 */
	
	
	@Test()
	public void dealKloudViaHome() throws InterruptedException {		
		driver.get("http://winekloud.codebnb.me");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='showDealsBtn']")).click();				
		//String elementClass = driver.findElement(By.text("Deal Kloud")).getAttribute(class);
		//WebElement elem = driver.findElement(By.linkText("Deal Kloud"));
		Thread.sleep(2000);
		Assert.assertEquals("active", driver.findElement(By.linkText("Deal Kloud")).getAttribute("class"));
		//String l = driver.findElement(By.xpath("//p[@class='hero_txt']")).getText();
		//System.out.println(l);
		String pText = driver.findElement(By.xpath("//p[@class ='hero_txt']")).getText();
		boolean textFound = pText.contains("With over 300 brand new Deals every day from more than 1,000 Wine Retailers,");
		Assert.assertTrue(textFound);
//		Assert.assertEquals.getText()'
		driver.close();
//		driver.quit();
	}
	
	/*
	 Test Case 3: Contact page from home page bottom navigation menu
	 Summary: The contact page should be opened from home page bottom navigation menu, providing 5 emails.
	 Steps: 1. Navigate to the http://winekloud.codebnb.me URL.
	 		2. Click on the "Contact" item on bottom navigation menu.
	 Expected Result: It should open the contact page, providing 5 emails.
	 */
	
	@Test()
	public void contactViaHome() throws InterruptedException{
		driver.get("http://winekloud.codebnb.me");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='clearAfter']/ul[1]/li[3]/a")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed());
		Assert.assertEquals(5, driver.findElements(By.xpath("//a[contains(@href, 'mailto')]")).size());
		driver.close();
//		driver.quit();
	}
	
	/*
	 Test Case 4: Facebook link on home page bottom navigation menu
	 Summary: The facebook icon on home page bottom navigation menu should open WineKloud facebook page
	 Steps: 1. Navigate to the http://winekloud.codebnb.me URL;
	 		2. Click on the facebook icon on bottom navigtion menu.
	 Expected Result: WineKloud facebook page should be opened (facebook.com/winekloud)
	 */
	
	@Test()
	public void fbLinkHome() throws InterruptedException {
		driver.get("http://winekloud.codebnb.me");
		driver.findElement(By.xpath("//div[@class='clearAfter']/ul[2]/li[1]/a")).click();
		Thread.sleep(2000);
		Assert.assertEquals("https://www.facebook.com/winekloud", driver.getCurrentUrl());
		driver.close();
		driver.quit();	
	}
	
//	@Test
//	public void loginFromMyKloud() {
//		
//		driver.get("http://winekloud.codebnb.me");
//		driver.findElement(By.xpath("//a[@class='showDealsBtn']")).click();
//		driver.findElement(By.className("my_kloud")).click();
//		driver.findElement(By.className("Wine Tracker")).click();
//		Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(), "Track a wine or retailer.");
//		Assert.assertEquals(driver.findElement(By.className("forMembersOnly")).getText(), "(Free Account Required)");
//		driver.findElement(By.className("txtBtn")).click();
////		Assert.assertThat(driver.findElement(By.className("form-box-inner group")).isPresent);
		
//	}
	
	@Test()
	public void dealSearch() throws InterruptedException {
		driver.get("http://winekloud.codebnb.me");
		driver.findElement(By.xpath("//a[@class='showDealsBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("fa fa-search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("srch-term")).sendKeys("some wine");
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());
		driver.findElement(By.className("close open")).click();
		driver.findElement(By.id("country")).sendKeys("some country");
		driver.findElement(By.id("vintage")).sendKeys("no idea");
		driver.findElement(By.id("state")).sendKeys("SS");
//		WebElement priceMinRange = driver.findElement(By.xpath("//div[@class='range-inner group'][1]/span/span[6]"))
		Actions move = new Actions(driver);
		move.dragAndDropBy(driver.findElement(By.xpath("//div[@class='range-inner group'][1]/span/span[6]")), 20, 0).build().perform();
		move.dragAndDropBy(driver.findElement(By.xpath("//div[@class='range-inner group'][1]/span/span[7]")), 50, 0).build().perform();
		
		
	}

}

//try {
//	Thread.sleep(2000);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}

