
package tests;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class TestCases {
	WebDriverWait device1WaitDriver;

	public static void main(String[] args) throws InterruptedException, JsonIOException, JsonSyntaxException, FileNotFoundException {
		sunnyDayHandshake();
	}
	
	public static void sunnyDayHandshake() throws InterruptedException, JsonIOException, JsonSyntaxException, FileNotFoundException {//static so that main method can call this fn
		RideShare device1 = new RideShare();
		RideShare device2 = new RideShare();
		// Instantiate Appium Driver
		
		device2.setUpDevice("Paresh");
		device1.setUpDevice("Lester");
		Thread.sleep(30000);
		device2.passengerPublish();
		device1.hostPublish();
		Thread.sleep(10000);
		device2.requestPickup(device1);//have to check name
		Thread.sleep(8000);
		device1.acceptRequest(device2);//have to check name 
		device2.enterRide(device1);//no need to check name
		device1.drop(device1);//no need to check name
		//device1.rate(device2);//no need to check name
	}

	public void sunnyDayHandshakeOneHostTwoPassegers() throws InterruptedException {
		RideShare device1 = new RideShare();
		RideShare device2 = new RideShare();
		RideShare device3 = new RideShare();
		// Instantiate Appium Driver

		Thread.sleep(40000);
		//device1.postTripAsPassgr(device1Driver);
		device1.hostPublish();
		device2.passengerPublish();
		device3.passengerPublish();
		device1.requestPickup(device2);
		device2.requestPickup(device2);
		device3.acceptRequest(device1);
		device3.acceptRequest(device2);
		device1.enterRide(device2);
		device2.drop(device1);
		device1.rate(device2);
	}
}
