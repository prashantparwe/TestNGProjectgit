package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObjects {
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By LoginButton=By.xpath("//input[@id='Login']");
	private By TryForFree=By.xpath("//a[@id='signup_link']");
	
	
	// This line is added for git demo purpose
	public LogInPageObjects(WebDriver driver2) {
		// Created above constructor 
		this.driver=driver2;
	}
	public WebElement EnterUsename () {
		
		return driver.findElement(username);
		
	}
    public WebElement EnterPassword () {
		
		return driver.findElement(password);
	

    }
    public WebElement ClickLogin () {
	
	return driver.findElement(LoginButton);
	
    }
    public WebElement ClickonTryForFree () {
    	
    	return driver.findElement(TryForFree);
    	
    }
}


