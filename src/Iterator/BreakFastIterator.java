package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakFastIterator implements Iterator{

	ArrayList<MenuItem> menuItem;
	int index;
	
	public BreakFastIterator(ArrayList<MenuItem> menuItem) {
		// TODO Auto-generated constructor stub
		this.menuItem = menuItem;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		if (index < menuItem.size())
			return true;
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menu = menuItem.get(index);
		index++;
		return menu;
	}

}
