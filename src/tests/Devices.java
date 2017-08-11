package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Devices{
	private AppiumDriver<WebElement> driver = null;
	
	public void setUpDevice(String deviceId,String osVersion,String osName,String appiumPort,String appPackage,String appActivity) {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", deviceId); // Give Device ID of your mobile phone FBAZGU065350WXL,fd303a77,ZY22328KV4
		caps.setCapability("platformName", osName);
		caps.setCapability("platformVersion", osVersion);//6.0.1,7.1.1,6.0.1
		caps.setCapability("appPackage", appPackage);
		caps.setCapability("appActivity",appActivity);
		caps.setCapability("noReset", "true");
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:"+appiumPort+"/wd/hub"), caps);
		}
		catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void buttonClick(String xPath) {
		driver.findElement(By.xpath(xPath)).click();
	}

}
