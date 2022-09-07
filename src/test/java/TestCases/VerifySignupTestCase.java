package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LogInPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifySignupTestCase extends BaseClass{


	@Test
	public void Signup() throws IOException, InterruptedException {
		
		browserLaunch();
		
		driver.get("https://login.salesforce.com/?locale=in");
		LogInPageObjects lpo =new LogInPageObjects (driver);
		lpo.ClickonTryForFree().click();
		
		Thread.sleep(3000);
		
		String actualTitle=driver.getTitle();
		String expectedTitle= TestCaseData.expectedTitle;
		
        commonUtilities.handleAssertions(actualTitle, expectedTitle);
		
		
		
		SignUpPageObjects spo=new SignUpPageObjects(driver);
		
		spo.EnterFirstName().sendKeys("Rahul");
		spo.EnterLastName().sendKeys("Pant");
		Select s=new Select(spo.SelectJobTilte());
		s.selectByIndex(1);
		
		commonUtilities.dropdownHandle(spo.SelectJobTilte(),1);
		spo.EnterUsermail().sendKeys("abcddcab@gmail.com");
		spo.EnterCompany().sendKeys("Infosys");
		spo.EnterPhone().sendKeys("9960278435");
		
		commonUtilities.dropdownHandle(spo.SelectEmployees(),2);
		
		
		
		
	
	
	     	
		
		
		
		
		
	}
}
