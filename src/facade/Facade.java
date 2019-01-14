package facade;

public class Facade 
{
	WashingMachine washingMachine;
	VacuumCleaner vacuumCleaner;
	RobotVacuumCleaner robotVacuumCleaner;
	
	public Facade(WashingMachine w, VacuumCleaner v, RobotVacuumCleaner r) {
		// TODO Auto-generated constructor stub
		washingMachine = w;
		vacuumCleaner = v;
		robotVacuumCleaner = r;
	}
	
	public void cleaningOn()
	{
		washingMachine.washingOn();
		vacuumCleaner.vacuumCleanerOn();
		robotVacuumCleaner.robotVacuumCleanerOn();
	}
	
	public void cleaningOff()
	{
		washingMachine.washingOff();
		vacuumCleaner.vacuumCleanerOff();
		robotVacuumCleaner.robotVacuumCleanerOff();
	}
}
