package Decorator;

public class Milk extends Additives{

	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 5 + beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "우유" + beverage.getDescription();
	}

}
