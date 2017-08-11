
package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
//import junit.framework.Assert;

public class TestCases {
	WebDriverWait device1WaitDriver;

	public static void main(String[] args) throws InterruptedException {
		RideShare device1 = new RideShare();
		RideShare device2 = new RideShare();
		// Instantiate Appium Driver
		device1.setUpDevice("FBAZGU065350WXL", "6.0.1", "Android", "4723", "com.almawiz.loloshare",
				".MainActivity");
		device2.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
				".MainActivity");

		Thread.sleep(40000);
		//device1.postTripAsPassgr(device1Driver);
		device2.handShakeTrip(device1);

	}
	
	public void SunnyDayHandshake() throws InterruptedException {
		RideShare device1 = new RideShare();
		RideShare device2 = new RideShare();
		// Instantiate Appium Driver
		device1.setUpDevice("FBAZGU065350WXL", "6.0.1", "Android", "4723", "com.almawiz.loloshare",
				".MainActivity");
		device2.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
				".MainActivity");

		Thread.sleep(40000);
		//device1.postTripAsPassgr(device1Driver);
		device1.publishTrip();
		device2.publishTrip();
		device1.requestPickup(device2);
		device2.acceptRequest(device1);
		device1.enterRide(device2);
		device2.drop(device1);
		device1.rate(device2);
	}

	public void SunnyDayHandshakeOneHostTwoPassegers() throws InterruptedException {
		RideShare device1 = new RideShare();
		RideShare device2 = new RideShare();
		RideShare device3 = new RideShare();
		// Instantiate Appium Driver
		device1.setUpDevice("FBAZGU065350WXL", "6.0.1", "Android", "4723", "com.almawiz.loloshare",
				".MainActivity");
		device2.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
				".MainActivity");
		device3.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
				".MainActivity");

		Thread.sleep(40000);
		//device1.postTripAsPassgr(device1Driver);
		device1.publishTrip();
		device2.publishTrip();
		device3.publishTrip();
		device1.requestPickup(device2);
		device2.requestPickup(device2);
		device3.acceptRequest(device1);
		device3.acceptRequest(device2);
		device1.enterRide(device2);
		device2.drop(device1);
		device1.rate(device2);
	}
	//	public void SimpleTest() {
//		Assert.assertNotNull(device1Driver.getContext());
//	}
}
