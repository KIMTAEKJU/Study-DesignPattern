package Iterator;

import java.util.ArrayList;

public class BreakFastMenu 
{
	ArrayList<MenuItem> menu;
	
	public BreakFastMenu() {
		// TODO Auto-generated constructor stub
		menu = new ArrayList<>();
		menu.add(new MenuItem("계란후라이", 1.5));
		menu.add(new MenuItem("계란찜", 2.5));
	}
	
	public Object createIterator()
	{
		return this.menu.iterator();
	}

	public ArrayList<MenuItem> getMenu() {
		return menu;
	}
	
	
}
