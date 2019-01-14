package Command;

public class LivingRoomLightOffCommand implements Command{

	Light light;
	
	public LivingRoomLightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

}
