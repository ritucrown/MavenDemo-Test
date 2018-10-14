package MavenDemo.MavemDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	private Properties properties;
	private final String propertiFilePath ="//src//main//java//com//SCBank//dataprovider//configuration.properties";
	
	//Constructor to Load the configuration property file
	public Base() {
		// TODO Auto-generated constructor stub
		BufferedReader reader;
		try {
			System.out.println(System.getProperty("user.dir")+propertiFilePath);
			reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+propertiFilePath));
			properties = new Properties();
			properties.load(reader);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	//Method to get Chrome driver
	public WebDriver getChromeDriver() {
		System.setProperty(getChrome(), getChromeExe());
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	//Method to get Chrome driver
	public WebDriver getFireFoxDriver() {
		System.setProperty(getGecko(),getGeckoExe());
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	//Method to read properties file and get chrome exe file
	public String getChromeExe() {
		String chromePath = properties.getProperty("driver_path");
		if (chromePath!=null) {
			return chromePath;
		}else{
			throw new RuntimeException("Chrome driver path not found in properties file");
		}
	}
	//it Gives the String required to set property for chrome driver
	public String getChrome() {
		String chrome = properties.getProperty("chrome");
		if (chrome!=null) {
			return chrome;
		}else{
			throw new RuntimeException("Chrome driver property not found in properties file");
		}
	}
	//Method to read properties file and get Gecko exe file
	public String getGeckoExe() {
		String geckoPath = properties.getProperty("gecko_path");
		if (geckoPath!=null) {
			return geckoPath;
		}else{
			throw new RuntimeException("Gecko driver path propery not found in properties file");
		}
	}
	//it Gives the String required to set property for gecko driver
	public String getGecko() {
		String gecko = properties.getProperty("gecko");
		if (gecko!=null) {
			return gecko;
		}else{
			throw new RuntimeException("Gecko driver propery not found in properties file");
		}
	}
	//Method to get Login URL from properties file
	public String getLoginURL() {
		String url = properties.getProperty("login_url");
		if (url!=null) {
			return url;
		}else{
			throw new RuntimeException("Login URL not Found in properties file");
		}
	}
	//Method to get Logout URL from properties file
	public String getLogoutURL() {
		String url = properties.getProperty("logout_url");
		if (url!=null) {
			return url;
		}else{
			throw new RuntimeException("Logout URL not Found in properties file");
		}
	}

	public String getExcelFilePath() {
		// TODO Auto-generated method stub
		String excelPath = properties.getProperty("excel_file");
		if (excelPath!=null) {
			return excelPath;
		} else {
			throw new RuntimeException("Excel file not found");
		}
	};
}
