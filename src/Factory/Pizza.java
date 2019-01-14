package Factory;

public abstract class Pizza 
{
	String name;
	Sauce sauce;
	Dough dough;
	IngredientsFactory igf;
	
	void cut()
	{
		System.out.println(name + "피자를 자릅니다");
	}
	
	void box()
	{
		System.out.println(name + "피자를 포장합니다");
	}
	
	public abstract void prepare();
}
