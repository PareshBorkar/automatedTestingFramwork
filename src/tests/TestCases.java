
package tests;

import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCases {
	WebDriverWait device1WaitDriver;

	public static void main(String[] args) throws InterruptedException {
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
	
	public static void sunnyDayHandshake() throws InterruptedException {//static so that main method can call this fn
		RideShare device1 = new RideShare();
		RideShare device2 = new RideShare();
		// Instantiate Appium Driver
		device1.setUpDevice("FBAZGU065350WXL", "6.0.1", "Android", "4723", "com.almawiz.loloshare",
				".MainActivity");
		device2.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
				".MainActivity");

		Thread.sleep(40000);
		
		device1.publishTrip("PASSENGER");//call directly hostPublish method?
		device2.publishTrip("HOST");
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
		device1.setUpDevice("FBAZGU065350WXL", "6.0.1", "Android", "4723", "com.almawiz.loloshare",
				".MainActivity");
		device2.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
				".MainActivity");
		device3.setUpDevice("ZY22328KV4", "6.0.1", "Android", "4725", "com.almawiz.loloshare",
				".MainActivity");

		Thread.sleep(40000);
		//device1.postTripAsPassgr(device1Driver);
		device1.publishTrip("HOST");
		device2.publishTrip("PASSENGER");
		device3.publishTrip("PASSENGER");
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
