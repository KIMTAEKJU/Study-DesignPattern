package Iterator;

public class MenuItem 
{
	String name;
	double price;
	
	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + "]";
	}

	public MenuItem(String name, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
}
