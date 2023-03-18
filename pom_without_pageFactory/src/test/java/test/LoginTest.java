package test;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import utilities.Base;

public class LoginTest extends Base {  //extends the Base class, so gets the value driver
	
  @Test
  public void login() throws InterruptedException {
	  LoginPage lpobj=new LoginPage(driver);  //passing the parameter driver to the constructor LoginPage
	  lpobj.loginDetails();
  }
}
