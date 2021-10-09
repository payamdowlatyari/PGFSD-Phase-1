package assignment1;

public class Main {

	public static void main(String[] args) {
		
		// dynamic polymorphism
		System.out.println("2W"); // 2W
		Vehicle w2 = new W2(); 
		w2.run();
		w2.stop();
		System.out.println("Speed: " + w2.getSpeed());
		System.out.println("Distance: " + w2.getDistance());
		
		w2.fuel(100000);
		w2.fuel(200000, 'm');
		w2.fuel(300000, "sport");
		
		System.out.println("\n3W"); // 3W
		Vehicle w3 = new W3(); 
		w3.run();
		w3.stop();
		System.out.println("Speed: " + w3.getSpeed());
		System.out.println("Distance: " + w3.getDistance());
		
		w3.fuel(100000);
		w3.fuel(200000, 'k');
		w3.fuel(300000, "sport");		
		
		System.out.println("\n4W"); // 4W
		Vehicle w4 = new W4(); 
		w4.run();
		w4.stop();
		System.out.println("Speed: " + w4.getSpeed());
		System.out.println("Distance: " + w4.getDistance());
		
		w4.fuel(100000);
		w4.fuel(200000, 'm');
		w4.fuel(300000, "regular");	
		
		System.out.println("\n8W"); // 8W
		Vehicle w8 = new W8(); 
		w8.run();
		w8.stop();
		System.out.println("Speed: " + w8.getSpeed());
		System.out.println("Distance: " + w8.getDistance());
		
		w8.fuel(100000);
		w8.fuel(200000, 'w');
		w8.fuel(300000, "sport");	
	}

}
