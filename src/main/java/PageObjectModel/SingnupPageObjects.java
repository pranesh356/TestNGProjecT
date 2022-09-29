package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingnupPageObjects {
	
public WebDriver driver;
	
	By firstName=By.xpath("//input[@name='UserFirstName']");
	By jobTitle=By.xpath("//select[@name='UserTitle']");
	
	
	
	
	public SingnupPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EnterFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement selectJobTitle() {
		return driver.findElement(jobTitle);
	}
	
	
	
	

}
