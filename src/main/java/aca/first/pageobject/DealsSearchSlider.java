package aca.first.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DealsSearchSlider {
	WebDriver driver = new FirefoxDriver();
	//efrwerwe
	
	public WebElement expandIcon = driver.findElement(By.className("fa fa-search"));	
	public WebElement keywordField = driver.findElement(By.id("srch-term"));
		
	public WebElement varietalChecklist = driver.findElement(By.xpath("//dt[@class='group']/a"));
	public WebElement barberaVariety = driver.findElement(By.xpath("//input[@value='BARBERA']"));
	
	public WebElement countryField = driver.findElement(By.id("country"));
	String country;
	
	public WebElement vintageField = driver.findElement(By.id("vintage"));
	int vintage;
	
	public WebElement stateField = driver.findElement(By.id("state"));
	String state;
	
	public WebElement priceRangeSlider = driver.findElement(By.xpath("//div[@class='range-wrap fd mt10 group'][1]"));
	public WebElement priceMinRange = driver.findElement(By.xpath("//div[@class='range-inner group'][1]/span/span[6]"));
	public WebElement priceMaxRange = driver.findElement(By.xpath("//div[@class='range-inner group'][1]/span/span[7]"));
	
	public WebElement ratingRangeSlider = driver.findElement(By.xpath("//div[@class='range-wrap fd mt10 group'][2]"));
	public WebElement ratingMinRange = driver.findElement(By.xpath("//div[@class='range-inner group'][2]/span/span[6]"));
	public WebElement ratingMaxRange = driver.findElement(By.xpath("//div[@class='range-inner group'][2]/span/span[7]"));
	
	public WebElement discountRangeSlider = driver.findElement(By.xpath("//div[@class='range-wrap fd mt10 group'][3]"));
	public WebElement discountMinRange = driver.findElement(By.xpath("//div[@class='range-inner group'][3]/span/span[6]"));
	public WebElement discountMaxRange = driver.findElement(By.xpath("//div[@class='range-inner group'][3]/span/span[7]"));
	
	public WebElement beef = driver.findElement(By.xpath("//label[text()='Beef']"));
	public WebElement pork = driver.findElement(By.xpath("//label[text()='Pork']"));
	public WebElement poultry = driver.findElement(By.xpath("//label[text()='Poultry']"));
	public WebElement shellfish = driver.findElement(By.xpath("//label[text()='Shellfish']"));
	public WebElement fish = driver.findElement(By.xpath("//label[text()='Fish']"));
	public WebElement redSauce = driver.findElement(By.xpath("//label[text()='Red Sauce']"));
	public WebElement brownSauce = driver.findElement(By.xpath("//label[text()='Brown Sauce']"));
	public WebElement whiteSauce = driver.findElement(By.xpath("//label[text()='White Sauce']"));
	public WebElement vegetables = driver.findElement(By.xpath("//label[text()='Vegetables']"));
	public WebElement sharpCheese = driver.findElement(By.xpath("//label[text()='Sharp Cheese']"));
	public WebElement mildCheese = driver.findElement(By.xpath("//label[text()='Mild Cheese']"));
	public WebElement dessert = driver.findElement(By.xpath("//label[text()='Dessert']"));
	public WebElement barbecue = driver.findElement(By.xpath("//label[text()='Barbecue']"));
	public WebElement asian = driver.findElement(By.xpath("//label[text()='Asian']"));
	public WebElement indian = driver.findElement(By.xpath("//label[text()='Indian']"));
	public WebElement spanish = driver.findElement(By.xpath("//label[text()='Spanish']"));
	
	public WebElement freeShipping = driver.findElement(By.xpath("//label[@for='free_shipping']"));
	
	public WebElement goButton = driver.findElement(By.id("sliding-go-button"));
	
	public WebElement collapseIcon = driver.findElement(By.className("fa fa-times"));
	
	public void expandSearchForm() {
		expandIcon.click();
		Assert.assertTrue(driver.findElement(By.id("mCSB_1_container")).isDisplayed());	
	}
	
	public void enterSearchKeyword(String keyword){
		keywordField.clear();
		keywordField.sendKeys(keyword);
	}
	
	public void selectVarietyBarbera() {
		varietalChecklist.click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='mutliSelect group']/ul")).isDisplayed());
		barberaVariety.click();
		Assert.assertTrue(barberaVariety.isSelected());
	}
	
	public void enterCountry() {
		countryField.clear();
		countryField.sendKeys(country);
	}
	
	public void proceedSearch() {
		goButton.click();
	}
}
