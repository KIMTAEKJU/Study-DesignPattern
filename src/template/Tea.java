package template;

public class Tea extends Beverage{

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("차를 끓여냅니다");
	}

	@Override
	public void addComponents() {
		// TODO Auto-generated method stub
		System.out.println("레몬이나 다른것을 넣습니다");
	}

}
