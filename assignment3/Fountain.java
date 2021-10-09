package assignment3;

public class Fountain extends Pen{

	Fountain() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void write() {
		System.out.println("Writing with fountain pen!");
		
	}

	@Override
	void refill() {
		System.out.println("Refill needed for fountain pen!");
		
	}
	
	void changeNib() {
		System.out.println("Please change nib of fountain pen!");
	}

}
