package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	//This driver dont have any scope
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	
	
	public LoginPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement EnterUsername() {
		return driver.findElement(username);	
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(password);	
	}
	
	public WebElement ClickOnLogin() {
		return driver.findElement(login);	
	}
	
	public WebElement ClickOnTyyForFree() {
		return driver.findElement(tryForFree);	
	}
	
	
	
	

}
