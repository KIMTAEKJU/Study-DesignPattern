package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject
{
	private int temperature;
	private int humidity;
	private int pressure;
	private ArrayList<Observer> observerList = new ArrayList<>();
	
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer i : observerList)
			i.update(getTemperature(), getHumidity(), getPressure());
	}
	
	public void measurementChanged(int temperature, int humidity, int pressure)
	{
		setTemperature(temperature);
		setPressure(pressure);
		setHumidity(humidity);
		
		notifyObserver();
	}
}
