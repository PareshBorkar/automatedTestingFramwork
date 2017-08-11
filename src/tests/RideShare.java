package tests;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class RideShare extends Devices {

//	public void postTripAsPassgr(AppiumDriver<WebElement> deviceDriver) throws InterruptedException {
//		// android.view.View
//		buttonClick(deviceDriver, "//android.view.View[@index='3']/android.widget.Button[@index='0']");
//		Thread.sleep(2000);
//		////android.widget.Button[contains(@resource-id,'digit5')]
//		buttonClick(deviceDriver,
//				"//android.widget.Button[contains(@content-desc,'briefcase Work')]");
//		Thread.sleep(2000);
//		buttonClick(deviceDriver, "//android.widget.RadioButton[@content-desc='Request Pickup']");
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='PUBLISH TRIP ']");
//		Thread.sleep(1000);
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='OK ']");
//		Thread.sleep(30000);//now give host call to publish trip
//		//android.view.View[@index='2']/
//		buttonClick(deviceDriver, "//android.widget.Image[@content-desc='profile_img']");
//		Thread.sleep(2000);
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='REQUEST ']");
//		Thread.sleep(30000);
//		buttonClick(deviceDriver, "//android.widget.Image[@content-desc='profile_img']");//when changed to arriving only one comes
//		Thread.sleep(2000);
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='ENTERED RIDE ']");
//		Thread.sleep(2000);
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='OK ']");
//		Thread.sleep(3000);
//		//android.webkit.WebView/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='0']/
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='APPLY ']");
//		//after host says drop
//		Thread.sleep(30000);
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='SUBMIT ']");
//	}
//
//	public void postTripAsHost(AppiumDriver<WebElement> deviceDriver) throws InterruptedException {
//		buttonClick(deviceDriver, "//android.view.View[@index='3']/android.widget.Button[@index='0']");
//		Thread.sleep(2000);
//		buttonClick(deviceDriver,
//				"//android.widget.Button[@content-desc='briefcase Work - Rua Armada Portuguesa, Altinho, Panjim, Goa 403001, India ']");
//		Thread.sleep(2000);
//		buttonClick(deviceDriver, "//android.widget.RadioButton[@content-desc='Hosting']");
//		
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='PUBLISH TRIP ']");
//		Thread.sleep(1000);
//		buttonClick(deviceDriver, "//android.widget.Button[@content-desc='OK ']");
//	}
//	
	public void handShakeTrip(RideShare otherDevice) throws InterruptedException{
		//publishAsPasseng
		otherDevice.buttonClick("//android.view.View[@index='3']/android.widget.Button[@index='0']");
		Thread.sleep(2000);
		otherDevice.buttonClick("//android.widget.Button[contains(@content-desc,'briefcase Work')]");
		Thread.sleep(2000);
		otherDevice.buttonClick("//android.widget.RadioButton[@content-desc='Request Pickup']");
		otherDevice.buttonClick("//android.widget.Button[@content-desc='PUBLISH TRIP ']");
		Thread.sleep(1000);
		otherDevice.buttonClick( "//android.widget.Button[@content-desc='OK ']");
		
		//publishAsHost
		buttonClick("//android.view.View[@index='3']/android.widget.Button[@index='0']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[contains(@content-desc,'briefcase Work')]");
		Thread.sleep(2000);
		buttonClick("//android.widget.RadioButton[@content-desc='Hosting']");
		buttonClick("//android.widget.Button[@content-desc='PUBLISH TRIP ']");
		Thread.sleep(1000);
		buttonClick("//android.widget.Button[@content-desc='OK ']");
		Thread.sleep(30000);
		
		//passenger request ride
		otherDevice.buttonClick("//android.widget.Image[@content-desc='profile_img']");
		Thread.sleep(3000);
		otherDevice.buttonClick("//android.widget.Button[@content-desc='REQUEST ']");
		Thread.sleep(10000);
		
		//host accept ride
		buttonClick("//android.widget.Image[@content-desc='profile_img']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[@content-desc='ACCEPT ']");
		Thread.sleep(9000);
		
		//passenger enters the ride
		otherDevice.buttonClick("//android.widget.Image[@content-desc='profile_img']");
		Thread.sleep(2000);
		otherDevice.buttonClick("//android.widget.Button[@content-desc='ENTERED RIDE ']");
		Thread.sleep(3000);
		otherDevice.buttonClick("//android.widget.Button[@content-desc='OK ']");
		Thread.sleep(9000);
		
		//host drops the passenger
		buttonClick("//android.widget.Image[@content-desc='profile_img']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[@content-desc='DROP ']");
		
		//passenger gives rating to host
		Thread.sleep(10000);
		otherDevice.buttonClick("//android.widget.Button[@content-desc='SUBMIT ']");
		
		//host ends the trip
		buttonClick("//android.widget.Button[@content-desc='close End Trip ']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[@content-desc='END ']");
	}
	
	public void publishTrip()  throws InterruptedException{
		buttonClick("//android.view.View[@index='3']/android.widget.Button[@index='0']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[contains(@content-desc,'briefcase Work')]");
		Thread.sleep(2000);
		buttonClick("//android.widget.RadioButton[@content-desc='Hosting']");
		buttonClick("//android.widget.Button[@content-desc='PUBLISH TRIP ']");
		Thread.sleep(1000);
		buttonClick("//android.widget.Button[@content-desc='OK ']");
		Thread.sleep(30000);
	}

	public void requestPickup(RideShare otherDevice)   throws InterruptedException {
		buttonClick("//android.widget.Image[@content-desc='profile_img']");
		Thread.sleep(3000);
		buttonClick("//android.widget.Button[@content-desc='REQUEST ']");
		Thread.sleep(10000);
	}
}
