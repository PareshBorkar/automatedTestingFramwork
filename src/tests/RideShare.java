package tests;

public class RideShare extends Devices {

	public void hostPublish() throws InterruptedException {
		//buttonClick("//android.view.View[@index='3']/android.widget.Button[@index='0']");
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='3']");///android.widget.Button[@index='0']
		Thread.sleep(2000);
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='2']/android.widget.Button[@index='5']");///android.widget.Button[contains(@content-desc,'briefcase Work')]
		Thread.sleep(3000);
		//buttonClick("//android.widget.RadioButton[@content-desc='Hosting']");
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='4']/android.view.View[@index='1']");///android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='2']
		
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']");//publishTripButtonClick
	}

	public void passengerPublish() throws InterruptedException {
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='3']");
		Thread.sleep(3000);
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='2']/android.widget.Button[@index='5']");
		Thread.sleep(3000);
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='4']/android.view.View[@index='0']");
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']");
	}

	public void requestPickup(RideShare otherDevice) throws InterruptedException {
		// make sure that otherDevice is only requested
		// this logic should be in loop so that it clicks all the host/passengers
		// present everytime +2 can be done for last view if not present than something else can be done
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Image[@index='0']");//android.widget.Image[@content-desc='profile_img']
		Thread.sleep(3000);
		String xPathTemp = String.format("//android.view.View[contains(@content-desc,'%s')]", otherDevice.userName);
		Boolean reqUser = checkElementPresent(xPathTemp);
		if (reqUser) {
			buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']");//requestBtnClick
		}
	}

	public void acceptRequest(RideShare otherDevice) throws InterruptedException {
		/// make sure that otherDevice is only accepted
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Image[@index='0']");
		Thread.sleep(2000);

		String xPathTemp = String.format("//android.view.View[contains(@content-desc,'%s')]", otherDevice.userName);
		Boolean reqUser = checkElementPresent(xPathTemp);
		if (reqUser) {
			buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='1']");//accept
			Thread.sleep(9000);
		}
	}

	public void enterRide(RideShare otherDevice) throws InterruptedException {
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Image[@index='0']");//imageClickFooter
		Thread.sleep(2000);
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='1']");//enteredRide
		Thread.sleep(3000);
		buttonClick("//android.widget.Button[@content-desc='OK ']");
		Thread.sleep(9000);
	}

	public void drop(RideShare otherDevice) throws InterruptedException {
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Image[@index='0']");//imageClickFooter
		Thread.sleep(2000);
		buttonClick("//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']");//Drop
	}

	public void rate(RideShare otherDevice) throws InterruptedException {

	}

}
