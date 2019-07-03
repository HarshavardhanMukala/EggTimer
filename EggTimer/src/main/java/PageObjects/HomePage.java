package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	By StartTimerFeild = By.id("start_a_timer");
	By GoButton=By.id("timergo");
	By HomeImage=By.xpath("//div[@id='header']//h1//img");
	By StartTime=By.xpath("//label[contains(text(),'Start a timer')]");
	
	public WebElement StartTimer()
	{
	return driver.findElement(StartTimerFeild);
	}
	public WebElement Go()
	{
	return driver.findElement(GoButton);
	}
	public WebElement HomeImageCheck()
	{
	return driver.findElement(HomeImage);
	}
	public WebElement StartTimeCheck()
	{
	return driver.findElement(StartTime);
	}
	
	
	}
	
	

