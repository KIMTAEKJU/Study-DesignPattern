package Observer;

public class ForecastDisplay implements Observer, Display
{
	private int temp;
	private int hu;
	private int pre;
	public Subject wd;
	
	public ForecastDisplay(Subject wd) {
		// TODO Auto-generated constructor stub
		this.wd = wd;
		wd.registerObserver(this);
	}
	@Override
	public void update(int temperature, int humidity, int pressure) {
		// TODO Auto-generated method stub
		temp = temperature;
		hu = humidity;
		pre = pressure;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(temp);
		System.out.println(hu);
		System.out.println(pre);
	}

}
