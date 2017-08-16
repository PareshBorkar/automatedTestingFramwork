
package tests;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class TestCases {
	WebDriverWait device1WaitDriver;

	public static void main(String[] args) throws InterruptedException, JsonIOException, JsonSyntaxException, FileNotFoundException {
		sunnyDayHandshake();
//		RideShare device1 = new RideShare();
//		RideShare device2 = new RideShare(); 
		// Instantiate Appium Driver
//		device1.setUpDevice("FBAZGU065350WXL", "6.0.1", "Android", "4723", "com.almawiz.loloshare",
//				".MainActivity");
//		device2.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
//				".MainActivity");//put this in config pass emailId and let the info get through config

//		Thread.sleep(40000);
		//device1.postTripAsPassgr(device1Driver);
//		device2.handShakeTrip(device1);
	}
	
	public static void sunnyDayHandshake() throws InterruptedException, JsonIOException, JsonSyntaxException, FileNotFoundException {//static so that main method can call this fn
		RideShare device1 = new RideShare();
		RideShare device2 = new RideShare();
		// Instantiate Appium Driver
		device1.setUpDevice("Paresh");
		device2.setUpDevice("Ronald");
		System.out.println(device1.userName);
		System.out.println(device2.userName);
		Thread.sleep(40000);
		
		device1.hostPublish();//call directly hostPublish method?
		device2.passengerPublish();
		device1.requestPickup(device2);//how to acheive this?
//		device2.acceptRequest(device1);
//		device1.enterRide(device2);
//		device2.drop(device1);
//		device1.rate(device2);
	}

	public void sunnyDayHandshakeOneHostTwoPassegers() throws InterruptedException {
		RideShare device1 = new RideShare();
		RideShare device2 = new RideShare();
		RideShare device3 = new RideShare();
		// Instantiate Appium Driver
//		device1.setUpDevice("FBAZGU065350WXL", "6.0.1", "Android", "4723", "com.almawiz.loloshare",
//				".MainActivity");
//		device2.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
//				".MainActivity");
//		device3.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
//				".MainActivity");

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
	//	public void SimpleTest() {
//		Assert.assertNotNull(device1Driver.getContext());
//	}
}
