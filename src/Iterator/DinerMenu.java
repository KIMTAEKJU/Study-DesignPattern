package Iterator;

public class DinerMenu 
{
	MenuItem[] menu;
	
	public DinerMenu() {
		// TODO Auto-generated constructor stub
		menu = new MenuItem[2];
		
		menu[0] = new MenuItem("감자튀김", 2.1);
		menu[1] = new MenuItem("스파게티", 10.1);
	}
	
	public Object createIterator(MenuItem[] menuItem)
	{
		return new DinerMenuIterator(menuItem);
	}

	public MenuItem[] getMenu() {
		return menu;
	}
	
	
}
