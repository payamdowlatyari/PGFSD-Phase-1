package assignment2;

abstract class MNC 
{
	MNC()
	{
		System.out.println("MNC Constructor ... ");	
		
	}
	
	abstract void absOne();
	abstract void absTwo();
	
	void normalOne() 
	{
		System.out.println("I am normalOne class in MNC!");
		
	}
	
}
