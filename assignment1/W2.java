package assignment1;

public class W2 extends Vehicle{
	
	int speed;
	long distance;
	int num_of_tire;
	
	
	W2(){
		this.speed = 120;
		this.distance = 200000;
		this.num_of_tire = 2;
	}
		
	
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Run vehicle W2");
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop vehicle W2");
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
