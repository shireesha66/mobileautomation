package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.HomePage;

public class HomePageTest extends BaseTest {

	HomePage hp;
	
//	@BeforeMethod
//	public void getDriver(String Platformtype) {
//		Platformtype="Android";
//		UiAutomator2Options uio = new UiAutomator2Options();
//		driver = new AndroidDriver(uio);
//	}
//	
	
	@Test
	public void TapOnProduct_tc01() {
		HomePage hp = new HomePage(driver);
		hp.firstproduct.click();
	}
	
}
