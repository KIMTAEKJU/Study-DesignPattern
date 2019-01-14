package Observer;

import java.util.Observable;
import java.util.Observer;

public class Observer_java implements Observer{

	private int pre, hu, tem;
	private Observable subject;
	
	public Observer_java(Observable subject) 
	{
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

		if (o instanceof Subject_java)
		{
			Subject_java s = (Subject_java)o;
			pre = s.getPre();
			System.out.println(pre);
		}
	}

}
