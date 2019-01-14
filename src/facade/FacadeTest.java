package facade;

public class FacadeTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WashingMachine w = new WashingMachine();
		VacuumCleaner v = new VacuumCleaner();
		RobotVacuumCleaner r = new RobotVacuumCleaner();
		
		Facade f = new Facade(w, v, r);
		f.cleaningOn();
		
	}

}
