package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonUtilities {
	
	// This is common method for dropdown handle
	public static void dropdownHandle(WebElement dropdownXpath, int index) {
		
		Select s=new Select(dropdownXpath);
		s.selectByIndex(index);
		
		
	}
	
	public static void handleAssertions(String actual,String expected) {
		
		SoftAssert assertion =new SoftAssert();
		assertion.assertEquals(actual, expected);
		assertion.assertAll();
	}

}
