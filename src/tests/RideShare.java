package tests;

public class RideShare extends Devices {

	public void hostPublish() throws InterruptedException {
		buttonClick("//android.view.View[@index='3']/android.widget.Button[@index='0']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[contains(@content-desc,'briefcase Work')]");
		Thread.sleep(2000);
		buttonClick("//android.widget.RadioButton[@content-desc='Hosting']");
		buttonClick("//android.widget.Button[@content-desc='PUBLISH TRIP ']");
		Thread.sleep(30000);
	}

	public void passengerPublish() throws InterruptedException {
		buttonClick("//android.view.View[@index='3']/android.widget.Button[@index='0']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[contains(@content-desc,'briefcase Work')]");
		Thread.sleep(2000);
		buttonClick("//android.widget.RadioButton[@content-desc='Request Pickup']");
		buttonClick("//android.widget.Button[@content-desc='PUBLISH TRIP ']");
	}

	public void requestPickup(RideShare otherDevice) throws InterruptedException {
		// make sure that otherDevice is only requested
		// this logic should be in loop so that it clicks all the host/passengers
		// present
		buttonClick("//android.widget.Image[@content-desc='_149795158073601_t']");
		Thread.sleep(3000);

		String xPathTemp = String.format("//android.view.View[contains(@content-desc,'%s')]", otherDevice.userName);
		Boolean reqUser = checkElementPresent(xPathTemp);
		if (reqUser) {
			buttonClick("//android.widget.Button[@content-desc='REQUEST ']");
			Thread.sleep(10000);
		}
	}

	public void acceptRequest(RideShare otherDevice) throws InterruptedException {
		/// make sure that otherDevice is only accepted
		buttonClick("//android.widget.Image[@content-desc='profile_img']");
		Thread.sleep(2000);

		String xPathTemp = String.format("//android.view.View[contains(@content-desc,'%s')]", otherDevice.userName);
		Boolean reqUser = checkElementPresent(xPathTemp);
		if (reqUser) {
			buttonClick("//android.widget.Button[@content-desc='ACCEPT ']");
			Thread.sleep(9000);
		}
	}

	public void enterRide(RideShare otherDevice) throws InterruptedException {
		buttonClick("//android.widget.Image[@content-desc='profile_img']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[@content-desc='ENTERED RIDE ']");
		Thread.sleep(3000);
		buttonClick("//android.widget.Button[@content-desc='OK ']");
		Thread.sleep(9000);
	}

	public void drop(RideShare otherDevice) throws InterruptedException {
		buttonClick("//android.widget.Image[@content-desc='profile_img']");
		Thread.sleep(2000);
		buttonClick("//android.widget.Button[@content-desc='DROP ']");
	}

	public void rate(RideShare otherDevice) throws InterruptedException {

	}

}
