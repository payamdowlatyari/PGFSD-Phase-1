package assignment5;

public class TV implements SmartTVremote{

	@Override
	public void trunOn() {
		System.out.println("Turn on the Smart TV");
		
	}

	@Override
	public void trunOff() {
		System.out.println("Turn off the Smart TV");
		
	}

	@Override
	public void changeVolume() {
		System.out.println("Change the volume of Smart TV");
		
	}

}
