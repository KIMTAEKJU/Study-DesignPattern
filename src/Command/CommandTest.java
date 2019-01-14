package Command;

public class CommandTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Light light = new Light();
		LivingRoomLightOnCommand lc = new LivingRoomLightOnCommand(light);
		Command lco = new NoCommand();
		Command[] arr = {new LivingRoomLightOnCommand(light), new LivingRoomLightOffCommand(light), new NoCommand()};
		Rimocon r = new Rimocon(arr);
		r.pressButton();
		
	}

}
