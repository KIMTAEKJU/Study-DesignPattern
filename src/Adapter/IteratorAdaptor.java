package Adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdaptor implements Enumeration 
{
	Iterator iterator;
	
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return iterator.next();
	}
	
}
