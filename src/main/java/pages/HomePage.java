package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BasePage {

	
	
	public HomePage(AppiumDriver driver) {
		super(driver);
		
	}

//	@iOSXCUITFindBy(accessibility = "")
//	@AndroidFindBy(uiAutomator = "")
//	public WebElement loginButton;
//	
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.solodroid.solomerce:id/product_name'])[1]")
	public WebElement firstproduct;
	
	
	
	
}
