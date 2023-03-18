package test;

import org.testng.annotations.Test;

import pageObject.FlightsPage;
import utilities.Base;

public class FlightsTest extends Base{
  @Test
  public void flightsVerification() throws InterruptedException {
	//  driver.get("https://demo.guru99.com/test/newtours/reservation.php"); //to avoid ads , or use parameterization in xml
	  FlightsPage fpobj=new FlightsPage(driver);
	  fpobj.flightsPageDetails();
  }
}
