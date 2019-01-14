package Decorator;

public class Coffee extends Beverage{

	public Coffee(int size) 
	{
		// TODO Auto-generated constructor stub
		this.size = size;
	}
	
	public Coffee(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 10 + getSize();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "커피";
	}

}
