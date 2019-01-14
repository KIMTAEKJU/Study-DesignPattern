package Strategy;

public class DuckTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Flyable f = new FlyToWings();
		Flyable f1 = new FlyNoWay();
		Flyable f2 = new FlyRocket();
		Quakable q = new QuackQuack();
		Quakable q1 = new MuteQuack();
		MallardDuck m = new MallardDuck(f, q);
		m.fly();
		m.quack();
		m.setFly(f1);
		m.fly();
		m.setFly(f2);
		m.fly();
	}

}
