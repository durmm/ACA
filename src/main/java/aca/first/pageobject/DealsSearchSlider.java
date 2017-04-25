package aca.first.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DealsSearchSlider {
	WebDriver driver = new FirefoxDriver();
	
	private WebElement keywordField = driver.findElement(By.id("srch-term"));
	String keyword;
	
	private WebElement varietalChecklist = driver.findElement(By.xpath("//dt[@class='group']/a"));
	
	private WebElement countryField = driver.findElement(By.id("country"));
	String country;
	
	private WebElement vintageField = driver.findElement(By.id("vintage"));
	int vintage;
	
	private WebElement stateField = driver.findElement(By.id("state"));
	String state;
	
	private WebElement priceRangeSlider = driver.findElement(By.xpath("//div[@class='range-wrap fd mt10 group'][1]"));
	private WebElement priceMinRange = driver.findElement(By.xpath("//div[@class='range-inner group'][1]/span/span[6]"));
	private WebElement priceMaxRange = driver.findElement(By.xpath("//div[@class='range-inner group'][1]/span/span[7]"));
	
	private WebElement ratingRangeSlider = driver.findElement(By.xpath("//div[@class='range-wrap fd mt10 group'][2]"));
	private WebElement ratingMinRange = driver.findElement(By.xpath("//div[@class='range-inner group'][2]/span/span[6]"));
	private WebElement ratingMaxRange = driver.findElement(By.xpath("//div[@class='range-inner group'][2]/span/span[7]"));
	
	private WebElement discountRangeSlider = driver.findElement(By.xpath("//div[@class='range-wrap fd mt10 group'][3]"));
	private WebElement discountMinRange = driver.findElement(By.xpath("//div[@class='range-inner group'][3]/span/span[6]"));
	private WebElement discountMaxRange = driver.findElement(By.xpath("//div[@class='range-inner group'][3]/span/span[7]"));
	
	private WebElement beef = driver.findElement(By.xpath("//label[text()='Beef']"));
	private WebElement pork = driver.findElement(By.xpath("//label[text()='Pork']"));
	private WebElement poultry = driver.findElement(By.xpath("//label[text()='Poultry']"));
	private WebElement shellfish = driver.findElement(By.xpath("//label[text()='Shellfish']"));
	private WebElement fish = driver.findElement(By.xpath("//label[text()='Fish']"));
	private WebElement redSauce = driver.findElement(By.xpath("//label[text()='Red Sauce']"));
	private WebElement brownSauce = driver.findElement(By.xpath("//label[text()='Brown Sauce']"));
	private WebElement whiteSauce = driver.findElement(By.xpath("//label[text()='White Sauce']"));
	private WebElement vegetables = driver.findElement(By.xpath("//label[text()='Vegetables']"));
	private WebElement sharpCheese = driver.findElement(By.xpath("//label[text()='Sharp Cheese']"));
	private WebElement mildCheese = driver.findElement(By.xpath("//label[text()='Mild Cheese']"));
	private WebElement dessert = driver.findElement(By.xpath("//label[text()='Dessert']"));
	private WebElement barbecue = driver.findElement(By.xpath("//label[text()='Barbecue']"));
	private WebElement asian = driver.findElement(By.xpath("//label[text()='Asian']"));
	private WebElement indian = driver.findElement(By.xpath("//label[text()='Indian']"));
	private WebElement spanish = driver.findElement(By.xpath("//label[text()='Spanish']"));
	
	private WebElement freeShipping = driver.findElement(By.xpath("//label[@for='free_shipping']"));
	
	private WebElement goButton = driver.findElement(By.id("sliding-go-button"));
}
