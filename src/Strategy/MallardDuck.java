package Strategy;

public class MallardDuck extends Duck{
	
	
	public MallardDuck(Flyable fly, Quakable quack) 
	{
		// TODO Auto-generated constructor stub
		this.flys = fly;
		this.quacks = quack;
	}
	
	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("MallardDuck");
	}
	
	public void setFly(Flyable fly)
	{
		this.flys = fly;
	}

}
