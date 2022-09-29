package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public WebDriver driverInitializtion() throws IOException {
	 //To read the properties file
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		//To access the properties file
		prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		
		if(browserName.contentEquals("chrome")) {
//WebDriverManager.chromedriver().browserVersion("79.0.9").setup(); //To run  specic chrome driver	
			   WebDriverManager.chromedriver().setup(); // This will run with latest version
		         driver = new ChromeDriver();    
			
		}
		else if(browserName.contentEquals("fireFox")) {
			
			//Firefox driver code
		}
		
       else if(browserName.contentEquals("edge")) {
			
			//edge driver code
		}
       else {
    	   System.out.println("Please choose valid browser to launch");
       }
		
		return driver;
	
		
	}
	
	@BeforeMethod
	public void launchChromeBrowser() throws IOException {
		driver=driverInitializtion();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void closeBrowser() throws IOException {
		driver.close();
	}
	
	
	
	

}
