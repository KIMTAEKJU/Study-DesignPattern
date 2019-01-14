package Adapter;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("골골");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("칠면조 날다");
	}

}
