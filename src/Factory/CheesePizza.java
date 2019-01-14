package Factory;

public class CheesePizza extends Pizza
{
	public CheesePizza(IngredientsFactory igf) {
		// TODO Auto-generated constructor stub
		this.igf = igf;
		prepare();
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		sauce = igf.createSauce();
		System.out.println("소스를 첨가합니다");
		dough = igf.createDaugh();
		System.out.println("도우를 넣습니다");
	}
}
