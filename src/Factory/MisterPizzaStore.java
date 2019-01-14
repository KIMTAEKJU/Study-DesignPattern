package Factory;

public class MisterPizzaStore extends PizzaStore {

	public MisterPizzaStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pizza createPizza(String name) 
	{
		IngredientsFactory igf = new MisterPizzaIngredientsFactory();
		// TODO Auto-generated method stub
		if ("cheese".equals(name))
			pizza = new CheesePizza(igf);
		return pizza;
	}

}
