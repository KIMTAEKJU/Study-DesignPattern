package Decorator;

public abstract class Beverage 
{
	public String description;
	public Beverage beverage;
	public int size;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public abstract int cost();
	public abstract String getDescription();
}
