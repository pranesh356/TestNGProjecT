package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SingnupPageObjects;
import Resources.BaseClass;
import Resources.Constants;

public class SignupTestCase extends BaseClass{
	
	@Test
	public void launchBrowser() throws IOException, InterruptedException {
		
		//This driver have scope
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
	/*	LoginPageObjects obj=new LoginPageObjects(driver);
		obj.ClickOnTyyForFree().click();*/
		
		Thread.sleep(5000);
		SingnupPageObjects obj1=new SingnupPageObjects(driver);
		obj1.EnterFirstName().sendKeys(Constants.username);
		
		Select s=new Select(obj1.selectJobTitle());
		s.selectByIndex(1);
		
		
	

		
	}

}
