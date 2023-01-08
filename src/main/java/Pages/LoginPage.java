package Pages;

import org.openqa.selenium.By;

import Utilities.Baseclass;

public class LoginPage extends Baseclass {
	
	public By login_username=By.xpath("//input[@type='text']");
	public By login_password=By.xpath("//input[@type='password']");
	public By login_loginbuttn=By.xpath("//div[text()='Login']");
	
	public void getlogin(String username,String password)
	{
		sendkeys(login_username,username);
		sendkeys(login_password,password);
		click(login_loginbuttn);
	}
	
	

}
