package Decorator;

public class Juice extends Beverage 
{
	
	public Juice()
	{
		
	}
	
	public Juice(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "주스";
	}
}
