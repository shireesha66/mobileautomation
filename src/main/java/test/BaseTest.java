package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	public static AppiumDriver driver;
	
	
	public void getDriver(String platformType) {
		
		if(platformType=="android") {
			UiAutomator2Options uio = new UiAutomator2Options();
			driver = new AndroidDriver(uio);
		}else if(platformType=="ios"){
			XCUITestOptions ios = new XCUITestOptions();
			driver = new IOSDriver(ios);
		}
	}
	
	AppiumDriverLocalService service;
	
	@BeforeTest
	public void startUp() {
		
		service = new AppiumServiceBuilder()
				.withAppiumJS(new File("/Users/mahen/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723)
				.build();
		
		 service.start();
	}

	@AfterTest
	public void stop() {
		service.stop();
	}
	
	@Test
	public void launchApp() throws MalformedURLException {
		UiAutomator2Options uio = new UiAutomator2Options();
		uio.setAppActivity(".activities.MainActivity");
		uio.setAppPackage("com.solodroid.solomerce");
		uio.setPlatformVersion("14");
		uio.setPlatformName("android");
		uio.setDeviceName("samsung");
		uio.setUnlockKey("pin");
		uio.setUnlockKey("198319");
		URL host = new URL(" http://127.0.0.1:4723");
		AndroidDriver driver = new AndroidDriver(host, uio);
		System.out.println("application launched");
		
	}
}
