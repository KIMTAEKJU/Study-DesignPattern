package Adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MallaredDuck duck = new MallaredDuck();
		WildTurkey turkey = new WildTurkey();
		TurkeyAdapter ta = new TurkeyAdapter(turkey);
		DuckAdapter da = new DuckAdapter(duck);
		test(ta);
		test(da);
		
		
	}
	
	static void test(Duck duck)
	{
		duck.quack();
		duck.fly();
	}
	
	static void test(Turkey turkey)
	{
		turkey.gobble();
		turkey.fly();
	}

}
