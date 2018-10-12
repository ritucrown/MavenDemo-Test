package MavenDemo.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import MavenDemo.MavemDemo.Base;

public class LoginTest extends Base{
	WebDriver driver;
  @Test
  public void loginTest() {
	  System.out.println("This is login Test");
	  Assert.assertTrue(true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method ");
	  driver.get("https://ibank.standardchartered.co.in/nfs/login.htm");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after Method");
  }
  @BeforeTest
  public void beforeTest(){
	  System.setProperty("webdriver.gecko.driver", "D:\\Class\\Setup_64Bit\\geckodriver.exe");
	  driver = new FirefoxDriver();
	 
	  
  }

}
