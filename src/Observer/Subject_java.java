package Observer;

import java.util.Observable;

public class Subject_java extends Observable 
{
	private int pre;
	private int tem;
	private int hu;
	
	public Subject_java() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void measurementsChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(int pre, int hu, int tem)
	{
		this.tem = tem;
		this.pre = pre;
		this.hu = hu;
		measurementsChanged();
	}
	
	public int getPre() {
		return pre;
	}
	public int getTem() {
		return tem;
	}
	public int getHu() {
		return hu;
	}
	
}
