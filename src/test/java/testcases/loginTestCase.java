package testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.Constants;

public class loginTestCase extends BaseClass{
	
	@Test(dataProvider="testData")
	public void launchBrowser(String username, String password) throws IOException {

		LoginPageObjects obj=new LoginPageObjects(driver);
		obj.EnterUsername().sendKeys(username);
		obj.EnterPassword().sendKeys(password);
		obj.ClickOnLogin().click();
		
		WebElement a=driver.findElement(By.xpath("//div[@id='error']"));
		String actualText=a.getText();
		Assert.assertEquals(actualText, Constants.Expected);
		
			
	}
	
	@DataProvider
	public Object[][] testData() {
		Object[][] data=new Object[2][2];
		data[0][0]=Constants.username1;
		data[0][1]=Constants.password1;
		data[1][0]=Constants.username2;
		data[1][1]=Constants.password2;
		
		return data;
		
		
	}
	


}
