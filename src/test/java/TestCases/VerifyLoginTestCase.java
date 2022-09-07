package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LogInPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifyLoginTestCase extends BaseClass{
	
	@Test
	public void login() throws IOException {
		
		
		LogInPageObjects lpo= new LogInPageObjects(driver);
		lpo.EnterUsename().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickLogin().click();
		
		// Assertion
		
		String expected = TestCaseData.expected;
		String  actual = driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		commonUtilities.handleAssertions(actual, expected);
		
				
		
		
		
		
	}	
	
	

}
