package assignment3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Q3 - a");
		Pen p = new Fountain();
		p.write();
		p.refill();
		
		Fountain f = new Fountain();
		f.changeNib();
		
		
		System.out.println();
		System.out.println("Q3 - b");
		
		Monkey m = new Monkey();
		m.eat();
		m.sleep();
		m.jump();
		m.bite();
		
		System.out.println();
		Human h = new Human();
		h.eat();
		h.sleep();
		h.talk();
		h.think();

	}

}
