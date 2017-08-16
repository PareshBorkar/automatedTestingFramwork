package tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Devices {
	private AppiumDriver<WebElement> driver = null;
	String userName = null;

	public void setUpDevice(String userName) throws JsonIOException, JsonSyntaxException, FileNotFoundException {

		JsonParser parser = new JsonParser();
		JsonObject obj = (JsonObject) parser
				.parse(new FileReader("C:\\Users\\user\\eclipse-workspace\\AppiumTest\\src\\tests\\config.json"));
		JsonObject userObj = (JsonObject) obj.get(userName);
		
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", userObj.get("deviceId"));
		caps.setCapability("platformName", userObj.get("deviceId"));
		caps.setCapability("platformVersion", userObj.get("osVersion"));
		caps.setCapability("appPackage",userObj.get("appPackage"));
		caps.setCapability("appActivity", userObj.get("appActivity"));
		caps.setCapability("noReset", "true");
		this.userName = userObj.get("nameInApp").toString();
	
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:"+userObj.get("appiumPort").toString()+"/wd/hub"), caps);
		} catch (MalformedURLException e) {
			System.out.println("error "+e.getMessage());
		}
		
	}

	public void buttonClick(String xPath) {
		driver.findElement(By.xpath(xPath)).click();// what sorcery is happening with driver?! how driver gets value
	}

	public String getTextFromXapth(String xPath) {
		return driver.findElement(By.xpath(xPath)).getAttribute("content-desc").toString();
	}
}
