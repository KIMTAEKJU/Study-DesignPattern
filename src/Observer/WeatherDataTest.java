package Observer;

public class WeatherDataTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WeatherData wd = new WeatherData();
		ForecastDisplay fd = new ForecastDisplay(wd);
		wd.measurementChanged(20, 30, 40);
		wd.measurementChanged(50, 70, 1);
		wd.removeObserver(fd);
		wd.measurementChanged(51, 21, 2);
	}

}
