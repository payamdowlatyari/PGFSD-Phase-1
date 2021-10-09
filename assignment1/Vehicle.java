package assignment1;

public abstract class Vehicle {
	
	int speed;
	long distance;
	
	Vehicle() {
		this.speed = 100;
		this.distance = 100000;
	}
	
	Vehicle(int speed, long distance){
		this.speed = speed;
		this.distance = distance;
	}
	
	int getTime() {
		return (int) (this.distance/this.speed); 
	}
	

	abstract void run();
	abstract void stop();
	
	public void fuel(int distance) {
		
		System.out.println((distance * 0.001 )+ " liter");
	}
	
	public void fuel(float distance, String mode) {
		
		if (mode == "sport") {
			System.out.println(((distance * 0.001) * 0.75)+ " liter");
		}
		else System.out.println((distance * 0.001)+ " liter");
		
	}
	
	public void fuel(int distance, char c) {
		
		if (c == 'k') {
			System.out.println((distance * 0.001) + " liter");
		}
		else if (c == 'm') {
			System.out.println((distance * 0.00062)+ " liter");
		}
		else System.out.println("Please enter m or k");
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}


}
