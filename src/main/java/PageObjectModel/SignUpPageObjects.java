package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	public WebDriver driver;
	
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	private By LastName=By.xpath("//input[@name='UserLastName']");
	private By Usermail=By.xpath("//input[@name='UserEmail']");
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	private By Company=By.xpath("//input[@name='CompanyName']");
	private By Employees=By.xpath("//select[@name='CompanyEmployees']");
	private By Phone=By.xpath("//input[@name='UserPhone']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	

	
    public SignUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
		
	}
	public WebElement EnterFirstName () {
	
	return driver.findElement(FirstName);
    }
    public WebElement EnterLastName() {
    return driver.findElement(LastName);
    	
    }
    public WebElement EnterUsermail () {
    return driver.findElement(Usermail);
    
    }
    public WebElement SelectJobTilte () {
    return driver.findElement(JobTitle);
    }
    public WebElement EnterCompany () {
    return driver.findElement(Company);
    }
    public WebElement SelectEmployees () {
    return driver.findElement(Employees);
    }
    public WebElement EnterPhone () {
    return driver.findElement(Phone);
    }
    public WebElement SelectCountry () {
    return driver.findElement(Country);
    }
}
        
        
        
        
        
        
        
        
        
    