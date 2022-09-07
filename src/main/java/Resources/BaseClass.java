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

	public WebDriver driver; // Global declare this variable 
	public Properties prop;// we are declaring this variable as global 
	
	public WebDriver browserLaunch() throws IOException {
		// This will help us to read data.properties 
//FileInputStream fis= new FileInputStream("C:\\Users\\Prashant\\eclipse-workspace\\20thJuneTestNGFramework\\src\\main\\java\\Resources\\data.properties");
		//above line using path from data properties file of same pc but if we want universal path to run on  any pc we shoud use below code insted of above code
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		// This will help us to access the data.properties 
		 prop =new Properties();
		
		prop.load(fis);
	String browserName=	prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("Chrome")) {
		// can launch the browser w/o code & in any version not need driver path 
	WebDriverManager.chromedriver().setup();
	// can launch the browser w/o code & in specific version not need driver path 
//WebDriverManager.chromedriver.version("102.1.0").setup();
	
		driver = new ChromeDriver();

	}else if(browserName.equalsIgnoreCase("Edge")) {
			
	}else if(browserName.equalsIgnoreCase("Firefox")) {
			
	}
	else {
		
		System.out.println("please slect valid browser");
	}
	
	return driver;
	}
	// Modifications for to run this method at first from all codes 
	@BeforeMethod
	
	public void launchBrowser() throws IOException {
	
	browserLaunch();
	driver.get(prop.getProperty("url"));
	
 
}
@AfterMethod
	
	public void teardown() throws IOException {
	
	driver.quit();
	
}}

	