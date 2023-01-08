package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
	public static WebDriver driver;
	
	public void openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome 80\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
	}
	
	public String readConfig(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(".\\Configuration\\Config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	
	public void openApplication(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void sendkeys(By by,String text)
	{
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(text);
		
	}

	public void click(By by)
	{
	driver.findElement(by).click();
	
}
}