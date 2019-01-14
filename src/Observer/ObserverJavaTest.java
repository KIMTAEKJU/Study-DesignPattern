package Observer;

public class ObserverJavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject_java s = new Subject_java();
		Observer_java o = new Observer_java(s);
		
		s.setMeasurements(10, 15, 20);
	}

}
