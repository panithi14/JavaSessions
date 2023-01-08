package Corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\Chrome 80\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.computerhope.com/issues/ch000075.htm");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.linkText("CSS and HTML color help and support."));
		
		JavaScriptExecutor js=(JavaScriptExecutor)driver;
	       ((JavascriptExecutor) js).executeScript("arguments[0],click()",element);
		
		
		

	}

}
