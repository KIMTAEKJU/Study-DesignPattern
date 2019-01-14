package Command;

public class LivingRoomLightOnCommand implements Command {

	Light light;
	
	public LivingRoomLightOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

}
