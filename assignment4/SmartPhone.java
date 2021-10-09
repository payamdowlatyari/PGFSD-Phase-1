package assignment4;

public class SmartPhone extends Phone{
	
	SmartPhone(){
		
	}

	@Override
	void lift() {
		System.out.println("Lift Smart Phone");
		
	}

	@Override
	void disconnected() {
		System.out.println("Smart Phone Disconnected");
		
	}

}
