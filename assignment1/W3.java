package assignment1;

public class W3 extends Vehicle{
	
	int speed;
	long distance;
	int num_of_tire;

	public W3() {
		this.speed = 130;
		this.distance = 300000;
		this.num_of_tire = 3;
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Run vehicle W3");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop vehicle W3");
	}

void display() {
		
		System.out.println("Parent Speed: "  + super.getSpeed());
		System.out.println("Parent Distance: "  + super.getDistance());
		System.out.println(); // next line
		System.out.println("Speed: "  + this.speed);
		System.out.println("Distance: "  + this.distance);
		System.out.println("Number of Tires: "  + this.num_of_tire);
		

	}
}
