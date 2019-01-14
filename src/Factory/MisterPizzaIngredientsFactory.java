package Factory;

public class MisterPizzaIngredientsFactory implements IngredientsFactory
{
	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MisterPizzaSauce("미스터피자소스");
	}

	@Override
	public Dough createDaugh() {
		// TODO Auto-generated method stub
		return new MisterPizzaDough("미스터피자도우");
	}
	
}
