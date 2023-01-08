package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utilities.Baseclass;

public class TC_01 extends Baseclass {

	
	@BeforeMethod
	
	public void beforemethod() throws Throwable
	{
		openBrowser(readConfig("browser"));
		openApplication(readConfig("url"));
		
	}
	
	@Test
	public void test() 
	{
		try {
			
		
		LoginPage login=new LoginPage();
		login.getlogin(readConfig("username"),readConfig("password"));
		
	}catch(Throwable e)
		{
		e.printStackTrace();
		}

}
}