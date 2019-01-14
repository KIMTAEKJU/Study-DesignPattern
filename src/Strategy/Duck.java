package Strategy;

public abstract class Duck implements Flyable, Quakable 
{
	public Flyable flys;
	public Quakable quacks;
	
	public abstract void display();
	
	@Override
	public void fly()
	{
		flys.fly();
	}
	
	@Override
	public void quack()
	{
		quacks.quack();
	}
}
