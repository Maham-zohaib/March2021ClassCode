package com.mobile.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchinApp {

	public static void main(String[] args) throws MalformedURLException {

		
		
		AppiumDriver<MobileElement> driver;
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability("appPackage", "com.sec.android.gallery3d");
		//dc.setCapability("appActivity", "com.sec.android.gallery3d.app.Gallery");
		//dc.setCapability("platformName", "Android");
		//dc.setCapability("platformVersion", "10");
		//dc.setCapability("DeviceName", "samsung");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.camera");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.camera.PermissionsActivity");
		dc.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
		
		
		driver = new AndroidDriver<MobileElement>(url, dc);
System.out.println("App Launched");
	}

}
