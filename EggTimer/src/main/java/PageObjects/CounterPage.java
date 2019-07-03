package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CounterPage {
	
	public WebDriver driver;

	public CounterPage(WebDriver driver)
	{
	this.driver=driver;	
	}

	By CounterDisplay = By.xpath("//h2[@id='progressText']");
	
	public WebElement StartTimer1()
	{
	return driver.findElement(CounterDisplay);
	}
	
	
	
}
