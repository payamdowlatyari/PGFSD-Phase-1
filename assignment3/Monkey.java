package assignment3;

public class Monkey implements BasicAnimal{
	
	Monkey(){
		System.out.println("I am a monkey!");
	}

	@Override
	public void eat() {
		
		System.out.println("I eat");
	}

	@Override
	public void sleep() {
		
		System.out.println("I sleep");
		
	}
	
	void jump() {
		System.out.println("I jump");
	}
	
	void bite() {
		System.out.println("I bit");
	}

}
