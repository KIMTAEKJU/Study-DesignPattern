package template;

public class Coffee extends Beverage{

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("커피를 끓여냅니다");
	}

	@Override
	public void addComponents() {
		// TODO Auto-generated method stub
		System.out.println("설탕이나  시럽을 넣습니다.");
	}

}
