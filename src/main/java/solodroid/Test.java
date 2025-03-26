package solodroid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Test {
	
	// desired capabilities or UIautomator2Options(to launch app on mobile device we need to set these)
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
	
	UiAutomator2Options uio = new UiAutomator2Options();
	uio.setAppActivity(".activities.MainActivity");
	uio.setAppPackage("com.solodroid.solomerce");
	uio.setPlatformVersion("14");
	uio.setPlatformName("android");
	uio.setDeviceName("samsung");
	URL host = new URL(" http://127.0.0.1:4723");
	AndroidDriver driver = new AndroidDriver(host, uio);
	System.out.println("application launched");
	
/*	//tap
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.solodroid.solomerce:id/product_name'])[1]")).click();
	
	driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/product_image")).click(); */
	/*swipe(pointerdown=touching with finger, pointerup=finger releasing, pointer move = how much duration we need to move finger)
	// element that is visible on screen is called viewport*/
	
/*	PointerInput finger = new PointerInput(Kind.TOUCH, "0");
	Sequence s = new Sequence(finger, 0);
	
	s.addAction(finger.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 900, 1000))
	.addAction(finger.createPointerDown(0))
	.addAction(finger.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 90, 1000))
	.addAction(finger.createPointerUp(0));
	
	driver.perform(Arrays.asList(s));
	 //right swipe
	PointerInput finger1 = new PointerInput(Kind.TOUCH, "0");
	Sequence s1 = new Sequence(finger1, 0);
	
	s1.addAction(finger1.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 50, 1160))
	.addAction(finger1.createPointerDown(0))
	.addAction(finger1.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 900, 1160))
	.addAction(finger1.createPointerUp(0));
	
	driver.perform(Arrays.asList(s1));
	
	//swipeup(scroll up)
	
	PointerInput finger2 = new PointerInput(Kind.TOUCH, "0");
	Sequence s2 = new Sequence(finger2, 0);
	
	s2.addAction(finger2.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 560, 1700))
	.addAction(finger2.createPointerDown(0))
	.addAction(finger2.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 560, 800))
	.addAction(finger2.createPointerUp(0));
	
	driver.perform(Arrays.asList(s2));
	
	//swipe down(scroll down)
	PointerInput finger3 = new PointerInput(Kind.TOUCH, "0");
	Sequence s3 = new Sequence(finger3, 0);
	
	s3.addAction(finger3.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 560, 660))
	.addAction(finger3.createPointerDown(0))
	.addAction(finger3.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 560, 1660))
	.addAction(finger3.createPointerUp(0));
	
	driver.perform(Arrays.asList(s3));  */
	
	//pinch(zoom in)
	
	
	/* Thread.sleep(4000);
	PointerInput finger4 = new PointerInput(Kind.TOUCH, "0");
	Sequence s4 = new Sequence(finger4, 0);
	s4.addAction(finger4.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 600, 960))
	.addAction(finger4.createPointerDown(0))
	.addAction(finger4.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 600, 300))
	.addAction(finger4.createPointerUp(0));
	
	
	
	PointerInput finger5 = new PointerInput(Kind.TOUCH, "1");
	Sequence s5 = new Sequence(finger5, 0);
	s5.addAction(finger5.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 610, 1660))
	.addAction(finger5.createPointerDown(0))
	.addAction(finger5.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 610, 2360))
	.addAction(finger5.createPointerUp(0));
	
	driver.perform(Arrays.asList(s4 , s5));
	
	
	//pinch(zoom out)

	Thread.sleep(2000);
	PointerInput finger6 = new PointerInput(PointerInput.Kind.TOUCH, "2"); // Upper finger
	Sequence s6 = new Sequence(finger6, 0);
	s6.addAction(finger6.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 600, 2360)) // Start far apart
	  .addAction(finger6.createPointerDown(0))
	  .addAction(finger6.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 600, 1660)) // Move upward (closer)
	  .addAction(finger6.createPointerUp(0));

	PointerInput finger7 = new PointerInput(PointerInput.Kind.TOUCH, "3"); // Lower finger
	Sequence s7 = new Sequence(finger7, 0);
	s7.addAction(finger7.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 610, 1660)) // Start far apart
	  .addAction(finger7.createPointerDown(0))
	  .addAction(finger7.createPointerMove(Duration.ofMillis(700), Origin.viewport(), 610, 2360)) // Move downward (closer)
	  .addAction(finger7.createPointerUp(0));

	driver.perform(Arrays.asList(s6, s7)); */


	//drag and drop
	
	//long press: pointer driver for 5 sec, then pointer up
	
	//sendkeys
//	driver.findElement(AppiumBy.accessibilityId("Search…")).click();
//	driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/search_src_text")).sendKeys("Baby");
//	driver.hideKeyboard();
//	driver.runAppInBackground(Duration.ofSeconds(10));  
	
	//screen rotation
//	if(driver.getOrientation().equals(ScreenOrientation.PORTRAIT)) {
//		driver.rotate(ScreenOrientation.LANDSCAPE);
//	}
	
//	driver.lockDevice();
//	driver.unlockDevice();
//	
//	driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	
	// by using androiduiselector class locating element
	
//	WebElement product=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Samsung Galaxy S10 - Black\")"));
//	product.click();
//	
	WebElement product1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.solodroid.solomerce:id/product_name\")"));
    product1.click();
//    
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()"
    +".resourceId(\"com.solodroid.solomerce:id/recycler_view\")).flingForward()"
    		+".scrollIntoView(new UiSelector()"+".text(\"Animal Jumpsuit for Newborn Baby\"))")).click();
	
	         
    
       //select -> new UiSelector().resourceId("name")
       //scrollable - UIScrollable
    
      // new UiScrollable(select element).flingForward().scrollIntoView(Select element).click();
	
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
     wait.until(ExpectedConditions.visibilityOf(product1)); 
	}	
	
	
}