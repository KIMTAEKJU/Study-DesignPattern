package Decorator;

public class DecoratorTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Coffee coffee = new Coffee();
		Milk milk = new Milk(coffee);
		Milk milk2 = new Milk(milk);
		
		System.out.println(milk.cost());
		System.out.println(milk.getDescription());
		System.out.println(milk2.getDescription());
	
	}
}
