package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public void loginDetails() throws InterruptedException {
		  WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));  //local variable
		  user.sendKeys("tutorial");
		  Thread.sleep(2000);
		  WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		  pass.sendKeys("tutorial");
		  Thread.sleep(2000);
		  WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		  submit.click();
	}

	public LoginPage(WebDriver driver) {  //constructor, passing the parameter driver,calling from  LoginTest
		this.driver=driver;
	}
}
