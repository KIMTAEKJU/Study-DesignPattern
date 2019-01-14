package Factory;

public abstract class PizzaStore
{
	Pizza pizza;
	
	public void pizzaOrder(String pizzaName)
	{
		pizza = createPizza(pizzaName);
		pizza.cut();
		pizza.box();
	}
	
	public abstract Pizza createPizza(String name);
}
