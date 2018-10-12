package MavenDemo.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import MavenDemo.MavemDemo.Base;

public class LogoutTest extends Base   {
	WebDriver driver;
  @Test
  public void logoutTest() {
	  System.out.println("Logout Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://ibank.standardchartered.co.in/nfs/logout.htm");
	  System.out.println("before Method is this");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method is this");
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Class\\Setup_64Bit\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  System.out.println("Before Test is this");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test is this");
  }

}
