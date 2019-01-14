package Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator{

	MenuItem[] menuItem;
	int index;

	public DinerMenuIterator(MenuItem[] menuItem) {
		// TODO Auto-generated constructor stub
		this.menuItem = menuItem;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (index < menuItem.length)
			return true;
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menu = menuItem[index];
		index++;
		return menu;
	}

}
