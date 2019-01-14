package Iterator;

import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DinerMenu d = new DinerMenu();
		BreakFastMenu b = new BreakFastMenu();
		Iterator i = (Iterator) d.createIterator(d.getMenu());
		
		while (i.hasNext())
		{
			System.out.println(i.next().toString());
		}
		
		Iterator i2 = (Iterator)b.createIterator(b.getMenu());
		
		while (i2.hasNext())
		{
			System.out.println(i2.next().toString());
		}
	}

}
