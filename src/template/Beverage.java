package template;

public abstract class Beverage 
{
	public final void prepare()
	{
		boilWater();
		brew();
		fillCup();
		if (hook())
			addComponents();
	}
	
	public abstract void brew();
	public abstract void addComponents();
	
	void boilWater()
	{
		System.out.println("물을 끓입니다");
	}
	
	void fillCup()
	{
		System.out.println("컵에 따릅니다");
	}
	
	boolean hook()
	{
		return true;
	}
}
