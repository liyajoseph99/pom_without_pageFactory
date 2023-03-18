package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage {
	
	public WebDriver driver;
	
	public void flightsPageDetails() throws InterruptedException {
		Thread.sleep(2000);
		WebElement flights=driver.findElement(By.xpath("//a[text()='Flights']"));
		flights.click();
		Thread.sleep(7000);
		
		//WebElement iframe=driver.findElement(By.id("ad_iframe"));
		/*WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));  //explicit wait
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(11));     //iframe handling
		WebElement dismiss=driver.findElement(By.cssSelector("div#dismiss-button"));
		dismiss.click();
		Thread.sleep(2000);*/
		
		List<WebElement>obj=driver.findElements(By.xpath("//input[@name='tripType']"));//return all the elements.if radiobuttons having same xpath.
		obj.get(0).click();
		Thread.sleep(2000);
		
		WebElement passenger=driver.findElement(By.xpath("//select[@name='passCount']"));
		Select obj1=new Select(passenger);
		obj1.selectByIndex(1);                 
		Thread.sleep(2000);
		
		WebElement depart=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select obj2=new Select(depart);
		obj2.selectByValue("London");  
		Thread.sleep(2000);
		
		WebElement continu=driver.findElement(By.xpath("//input[@name='findFlights']"));
		continu.click();
	}
	
	public FlightsPage(WebDriver driver) {
		this.driver=driver;
	}

}
