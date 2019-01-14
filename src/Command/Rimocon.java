package Command;

public class Rimocon 
{
	Command[] slot;
	
	public Rimocon(Command[] slot) {
		// TODO Auto-generated constructor stub
		this.slot = slot;
	}
	
	public void pressButton()
	{
		for (Command i : slot)
			i.execute();
	}
}
